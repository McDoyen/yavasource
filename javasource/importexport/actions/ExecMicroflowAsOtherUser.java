// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package importexport.actions;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.ISession;
import com.mendix.systemwideinterfaces.core.IUser;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class ExecMicroflowAsOtherUser extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String UserName;
	private java.lang.String MicroflowName;
	private IMendixObject InputObject;

	public ExecMicroflowAsOtherUser(IContext context, java.lang.String UserName, java.lang.String MicroflowName, IMendixObject InputObject)
	{
		super(context);
		this.UserName = UserName;
		this.MicroflowName = MicroflowName;
		this.InputObject = InputObject;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		// Basically a modified version of the community commons version
		IContext context = this.getContext();
		if (context == null)
			throw new Exception("Assertion: No context provided");
		if (MicroflowName == null || MicroflowName.isEmpty())
			throw new Exception("[ImportAsync] No context provided");
		if (!Core.getMicroflowNames().contains(MicroflowName))
			throw new Exception("[ImportAsync] Microflow not found: " + MicroflowName);
		IContext c = getContextFor(context, UserName);
		if (InputObject != null){
			//Core.getLogger("ImportAsync").info("Input object is of type " + InputObject.getMetaObject().getName());
			return Core.execute(c, MicroflowName, InputObject);
		}else{
			return Core.execute(c, MicroflowName);
		}
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "ExecMicroflowAsOtherUser";
	}

	// BEGIN EXTRA CODE
	
	private static IContext getContextFor(IContext context, String username) {
		if (username == null || username.isEmpty()) {
			throw new RuntimeException("[ImportAsync] No username provided");
		}
		ISession session = getSessionFor(context, username);
		IContext c = session.createContext();
		return c.createSudoClone();
		//return c.getSudoContext(); deprecated
	}

	private static ISession getSessionFor(IContext context, String username) {
		ISession session  = Core.getActiveSession(username);
		if (session == null) {
			IContext newContext = context.getSession().createContext().createSudoClone();//.getSudoContext(); deprecated
			newContext.startTransaction();
			try {
				session = initializeSessionForUser(newContext, username);
			} catch (CoreException e) {
				newContext.rollbackTransAction();
				
				throw new RuntimeException("[ImportAsync] Failed to initialize session for user: " + username + ": " + e.getMessage(), e);
			} finally {
				newContext.endTransaction();
			}
		}
		return session;
	}

	private static ISession initializeSessionForUser(IContext context, String username) throws CoreException {
		IUser user = Core.getUser(context, username);
		if (user == null) {
			throw new RuntimeException("[ImportAsync] User with username '" + username + "' does not exist");
		}

		return Core.initializeSession(user, null);
	}
	// END EXTRA CODE
}