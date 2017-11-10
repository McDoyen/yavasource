// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfacecontractaspectupdates.proxies;

public class OutgoingContractAspectUpdateConfirmation extends interfaceshared.proxies.OutgoingConfirmation
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceContractAspectUpdates.OutgoingContractAspectUpdateConfirmation";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		NextRetry("NextRetry"),
		RetryByHeartBeat("RetryByHeartBeat"),
		MessageID("MessageID"),
		MessageType("MessageType"),
		MessageDirection("MessageDirection"),
		Status("Status"),
		RetrievedInterfaceName("RetrievedInterfaceName"),
		CreatedByCustomMessage("CreatedByCustomMessage"),
		ProcessingAttempt_OutgoingConfirmation("InterfaceShared.ProcessingAttempt_OutgoingConfirmation"),
		InterfaceEvent_OutgoingMessage("InterfaceShared.InterfaceEvent_OutgoingMessage"),
		IncomingConfirmation_OutgoingMessage("InterfaceShared.IncomingConfirmation_OutgoingMessage"),
		OutgoingMessage_QueuedByOutgoingMessage("InterfaceShared.OutgoingMessage_QueuedByOutgoingMessage"),
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

	public OutgoingContractAspectUpdateConfirmation(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceContractAspectUpdates.OutgoingContractAspectUpdateConfirmation"));
	}

	protected OutgoingContractAspectUpdateConfirmation(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject outgoingContractAspectUpdateConfirmationMendixObject)
	{
		super(context, outgoingContractAspectUpdateConfirmationMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceContractAspectUpdates.OutgoingContractAspectUpdateConfirmation", outgoingContractAspectUpdateConfirmationMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceContractAspectUpdates.OutgoingContractAspectUpdateConfirmation");
	}

	/**
	 * @deprecated Use 'OutgoingContractAspectUpdateConfirmation.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmation initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmation.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmation initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("InterfaceContractAspectUpdates.OutgoingContractAspectUpdateConfirmationMessageExpertDesk", mendixObject.getType()))
			return interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmationMessageExpertDesk.initialize(context, mendixObject);

		return new interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmation(context, mendixObject);
	}

	public static interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmation load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmation.initialize(context, mendixObject);
	}

	public static java.util.List<? extends interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmation> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmation> result = new java.util.ArrayList<interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmation>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceContractAspectUpdates.OutgoingContractAspectUpdateConfirmation" + xpathConstraint))
			result.add(interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmation.initialize(context, obj));
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmation that = (interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmation) obj;
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
		return "InterfaceContractAspectUpdates.OutgoingContractAspectUpdateConfirmation";
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