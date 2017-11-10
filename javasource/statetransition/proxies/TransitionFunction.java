// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package statetransition.proxies;

public class TransitionFunction
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject transitionFunctionMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "StateTransition.TransitionFunction";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Order("Order"),
		Delayed("Delayed"),
		ShowDelayed("ShowDelayed"),
		TransitionFunction_Function("StateTransition.TransitionFunction_Function"),
		TransitionFunction_Transition("StateTransition.TransitionFunction_Transition");

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

	public TransitionFunction(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "StateTransition.TransitionFunction"));
	}

	protected TransitionFunction(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject transitionFunctionMendixObject)
	{
		if (transitionFunctionMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("StateTransition.TransitionFunction", transitionFunctionMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a StateTransition.TransitionFunction");

		this.transitionFunctionMendixObject = transitionFunctionMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'TransitionFunction.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static statetransition.proxies.TransitionFunction initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return statetransition.proxies.TransitionFunction.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static statetransition.proxies.TransitionFunction initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new statetransition.proxies.TransitionFunction(context, mendixObject);
	}

	public static statetransition.proxies.TransitionFunction load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return statetransition.proxies.TransitionFunction.initialize(context, mendixObject);
	}

	public static java.util.List<statetransition.proxies.TransitionFunction> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<statetransition.proxies.TransitionFunction> result = new java.util.ArrayList<statetransition.proxies.TransitionFunction>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//StateTransition.TransitionFunction" + xpathConstraint))
			result.add(statetransition.proxies.TransitionFunction.initialize(context, obj));
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
	 * @return value of Order
	 */
	public final java.lang.Integer getOrder()
	{
		return getOrder(getContext());
	}

	/**
	 * @param context
	 * @return value of Order
	 */
	public final java.lang.Integer getOrder(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Order.toString());
	}

	/**
	 * Set value of Order
	 * @param order
	 */
	public final void setOrder(java.lang.Integer order)
	{
		setOrder(getContext(), order);
	}

	/**
	 * Set value of Order
	 * @param context
	 * @param order
	 */
	public final void setOrder(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer order)
	{
		getMendixObject().setValue(context, MemberNames.Order.toString(), order);
	}

	/**
	 * @return value of Delayed
	 */
	public final java.lang.Boolean getDelayed()
	{
		return getDelayed(getContext());
	}

	/**
	 * @param context
	 * @return value of Delayed
	 */
	public final java.lang.Boolean getDelayed(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Delayed.toString());
	}

	/**
	 * Set value of Delayed
	 * @param delayed
	 */
	public final void setDelayed(java.lang.Boolean delayed)
	{
		setDelayed(getContext(), delayed);
	}

	/**
	 * Set value of Delayed
	 * @param context
	 * @param delayed
	 */
	public final void setDelayed(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean delayed)
	{
		getMendixObject().setValue(context, MemberNames.Delayed.toString(), delayed);
	}

	/**
	 * @return value of ShowDelayed
	 */
	public final java.lang.Boolean getShowDelayed()
	{
		return getShowDelayed(getContext());
	}

	/**
	 * @param context
	 * @return value of ShowDelayed
	 */
	public final java.lang.Boolean getShowDelayed(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ShowDelayed.toString());
	}

	/**
	 * Set value of ShowDelayed
	 * @param showdelayed
	 */
	public final void setShowDelayed(java.lang.Boolean showdelayed)
	{
		setShowDelayed(getContext(), showdelayed);
	}

	/**
	 * Set value of ShowDelayed
	 * @param context
	 * @param showdelayed
	 */
	public final void setShowDelayed(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean showdelayed)
	{
		getMendixObject().setValue(context, MemberNames.ShowDelayed.toString(), showdelayed);
	}

	/**
	 * @return value of TransitionFunction_Function
	 */
	public final statetransition.proxies.Function getTransitionFunction_Function() throws com.mendix.core.CoreException
	{
		return getTransitionFunction_Function(getContext());
	}

	/**
	 * @param context
	 * @return value of TransitionFunction_Function
	 */
	public final statetransition.proxies.Function getTransitionFunction_Function(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		statetransition.proxies.Function result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TransitionFunction_Function.toString());
		if (identifier != null)
			result = statetransition.proxies.Function.load(context, identifier);
		return result;
	}

	/**
	 * Set value of TransitionFunction_Function
	 * @param transitionfunction_function
	 */
	public final void setTransitionFunction_Function(statetransition.proxies.Function transitionfunction_function)
	{
		setTransitionFunction_Function(getContext(), transitionfunction_function);
	}

	/**
	 * Set value of TransitionFunction_Function
	 * @param context
	 * @param transitionfunction_function
	 */
	public final void setTransitionFunction_Function(com.mendix.systemwideinterfaces.core.IContext context, statetransition.proxies.Function transitionfunction_function)
	{
		if (transitionfunction_function == null)
			getMendixObject().setValue(context, MemberNames.TransitionFunction_Function.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.TransitionFunction_Function.toString(), transitionfunction_function.getMendixObject().getId());
	}

	/**
	 * @return value of TransitionFunction_Transition
	 */
	public final statetransition.proxies.Transition getTransitionFunction_Transition() throws com.mendix.core.CoreException
	{
		return getTransitionFunction_Transition(getContext());
	}

	/**
	 * @param context
	 * @return value of TransitionFunction_Transition
	 */
	public final statetransition.proxies.Transition getTransitionFunction_Transition(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		statetransition.proxies.Transition result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TransitionFunction_Transition.toString());
		if (identifier != null)
			result = statetransition.proxies.Transition.load(context, identifier);
		return result;
	}

	/**
	 * Set value of TransitionFunction_Transition
	 * @param transitionfunction_transition
	 */
	public final void setTransitionFunction_Transition(statetransition.proxies.Transition transitionfunction_transition)
	{
		setTransitionFunction_Transition(getContext(), transitionfunction_transition);
	}

	/**
	 * Set value of TransitionFunction_Transition
	 * @param context
	 * @param transitionfunction_transition
	 */
	public final void setTransitionFunction_Transition(com.mendix.systemwideinterfaces.core.IContext context, statetransition.proxies.Transition transitionfunction_transition)
	{
		if (transitionfunction_transition == null)
			getMendixObject().setValue(context, MemberNames.TransitionFunction_Transition.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.TransitionFunction_Transition.toString(), transitionfunction_transition.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return transitionFunctionMendixObject;
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
			final statetransition.proxies.TransitionFunction that = (statetransition.proxies.TransitionFunction) obj;
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
		return "StateTransition.TransitionFunction";
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
