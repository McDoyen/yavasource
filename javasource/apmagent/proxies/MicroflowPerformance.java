// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package apmagent.proxies;

public class MicroflowPerformance
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject microflowPerformanceMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "APMAgent.MicroflowPerformance";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Duration("Duration"),
		Timestamp("Timestamp"),
		Key("Key"),
		IsMain("IsMain"),
		IsLoop("IsLoop"),
		IsNoStart("IsNoStart"),
		IsNoEnd("IsNoEnd"),
		PerformanceType("PerformanceType"),
		Marker("Marker"),
		PathIndex("PathIndex"),
		AutoID("AutoID"),
		CalledByActionID("CalledByActionID"),
		IterationByLoopActionID("IterationByLoopActionID"),
		EndTime("EndTime"),
		hostname("hostname"),
		Message("Message"),
		HasSQLStatements("HasSQLStatements"),
		RemoteID("RemoteID"),
		User("User"),
		MicroflowPerformanceIteration_LoopAction("APMAgent.MicroflowPerformanceIteration_LoopAction"),
		MicroflowPerformance_CalledByAction("APMAgent.MicroflowPerformance_CalledByAction");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public MicroflowPerformance(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "APMAgent.MicroflowPerformance"));
	}

	protected MicroflowPerformance(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject microflowPerformanceMendixObject)
	{
		if (microflowPerformanceMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("APMAgent.MicroflowPerformance", microflowPerformanceMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a APMAgent.MicroflowPerformance");

		this.microflowPerformanceMendixObject = microflowPerformanceMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'MicroflowPerformance.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static apmagent.proxies.MicroflowPerformance initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return apmagent.proxies.MicroflowPerformance.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static apmagent.proxies.MicroflowPerformance initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new apmagent.proxies.MicroflowPerformance(context, mendixObject);
	}

	public static apmagent.proxies.MicroflowPerformance load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return apmagent.proxies.MicroflowPerformance.initialize(context, mendixObject);
	}

	public static java.util.List<apmagent.proxies.MicroflowPerformance> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<apmagent.proxies.MicroflowPerformance> result = new java.util.ArrayList<apmagent.proxies.MicroflowPerformance>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//APMAgent.MicroflowPerformance" + xpathConstraint))
			result.add(apmagent.proxies.MicroflowPerformance.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of Duration
	 */
	public final java.lang.Long getDuration()
	{
		return getDuration(getContext());
	}

	/**
	 * @param context
	 * @return value of Duration
	 */
	public final java.lang.Long getDuration(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.Duration.toString());
	}

	/**
	 * Set value of Duration
	 * @param duration
	 */
	public final void setDuration(java.lang.Long duration)
	{
		setDuration(getContext(), duration);
	}

	/**
	 * Set value of Duration
	 * @param context
	 * @param duration
	 */
	public final void setDuration(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long duration)
	{
		getMendixObject().setValue(context, MemberNames.Duration.toString(), duration);
	}

	/**
	 * @return value of Timestamp
	 */
	public final java.util.Date getTimestamp()
	{
		return getTimestamp(getContext());
	}

	/**
	 * @param context
	 * @return value of Timestamp
	 */
	public final java.util.Date getTimestamp(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Timestamp.toString());
	}

	/**
	 * Set value of Timestamp
	 * @param timestamp
	 */
	public final void setTimestamp(java.util.Date timestamp)
	{
		setTimestamp(getContext(), timestamp);
	}

	/**
	 * Set value of Timestamp
	 * @param context
	 * @param timestamp
	 */
	public final void setTimestamp(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date timestamp)
	{
		getMendixObject().setValue(context, MemberNames.Timestamp.toString(), timestamp);
	}

	/**
	 * @return value of Key
	 */
	public final java.lang.String getKey()
	{
		return getKey(getContext());
	}

	/**
	 * @param context
	 * @return value of Key
	 */
	public final java.lang.String getKey(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Key.toString());
	}

	/**
	 * Set value of Key
	 * @param key
	 */
	public final void setKey(java.lang.String key)
	{
		setKey(getContext(), key);
	}

	/**
	 * Set value of Key
	 * @param context
	 * @param key
	 */
	public final void setKey(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String key)
	{
		getMendixObject().setValue(context, MemberNames.Key.toString(), key);
	}

	/**
	 * @return value of IsMain
	 */
	public final java.lang.Boolean getIsMain()
	{
		return getIsMain(getContext());
	}

	/**
	 * @param context
	 * @return value of IsMain
	 */
	public final java.lang.Boolean getIsMain(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsMain.toString());
	}

	/**
	 * Set value of IsMain
	 * @param ismain
	 */
	public final void setIsMain(java.lang.Boolean ismain)
	{
		setIsMain(getContext(), ismain);
	}

	/**
	 * Set value of IsMain
	 * @param context
	 * @param ismain
	 */
	public final void setIsMain(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean ismain)
	{
		getMendixObject().setValue(context, MemberNames.IsMain.toString(), ismain);
	}

	/**
	 * @return value of IsLoop
	 */
	public final java.lang.Boolean getIsLoop()
	{
		return getIsLoop(getContext());
	}

	/**
	 * @param context
	 * @return value of IsLoop
	 */
	public final java.lang.Boolean getIsLoop(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsLoop.toString());
	}

	/**
	 * Set value of IsLoop
	 * @param isloop
	 */
	public final void setIsLoop(java.lang.Boolean isloop)
	{
		setIsLoop(getContext(), isloop);
	}

	/**
	 * Set value of IsLoop
	 * @param context
	 * @param isloop
	 */
	public final void setIsLoop(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isloop)
	{
		getMendixObject().setValue(context, MemberNames.IsLoop.toString(), isloop);
	}

	/**
	 * @return value of IsNoStart
	 */
	public final java.lang.Boolean getIsNoStart()
	{
		return getIsNoStart(getContext());
	}

	/**
	 * @param context
	 * @return value of IsNoStart
	 */
	public final java.lang.Boolean getIsNoStart(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsNoStart.toString());
	}

	/**
	 * Set value of IsNoStart
	 * @param isnostart
	 */
	public final void setIsNoStart(java.lang.Boolean isnostart)
	{
		setIsNoStart(getContext(), isnostart);
	}

	/**
	 * Set value of IsNoStart
	 * @param context
	 * @param isnostart
	 */
	public final void setIsNoStart(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isnostart)
	{
		getMendixObject().setValue(context, MemberNames.IsNoStart.toString(), isnostart);
	}

	/**
	 * @return value of IsNoEnd
	 */
	public final java.lang.Boolean getIsNoEnd()
	{
		return getIsNoEnd(getContext());
	}

	/**
	 * @param context
	 * @return value of IsNoEnd
	 */
	public final java.lang.Boolean getIsNoEnd(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsNoEnd.toString());
	}

	/**
	 * Set value of IsNoEnd
	 * @param isnoend
	 */
	public final void setIsNoEnd(java.lang.Boolean isnoend)
	{
		setIsNoEnd(getContext(), isnoend);
	}

	/**
	 * Set value of IsNoEnd
	 * @param context
	 * @param isnoend
	 */
	public final void setIsNoEnd(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isnoend)
	{
		getMendixObject().setValue(context, MemberNames.IsNoEnd.toString(), isnoend);
	}

	/**
	 * Set value of PerformanceType
	 * @param performancetype
	 */
	public final apmagent.proxies.PerformanceTypeEnum getPerformanceType()
	{
		return getPerformanceType(getContext());
	}

	/**
	 * @param context
	 * @return value of PerformanceType
	 */
	public final apmagent.proxies.PerformanceTypeEnum getPerformanceType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.PerformanceType.toString());
		if (obj == null)
			return null;

		return apmagent.proxies.PerformanceTypeEnum.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of PerformanceType
	 * @param performancetype
	 */
	public final void setPerformanceType(apmagent.proxies.PerformanceTypeEnum performancetype)
	{
		setPerformanceType(getContext(), performancetype);
	}

	/**
	 * Set value of PerformanceType
	 * @param context
	 * @param performancetype
	 */
	public final void setPerformanceType(com.mendix.systemwideinterfaces.core.IContext context, apmagent.proxies.PerformanceTypeEnum performancetype)
	{
		if (performancetype != null)
			getMendixObject().setValue(context, MemberNames.PerformanceType.toString(), performancetype.toString());
		else
			getMendixObject().setValue(context, MemberNames.PerformanceType.toString(), null);
	}

	/**
	 * @return value of Marker
	 */
	public final java.lang.String getMarker()
	{
		return getMarker(getContext());
	}

	/**
	 * @param context
	 * @return value of Marker
	 */
	public final java.lang.String getMarker(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Marker.toString());
	}

	/**
	 * Set value of Marker
	 * @param marker
	 */
	public final void setMarker(java.lang.String marker)
	{
		setMarker(getContext(), marker);
	}

	/**
	 * Set value of Marker
	 * @param context
	 * @param marker
	 */
	public final void setMarker(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String marker)
	{
		getMendixObject().setValue(context, MemberNames.Marker.toString(), marker);
	}

	/**
	 * @return value of PathIndex
	 */
	public final java.lang.Integer getPathIndex()
	{
		return getPathIndex(getContext());
	}

	/**
	 * @param context
	 * @return value of PathIndex
	 */
	public final java.lang.Integer getPathIndex(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.PathIndex.toString());
	}

	/**
	 * Set value of PathIndex
	 * @param pathindex
	 */
	public final void setPathIndex(java.lang.Integer pathindex)
	{
		setPathIndex(getContext(), pathindex);
	}

	/**
	 * Set value of PathIndex
	 * @param context
	 * @param pathindex
	 */
	public final void setPathIndex(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer pathindex)
	{
		getMendixObject().setValue(context, MemberNames.PathIndex.toString(), pathindex);
	}

	/**
	 * @return value of AutoID
	 */
	public final java.lang.Long getAutoID()
	{
		return getAutoID(getContext());
	}

	/**
	 * @param context
	 * @return value of AutoID
	 */
	public final java.lang.Long getAutoID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.AutoID.toString());
	}

	/**
	 * Set value of AutoID
	 * @param autoid
	 */
	public final void setAutoID(java.lang.Long autoid)
	{
		setAutoID(getContext(), autoid);
	}

	/**
	 * Set value of AutoID
	 * @param context
	 * @param autoid
	 */
	public final void setAutoID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long autoid)
	{
		getMendixObject().setValue(context, MemberNames.AutoID.toString(), autoid);
	}

	/**
	 * @return value of CalledByActionID
	 */
	public final java.lang.Long getCalledByActionID()
	{
		return getCalledByActionID(getContext());
	}

	/**
	 * @param context
	 * @return value of CalledByActionID
	 */
	public final java.lang.Long getCalledByActionID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.CalledByActionID.toString());
	}

	/**
	 * Set value of CalledByActionID
	 * @param calledbyactionid
	 */
	public final void setCalledByActionID(java.lang.Long calledbyactionid)
	{
		setCalledByActionID(getContext(), calledbyactionid);
	}

	/**
	 * Set value of CalledByActionID
	 * @param context
	 * @param calledbyactionid
	 */
	public final void setCalledByActionID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long calledbyactionid)
	{
		getMendixObject().setValue(context, MemberNames.CalledByActionID.toString(), calledbyactionid);
	}

	/**
	 * @return value of IterationByLoopActionID
	 */
	public final java.lang.Long getIterationByLoopActionID()
	{
		return getIterationByLoopActionID(getContext());
	}

	/**
	 * @param context
	 * @return value of IterationByLoopActionID
	 */
	public final java.lang.Long getIterationByLoopActionID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.IterationByLoopActionID.toString());
	}

	/**
	 * Set value of IterationByLoopActionID
	 * @param iterationbyloopactionid
	 */
	public final void setIterationByLoopActionID(java.lang.Long iterationbyloopactionid)
	{
		setIterationByLoopActionID(getContext(), iterationbyloopactionid);
	}

	/**
	 * Set value of IterationByLoopActionID
	 * @param context
	 * @param iterationbyloopactionid
	 */
	public final void setIterationByLoopActionID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long iterationbyloopactionid)
	{
		getMendixObject().setValue(context, MemberNames.IterationByLoopActionID.toString(), iterationbyloopactionid);
	}

	/**
	 * @return value of EndTime
	 */
	public final java.util.Date getEndTime()
	{
		return getEndTime(getContext());
	}

	/**
	 * @param context
	 * @return value of EndTime
	 */
	public final java.util.Date getEndTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.EndTime.toString());
	}

	/**
	 * Set value of EndTime
	 * @param endtime
	 */
	public final void setEndTime(java.util.Date endtime)
	{
		setEndTime(getContext(), endtime);
	}

	/**
	 * Set value of EndTime
	 * @param context
	 * @param endtime
	 */
	public final void setEndTime(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date endtime)
	{
		getMendixObject().setValue(context, MemberNames.EndTime.toString(), endtime);
	}

	/**
	 * @return value of hostname
	 */
	public final java.lang.String gethostname()
	{
		return gethostname(getContext());
	}

	/**
	 * @param context
	 * @return value of hostname
	 */
	public final java.lang.String gethostname(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.hostname.toString());
	}

	/**
	 * Set value of hostname
	 * @param hostname
	 */
	public final void sethostname(java.lang.String hostname)
	{
		sethostname(getContext(), hostname);
	}

	/**
	 * Set value of hostname
	 * @param context
	 * @param hostname
	 */
	public final void sethostname(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String hostname)
	{
		getMendixObject().setValue(context, MemberNames.hostname.toString(), hostname);
	}

	/**
	 * @return value of Message
	 */
	public final java.lang.String getMessage()
	{
		return getMessage(getContext());
	}

	/**
	 * @param context
	 * @return value of Message
	 */
	public final java.lang.String getMessage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Message.toString());
	}

	/**
	 * Set value of Message
	 * @param message
	 */
	public final void setMessage(java.lang.String message)
	{
		setMessage(getContext(), message);
	}

	/**
	 * Set value of Message
	 * @param context
	 * @param message
	 */
	public final void setMessage(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String message)
	{
		getMendixObject().setValue(context, MemberNames.Message.toString(), message);
	}

	/**
	 * @return value of HasSQLStatements
	 */
	public final java.lang.Boolean getHasSQLStatements()
	{
		return getHasSQLStatements(getContext());
	}

	/**
	 * @param context
	 * @return value of HasSQLStatements
	 */
	public final java.lang.Boolean getHasSQLStatements(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.HasSQLStatements.toString());
	}

	/**
	 * Set value of HasSQLStatements
	 * @param hassqlstatements
	 */
	public final void setHasSQLStatements(java.lang.Boolean hassqlstatements)
	{
		setHasSQLStatements(getContext(), hassqlstatements);
	}

	/**
	 * Set value of HasSQLStatements
	 * @param context
	 * @param hassqlstatements
	 */
	public final void setHasSQLStatements(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean hassqlstatements)
	{
		getMendixObject().setValue(context, MemberNames.HasSQLStatements.toString(), hassqlstatements);
	}

	/**
	 * @return value of RemoteID
	 */
	public final java.lang.Long getRemoteID()
	{
		return getRemoteID(getContext());
	}

	/**
	 * @param context
	 * @return value of RemoteID
	 */
	public final java.lang.Long getRemoteID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.RemoteID.toString());
	}

	/**
	 * Set value of RemoteID
	 * @param remoteid
	 */
	public final void setRemoteID(java.lang.Long remoteid)
	{
		setRemoteID(getContext(), remoteid);
	}

	/**
	 * Set value of RemoteID
	 * @param context
	 * @param remoteid
	 */
	public final void setRemoteID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long remoteid)
	{
		getMendixObject().setValue(context, MemberNames.RemoteID.toString(), remoteid);
	}

	/**
	 * @return value of User
	 */
	public final java.lang.String getUser()
	{
		return getUser(getContext());
	}

	/**
	 * @param context
	 * @return value of User
	 */
	public final java.lang.String getUser(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.User.toString());
	}

	/**
	 * Set value of User
	 * @param user
	 */
	public final void setUser(java.lang.String user)
	{
		setUser(getContext(), user);
	}

	/**
	 * Set value of User
	 * @param context
	 * @param user
	 */
	public final void setUser(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String user)
	{
		getMendixObject().setValue(context, MemberNames.User.toString(), user);
	}

	/**
	 * @return value of MicroflowPerformanceIteration_LoopAction
	 */
	public final apmagent.proxies.ActionPerformance getMicroflowPerformanceIteration_LoopAction() throws com.mendix.core.CoreException
	{
		return getMicroflowPerformanceIteration_LoopAction(getContext());
	}

	/**
	 * @param context
	 * @return value of MicroflowPerformanceIteration_LoopAction
	 */
	public final apmagent.proxies.ActionPerformance getMicroflowPerformanceIteration_LoopAction(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		apmagent.proxies.ActionPerformance result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.MicroflowPerformanceIteration_LoopAction.toString());
		if (identifier != null)
			result = apmagent.proxies.ActionPerformance.load(context, identifier);
		return result;
	}

	/**
	 * Set value of MicroflowPerformanceIteration_LoopAction
	 * @param microflowperformanceiteration_loopaction
	 */
	public final void setMicroflowPerformanceIteration_LoopAction(apmagent.proxies.ActionPerformance microflowperformanceiteration_loopaction)
	{
		setMicroflowPerformanceIteration_LoopAction(getContext(), microflowperformanceiteration_loopaction);
	}

	/**
	 * Set value of MicroflowPerformanceIteration_LoopAction
	 * @param context
	 * @param microflowperformanceiteration_loopaction
	 */
	public final void setMicroflowPerformanceIteration_LoopAction(com.mendix.systemwideinterfaces.core.IContext context, apmagent.proxies.ActionPerformance microflowperformanceiteration_loopaction)
	{
		if (microflowperformanceiteration_loopaction == null)
			getMendixObject().setValue(context, MemberNames.MicroflowPerformanceIteration_LoopAction.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.MicroflowPerformanceIteration_LoopAction.toString(), microflowperformanceiteration_loopaction.getMendixObject().getId());
	}

	/**
	 * @return value of MicroflowPerformance_CalledByAction
	 */
	public final apmagent.proxies.ActionPerformance getMicroflowPerformance_CalledByAction() throws com.mendix.core.CoreException
	{
		return getMicroflowPerformance_CalledByAction(getContext());
	}

	/**
	 * @param context
	 * @return value of MicroflowPerformance_CalledByAction
	 */
	public final apmagent.proxies.ActionPerformance getMicroflowPerformance_CalledByAction(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		apmagent.proxies.ActionPerformance result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.MicroflowPerformance_CalledByAction.toString());
		if (identifier != null)
			result = apmagent.proxies.ActionPerformance.load(context, identifier);
		return result;
	}

	/**
	 * Set value of MicroflowPerformance_CalledByAction
	 * @param microflowperformance_calledbyaction
	 */
	public final void setMicroflowPerformance_CalledByAction(apmagent.proxies.ActionPerformance microflowperformance_calledbyaction)
	{
		setMicroflowPerformance_CalledByAction(getContext(), microflowperformance_calledbyaction);
	}

	/**
	 * Set value of MicroflowPerformance_CalledByAction
	 * @param context
	 * @param microflowperformance_calledbyaction
	 */
	public final void setMicroflowPerformance_CalledByAction(com.mendix.systemwideinterfaces.core.IContext context, apmagent.proxies.ActionPerformance microflowperformance_calledbyaction)
	{
		if (microflowperformance_calledbyaction == null)
			getMendixObject().setValue(context, MemberNames.MicroflowPerformance_CalledByAction.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.MicroflowPerformance_CalledByAction.toString(), microflowperformance_calledbyaction.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return microflowPerformanceMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final apmagent.proxies.MicroflowPerformance that = (apmagent.proxies.MicroflowPerformance) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "APMAgent.MicroflowPerformance";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
