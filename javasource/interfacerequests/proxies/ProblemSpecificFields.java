// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfacerequests.proxies;

public class ProblemSpecificFields extends interfaceshared.proxies.AuditableEntity
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceRequests.ProblemSpecificFields";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ProblemType("ProblemType"),
		ProblemTypeString("ProblemTypeString"),
		IncomingRequest_ProblemSpecificFields("InterfaceRequests.IncomingRequest_ProblemSpecificFields"),
		ProblemSpecificFieldsContainerExpertDesk_ProblemSpecificFields("InterfaceRequests.ProblemSpecificFieldsContainerExpertDesk_ProblemSpecificFields"),
		IncomingRequestUpdate_ProblemSpecificFields("InterfaceRequestUpdate.IncomingRequestUpdate_ProblemSpecificFields");

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

	public ProblemSpecificFields(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceRequests.ProblemSpecificFields"));
	}

	protected ProblemSpecificFields(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject problemSpecificFieldsMendixObject)
	{
		super(context, problemSpecificFieldsMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceRequests.ProblemSpecificFields", problemSpecificFieldsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceRequests.ProblemSpecificFields");
	}

	/**
	 * @deprecated Use 'ProblemSpecificFields.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfacerequests.proxies.ProblemSpecificFields initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfacerequests.proxies.ProblemSpecificFields.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfacerequests.proxies.ProblemSpecificFields initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfacerequests.proxies.ProblemSpecificFields(context, mendixObject);
	}

	public static interfacerequests.proxies.ProblemSpecificFields load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfacerequests.proxies.ProblemSpecificFields.initialize(context, mendixObject);
	}

	public static java.util.List<interfacerequests.proxies.ProblemSpecificFields> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfacerequests.proxies.ProblemSpecificFields> result = new java.util.ArrayList<interfacerequests.proxies.ProblemSpecificFields>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceRequests.ProblemSpecificFields" + xpathConstraint))
			result.add(interfacerequests.proxies.ProblemSpecificFields.initialize(context, obj));
		return result;
	}

	/**
	 * Set value of ProblemType
	 * @param problemtype
	 */
	public final process.proxies.ProblemType getProblemType()
	{
		return getProblemType(getContext());
	}

	/**
	 * @param context
	 * @return value of ProblemType
	 */
	public final process.proxies.ProblemType getProblemType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ProblemType.toString());
		if (obj == null)
			return null;

		return process.proxies.ProblemType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ProblemType
	 * @param problemtype
	 */
	public final void setProblemType(process.proxies.ProblemType problemtype)
	{
		setProblemType(getContext(), problemtype);
	}

	/**
	 * Set value of ProblemType
	 * @param context
	 * @param problemtype
	 */
	public final void setProblemType(com.mendix.systemwideinterfaces.core.IContext context, process.proxies.ProblemType problemtype)
	{
		if (problemtype != null)
			getMendixObject().setValue(context, MemberNames.ProblemType.toString(), problemtype.toString());
		else
			getMendixObject().setValue(context, MemberNames.ProblemType.toString(), null);
	}

	/**
	 * @return value of ProblemTypeString
	 */
	public final java.lang.String getProblemTypeString()
	{
		return getProblemTypeString(getContext());
	}

	/**
	 * @param context
	 * @return value of ProblemTypeString
	 */
	public final java.lang.String getProblemTypeString(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ProblemTypeString.toString());
	}

	/**
	 * Set value of ProblemTypeString
	 * @param problemtypestring
	 */
	public final void setProblemTypeString(java.lang.String problemtypestring)
	{
		setProblemTypeString(getContext(), problemtypestring);
	}

	/**
	 * Set value of ProblemTypeString
	 * @param context
	 * @param problemtypestring
	 */
	public final void setProblemTypeString(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String problemtypestring)
	{
		getMendixObject().setValue(context, MemberNames.ProblemTypeString.toString(), problemtypestring);
	}

	/**
	 * @return value of IncomingRequest_ProblemSpecificFields
	 */
	public final interfacerequests.proxies.IncomingRequest getIncomingRequest_ProblemSpecificFields() throws com.mendix.core.CoreException
	{
		return getIncomingRequest_ProblemSpecificFields(getContext());
	}

	/**
	 * @param context
	 * @return value of IncomingRequest_ProblemSpecificFields
	 */
	public final interfacerequests.proxies.IncomingRequest getIncomingRequest_ProblemSpecificFields(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerequests.proxies.IncomingRequest result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.IncomingRequest_ProblemSpecificFields.toString());
		if (identifier != null)
			result = interfacerequests.proxies.IncomingRequest.load(context, identifier);
		return result;
	}

	/**
	 * Set value of IncomingRequest_ProblemSpecificFields
	 * @param incomingrequest_problemspecificfields
	 */
	public final void setIncomingRequest_ProblemSpecificFields(interfacerequests.proxies.IncomingRequest incomingrequest_problemspecificfields)
	{
		setIncomingRequest_ProblemSpecificFields(getContext(), incomingrequest_problemspecificfields);
	}

	/**
	 * Set value of IncomingRequest_ProblemSpecificFields
	 * @param context
	 * @param incomingrequest_problemspecificfields
	 */
	public final void setIncomingRequest_ProblemSpecificFields(com.mendix.systemwideinterfaces.core.IContext context, interfacerequests.proxies.IncomingRequest incomingrequest_problemspecificfields)
	{
		if (incomingrequest_problemspecificfields == null)
			getMendixObject().setValue(context, MemberNames.IncomingRequest_ProblemSpecificFields.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.IncomingRequest_ProblemSpecificFields.toString(), incomingrequest_problemspecificfields.getMendixObject().getId());
	}

	/**
	 * @return value of ProblemSpecificFieldsContainerExpertDesk_ProblemSpecificFields
	 */
	public final interfacerequests.proxies.ProblemSpecificFieldsContainerExpertDesk getProblemSpecificFieldsContainerExpertDesk_ProblemSpecificFields() throws com.mendix.core.CoreException
	{
		return getProblemSpecificFieldsContainerExpertDesk_ProblemSpecificFields(getContext());
	}

	/**
	 * @param context
	 * @return value of ProblemSpecificFieldsContainerExpertDesk_ProblemSpecificFields
	 */
	public final interfacerequests.proxies.ProblemSpecificFieldsContainerExpertDesk getProblemSpecificFieldsContainerExpertDesk_ProblemSpecificFields(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerequests.proxies.ProblemSpecificFieldsContainerExpertDesk result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ProblemSpecificFieldsContainerExpertDesk_ProblemSpecificFields.toString());
		if (identifier != null)
			result = interfacerequests.proxies.ProblemSpecificFieldsContainerExpertDesk.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ProblemSpecificFieldsContainerExpertDesk_ProblemSpecificFields
	 * @param problemspecificfieldscontainerexpertdesk_problemspecificfields
	 */
	public final void setProblemSpecificFieldsContainerExpertDesk_ProblemSpecificFields(interfacerequests.proxies.ProblemSpecificFieldsContainerExpertDesk problemspecificfieldscontainerexpertdesk_problemspecificfields)
	{
		setProblemSpecificFieldsContainerExpertDesk_ProblemSpecificFields(getContext(), problemspecificfieldscontainerexpertdesk_problemspecificfields);
	}

	/**
	 * Set value of ProblemSpecificFieldsContainerExpertDesk_ProblemSpecificFields
	 * @param context
	 * @param problemspecificfieldscontainerexpertdesk_problemspecificfields
	 */
	public final void setProblemSpecificFieldsContainerExpertDesk_ProblemSpecificFields(com.mendix.systemwideinterfaces.core.IContext context, interfacerequests.proxies.ProblemSpecificFieldsContainerExpertDesk problemspecificfieldscontainerexpertdesk_problemspecificfields)
	{
		if (problemspecificfieldscontainerexpertdesk_problemspecificfields == null)
			getMendixObject().setValue(context, MemberNames.ProblemSpecificFieldsContainerExpertDesk_ProblemSpecificFields.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ProblemSpecificFieldsContainerExpertDesk_ProblemSpecificFields.toString(), problemspecificfieldscontainerexpertdesk_problemspecificfields.getMendixObject().getId());
	}

	/**
	 * @return value of IncomingRequestUpdate_ProblemSpecificFields
	 */
	public final interfacerequestupdate.proxies.IncomingRequestUpdate getIncomingRequestUpdate_ProblemSpecificFields() throws com.mendix.core.CoreException
	{
		return getIncomingRequestUpdate_ProblemSpecificFields(getContext());
	}

	/**
	 * @param context
	 * @return value of IncomingRequestUpdate_ProblemSpecificFields
	 */
	public final interfacerequestupdate.proxies.IncomingRequestUpdate getIncomingRequestUpdate_ProblemSpecificFields(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerequestupdate.proxies.IncomingRequestUpdate result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.IncomingRequestUpdate_ProblemSpecificFields.toString());
		if (identifier != null)
			result = interfacerequestupdate.proxies.IncomingRequestUpdate.load(context, identifier);
		return result;
	}

	/**
	 * Set value of IncomingRequestUpdate_ProblemSpecificFields
	 * @param incomingrequestupdate_problemspecificfields
	 */
	public final void setIncomingRequestUpdate_ProblemSpecificFields(interfacerequestupdate.proxies.IncomingRequestUpdate incomingrequestupdate_problemspecificfields)
	{
		setIncomingRequestUpdate_ProblemSpecificFields(getContext(), incomingrequestupdate_problemspecificfields);
	}

	/**
	 * Set value of IncomingRequestUpdate_ProblemSpecificFields
	 * @param context
	 * @param incomingrequestupdate_problemspecificfields
	 */
	public final void setIncomingRequestUpdate_ProblemSpecificFields(com.mendix.systemwideinterfaces.core.IContext context, interfacerequestupdate.proxies.IncomingRequestUpdate incomingrequestupdate_problemspecificfields)
	{
		if (incomingrequestupdate_problemspecificfields == null)
			getMendixObject().setValue(context, MemberNames.IncomingRequestUpdate_ProblemSpecificFields.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.IncomingRequestUpdate_ProblemSpecificFields.toString(), incomingrequestupdate_problemspecificfields.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfacerequests.proxies.ProblemSpecificFields that = (interfacerequests.proxies.ProblemSpecificFields) obj;
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
		return "InterfaceRequests.ProblemSpecificFields";
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
