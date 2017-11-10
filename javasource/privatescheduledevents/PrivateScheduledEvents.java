package privatescheduledevents;

import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import privatescheduledevents.proxies.ScheduledEvent;
import privatescheduledevents.proxies.ScheduledEventAudit;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.logging.ILogNode;

public class PrivateScheduledEvents {
    private final static ILogNode logger = Core.getLogger("PrivateScheduledEvents");
	private static Map<String,ScheduledExecutorService> scheduledEventServices = new ConcurrentHashMap<String,ScheduledExecutorService>();
	private static Map<String,PrivateScheduledEventThread> scheduledEventThreads = new ConcurrentHashMap<String,PrivateScheduledEventThread>();
	private static AtomicInteger privateID = new AtomicInteger();
	public static int getNumberOfScheduledEventsRunning() {
		return scheduledEventServices.size();
	}
	
	public static boolean startScheduledEvent(ScheduledEvent scheduledEvent) {
		String name = scheduledEvent.getMicroflowName();
		if (scheduledEventServices.containsKey(name)) {
			stopScheduledEvent(name);
		}
		final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		Calendar calendar = Calendar.getInstance();
		long now = calendar.getTimeInMillis();
		int year = calendar.get(Calendar.YEAR);
	    int month = calendar.get(Calendar.MONTH);
	    int day = calendar.get(Calendar.DATE);
	    calendar.set(year, month, day, 0, 0, 0);
	    calendar.set(Calendar.MILLISECOND, 0);
	    long millisecondsOnDay = now - calendar.getTimeInMillis();
		long delay = scheduledEvent.getOffset() - millisecondsOnDay;
		while (delay<0) delay += scheduledEvent.getFrequency();
		/*ScheduledFuture<?> thread = */
		PrivateScheduledEventThread privateScheduledEventThread = new PrivateScheduledEventThread(scheduledEvent);

		scheduler.scheduleAtFixedRate(privateScheduledEventThread, delay, scheduledEvent.getFrequency(), TimeUnit.MILLISECONDS);
		scheduledEventServices.put(name, scheduler);
		scheduledEventThreads.put(name, privateScheduledEventThread);
		logger.info("Started dynamic scheduled event " + name);
		return true;
	}
	
	public static boolean stopScheduledEvent(ScheduledEvent scheduledEvent) {
		return stopScheduledEvent(scheduledEvent.getMicroflowName());
	}
	private static boolean stopScheduledEvent(String name) {
		PrivateScheduledEventThread privateScheduledEventThread = scheduledEventThreads.get(name);
		if (privateScheduledEventThread==null) return false;
		privateScheduledEventThread.stop();
		scheduledEventThreads.remove(name);
		ScheduledExecutorService scheduler = scheduledEventServices.get(name);
		scheduledEventServices.remove(name);
		if (scheduler!=null && !scheduler.isShutdown() && !scheduler.isTerminated()) {
			try {
				scheduler.shutdown();
			} catch (Exception e) {
				logger.warn("Cannot shutdown ScheduledExecutorService, but thread is inactivated and will not be started again.", e);
				try {
					scheduler.shutdownNow();
				} catch (Exception e1) {
					logger.warn("Cannot shutdownNow ScheduledExecutorService.", e1);
					try {
						scheduler.awaitTermination(30, TimeUnit.SECONDS);
					} catch (Exception e2) {
						logger.warn("Cannot awaitTermination ScheduledExecutorService.", e2);
						return false;
					}
				}
			}
		}
		logger.info("Stopped dynamic scheduled event " + name);
		return true;
	}
	
	public static boolean isRunningScheduledEvent(ScheduledEvent scheduledEvent) {
		String name = scheduledEvent.getMicroflowName();
		if (name==null) return false;
		ScheduledExecutorService scheduler = scheduledEventServices.get(name);
		if (scheduler!=null && !scheduler.isShutdown() && !scheduler.isTerminated()) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean stopAllScheduledEvent() {
		boolean result = true;
		for (String schedulerKey:scheduledEventServices.keySet()) {
			if (!stopScheduledEvent(schedulerKey)) result = false;
		}
		return result;
	}
	
	private static class PrivateScheduledEventThread implements Runnable {
		private ScheduledEvent scheduledEvent1;
		private String MicroflowName1;
		private volatile boolean active = true;
		PrivateScheduledEventThread(ScheduledEvent scheduledEvent) {
			this.scheduledEvent1 = scheduledEvent;
			this.MicroflowName1 = scheduledEvent.getMicroflowName();
		}
		
		public void stop() {
			active = false;
		}
		
		public void run() {
			if (!active || Thread.currentThread().isInterrupted()) return;
			
			Thread.currentThread().setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
		        @Override
		        public void uncaughtException(Thread t, Throwable e) {
		            logger.error("uncaughtException "+e.getMessage()+"in " + MicroflowName1, e);
		        }
		    });
			
			Thread.currentThread().setName("PrivateScheduledEvent " + privateID.incrementAndGet() + " for microflow " + MicroflowName1);
	    	Date start = new Date();
	    	ScheduledEventAudit scheduledEventAudit = new ScheduledEventAudit(Core.createSystemContext());
	    	scheduledEventAudit.setScheduledEventAudit_ScheduledEvent(scheduledEvent1);
	    	try {
				if (!active || Thread.currentThread().isInterrupted()) return;
				scheduledEventAudit.commit();
			} catch (CoreException e1) {
				logger.error("Error committing new ScheduledEventAudit record in " + MicroflowName1, e1);
			}
			try {
				if (!active || Thread.currentThread().isInterrupted()) return;
				logger.trace("Running executing dynamic scheduled event microflow " + MicroflowName1);
				Core.execute(Core.createSystemContext(), MicroflowName1);				
				logger.trace("Finished executing dynamic scheduled event microflow " + MicroflowName1 );
				if (!active || Thread.currentThread().isInterrupted()) return;
			} catch (Exception e) {
				logger.error("Failed to execute dynamic scheduled event microflow " + MicroflowName1 + ".", e);
			}

			Date end = new Date();
			Long millis = end.getTime() - start.getTime();
			scheduledEventAudit.setDuration(millis);
			scheduledEventAudit.setIsFinished(true);
			scheduledEventAudit.setStop(end);
			try {
				if (!active || Thread.currentThread().isInterrupted()) return;
				scheduledEventAudit.commit();
			} catch (CoreException e1) {
				logger.error("Error committing updated ScheduledEventAudit record in " + MicroflowName1, e1);
			}
			
			scheduledEvent1.setLastRun(end);
			try {
				if (!active || Thread.currentThread().isInterrupted()) return;
				scheduledEvent1.commit();
			} catch (CoreException e1) {
				logger.error("Error committing updated ScheduledEvent record in " + MicroflowName1, e1);
			}
			logger.debug("Executed dynamic scheduled event microflow " + MicroflowName1 + " in " + millis + " ms.");
	    }
	}
}
