// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfaceaffectedcis.proxies;

public class IncomingAffectedCIs extends interfaceshared.proxies.IncomingMessage
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceAffectedCIs.IncomingAffectedCIs";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
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
		UU95_AffectedCIsResponse_IncomingAffectedCIs("InterfaceAffectedCIs.UU95_AffectedCIsResponse_IncomingAffectedCIs"),
		IncomingAffectedCIs_Request("InterfaceAffectedCIs.IncomingAffectedCIs_Request"),
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

	public IncomingAffectedCIs(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceAffectedCIs.IncomingAffectedCIs"));
	}

	protected IncomingAffectedCIs(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject incomingAffectedCIsMendixObject)
	{
		super(context, incomingAffectedCIsMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("InterfaceAffectedCIs.IncomingAffectedCIs", incomingAffectedCIsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceAffectedCIs.IncomingAffectedCIs");
	}

	/**
	 * @deprecated Use 'IncomingAffectedCIs.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfaceaffectedcis.proxies.IncomingAffectedCIs initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfaceaffectedcis.proxies.IncomingAffectedCIs.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfaceaffectedcis.proxies.IncomingAffectedCIs initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfaceaffectedcis.proxies.IncomingAffectedCIs(context, mendixObject);
	}

	public static interfaceaffectedcis.proxies.IncomingAffectedCIs load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfaceaffectedcis.proxies.IncomingAffectedCIs.initialize(context, mendixObject);
	}

	public static java.util.List<interfaceaffectedcis.proxies.IncomingAffectedCIs> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfaceaffectedcis.proxies.IncomingAffectedCIs> result = new java.util.ArrayList<interfaceaffectedcis.proxies.IncomingAffectedCIs>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceAffectedCIs.IncomingAffectedCIs" + xpathConstraint))
			result.add(interfaceaffectedcis.proxies.IncomingAffectedCIs.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of UU95_AffectedCIsResponse_IncomingAffectedCIs
	 */
	public final interfaceaffectedcis.proxies.AffectedCIsResponse getUU95_AffectedCIsResponse_IncomingAffectedCIs() throws com.mendix.core.CoreException
	{
		return getUU95_AffectedCIsResponse_IncomingAffectedCIs(getContext());
	}

	/**
	 * @param context
	 * @return value of UU95_AffectedCIsResponse_IncomingAffectedCIs
	 */
	public final interfaceaffectedcis.proxies.AffectedCIsResponse getUU95_AffectedCIsResponse_IncomingAffectedCIs(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceaffectedcis.proxies.AffectedCIsResponse result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.UU95_AffectedCIsResponse_IncomingAffectedCIs.toString());
		if (identifier != null)
			result = interfaceaffectedcis.proxies.AffectedCIsResponse.load(context, identifier);
		return result;
	}

	/**
	 * Set value of UU95_AffectedCIsResponse_IncomingAffectedCIs
	 * @param uu95_affectedcisresponse_incomingaffectedcis
	 */
	public final void setUU95_AffectedCIsResponse_IncomingAffectedCIs(interfaceaffectedcis.proxies.AffectedCIsResponse uu95_affectedcisresponse_incomingaffectedcis)
	{
		setUU95_AffectedCIsResponse_IncomingAffectedCIs(getContext(), uu95_affectedcisresponse_incomingaffectedcis);
	}

	/**
	 * Set value of UU95_AffectedCIsResponse_IncomingAffectedCIs
	 * @param context
	 * @param uu95_affectedcisresponse_incomingaffectedcis
	 */
	public final void setUU95_AffectedCIsResponse_IncomingAffectedCIs(com.mendix.systemwideinterfaces.core.IContext context, interfaceaffectedcis.proxies.AffectedCIsResponse uu95_affectedcisresponse_incomingaffectedcis)
	{
		if (uu95_affectedcisresponse_incomingaffectedcis == null)
			getMendixObject().setValue(context, MemberNames.UU95_AffectedCIsResponse_IncomingAffectedCIs.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.UU95_AffectedCIsResponse_IncomingAffectedCIs.toString(), uu95_affectedcisresponse_incomingaffectedcis.getMendixObject().getId());
	}

	/**
	 * @return value of IncomingAffectedCIs_Request
	 */
	public final process.proxies.Request getIncomingAffectedCIs_Request() throws com.mendix.core.CoreException
	{
		return getIncomingAffectedCIs_Request(getContext());
	}

	/**
	 * @param context
	 * @return value of IncomingAffectedCIs_Request
	 */
	public final process.proxies.Request getIncomingAffectedCIs_Request(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		process.proxies.Request result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.IncomingAffectedCIs_Request.toString());
		if (identifier != null)
			result = process.proxies.Request.load(context, identifier);
		return result;
	}

	/**
	 * Set value of IncomingAffectedCIs_Request
	 * @param incomingaffectedcis_request
	 */
	public final void setIncomingAffectedCIs_Request(process.proxies.Request incomingaffectedcis_request)
	{
		setIncomingAffectedCIs_Request(getContext(), incomingaffectedcis_request);
	}

	/**
	 * Set value of IncomingAffectedCIs_Request
	 * @param context
	 * @param incomingaffectedcis_request
	 */
	public final void setIncomingAffectedCIs_Request(com.mendix.systemwideinterfaces.core.IContext context, process.proxies.Request incomingaffectedcis_request)
	{
		if (incomingaffectedcis_request == null)
			getMendixObject().setValue(context, MemberNames.IncomingAffectedCIs_Request.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.IncomingAffectedCIs_Request.toString(), incomingaffectedcis_request.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final interfaceaffectedcis.proxies.IncomingAffectedCIs that = (interfaceaffectedcis.proxies.IncomingAffectedCIs) obj;
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
		return "InterfaceAffectedCIs.IncomingAffectedCIs";
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