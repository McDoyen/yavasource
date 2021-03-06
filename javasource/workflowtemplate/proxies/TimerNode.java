// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowtemplate.proxies;

public class TimerNode extends workflowtemplate.proxies.Node
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "WorkflowTemplate.TimerNode";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		TimeOut("TimeOut"),
		TimeOutStr("TimeOutStr"),
		InstanceID("InstanceID"),
		Order("Order"),
		Name("Name"),
		NodeType("NodeType"),
		TempInsertType("TempInsertType"),
		HasFromNodes("HasFromNodes"),
		HasToNodes("HasToNodes"),
		ValidationText("ValidationText"),
		Valid("Valid"),
		ResetChart("ResetChart"),
		Node_Workflow("WorkflowTemplate.Node_Workflow"),
		TempInsertAfterNodeTemplate("WorkflowTemplate.TempInsertAfterNodeTemplate"),
		EndNode_WorkflowResult("WorkflowTemplate.EndNode_WorkflowResult");

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

	public TimerNode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "WorkflowTemplate.TimerNode"));
	}

	protected TimerNode(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject timerNodeMendixObject)
	{
		super(context, timerNodeMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("WorkflowTemplate.TimerNode", timerNodeMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a WorkflowTemplate.TimerNode");
	}

	/**
	 * @deprecated Use 'TimerNode.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static workflowtemplate.proxies.TimerNode initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return workflowtemplate.proxies.TimerNode.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static workflowtemplate.proxies.TimerNode initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new workflowtemplate.proxies.TimerNode(context, mendixObject);
	}

	public static workflowtemplate.proxies.TimerNode load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return workflowtemplate.proxies.TimerNode.initialize(context, mendixObject);
	}

	public static java.util.List<workflowtemplate.proxies.TimerNode> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<workflowtemplate.proxies.TimerNode> result = new java.util.ArrayList<workflowtemplate.proxies.TimerNode>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//WorkflowTemplate.TimerNode" + xpathConstraint))
			result.add(workflowtemplate.proxies.TimerNode.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of TimeOut
	 */
	public final java.lang.Integer getTimeOut()
	{
		return getTimeOut(getContext());
	}

	/**
	 * @param context
	 * @return value of TimeOut
	 */
	public final java.lang.Integer getTimeOut(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.TimeOut.toString());
	}

	/**
	 * Set value of TimeOut
	 * @param timeout
	 */
	public final void setTimeOut(java.lang.Integer timeout)
	{
		setTimeOut(getContext(), timeout);
	}

	/**
	 * Set value of TimeOut
	 * @param context
	 * @param timeout
	 */
	public final void setTimeOut(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer timeout)
	{
		getMendixObject().setValue(context, MemberNames.TimeOut.toString(), timeout);
	}

	/**
	 * @return value of TimeOutStr
	 */
	public final java.lang.String getTimeOutStr()
	{
		return getTimeOutStr(getContext());
	}

	/**
	 * @param context
	 * @return value of TimeOutStr
	 */
	public final java.lang.String getTimeOutStr(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.TimeOutStr.toString());
	}

	/**
	 * Set value of TimeOutStr
	 * @param timeoutstr
	 */
	public final void setTimeOutStr(java.lang.String timeoutstr)
	{
		setTimeOutStr(getContext(), timeoutstr);
	}

	/**
	 * Set value of TimeOutStr
	 * @param context
	 * @param timeoutstr
	 */
	public final void setTimeOutStr(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String timeoutstr)
	{
		getMendixObject().setValue(context, MemberNames.TimeOutStr.toString(), timeoutstr);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final workflowtemplate.proxies.TimerNode that = (workflowtemplate.proxies.TimerNode) obj;
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
		return "WorkflowTemplate.TimerNode";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Override
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
