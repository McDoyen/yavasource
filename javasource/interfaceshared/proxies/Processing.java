// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package interfaceshared.proxies;

public class Processing
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject processingMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "InterfaceShared.Processing";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ProcessingType("ProcessingType"),
		ProcessingMessage("ProcessingMessage"),
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

	public Processing(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "InterfaceShared.Processing"));
	}

	protected Processing(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject processingMendixObject)
	{
		if (processingMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("InterfaceShared.Processing", processingMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a InterfaceShared.Processing");

		this.processingMendixObject = processingMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Processing.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static interfaceshared.proxies.Processing initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return interfaceshared.proxies.Processing.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static interfaceshared.proxies.Processing initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("InterfaceShared.ProcessingLog", mendixObject.getType()))
			return interfaceshared.proxies.ProcessingLog.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("InterfaceShared.ProcessingPart", mendixObject.getType()))
			return interfaceshared.proxies.ProcessingPart.initialize(context, mendixObject);

		return new interfaceshared.proxies.Processing(context, mendixObject);
	}

	public static interfaceshared.proxies.Processing load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return interfaceshared.proxies.Processing.initialize(context, mendixObject);
	}

	public static java.util.List<? extends interfaceshared.proxies.Processing> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<interfaceshared.proxies.Processing> result = new java.util.ArrayList<interfaceshared.proxies.Processing>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//InterfaceShared.Processing" + xpathConstraint))
			result.add(interfaceshared.proxies.Processing.initialize(context, obj));
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
	 * Set value of ProcessingType
	 * @param processingtype
	 */
	public final interfaceshared.proxies.ProcessingType getProcessingType()
	{
		return getProcessingType(getContext());
	}

	/**
	 * @param context
	 * @return value of ProcessingType
	 */
	public final interfaceshared.proxies.ProcessingType getProcessingType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ProcessingType.toString());
		if (obj == null)
			return null;

		return interfaceshared.proxies.ProcessingType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ProcessingType
	 * @param processingtype
	 */
	public final void setProcessingType(interfaceshared.proxies.ProcessingType processingtype)
	{
		setProcessingType(getContext(), processingtype);
	}

	/**
	 * Set value of ProcessingType
	 * @param context
	 * @param processingtype
	 */
	public final void setProcessingType(com.mendix.systemwideinterfaces.core.IContext context, interfaceshared.proxies.ProcessingType processingtype)
	{
		if (processingtype != null)
			getMendixObject().setValue(context, MemberNames.ProcessingType.toString(), processingtype.toString());
		else
			getMendixObject().setValue(context, MemberNames.ProcessingType.toString(), null);
	}

	/**
	 * @return value of ProcessingMessage
	 */
	public final java.lang.String getProcessingMessage()
	{
		return getProcessingMessage(getContext());
	}

	/**
	 * @param context
	 * @return value of ProcessingMessage
	 */
	public final java.lang.String getProcessingMessage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ProcessingMessage.toString());
	}

	/**
	 * Set value of ProcessingMessage
	 * @param processingmessage
	 */
	public final void setProcessingMessage(java.lang.String processingmessage)
	{
		setProcessingMessage(getContext(), processingmessage);
	}

	/**
	 * Set value of ProcessingMessage
	 * @param context
	 * @param processingmessage
	 */
	public final void setProcessingMessage(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String processingmessage)
	{
		getMendixObject().setValue(context, MemberNames.ProcessingMessage.toString(), processingmessage);
	}

	/**
	 * @return value of Processing_Processing
	 */
	public final interfaceshared.proxies.Processing getProcessing_Processing() throws com.mendix.core.CoreException
	{
		return getProcessing_Processing(getContext());
	}

	/**
	 * @param context
	 * @return value of Processing_Processing
	 */
	public final interfaceshared.proxies.Processing getProcessing_Processing(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceshared.proxies.Processing result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Processing_Processing.toString());
		if (identifier != null)
			result = interfaceshared.proxies.Processing.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Processing_Processing
	 * @param processing_processing
	 */
	public final void setProcessing_Processing(interfaceshared.proxies.Processing processing_processing)
	{
		setProcessing_Processing(getContext(), processing_processing);
	}

	/**
	 * Set value of Processing_Processing
	 * @param context
	 * @param processing_processing
	 */
	public final void setProcessing_Processing(com.mendix.systemwideinterfaces.core.IContext context, interfaceshared.proxies.Processing processing_processing)
	{
		if (processing_processing == null)
			getMendixObject().setValue(context, MemberNames.Processing_Processing.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Processing_Processing.toString(), processing_processing.getMendixObject().getId());
	}

	/**
	 * @return value of Processing_Attempt
	 */
	public final interfaceshared.proxies.Attempt getProcessing_Attempt() throws com.mendix.core.CoreException
	{
		return getProcessing_Attempt(getContext());
	}

	/**
	 * @param context
	 * @return value of Processing_Attempt
	 */
	public final interfaceshared.proxies.Attempt getProcessing_Attempt(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceshared.proxies.Attempt result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Processing_Attempt.toString());
		if (identifier != null)
			result = interfaceshared.proxies.Attempt.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Processing_Attempt
	 * @param processing_attempt
	 */
	public final void setProcessing_Attempt(interfaceshared.proxies.Attempt processing_attempt)
	{
		setProcessing_Attempt(getContext(), processing_attempt);
	}

	/**
	 * Set value of Processing_Attempt
	 * @param context
	 * @param processing_attempt
	 */
	public final void setProcessing_Attempt(com.mendix.systemwideinterfaces.core.IContext context, interfaceshared.proxies.Attempt processing_attempt)
	{
		if (processing_attempt == null)
			getMendixObject().setValue(context, MemberNames.Processing_Attempt.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Processing_Attempt.toString(), processing_attempt.getMendixObject().getId());
	}

	/**
	 * @return value of Processing_Message
	 */
	public final interfaceshared.proxies.Message getProcessing_Message() throws com.mendix.core.CoreException
	{
		return getProcessing_Message(getContext());
	}

	/**
	 * @param context
	 * @return value of Processing_Message
	 */
	public final interfaceshared.proxies.Message getProcessing_Message(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceshared.proxies.Message result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Processing_Message.toString());
		if (identifier != null)
			result = interfaceshared.proxies.Message.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Processing_Message
	 * @param processing_message
	 */
	public final void setProcessing_Message(interfaceshared.proxies.Message processing_message)
	{
		setProcessing_Message(getContext(), processing_message);
	}

	/**
	 * Set value of Processing_Message
	 * @param context
	 * @param processing_message
	 */
	public final void setProcessing_Message(com.mendix.systemwideinterfaces.core.IContext context, interfaceshared.proxies.Message processing_message)
	{
		if (processing_message == null)
			getMendixObject().setValue(context, MemberNames.Processing_Message.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Processing_Message.toString(), processing_message.getMendixObject().getId());
	}

	/**
	 * @return value of Processing_InterfaceMessageConfiguration
	 */
	public final interfaceconfiguration.proxies.InterfaceMessageConfiguration getProcessing_InterfaceMessageConfiguration() throws com.mendix.core.CoreException
	{
		return getProcessing_InterfaceMessageConfiguration(getContext());
	}

	/**
	 * @param context
	 * @return value of Processing_InterfaceMessageConfiguration
	 */
	public final interfaceconfiguration.proxies.InterfaceMessageConfiguration getProcessing_InterfaceMessageConfiguration(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfaceconfiguration.proxies.InterfaceMessageConfiguration result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Processing_InterfaceMessageConfiguration.toString());
		if (identifier != null)
			result = interfaceconfiguration.proxies.InterfaceMessageConfiguration.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Processing_InterfaceMessageConfiguration
	 * @param processing_interfacemessageconfiguration
	 */
	public final void setProcessing_InterfaceMessageConfiguration(interfaceconfiguration.proxies.InterfaceMessageConfiguration processing_interfacemessageconfiguration)
	{
		setProcessing_InterfaceMessageConfiguration(getContext(), processing_interfacemessageconfiguration);
	}

	/**
	 * Set value of Processing_InterfaceMessageConfiguration
	 * @param context
	 * @param processing_interfacemessageconfiguration
	 */
	public final void setProcessing_InterfaceMessageConfiguration(com.mendix.systemwideinterfaces.core.IContext context, interfaceconfiguration.proxies.InterfaceMessageConfiguration processing_interfacemessageconfiguration)
	{
		if (processing_interfacemessageconfiguration == null)
			getMendixObject().setValue(context, MemberNames.Processing_InterfaceMessageConfiguration.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Processing_InterfaceMessageConfiguration.toString(), processing_interfacemessageconfiguration.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return processingMendixObject;
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
			final interfaceshared.proxies.Processing that = (interfaceshared.proxies.Processing) obj;
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
		return "InterfaceShared.Processing";
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
