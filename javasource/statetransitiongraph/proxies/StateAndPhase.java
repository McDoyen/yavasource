// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package statetransitiongraph.proxies;

public class StateAndPhase
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject stateAndPhaseMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "StateTransitionGraph.StateAndPhase";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FromState("FromState"),
		FromPhase("FromPhase"),
		AutoID("AutoID"),
		ToPhase("ToPhase"),
		ToState("ToState"),
		StartPoint("StartPoint"),
		StateAndPhase_Matrix("StateTransitionGraph.StateAndPhase_Matrix"),
		StateAndPhase_Transition("StateTransitionGraph.StateAndPhase_Transition");

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

	public StateAndPhase(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "StateTransitionGraph.StateAndPhase"));
	}

	protected StateAndPhase(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject stateAndPhaseMendixObject)
	{
		if (stateAndPhaseMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("StateTransitionGraph.StateAndPhase", stateAndPhaseMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a StateTransitionGraph.StateAndPhase");

		this.stateAndPhaseMendixObject = stateAndPhaseMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'StateAndPhase.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static statetransitiongraph.proxies.StateAndPhase initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return statetransitiongraph.proxies.StateAndPhase.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static statetransitiongraph.proxies.StateAndPhase initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new statetransitiongraph.proxies.StateAndPhase(context, mendixObject);
	}

	public static statetransitiongraph.proxies.StateAndPhase load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return statetransitiongraph.proxies.StateAndPhase.initialize(context, mendixObject);
	}

	public static java.util.List<statetransitiongraph.proxies.StateAndPhase> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<statetransitiongraph.proxies.StateAndPhase> result = new java.util.ArrayList<statetransitiongraph.proxies.StateAndPhase>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//StateTransitionGraph.StateAndPhase" + xpathConstraint))
			result.add(statetransitiongraph.proxies.StateAndPhase.initialize(context, obj));
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
	 * @return value of FromState
	 */
	public final java.lang.String getFromState()
	{
		return getFromState(getContext());
	}

	/**
	 * @param context
	 * @return value of FromState
	 */
	public final java.lang.String getFromState(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FromState.toString());
	}

	/**
	 * Set value of FromState
	 * @param fromstate
	 */
	public final void setFromState(java.lang.String fromstate)
	{
		setFromState(getContext(), fromstate);
	}

	/**
	 * Set value of FromState
	 * @param context
	 * @param fromstate
	 */
	public final void setFromState(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String fromstate)
	{
		getMendixObject().setValue(context, MemberNames.FromState.toString(), fromstate);
	}

	/**
	 * @return value of FromPhase
	 */
	public final java.lang.String getFromPhase()
	{
		return getFromPhase(getContext());
	}

	/**
	 * @param context
	 * @return value of FromPhase
	 */
	public final java.lang.String getFromPhase(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FromPhase.toString());
	}

	/**
	 * Set value of FromPhase
	 * @param fromphase
	 */
	public final void setFromPhase(java.lang.String fromphase)
	{
		setFromPhase(getContext(), fromphase);
	}

	/**
	 * Set value of FromPhase
	 * @param context
	 * @param fromphase
	 */
	public final void setFromPhase(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String fromphase)
	{
		getMendixObject().setValue(context, MemberNames.FromPhase.toString(), fromphase);
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
	 * @return value of ToPhase
	 */
	public final java.lang.String getToPhase()
	{
		return getToPhase(getContext());
	}

	/**
	 * @param context
	 * @return value of ToPhase
	 */
	public final java.lang.String getToPhase(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ToPhase.toString());
	}

	/**
	 * Set value of ToPhase
	 * @param tophase
	 */
	public final void setToPhase(java.lang.String tophase)
	{
		setToPhase(getContext(), tophase);
	}

	/**
	 * Set value of ToPhase
	 * @param context
	 * @param tophase
	 */
	public final void setToPhase(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String tophase)
	{
		getMendixObject().setValue(context, MemberNames.ToPhase.toString(), tophase);
	}

	/**
	 * @return value of ToState
	 */
	public final java.lang.String getToState()
	{
		return getToState(getContext());
	}

	/**
	 * @param context
	 * @return value of ToState
	 */
	public final java.lang.String getToState(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ToState.toString());
	}

	/**
	 * Set value of ToState
	 * @param tostate
	 */
	public final void setToState(java.lang.String tostate)
	{
		setToState(getContext(), tostate);
	}

	/**
	 * Set value of ToState
	 * @param context
	 * @param tostate
	 */
	public final void setToState(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String tostate)
	{
		getMendixObject().setValue(context, MemberNames.ToState.toString(), tostate);
	}

	/**
	 * @return value of StartPoint
	 */
	public final java.lang.Boolean getStartPoint()
	{
		return getStartPoint(getContext());
	}

	/**
	 * @param context
	 * @return value of StartPoint
	 */
	public final java.lang.Boolean getStartPoint(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.StartPoint.toString());
	}

	/**
	 * Set value of StartPoint
	 * @param startpoint
	 */
	public final void setStartPoint(java.lang.Boolean startpoint)
	{
		setStartPoint(getContext(), startpoint);
	}

	/**
	 * Set value of StartPoint
	 * @param context
	 * @param startpoint
	 */
	public final void setStartPoint(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean startpoint)
	{
		getMendixObject().setValue(context, MemberNames.StartPoint.toString(), startpoint);
	}

	/**
	 * @return value of StateAndPhase_Matrix
	 */
	public final statetransition.proxies.Matrix getStateAndPhase_Matrix() throws com.mendix.core.CoreException
	{
		return getStateAndPhase_Matrix(getContext());
	}

	/**
	 * @param context
	 * @return value of StateAndPhase_Matrix
	 */
	public final statetransition.proxies.Matrix getStateAndPhase_Matrix(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		statetransition.proxies.Matrix result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.StateAndPhase_Matrix.toString());
		if (identifier != null)
			result = statetransition.proxies.Matrix.load(context, identifier);
		return result;
	}

	/**
	 * Set value of StateAndPhase_Matrix
	 * @param stateandphase_matrix
	 */
	public final void setStateAndPhase_Matrix(statetransition.proxies.Matrix stateandphase_matrix)
	{
		setStateAndPhase_Matrix(getContext(), stateandphase_matrix);
	}

	/**
	 * Set value of StateAndPhase_Matrix
	 * @param context
	 * @param stateandphase_matrix
	 */
	public final void setStateAndPhase_Matrix(com.mendix.systemwideinterfaces.core.IContext context, statetransition.proxies.Matrix stateandphase_matrix)
	{
		if (stateandphase_matrix == null)
			getMendixObject().setValue(context, MemberNames.StateAndPhase_Matrix.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.StateAndPhase_Matrix.toString(), stateandphase_matrix.getMendixObject().getId());
	}

	/**
	 * @return value of StateAndPhase_Transition
	 */
	public final statetransition.proxies.Transition getStateAndPhase_Transition() throws com.mendix.core.CoreException
	{
		return getStateAndPhase_Transition(getContext());
	}

	/**
	 * @param context
	 * @return value of StateAndPhase_Transition
	 */
	public final statetransition.proxies.Transition getStateAndPhase_Transition(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		statetransition.proxies.Transition result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.StateAndPhase_Transition.toString());
		if (identifier != null)
			result = statetransition.proxies.Transition.load(context, identifier);
		return result;
	}

	/**
	 * Set value of StateAndPhase_Transition
	 * @param stateandphase_transition
	 */
	public final void setStateAndPhase_Transition(statetransition.proxies.Transition stateandphase_transition)
	{
		setStateAndPhase_Transition(getContext(), stateandphase_transition);
	}

	/**
	 * Set value of StateAndPhase_Transition
	 * @param context
	 * @param stateandphase_transition
	 */
	public final void setStateAndPhase_Transition(com.mendix.systemwideinterfaces.core.IContext context, statetransition.proxies.Transition stateandphase_transition)
	{
		if (stateandphase_transition == null)
			getMendixObject().setValue(context, MemberNames.StateAndPhase_Transition.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.StateAndPhase_Transition.toString(), stateandphase_transition.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return stateAndPhaseMendixObject;
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
			final statetransitiongraph.proxies.StateAndPhase that = (statetransitiongraph.proxies.StateAndPhase) obj;
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
		return "StateTransitionGraph.StateAndPhase";
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