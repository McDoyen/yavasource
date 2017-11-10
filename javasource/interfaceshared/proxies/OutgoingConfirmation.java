// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfaceshared.proxies;

public class OutgoingConfirmation extends interfaceshared.proxies.OutgoingMessage
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceShared.OutgoingConfirmation";

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

	public OutgoingConfirmation(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceShared.OutgoingConfirmation"));
	}

	protected OutgoingConfirmation(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject outgoingConfirmationMendixObject)
	{
		super(context, outgoingConfirmationMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceShared.OutgoingConfirmation", outgoingConfirmationMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceShared.OutgoingConfirmation");
	}

	/**
	 * @deprecated Use 'OutgoingConfirmation.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfaceshared.proxies.OutgoingConfirmation initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfaceshared.proxies.OutgoingConfirmation.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfaceshared.proxies.OutgoingConfirmation initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("InterfaceAffectedCIs.OutgoingAffectedCIsConfirmation", mendixObject.getType()))
			return interfaceaffectedcis.proxies.OutgoingAffectedCIsConfirmation.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("InterfaceAttachments.OutgoingAttachmentsConfirmation", mendixObject.getType()))
			return interfaceattachments.proxies.OutgoingAttachmentsConfirmation.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("InterfaceContractAspectUpdates.OutgoingContractAspectUpdateConfirmation", mendixObject.getType()))
			return interfacecontractaspectupdates.proxies.OutgoingContractAspectUpdateConfirmation.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("InterfaceExternalReferences.OutgoingExternalReferencesConfirmation", mendixObject.getType()))
			return interfaceexternalreferences.proxies.OutgoingExternalReferencesConfirmation.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("InterfaceShared.OutgoingHeartBeatConfirmation", mendixObject.getType()))
			return interfaceshared.proxies.OutgoingHeartBeatConfirmation.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("InterfaceNotes.OutgoingNotesConfirmation", mendixObject.getType()))
			return interfacenotes.proxies.OutgoingNotesConfirmation.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("InterfaceRelations.OutgoingRelationsConfirmation", mendixObject.getType()))
			return interfacerelations.proxies.OutgoingRelationsConfirmation.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("InterfaceRequests.OutgoingRequestConfirmation", mendixObject.getType()))
			return interfacerequests.proxies.OutgoingRequestConfirmation.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("InterfaceRequestUpdate.OutgoingRequestUpdateConfirmation", mendixObject.getType()))
			return interfacerequestupdate.proxies.OutgoingRequestUpdateConfirmation.initialize(context, mendixObject);

		return new interfaceshared.proxies.OutgoingConfirmation(context, mendixObject);
	}

	public static interfaceshared.proxies.OutgoingConfirmation load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfaceshared.proxies.OutgoingConfirmation.initialize(context, mendixObject);
	}

	public static java.util.List<? extends interfaceshared.proxies.OutgoingConfirmation> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfaceshared.proxies.OutgoingConfirmation> result = new java.util.ArrayList<interfaceshared.proxies.OutgoingConfirmation>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceShared.OutgoingConfirmation" + xpathConstraint))
			result.add(interfaceshared.proxies.OutgoingConfirmation.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of ProcessingAttempt_OutgoingConfirmation
	 */
	public final interfaceshared.proxies.ProcessingAttempt getProcessingAttempt_OutgoingConfirmation() throws com.mendix.core.CoreException
	{
		return getProcessingAttempt_OutgoingConfirmation(getContext());
	}

	/**
	 * @param context
	 * @return value of ProcessingAttempt_OutgoingConfirmation
	 */
	public final interfaceshared.proxies.ProcessingAttempt getProcessingAttempt_OutgoingConfirmation(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceshared.proxies.ProcessingAttempt result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ProcessingAttempt_OutgoingConfirmation.toString());
		if (identifier != null)
			result = interfaceshared.proxies.ProcessingAttempt.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ProcessingAttempt_OutgoingConfirmation
	 * @param processingattempt_outgoingconfirmation
	 */
	public final void setProcessingAttempt_OutgoingConfirmation(interfaceshared.proxies.ProcessingAttempt processingattempt_outgoingconfirmation)
	{
		setProcessingAttempt_OutgoingConfirmation(getContext(), processingattempt_outgoingconfirmation);
	}

	/**
	 * Set value of ProcessingAttempt_OutgoingConfirmation
	 * @param context
	 * @param processingattempt_outgoingconfirmation
	 */
	public final void setProcessingAttempt_OutgoingConfirmation(com.mendix.systemwideinterfaces.core.IContext context, interfaceshared.proxies.ProcessingAttempt processingattempt_outgoingconfirmation)
	{
		if (processingattempt_outgoingconfirmation == null)
			getMendixObject().setValue(context, MemberNames.ProcessingAttempt_OutgoingConfirmation.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ProcessingAttempt_OutgoingConfirmation.toString(), processingattempt_outgoingconfirmation.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfaceshared.proxies.OutgoingConfirmation that = (interfaceshared.proxies.OutgoingConfirmation) obj;
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
		return "InterfaceShared.OutgoingConfirmation";
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
