// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mendix.proxies;

public class DateTimeFormat
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject dateTimeFormatMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Mendix.DateTimeFormat";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Description("Description"),
		Format("Format"),
		Sample("Sample");

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

	public DateTimeFormat(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Mendix.DateTimeFormat"));
	}

	protected DateTimeFormat(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject dateTimeFormatMendixObject)
	{
		if (dateTimeFormatMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Mendix.DateTimeFormat", dateTimeFormatMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Mendix.DateTimeFormat");

		this.dateTimeFormatMendixObject = dateTimeFormatMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'DateTimeFormat.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static mendix.proxies.DateTimeFormat initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return mendix.proxies.DateTimeFormat.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static mendix.proxies.DateTimeFormat initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new mendix.proxies.DateTimeFormat(context, mendixObject);
	}

	public static mendix.proxies.DateTimeFormat load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return mendix.proxies.DateTimeFormat.initialize(context, mendixObject);
	}

	public static java.util.List<mendix.proxies.DateTimeFormat> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<mendix.proxies.DateTimeFormat> result = new java.util.ArrayList<mendix.proxies.DateTimeFormat>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Mendix.DateTimeFormat" + xpathConstraint))
			result.add(mendix.proxies.DateTimeFormat.initialize(context, obj));
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
	 * @return value of Description
	 */
	public final java.lang.String getDescription()
	{
		return getDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of Description
	 */
	public final java.lang.String getDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Description.toString());
	}

	/**
	 * Set value of Description
	 * @param description
	 */
	public final void setDescription(java.lang.String description)
	{
		setDescription(getContext(), description);
	}

	/**
	 * Set value of Description
	 * @param context
	 * @param description
	 */
	public final void setDescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String description)
	{
		getMendixObject().setValue(context, MemberNames.Description.toString(), description);
	}

	/**
	 * @return value of Format
	 */
	public final java.lang.String getFormat()
	{
		return getFormat(getContext());
	}

	/**
	 * @param context
	 * @return value of Format
	 */
	public final java.lang.String getFormat(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Format.toString());
	}

	/**
	 * Set value of Format
	 * @param format
	 */
	public final void setFormat(java.lang.String format)
	{
		setFormat(getContext(), format);
	}

	/**
	 * Set value of Format
	 * @param context
	 * @param format
	 */
	public final void setFormat(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String format)
	{
		getMendixObject().setValue(context, MemberNames.Format.toString(), format);
	}

	/**
	 * @return value of Sample
	 */
	public final java.lang.String getSample()
	{
		return getSample(getContext());
	}

	/**
	 * @param context
	 * @return value of Sample
	 */
	public final java.lang.String getSample(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Sample.toString());
	}

	/**
	 * Set value of Sample
	 * @param sample
	 */
	public final void setSample(java.lang.String sample)
	{
		setSample(getContext(), sample);
	}

	/**
	 * Set value of Sample
	 * @param context
	 * @param sample
	 */
	public final void setSample(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String sample)
	{
		getMendixObject().setValue(context, MemberNames.Sample.toString(), sample);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return dateTimeFormatMendixObject;
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
			final mendix.proxies.DateTimeFormat that = (mendix.proxies.DateTimeFormat) obj;
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
		return "Mendix.DateTimeFormat";
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
