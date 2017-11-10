// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfaceexternalreferences.proxies;

public class OutgoingExternalReferencesConfirmation extends interfaceshared.proxies.OutgoingConfirmation
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceExternalReferences.OutgoingExternalReferencesConfirmation";

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

	public OutgoingExternalReferencesConfirmation(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceExternalReferences.OutgoingExternalReferencesConfirmation"));
	}

	protected OutgoingExternalReferencesConfirmation(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject outgoingExternalReferencesConfirmationMendixObject)
	{
		super(context, outgoingExternalReferencesConfirmationMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceExternalReferences.OutgoingExternalReferencesConfirmation", outgoingExternalReferencesConfirmationMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceExternalReferences.OutgoingExternalReferencesConfirmation");
	}

	/**
	 * @deprecated Use 'OutgoingExternalReferencesConfirmation.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmation initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmation.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmation initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmation(context, mendixObject);
	}

	public static interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmation load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmation.initialize(context, mendixObject);
	}

	public static java.util.List<interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmation> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmation> result = new java.util.ArrayList<interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmation>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceExternalReferences.OutgoingExternalReferencesConfirmation" + xpathConstraint))
			result.add(interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmation.initialize(context, obj));
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmation that = (interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmation) obj;
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
		return "InterfaceExternalReferences.OutgoingExternalReferencesConfirmation";
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