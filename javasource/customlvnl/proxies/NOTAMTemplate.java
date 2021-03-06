// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package customlvnl.proxies;

public class NOTAMTemplate extends system.proxies.FileDocument
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "CustomLVNL.NOTAMTemplate";

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

	public NOTAMTemplate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "CustomLVNL.NOTAMTemplate"));
	}

	protected NOTAMTemplate(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject nOTAMTemplateMendixObject)
	{
		super(context, nOTAMTemplateMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("CustomLVNL.NOTAMTemplate", nOTAMTemplateMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a CustomLVNL.NOTAMTemplate");
	}

	/**
	 * @deprecated Use 'NOTAMTemplate.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static customlvnl.proxies.NOTAMTemplate initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return customlvnl.proxies.NOTAMTemplate.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static customlvnl.proxies.NOTAMTemplate initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new customlvnl.proxies.NOTAMTemplate(context, mendixObject);
	}

	public static customlvnl.proxies.NOTAMTemplate load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return customlvnl.proxies.NOTAMTemplate.initialize(context, mendixObject);
	}

	public static java.util.List<customlvnl.proxies.NOTAMTemplate> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<customlvnl.proxies.NOTAMTemplate> result = new java.util.ArrayList<customlvnl.proxies.NOTAMTemplate>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//CustomLVNL.NOTAMTemplate" + xpathConstraint))
			result.add(customlvnl.proxies.NOTAMTemplate.initialize(context, obj));
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final customlvnl.proxies.NOTAMTemplate that = (customlvnl.proxies.NOTAMTemplate) obj;
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
		return "CustomLVNL.NOTAMTemplate";
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
