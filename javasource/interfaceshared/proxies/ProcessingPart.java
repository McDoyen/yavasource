// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfaceshared.proxies;

public class ProcessingPart extends interfaceshared.proxies.Processing
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceShared.ProcessingPart";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Blocking("Blocking"),
		SuccessfullyProcessed("SuccessfullyProcessed"),
		Function("Function"),
		HasError("HasError"),
		HasWarning("HasWarning"),
		ProcessingType("ProcessingType"),
		ProcessingMessage("ProcessingMessage"),
		UU95_ConfirmationProcessingPart_IncomingMessage("InterfaceShared.UU95_ConfirmationProcessingPart_IncomingMessage"),
		ParentProcessingPart_LDAPInbox("InterfaceShared.ParentProcessingPart_LDAPInbox"),
		Person_ParentInterfaceProcessingPart("NAP.Person_ParentInterfaceProcessingPart"),
		Organisation_ParentInterfaceProcessingPart("NAP.Organisation_ParentInterfaceProcessingPart"),
		Location_ParentInterfaceProcessingPart("NAP.Location_ParentInterfaceProcessingPart"),
		Request_ParentInterfaceProcessingPart("Process.Request_ParentInterfaceProcessingPart"),
		Processing_Processing("InterfaceShared.Processing_Processing"),
		Processing_Attempt("InterfaceShared.Processing_Attempt"),
		Processing_Message("InterfaceShared.Processing_Message"),
		Processing_InterfaceMessageConfiguration("InterfaceShared.Processing_InterfaceMessageConfiguration");

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

	public ProcessingPart(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceShared.ProcessingPart"));
	}

	protected ProcessingPart(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject processingPartMendixObject)
	{
		super(context, processingPartMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceShared.ProcessingPart", processingPartMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceShared.ProcessingPart");
	}

	/**
	 * @deprecated Use 'ProcessingPart.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfaceshared.proxies.ProcessingPart initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfaceshared.proxies.ProcessingPart.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfaceshared.proxies.ProcessingPart initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfaceshared.proxies.ProcessingPart(context, mendixObject);
	}

	public static interfaceshared.proxies.ProcessingPart load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfaceshared.proxies.ProcessingPart.initialize(context, mendixObject);
	}

	public static java.util.List<interfaceshared.proxies.ProcessingPart> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfaceshared.proxies.ProcessingPart> result = new java.util.ArrayList<interfaceshared.proxies.ProcessingPart>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceShared.ProcessingPart" + xpathConstraint))
			result.add(interfaceshared.proxies.ProcessingPart.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of Blocking
	 */
	public final java.lang.Boolean getBlocking()
	{
		return getBlocking(getContext());
	}

	/**
	 * @param context
	 * @return value of Blocking
	 */
	public final java.lang.Boolean getBlocking(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Blocking.toString());
	}

	/**
	 * Set value of Blocking
	 * @param blocking
	 */
	public final void setBlocking(java.lang.Boolean blocking)
	{
		setBlocking(getContext(), blocking);
	}

	/**
	 * Set value of Blocking
	 * @param context
	 * @param blocking
	 */
	public final void setBlocking(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean blocking)
	{
		getMendixObject().setValue(context, MemberNames.Blocking.toString(), blocking);
	}

	/**
	 * @return value of SuccessfullyProcessed
	 */
	public final java.lang.Boolean getSuccessfullyProcessed()
	{
		return getSuccessfullyProcessed(getContext());
	}

	/**
	 * @param context
	 * @return value of SuccessfullyProcessed
	 */
	public final java.lang.Boolean getSuccessfullyProcessed(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.SuccessfullyProcessed.toString());
	}

	/**
	 * Set value of SuccessfullyProcessed
	 * @param successfullyprocessed
	 */
	public final void setSuccessfullyProcessed(java.lang.Boolean successfullyprocessed)
	{
		setSuccessfullyProcessed(getContext(), successfullyprocessed);
	}

	/**
	 * Set value of SuccessfullyProcessed
	 * @param context
	 * @param successfullyprocessed
	 */
	public final void setSuccessfullyProcessed(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean successfullyprocessed)
	{
		getMendixObject().setValue(context, MemberNames.SuccessfullyProcessed.toString(), successfullyprocessed);
	}

	/**
	 * @return value of Function
	 */
	public final java.lang.String getFunction()
	{
		return getFunction(getContext());
	}

	/**
	 * @param context
	 * @return value of Function
	 */
	public final java.lang.String getFunction(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Function.toString());
	}

	/**
	 * Set value of Function
	 * @param function
	 */
	public final void setFunction(java.lang.String function)
	{
		setFunction(getContext(), function);
	}

	/**
	 * Set value of Function
	 * @param context
	 * @param function
	 */
	public final void setFunction(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String function)
	{
		getMendixObject().setValue(context, MemberNames.Function.toString(), function);
	}

	/**
	 * @return value of HasError
	 */
	public final java.lang.Boolean getHasError()
	{
		return getHasError(getContext());
	}

	/**
	 * @param context
	 * @return value of HasError
	 */
	public final java.lang.Boolean getHasError(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.HasError.toString());
	}

	/**
	 * Set value of HasError
	 * @param haserror
	 */
	public final void setHasError(java.lang.Boolean haserror)
	{
		setHasError(getContext(), haserror);
	}

	/**
	 * Set value of HasError
	 * @param context
	 * @param haserror
	 */
	public final void setHasError(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean haserror)
	{
		getMendixObject().setValue(context, MemberNames.HasError.toString(), haserror);
	}

	/**
	 * @return value of HasWarning
	 */
	public final java.lang.Boolean getHasWarning()
	{
		return getHasWarning(getContext());
	}

	/**
	 * @param context
	 * @return value of HasWarning
	 */
	public final java.lang.Boolean getHasWarning(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.HasWarning.toString());
	}

	/**
	 * Set value of HasWarning
	 * @param haswarning
	 */
	public final void setHasWarning(java.lang.Boolean haswarning)
	{
		setHasWarning(getContext(), haswarning);
	}

	/**
	 * Set value of HasWarning
	 * @param context
	 * @param haswarning
	 */
	public final void setHasWarning(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean haswarning)
	{
		getMendixObject().setValue(context, MemberNames.HasWarning.toString(), haswarning);
	}

	/**
	 * @return value of UU95_ConfirmationProcessingPart_IncomingMessage
	 */
	public final interfaceshared.proxies.IncomingMessage getUU95_ConfirmationProcessingPart_IncomingMessage() throws com.mendix.core.CoreException
	{
		return getUU95_ConfirmationProcessingPart_IncomingMessage(getContext());
	}

	/**
	 * @param context
	 * @return value of UU95_ConfirmationProcessingPart_IncomingMessage
	 */
	public final interfaceshared.proxies.IncomingMessage getUU95_ConfirmationProcessingPart_IncomingMessage(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceshared.proxies.IncomingMessage result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.UU95_ConfirmationProcessingPart_IncomingMessage.toString());
		if (identifier != null)
			result = interfaceshared.proxies.IncomingMessage.load(context, identifier);
		return result;
	}

	/**
	 * Set value of UU95_ConfirmationProcessingPart_IncomingMessage
	 * @param uu95_confirmationprocessingpart_incomingmessage
	 */
	public final void setUU95_ConfirmationProcessingPart_IncomingMessage(interfaceshared.proxies.IncomingMessage uu95_confirmationprocessingpart_incomingmessage)
	{
		setUU95_ConfirmationProcessingPart_IncomingMessage(getContext(), uu95_confirmationprocessingpart_incomingmessage);
	}

	/**
	 * Set value of UU95_ConfirmationProcessingPart_IncomingMessage
	 * @param context
	 * @param uu95_confirmationprocessingpart_incomingmessage
	 */
	public final void setUU95_ConfirmationProcessingPart_IncomingMessage(com.mendix.systemwideinterfaces.core.IContext context, interfaceshared.proxies.IncomingMessage uu95_confirmationprocessingpart_incomingmessage)
	{
		if (uu95_confirmationprocessingpart_incomingmessage == null)
			getMendixObject().setValue(context, MemberNames.UU95_ConfirmationProcessingPart_IncomingMessage.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.UU95_ConfirmationProcessingPart_IncomingMessage.toString(), uu95_confirmationprocessingpart_incomingmessage.getMendixObject().getId());
	}

	/**
	 * @return value of ParentProcessingPart_LDAPInbox
	 */
	public final interfaceldap.proxies.LDAPInbox getParentProcessingPart_LDAPInbox() throws com.mendix.core.CoreException
	{
		return getParentProcessingPart_LDAPInbox(getContext());
	}

	/**
	 * @param context
	 * @return value of ParentProcessingPart_LDAPInbox
	 */
	public final interfaceldap.proxies.LDAPInbox getParentProcessingPart_LDAPInbox(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceldap.proxies.LDAPInbox result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ParentProcessingPart_LDAPInbox.toString());
		if (identifier != null)
			result = interfaceldap.proxies.LDAPInbox.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ParentProcessingPart_LDAPInbox
	 * @param parentprocessingpart_ldapinbox
	 */
	public final void setParentProcessingPart_LDAPInbox(interfaceldap.proxies.LDAPInbox parentprocessingpart_ldapinbox)
	{
		setParentProcessingPart_LDAPInbox(getContext(), parentprocessingpart_ldapinbox);
	}

	/**
	 * Set value of ParentProcessingPart_LDAPInbox
	 * @param context
	 * @param parentprocessingpart_ldapinbox
	 */
	public final void setParentProcessingPart_LDAPInbox(com.mendix.systemwideinterfaces.core.IContext context, interfaceldap.proxies.LDAPInbox parentprocessingpart_ldapinbox)
	{
		if (parentprocessingpart_ldapinbox == null)
			getMendixObject().setValue(context, MemberNames.ParentProcessingPart_LDAPInbox.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ParentProcessingPart_LDAPInbox.toString(), parentprocessingpart_ldapinbox.getMendixObject().getId());
	}

	/**
	 * @return value of Person_ParentInterfaceProcessingPart
	 */
	public final nap.proxies.Person getPerson_ParentInterfaceProcessingPart() throws com.mendix.core.CoreException
	{
		return getPerson_ParentInterfaceProcessingPart(getContext());
	}

	/**
	 * @param context
	 * @return value of Person_ParentInterfaceProcessingPart
	 */
	public final nap.proxies.Person getPerson_ParentInterfaceProcessingPart(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		nap.proxies.Person result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Person_ParentInterfaceProcessingPart.toString());
		if (identifier != null)
			result = nap.proxies.Person.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Person_ParentInterfaceProcessingPart
	 * @param person_parentinterfaceprocessingpart
	 */
	public final void setPerson_ParentInterfaceProcessingPart(nap.proxies.Person person_parentinterfaceprocessingpart)
	{
		setPerson_ParentInterfaceProcessingPart(getContext(), person_parentinterfaceprocessingpart);
	}

	/**
	 * Set value of Person_ParentInterfaceProcessingPart
	 * @param context
	 * @param person_parentinterfaceprocessingpart
	 */
	public final void setPerson_ParentInterfaceProcessingPart(com.mendix.systemwideinterfaces.core.IContext context, nap.proxies.Person person_parentinterfaceprocessingpart)
	{
		if (person_parentinterfaceprocessingpart == null)
			getMendixObject().setValue(context, MemberNames.Person_ParentInterfaceProcessingPart.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Person_ParentInterfaceProcessingPart.toString(), person_parentinterfaceprocessingpart.getMendixObject().getId());
	}

	/**
	 * @return value of Organisation_ParentInterfaceProcessingPart
	 */
	public final nap.proxies.Organisation getOrganisation_ParentInterfaceProcessingPart() throws com.mendix.core.CoreException
	{
		return getOrganisation_ParentInterfaceProcessingPart(getContext());
	}

	/**
	 * @param context
	 * @return value of Organisation_ParentInterfaceProcessingPart
	 */
	public final nap.proxies.Organisation getOrganisation_ParentInterfaceProcessingPart(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		nap.proxies.Organisation result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Organisation_ParentInterfaceProcessingPart.toString());
		if (identifier != null)
			result = nap.proxies.Organisation.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Organisation_ParentInterfaceProcessingPart
	 * @param organisation_parentinterfaceprocessingpart
	 */
	public final void setOrganisation_ParentInterfaceProcessingPart(nap.proxies.Organisation organisation_parentinterfaceprocessingpart)
	{
		setOrganisation_ParentInterfaceProcessingPart(getContext(), organisation_parentinterfaceprocessingpart);
	}

	/**
	 * Set value of Organisation_ParentInterfaceProcessingPart
	 * @param context
	 * @param organisation_parentinterfaceprocessingpart
	 */
	public final void setOrganisation_ParentInterfaceProcessingPart(com.mendix.systemwideinterfaces.core.IContext context, nap.proxies.Organisation organisation_parentinterfaceprocessingpart)
	{
		if (organisation_parentinterfaceprocessingpart == null)
			getMendixObject().setValue(context, MemberNames.Organisation_ParentInterfaceProcessingPart.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Organisation_ParentInterfaceProcessingPart.toString(), organisation_parentinterfaceprocessingpart.getMendixObject().getId());
	}

	/**
	 * @return value of Location_ParentInterfaceProcessingPart
	 */
	public final nap.proxies.Location getLocation_ParentInterfaceProcessingPart() throws com.mendix.core.CoreException
	{
		return getLocation_ParentInterfaceProcessingPart(getContext());
	}

	/**
	 * @param context
	 * @return value of Location_ParentInterfaceProcessingPart
	 */
	public final nap.proxies.Location getLocation_ParentInterfaceProcessingPart(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		nap.proxies.Location result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Location_ParentInterfaceProcessingPart.toString());
		if (identifier != null)
			result = nap.proxies.Location.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Location_ParentInterfaceProcessingPart
	 * @param location_parentinterfaceprocessingpart
	 */
	public final void setLocation_ParentInterfaceProcessingPart(nap.proxies.Location location_parentinterfaceprocessingpart)
	{
		setLocation_ParentInterfaceProcessingPart(getContext(), location_parentinterfaceprocessingpart);
	}

	/**
	 * Set value of Location_ParentInterfaceProcessingPart
	 * @param context
	 * @param location_parentinterfaceprocessingpart
	 */
	public final void setLocation_ParentInterfaceProcessingPart(com.mendix.systemwideinterfaces.core.IContext context, nap.proxies.Location location_parentinterfaceprocessingpart)
	{
		if (location_parentinterfaceprocessingpart == null)
			getMendixObject().setValue(context, MemberNames.Location_ParentInterfaceProcessingPart.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Location_ParentInterfaceProcessingPart.toString(), location_parentinterfaceprocessingpart.getMendixObject().getId());
	}

	/**
	 * @return value of Request_ParentInterfaceProcessingPart
	 */
	public final process.proxies.Request getRequest_ParentInterfaceProcessingPart() throws com.mendix.core.CoreException
	{
		return getRequest_ParentInterfaceProcessingPart(getContext());
	}

	/**
	 * @param context
	 * @return value of Request_ParentInterfaceProcessingPart
	 */
	public final process.proxies.Request getRequest_ParentInterfaceProcessingPart(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		process.proxies.Request result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Request_ParentInterfaceProcessingPart.toString());
		if (identifier != null)
			result = process.proxies.Request.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Request_ParentInterfaceProcessingPart
	 * @param request_parentinterfaceprocessingpart
	 */
	public final void setRequest_ParentInterfaceProcessingPart(process.proxies.Request request_parentinterfaceprocessingpart)
	{
		setRequest_ParentInterfaceProcessingPart(getContext(), request_parentinterfaceprocessingpart);
	}

	/**
	 * Set value of Request_ParentInterfaceProcessingPart
	 * @param context
	 * @param request_parentinterfaceprocessingpart
	 */
	public final void setRequest_ParentInterfaceProcessingPart(com.mendix.systemwideinterfaces.core.IContext context, process.proxies.Request request_parentinterfaceprocessingpart)
	{
		if (request_parentinterfaceprocessingpart == null)
			getMendixObject().setValue(context, MemberNames.Request_ParentInterfaceProcessingPart.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Request_ParentInterfaceProcessingPart.toString(), request_parentinterfaceprocessingpart.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfaceshared.proxies.ProcessingPart that = (interfaceshared.proxies.ProcessingPart) obj;
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
		return "InterfaceShared.ProcessingPart";
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
