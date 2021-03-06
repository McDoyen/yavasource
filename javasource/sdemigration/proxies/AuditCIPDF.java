// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sdemigration.proxies;

public class AuditCIPDF extends system.proxies.FileDocument
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SDEMigration.AuditCIPDF";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size");

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

	public AuditCIPDF(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SDEMigration.AuditCIPDF"));
	}

	protected AuditCIPDF(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject auditCIPDFMendixObject)
	{
		super(context, auditCIPDFMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("SDEMigration.AuditCIPDF", auditCIPDFMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SDEMigration.AuditCIPDF");
	}

	/**
	 * @deprecated Use 'AuditCIPDF.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static sdemigration.proxies.AuditCIPDF initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sdemigration.proxies.AuditCIPDF.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sdemigration.proxies.AuditCIPDF initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sdemigration.proxies.AuditCIPDF(context, mendixObject);
	}

	public static sdemigration.proxies.AuditCIPDF load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sdemigration.proxies.AuditCIPDF.initialize(context, mendixObject);
	}

	public static java.util.List<sdemigration.proxies.AuditCIPDF> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<sdemigration.proxies.AuditCIPDF> result = new java.util.ArrayList<sdemigration.proxies.AuditCIPDF>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SDEMigration.AuditCIPDF" + xpathConstraint))
			result.add(sdemigration.proxies.AuditCIPDF.initialize(context, obj));
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final sdemigration.proxies.AuditCIPDF that = (sdemigration.proxies.AuditCIPDF) obj;
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
		return "SDEMigration.AuditCIPDF";
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
