// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package customlvnl.proxies;

public class NOTAMTransient
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject nOTAMTransientMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "CustomLVNL.NOTAMTransient";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FileName("FileName"),
		PlannedStart("PlannedStart"),
		PlannedEnd("PlannedEnd"),
		NotamCode("NotamCode"),
		NotamText("NotamText");

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

	public NOTAMTransient(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "CustomLVNL.NOTAMTransient"));
	}

	protected NOTAMTransient(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject nOTAMTransientMendixObject)
	{
		if (nOTAMTransientMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("CustomLVNL.NOTAMTransient", nOTAMTransientMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a CustomLVNL.NOTAMTransient");

		this.nOTAMTransientMendixObject = nOTAMTransientMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'NOTAMTransient.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static customlvnl.proxies.NOTAMTransient initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return customlvnl.proxies.NOTAMTransient.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static customlvnl.proxies.NOTAMTransient initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new customlvnl.proxies.NOTAMTransient(context, mendixObject);
	}

	public static customlvnl.proxies.NOTAMTransient load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return customlvnl.proxies.NOTAMTransient.initialize(context, mendixObject);
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
	 * @return value of FileName
	 */
	public final java.lang.String getFileName()
	{
		return getFileName(getContext());
	}

	/**
	 * @param context
	 * @return value of FileName
	 */
	public final java.lang.String getFileName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FileName.toString());
	}

	/**
	 * Set value of FileName
	 * @param filename
	 */
	public final void setFileName(java.lang.String filename)
	{
		setFileName(getContext(), filename);
	}

	/**
	 * Set value of FileName
	 * @param context
	 * @param filename
	 */
	public final void setFileName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String filename)
	{
		getMendixObject().setValue(context, MemberNames.FileName.toString(), filename);
	}

	/**
	 * @return value of PlannedStart
	 */
	public final java.lang.String getPlannedStart()
	{
		return getPlannedStart(getContext());
	}

	/**
	 * @param context
	 * @return value of PlannedStart
	 */
	public final java.lang.String getPlannedStart(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PlannedStart.toString());
	}

	/**
	 * Set value of PlannedStart
	 * @param plannedstart
	 */
	public final void setPlannedStart(java.lang.String plannedstart)
	{
		setPlannedStart(getContext(), plannedstart);
	}

	/**
	 * Set value of PlannedStart
	 * @param context
	 * @param plannedstart
	 */
	public final void setPlannedStart(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String plannedstart)
	{
		getMendixObject().setValue(context, MemberNames.PlannedStart.toString(), plannedstart);
	}

	/**
	 * @return value of PlannedEnd
	 */
	public final java.lang.String getPlannedEnd()
	{
		return getPlannedEnd(getContext());
	}

	/**
	 * @param context
	 * @return value of PlannedEnd
	 */
	public final java.lang.String getPlannedEnd(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PlannedEnd.toString());
	}

	/**
	 * Set value of PlannedEnd
	 * @param plannedend
	 */
	public final void setPlannedEnd(java.lang.String plannedend)
	{
		setPlannedEnd(getContext(), plannedend);
	}

	/**
	 * Set value of PlannedEnd
	 * @param context
	 * @param plannedend
	 */
	public final void setPlannedEnd(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String plannedend)
	{
		getMendixObject().setValue(context, MemberNames.PlannedEnd.toString(), plannedend);
	}

	/**
	 * @return value of NotamCode
	 */
	public final java.lang.String getNotamCode()
	{
		return getNotamCode(getContext());
	}

	/**
	 * @param context
	 * @return value of NotamCode
	 */
	public final java.lang.String getNotamCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.NotamCode.toString());
	}

	/**
	 * Set value of NotamCode
	 * @param notamcode
	 */
	public final void setNotamCode(java.lang.String notamcode)
	{
		setNotamCode(getContext(), notamcode);
	}

	/**
	 * Set value of NotamCode
	 * @param context
	 * @param notamcode
	 */
	public final void setNotamCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String notamcode)
	{
		getMendixObject().setValue(context, MemberNames.NotamCode.toString(), notamcode);
	}

	/**
	 * @return value of NotamText
	 */
	public final java.lang.String getNotamText()
	{
		return getNotamText(getContext());
	}

	/**
	 * @param context
	 * @return value of NotamText
	 */
	public final java.lang.String getNotamText(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.NotamText.toString());
	}

	/**
	 * Set value of NotamText
	 * @param notamtext
	 */
	public final void setNotamText(java.lang.String notamtext)
	{
		setNotamText(getContext(), notamtext);
	}

	/**
	 * Set value of NotamText
	 * @param context
	 * @param notamtext
	 */
	public final void setNotamText(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String notamtext)
	{
		getMendixObject().setValue(context, MemberNames.NotamText.toString(), notamtext);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return nOTAMTransientMendixObject;
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
			final customlvnl.proxies.NOTAMTransient that = (customlvnl.proxies.NOTAMTransient) obj;
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
		return "CustomLVNL.NOTAMTransient";
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
