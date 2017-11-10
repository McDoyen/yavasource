package mendix.licensepoolmanager;


import java.util.Map;

import com.mendix.core.action.user.LoginAction;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.UserAction;

public class LPMLoginAction extends UserAction<LoginAction> {

	public LPMLoginAction(IContext context, Map<String, ? extends Object> params) {
		super(context);
	}

	@Override
	public LoginAction executeAction() throws Exception {
		//Core.logout(this.getContext().getSession());
		//return null;
		//AuthenticationRuntimeException
		throw new Exception("Login attempt for failed due to maximum number of concurrent users reached for license pool.");
	}
}