// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfaceaffectedcis.proxies;

public class AffectedCIResponsesContainerExpertDesk
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject affectedCIResponsesContainerExpertDeskMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceAffectedCIs.AffectedCIResponsesContainerExpertDesk";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		AffectedCIsResponsesContainerExpertDesk_IncomingAffectedCIsResponse("InterfaceAffectedCIs.AffectedCIsResponsesContainerExpertDesk_IncomingAffectedCIsResponse"),
		AffectedCIResponsesContainerExpertDesk_RequestResponse("InterfaceAffectedCIs.AffectedCIResponsesContainerExpertDesk_RequestResponse"),
		AffectedCIResponsesContainerExpertDesk_RequestResponseTask("InterfaceAffectedCIs.AffectedCIResponsesContainerExpertDesk_RequestResponseTask");

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

	public AffectedCIResponsesContainerExpertDesk(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceAffectedCIs.AffectedCIResponsesContainerExpertDesk"));
	}

	protected AffectedCIResponsesContainerExpertDesk(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject affectedCIResponsesContainerExpertDeskMendixObject)
	{
		if (affectedCIResponsesContainerExpertDeskMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("InterfaceAffectedCIs.AffectedCIResponsesContainerExpertDesk", affectedCIResponsesContainerExpertDeskMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceAffectedCIs.AffectedCIResponsesContainerExpertDesk");

		this.affectedCIResponsesContainerExpertDeskMendixObject = affectedCIResponsesContainerExpertDeskMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'AffectedCIResponsesContainerExpertDesk.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfaceaffectedcis.proxies.AffectedCIResponsesContainerExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfaceaffectedcis.proxies.AffectedCIResponsesContainerExpertDesk.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfaceaffectedcis.proxies.AffectedCIResponsesContainerExpertDesk initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new interfaceaffectedcis.proxies.AffectedCIResponsesContainerExpertDesk(context, mendixObject);
	}

	public static interfaceaffectedcis.proxies.AffectedCIResponsesContainerExpertDesk load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfaceaffectedcis.proxies.AffectedCIResponsesContainerExpertDesk.initialize(context, mendixObject);
	}

	public static java.util.List<interfaceaffectedcis.proxies.AffectedCIResponsesContainerExpertDesk> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfaceaffectedcis.proxies.AffectedCIResponsesContainerExpertDesk> result = new java.util.ArrayList<interfaceaffectedcis.proxies.AffectedCIResponsesContainerExpertDesk>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceAffectedCIs.AffectedCIResponsesContainerExpertDesk" + xpathConstraint))
			result.add(interfaceaffectedcis.proxies.AffectedCIResponsesContainerExpertDesk.initialize(context, obj));
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
	 * @return value of AffectedCIsResponsesContainerExpertDesk_IncomingAffectedCIsResponse
	 */
	public final interfaceaffectedcis.proxies.AffectedCIsResponse getAffectedCIsResponsesContainerExpertDesk_IncomingAffectedCIsResponse() throws com.mendix.core.CoreException
	{
		return getAffectedCIsResponsesContainerExpertDesk_IncomingAffectedCIsResponse(getContext());
	}

	/**
	 * @param context
	 * @return value of AffectedCIsResponsesContainerExpertDesk_IncomingAffectedCIsResponse
	 */
	public final interfaceaffectedcis.proxies.AffectedCIsResponse getAffectedCIsResponsesContainerExpertDesk_IncomingAffectedCIsResponse(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceaffectedcis.proxies.AffectedCIsResponse result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AffectedCIsResponsesContainerExpertDesk_IncomingAffectedCIsResponse.toString());
		if (identifier != null)
			result = interfaceaffectedcis.proxies.AffectedCIsResponse.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AffectedCIsResponsesContainerExpertDesk_IncomingAffectedCIsResponse
	 * @param affectedcisresponsescontainerexpertdesk_incomingaffectedcisresponse
	 */
	public final void setAffectedCIsResponsesContainerExpertDesk_IncomingAffectedCIsResponse(interfaceaffectedcis.proxies.AffectedCIsResponse affectedcisresponsescontainerexpertdesk_incomingaffectedcisresponse)
	{
		setAffectedCIsResponsesContainerExpertDesk_IncomingAffectedCIsResponse(getContext(), affectedcisresponsescontainerexpertdesk_incomingaffectedcisresponse);
	}

	/**
	 * Set value of AffectedCIsResponsesContainerExpertDesk_IncomingAffectedCIsResponse
	 * @param context
	 * @param affectedcisresponsescontainerexpertdesk_incomingaffectedcisresponse
	 */
	public final void setAffectedCIsResponsesContainerExpertDesk_IncomingAffectedCIsResponse(com.mendix.systemwideinterfaces.core.IContext context, interfaceaffectedcis.proxies.AffectedCIsResponse affectedcisresponsescontainerexpertdesk_incomingaffectedcisresponse)
	{
		if (affectedcisresponsescontainerexpertdesk_incomingaffectedcisresponse == null)
			getMendixObject().setValue(context, MemberNames.AffectedCIsResponsesContainerExpertDesk_IncomingAffectedCIsResponse.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AffectedCIsResponsesContainerExpertDesk_IncomingAffectedCIsResponse.toString(), affectedcisresponsescontainerexpertdesk_incomingaffectedcisresponse.getMendixObject().getId());
	}

	/**
	 * @return value of AffectedCIResponsesContainerExpertDesk_RequestResponse
	 */
	public final interfacerequests.proxies.RequestResponse getAffectedCIResponsesContainerExpertDesk_RequestResponse() throws com.mendix.core.CoreException
	{
		return getAffectedCIResponsesContainerExpertDesk_RequestResponse(getContext());
	}

	/**
	 * @param context
	 * @return value of AffectedCIResponsesContainerExpertDesk_RequestResponse
	 */
	public final interfacerequests.proxies.RequestResponse getAffectedCIResponsesContainerExpertDesk_RequestResponse(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerequests.proxies.RequestResponse result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AffectedCIResponsesContainerExpertDesk_RequestResponse.toString());
		if (identifier != null)
			result = interfacerequests.proxies.RequestResponse.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AffectedCIResponsesContainerExpertDesk_RequestResponse
	 * @param affectedciresponsescontainerexpertdesk_requestresponse
	 */
	public final void setAffectedCIResponsesContainerExpertDesk_RequestResponse(interfacerequests.proxies.RequestResponse affectedciresponsescontainerexpertdesk_requestresponse)
	{
		setAffectedCIResponsesContainerExpertDesk_RequestResponse(getContext(), affectedciresponsescontainerexpertdesk_requestresponse);
	}

	/**
	 * Set value of AffectedCIResponsesContainerExpertDesk_RequestResponse
	 * @param context
	 * @param affectedciresponsescontainerexpertdesk_requestresponse
	 */
	public final void setAffectedCIResponsesContainerExpertDesk_RequestResponse(com.mendix.systemwideinterfaces.core.IContext context, interfacerequests.proxies.RequestResponse affectedciresponsescontainerexpertdesk_requestresponse)
	{
		if (affectedciresponsescontainerexpertdesk_requestresponse == null)
			getMendixObject().setValue(context, MemberNames.AffectedCIResponsesContainerExpertDesk_RequestResponse.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AffectedCIResponsesContainerExpertDesk_RequestResponse.toString(), affectedciresponsescontainerexpertdesk_requestresponse.getMendixObject().getId());
	}

	/**
	 * @return value of AffectedCIResponsesContainerExpertDesk_RequestResponseTask
	 */
	public final interfacerequests.proxies.TaskResponse getAffectedCIResponsesContainerExpertDesk_RequestResponseTask() throws com.mendix.core.CoreException
	{
		return getAffectedCIResponsesContainerExpertDesk_RequestResponseTask(getContext());
	}

	/**
	 * @param context
	 * @return value of AffectedCIResponsesContainerExpertDesk_RequestResponseTask
	 */
	public final interfacerequests.proxies.TaskResponse getAffectedCIResponsesContainerExpertDesk_RequestResponseTask(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerequests.proxies.TaskResponse result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AffectedCIResponsesContainerExpertDesk_RequestResponseTask.toString());
		if (identifier != null)
			result = interfacerequests.proxies.TaskResponse.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AffectedCIResponsesContainerExpertDesk_RequestResponseTask
	 * @param affectedciresponsescontainerexpertdesk_requestresponsetask
	 */
	public final void setAffectedCIResponsesContainerExpertDesk_RequestResponseTask(interfacerequests.proxies.TaskResponse affectedciresponsescontainerexpertdesk_requestresponsetask)
	{
		setAffectedCIResponsesContainerExpertDesk_RequestResponseTask(getContext(), affectedciresponsescontainerexpertdesk_requestresponsetask);
	}

	/**
	 * Set value of AffectedCIResponsesContainerExpertDesk_RequestResponseTask
	 * @param context
	 * @param affectedciresponsescontainerexpertdesk_requestresponsetask
	 */
	public final void setAffectedCIResponsesContainerExpertDesk_RequestResponseTask(com.mendix.systemwideinterfaces.core.IContext context, interfacerequests.proxies.TaskResponse affectedciresponsescontainerexpertdesk_requestresponsetask)
	{
		if (affectedciresponsescontainerexpertdesk_requestresponsetask == null)
			getMendixObject().setValue(context, MemberNames.AffectedCIResponsesContainerExpertDesk_RequestResponseTask.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AffectedCIResponsesContainerExpertDesk_RequestResponseTask.toString(), affectedciresponsescontainerexpertdesk_requestresponsetask.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return affectedCIResponsesContainerExpertDeskMendixObject;
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
			final interfaceaffectedcis.proxies.AffectedCIResponsesContainerExpertDesk that = (interfaceaffectedcis.proxies.AffectedCIResponsesContainerExpertDesk) obj;
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
		return "InterfaceAffectedCIs.AffectedCIResponsesContainerExpertDesk";
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