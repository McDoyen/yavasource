// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package userstatistics.actions;

import java.util.Date;
import mendix.proxies.Account;
import mendix.proxies.LicensePool;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.ISession;
import com.mendix.systemwideinterfaces.core.IUser;
import communitycommons.XPath;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Updates a ConcurrentUserInfoObject with the actual stats.
 */
public class UpdateConcurrentUserInfo extends CustomJavaAction<java.lang.Boolean>
{
	private IMendixObject __concurrentUserInfoObj;
	private userstatistics.proxies.ConcurrentUserInfo concurrentUserInfoObj;

	public UpdateConcurrentUserInfo(IContext context, IMendixObject concurrentUserInfoObj)
	{
		super(context);
		this.__concurrentUserInfoObj = concurrentUserInfoObj;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.concurrentUserInfoObj = __concurrentUserInfoObj == null ? null : userstatistics.proxies.ConcurrentUserInfo.initialize(getContext(), __concurrentUserInfoObj);

		// BEGIN USER CODE
		LicensePool licensePool = concurrentUserInfoObj.getConcurrentUserInfo_LicensePool();
		Core.getLogger("UserStatistics").debug("Getting statistics on server "+concurrentUserInfoObj.getServerName()+" for " + (licensePool==null?"server.":"license pool " + licensePool.getName() + "."));
		int total = 0; 
		int named = 0; 
		int ws = 0; 
		int anon = 0;
		for(ISession session : Core.getActiveSessions()) { 
			Core.getLogger("UserStatistics").trace("Session " + session.getId().toString() + ".");
			if (session.getUser() != null){
				IUser user = session.getUser();
				if (licensePool!=null) {
					if (Core.isSubClassOf(Account.getType(), user.getMendixObject().getType())) {
						Account account = Account.initialize(this.getContext(), user.getMendixObject());
						LicensePool userLicensePool = account.getAccount_LicensePool();
						if (userLicensePool==null) {
							XPath<LicensePool> xPath = XPath.create(this.getContext(), mendix.proxies.LicensePool.class);
					        xPath.eq(LicensePool.MemberNames.IsDefault, true);
					        if (xPath.count()>0) {
					        	userLicensePool = xPath.first();
					        } else {
								Core.getLogger("UserStatistics").trace("User "+user.getName()+" has no license pool and there is no default license pool.");
					        	continue; // if no default license pool and user has no license pool then no pool check
					        }
						}
						if (!userLicensePool.equals(licensePool)) {
							Core.getLogger("UserStatistics").trace("User "+user.getName()+" is a member of different license pool " + userLicensePool.getName() + ".");
							continue;
						}
					} else {
						Core.getLogger("UserStatistics").trace("User is not an account so has no license pool");
						continue;  // if collecting statistics for a licensepool and the user is not an account then do not add up.
					}
				}
				total += 1;
				Core.getLogger("UserStatistics").trace("User "+user.getName()+" is a member of this license pool. Total is " + total + ".");
				if (user.isWebserviceUser()) {
					ws += 1;
					Core.getLogger("UserStatistics").trace("User "+user.getName()+" is a web service user. Web service users is " + ws + ".");
				} else if (user.isAnonymous()) {
					anon += 1;
					Core.getLogger("UserStatistics").trace("User "+user.getName()+" is an anonymous user. Anonymous users: " + anon + ".");
				} else {
					named += 1;
					Core.getLogger("UserStatistics").trace("User "+user.getName()+" is a normal/named user. Normal users: " + named + ".");
				}
			} else {
				Core.getLogger("UserStatistics").trace("Session without a user, so not added.");
			}
		}
		
		this.concurrentUserInfoObj.setAnonymous(anon);
		this.concurrentUserInfoObj.setNamed(named);
		this.concurrentUserInfoObj.setWebservice(ws);
		this.concurrentUserInfoObj.setTotal(total);
		this.concurrentUserInfoObj.setTimestamp(new Date());
		
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "UpdateConcurrentUserInfo";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}