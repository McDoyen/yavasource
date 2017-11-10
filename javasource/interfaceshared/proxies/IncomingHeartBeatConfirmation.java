// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfaceshared.proxies;

public class IncomingHeartBeatConfirmation extends interfaceshared.proxies.IncomingConfirmation
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceShared.IncomingHeartBeatConfirmation";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ConfirmationMessageID("ConfirmationMessageID"),
		InterfaceName("InterfaceName"),
		ExternalReferenceID("ExternalReferenceID"),
		InternalReferenceID("InternalReferenceID"),
		SuccessfullyProcessed("SuccessfullyProcessed"),
		MessageID("MessageID"),
		MessageType("MessageType"),
		MessageDirection("MessageDirection"),
		Status("Status"),
		RetrievedInterfaceName("RetrievedInterfaceName"),
		CreatedByCustomMessage("CreatedByCustomMessage"),
		UU95_IncomingHeartBeatConfirmation_IncomingHeartBeat("InterfaceShared.UU95_IncomingHeartBeatConfirmation_IncomingHeartBeat"),
		IncomingConfirmation_OutgoingMessage("InterfaceShared.IncomingConfirmation_OutgoingMessage"),
		IncomingMessage_SynchronousResponse("InterfaceShared.IncomingMessage_SynchronousResponse"),
		BooleanWrapper_Message("InterfaceShared.BooleanWrapper_Message"),
		Message_IndexData("InterfaceShared.Message_IndexData"),
		Message_InterfaceMessageConfiguration("InterfaceShared.Message_InterfaceMessageConfiguration"),
		Message_InterfaceConfiguration("InterfaceShared.Message_InterfaceConfiguration");

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

	public IncomingHeartBeatConfirmation(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceShared.IncomingHeartBeatConfirmation"));
	}

	protected IncomingHeartBeatConfirmation(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject incomingHeartBeatConfirmationMendixObject)
	{
		super(context, incomingHeartBeatConfirmationMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceShared.IncomingHeartBeatConfirmation", incomingHeartBeatConfirmationMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceShared.IncomingHeartBeatConfirmation");
	}

	/**
	 * @deprecated Use 'IncomingHeartBeatConfirmation.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfaceshared.proxies.IncomingHeartBeatConfirmation initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfaceshared.proxies.IncomingHeartBeatConfirmation.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfaceshared.proxies.IncomingHeartBeatConfirmation initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfaceshared.proxies.IncomingHeartBeatConfirmation(context, mendixObject);
	}

	public static interfaceshared.proxies.IncomingHeartBeatConfirmation load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfaceshared.proxies.IncomingHeartBeatConfirmation.initialize(context, mendixObject);
	}

	public static java.util.List<interfaceshared.proxies.IncomingHeartBeatConfirmation> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfaceshared.proxies.IncomingHeartBeatConfirmation> result = new java.util.ArrayList<interfaceshared.proxies.IncomingHeartBeatConfirmation>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceShared.IncomingHeartBeatConfirmation" + xpathConstraint))
			result.add(interfaceshared.proxies.IncomingHeartBeatConfirmation.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of UU95_IncomingHeartBeatConfirmation_IncomingHeartBeat
	 */
	public final interfaceshared.proxies.IncomingHeartBeat getUU95_IncomingHeartBeatConfirmation_IncomingHeartBeat() throws com.mendix.core.CoreException
	{
		return getUU95_IncomingHeartBeatConfirmation_IncomingHeartBeat(getContext());
	}

	/**
	 * @param context
	 * @return value of UU95_IncomingHeartBeatConfirmation_IncomingHeartBeat
	 */
	public final interfaceshared.proxies.IncomingHeartBeat getUU95_IncomingHeartBeatConfirmation_IncomingHeartBeat(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceshared.proxies.IncomingHeartBeat result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.UU95_IncomingHeartBeatConfirmation_IncomingHeartBeat.toString());
		if (identifier != null)
			result = interfaceshared.proxies.IncomingHeartBeat.load(context, identifier);
		return result;
	}

	/**
	 * Set value of UU95_IncomingHeartBeatConfirmation_IncomingHeartBeat
	 * @param uu95_incomingheartbeatconfirmation_incomingheartbeat
	 */
	public final void setUU95_IncomingHeartBeatConfirmation_IncomingHeartBeat(interfaceshared.proxies.IncomingHeartBeat uu95_incomingheartbeatconfirmation_incomingheartbeat)
	{
		setUU95_IncomingHeartBeatConfirmation_IncomingHeartBeat(getContext(), uu95_incomingheartbeatconfirmation_incomingheartbeat);
	}

	/**
	 * Set value of UU95_IncomingHeartBeatConfirmation_IncomingHeartBeat
	 * @param context
	 * @param uu95_incomingheartbeatconfirmation_incomingheartbeat
	 */
	public final void setUU95_IncomingHeartBeatConfirmation_IncomingHeartBeat(com.mendix.systemwideinterfaces.core.IContext context, interfaceshared.proxies.IncomingHeartBeat uu95_incomingheartbeatconfirmation_incomingheartbeat)
	{
		if (uu95_incomingheartbeatconfirmation_incomingheartbeat == null)
			getMendixObject().setValue(context, MemberNames.UU95_IncomingHeartBeatConfirmation_IncomingHeartBeat.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.UU95_IncomingHeartBeatConfirmation_IncomingHeartBeat.toString(), uu95_incomingheartbeatconfirmation_incomingheartbeat.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfaceshared.proxies.IncomingHeartBeatConfirmation that = (interfaceshared.proxies.IncomingHeartBeatConfirmation) obj;
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
		return "InterfaceShared.IncomingHeartBeatConfirmation";
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