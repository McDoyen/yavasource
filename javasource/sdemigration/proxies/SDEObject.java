// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sdemigration.proxies;

public class SDEObject
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject sDEObjectMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SDEMigration.SDEObject";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		processed("processed"),
		SDEObject_MigrationItemRun("SDEMigration.SDEObject_MigrationItemRun"),
		IncomingRequest_SDEObject("InterfaceRequests.IncomingRequest_SDEObject");

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

	public SDEObject(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SDEMigration.SDEObject"));
	}

	protected SDEObject(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject sDEObjectMendixObject)
	{
		if (sDEObjectMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("SDEMigration.SDEObject", sDEObjectMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SDEMigration.SDEObject");

		this.sDEObjectMendixObject = sDEObjectMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'SDEObject.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static sdemigration.proxies.SDEObject initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sdemigration.proxies.SDEObject.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sdemigration.proxies.SDEObject initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("SDEMigration.AssemblyAffectedUser", mendixObject.getType()))
			return sdemigration.proxies.AssemblyAffectedUser.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.Attachment", mendixObject.getType()))
			return sdemigration.proxies.Attachment.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.AttachmentICT", mendixObject.getType()))
			return sdemigration.proxies.AttachmentICT.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.AuditCIICT", mendixObject.getType()))
			return sdemigration.proxies.AuditCIICT.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.AuditICT", mendixObject.getType()))
			return sdemigration.proxies.AuditICT.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.CIAssembly", mendixObject.getType()))
			return sdemigration.proxies.CIAssembly.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.CICatalogPart", mendixObject.getType()))
			return sdemigration.proxies.CICatalogPart.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.CICategory", mendixObject.getType()))
			return sdemigration.proxies.CICategory.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.CIComponents", mendixObject.getType()))
			return sdemigration.proxies.CIComponents.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.CILocation", mendixObject.getType()))
			return sdemigration.proxies.CILocation.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.CINode", mendixObject.getType()))
			return sdemigration.proxies.CINode.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.CIOrganisationICT", mendixObject.getType()))
			return sdemigration.proxies.CIOrganisationICT.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.CIPersonICT", mendixObject.getType()))
			return sdemigration.proxies.CIPersonICT.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.CIRelationICT", mendixObject.getType()))
			return sdemigration.proxies.CIRelationICT.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.CIRelationICT_2", mendixObject.getType()))
			return sdemigration.proxies.CIRelationICT_2.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.CISystem", mendixObject.getType()))
			return sdemigration.proxies.CISystem.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.CIType", mendixObject.getType()))
			return sdemigration.proxies.CIType.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.Change", mendixObject.getType()))
			return sdemigration.proxies.Change.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.ChangeICT", mendixObject.getType()))
			return sdemigration.proxies.ChangeICT.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.ConfigurationItem", mendixObject.getType()))
			return sdemigration.proxies.ConfigurationItem.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.ConfigurationItemICT", mendixObject.getType()))
			return sdemigration.proxies.ConfigurationItemICT.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.CriticaliyInterrelationship", mendixObject.getType()))
			return sdemigration.proxies.CriticaliyInterrelationship.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.HistoricalIncidents", mendixObject.getType()))
			return sdemigration.proxies.HistoricalIncidents.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.HistoricalWorkorders", mendixObject.getType()))
			return sdemigration.proxies.HistoricalWorkorders.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.Incident", mendixObject.getType()))
			return sdemigration.proxies.Incident.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.PersonATM", mendixObject.getType()))
			return sdemigration.proxies.PersonATM.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.PersonICT", mendixObject.getType()))
			return sdemigration.proxies.PersonICT.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.Problem", mendixObject.getType()))
			return sdemigration.proxies.Problem.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.RegisteredHours", mendixObject.getType()))
			return sdemigration.proxies.RegisteredHours.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.RelationChangeProblem", mendixObject.getType()))
			return sdemigration.proxies.RelationChangeProblem.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.RiskAssessment", mendixObject.getType()))
			return sdemigration.proxies.RiskAssessment.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.ServiceRequestICT", mendixObject.getType()))
			return sdemigration.proxies.ServiceRequestICT.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.SupposedSystem", mendixObject.getType()))
			return sdemigration.proxies.SupposedSystem.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.TempPersonGroupAssociation", mendixObject.getType()))
			return sdemigration.proxies.TempPersonGroupAssociation.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.Vendor", mendixObject.getType()))
			return sdemigration.proxies.Vendor.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.Workorder", mendixObject.getType()))
			return sdemigration.proxies.Workorder.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.WorkorderICT", mendixObject.getType()))
			return sdemigration.proxies.WorkorderICT.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("SDEMigration.WorkorderICTAffectedItems", mendixObject.getType()))
			return sdemigration.proxies.WorkorderICTAffectedItems.initialize(context, mendixObject);

		return new sdemigration.proxies.SDEObject(context, mendixObject);
	}

	public static sdemigration.proxies.SDEObject load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sdemigration.proxies.SDEObject.initialize(context, mendixObject);
	}

	public static java.util.List<? extends sdemigration.proxies.SDEObject> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<sdemigration.proxies.SDEObject> result = new java.util.ArrayList<sdemigration.proxies.SDEObject>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SDEMigration.SDEObject" + xpathConstraint))
			result.add(sdemigration.proxies.SDEObject.initialize(context, obj));
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
	 * @return value of processed
	 */
	public final java.lang.Boolean getprocessed()
	{
		return getprocessed(getContext());
	}

	/**
	 * @param context
	 * @return value of processed
	 */
	public final java.lang.Boolean getprocessed(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.processed.toString());
	}

	/**
	 * Set value of processed
	 * @param processed
	 */
	public final void setprocessed(java.lang.Boolean processed)
	{
		setprocessed(getContext(), processed);
	}

	/**
	 * Set value of processed
	 * @param context
	 * @param processed
	 */
	public final void setprocessed(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean processed)
	{
		getMendixObject().setValue(context, MemberNames.processed.toString(), processed);
	}

	/**
	 * @return value of SDEObject_MigrationItemRun
	 */
	public final sdemigration.proxies.MigrationItemRun getSDEObject_MigrationItemRun() throws com.mendix.core.CoreException
	{
		return getSDEObject_MigrationItemRun(getContext());
	}

	/**
	 * @param context
	 * @return value of SDEObject_MigrationItemRun
	 */
	public final sdemigration.proxies.MigrationItemRun getSDEObject_MigrationItemRun(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		sdemigration.proxies.MigrationItemRun result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SDEObject_MigrationItemRun.toString());
		if (identifier != null)
			result = sdemigration.proxies.MigrationItemRun.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SDEObject_MigrationItemRun
	 * @param sdeobject_migrationitemrun
	 */
	public final void setSDEObject_MigrationItemRun(sdemigration.proxies.MigrationItemRun sdeobject_migrationitemrun)
	{
		setSDEObject_MigrationItemRun(getContext(), sdeobject_migrationitemrun);
	}

	/**
	 * Set value of SDEObject_MigrationItemRun
	 * @param context
	 * @param sdeobject_migrationitemrun
	 */
	public final void setSDEObject_MigrationItemRun(com.mendix.systemwideinterfaces.core.IContext context, sdemigration.proxies.MigrationItemRun sdeobject_migrationitemrun)
	{
		if (sdeobject_migrationitemrun == null)
			getMendixObject().setValue(context, MemberNames.SDEObject_MigrationItemRun.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SDEObject_MigrationItemRun.toString(), sdeobject_migrationitemrun.getMendixObject().getId());
	}

	/**
	 * @return value of IncomingRequest_SDEObject
	 */
	public final interfacerequests.proxies.IncomingRequest getIncomingRequest_SDEObject() throws com.mendix.core.CoreException
	{
		return getIncomingRequest_SDEObject(getContext());
	}

	/**
	 * @param context
	 * @return value of IncomingRequest_SDEObject
	 */
	public final interfacerequests.proxies.IncomingRequest getIncomingRequest_SDEObject(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		interfacerequests.proxies.IncomingRequest result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.IncomingRequest_SDEObject.toString());
		if (identifier != null)
			result = interfacerequests.proxies.IncomingRequest.load(context, identifier);
		return result;
	}

	/**
	 * Set value of IncomingRequest_SDEObject
	 * @param incomingrequest_sdeobject
	 */
	public final void setIncomingRequest_SDEObject(interfacerequests.proxies.IncomingRequest incomingrequest_sdeobject)
	{
		setIncomingRequest_SDEObject(getContext(), incomingrequest_sdeobject);
	}

	/**
	 * Set value of IncomingRequest_SDEObject
	 * @param context
	 * @param incomingrequest_sdeobject
	 */
	public final void setIncomingRequest_SDEObject(com.mendix.systemwideinterfaces.core.IContext context, interfacerequests.proxies.IncomingRequest incomingrequest_sdeobject)
	{
		if (incomingrequest_sdeobject == null)
			getMendixObject().setValue(context, MemberNames.IncomingRequest_SDEObject.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.IncomingRequest_SDEObject.toString(), incomingrequest_sdeobject.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return sDEObjectMendixObject;
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
			final sdemigration.proxies.SDEObject that = (sdemigration.proxies.SDEObject) obj;
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
		return "SDEMigration.SDEObject";
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
