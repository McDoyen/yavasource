// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testcases.proxies;

public class Field
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject fieldMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "TestCases.Field";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		TableSearchField("TableSearchField"),
		Field_Form("TestCases.Field_Form"),
		Field_CurrentTestCaseStep("TestCases.Field_CurrentTestCaseStep"),
		Field_Table("TestCases.Field_Table"),
		Field_MxObjectMember("TestCases.Field_MxObjectMember"),
		Field_MxObjectReference("TestCases.Field_MxObjectReference");

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

	public Field(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "TestCases.Field"));
	}

	protected Field(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject fieldMendixObject)
	{
		if (fieldMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("TestCases.Field", fieldMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a TestCases.Field");

		this.fieldMendixObject = fieldMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Field.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static testcases.proxies.Field initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return testcases.proxies.Field.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static testcases.proxies.Field initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new testcases.proxies.Field(context, mendixObject);
	}

	public static testcases.proxies.Field load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return testcases.proxies.Field.initialize(context, mendixObject);
	}

	public static java.util.List<testcases.proxies.Field> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<testcases.proxies.Field> result = new java.util.ArrayList<testcases.proxies.Field>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//TestCases.Field" + xpathConstraint))
			result.add(testcases.proxies.Field.initialize(context, obj));
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
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of TableSearchField
	 */
	public final java.lang.Boolean getTableSearchField()
	{
		return getTableSearchField(getContext());
	}

	/**
	 * @param context
	 * @return value of TableSearchField
	 */
	public final java.lang.Boolean getTableSearchField(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.TableSearchField.toString());
	}

	/**
	 * Set value of TableSearchField
	 * @param tablesearchfield
	 */
	public final void setTableSearchField(java.lang.Boolean tablesearchfield)
	{
		setTableSearchField(getContext(), tablesearchfield);
	}

	/**
	 * Set value of TableSearchField
	 * @param context
	 * @param tablesearchfield
	 */
	public final void setTableSearchField(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean tablesearchfield)
	{
		getMendixObject().setValue(context, MemberNames.TableSearchField.toString(), tablesearchfield);
	}

	/**
	 * @return value of Field_Form
	 */
	public final testcases.proxies.Form getField_Form() throws com.mendix.core.CoreException
	{
		return getField_Form(getContext());
	}

	/**
	 * @param context
	 * @return value of Field_Form
	 */
	public final testcases.proxies.Form getField_Form(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		testcases.proxies.Form result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Field_Form.toString());
		if (identifier != null)
			result = testcases.proxies.Form.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Field_Form
	 * @param field_form
	 */
	public final void setField_Form(testcases.proxies.Form field_form)
	{
		setField_Form(getContext(), field_form);
	}

	/**
	 * Set value of Field_Form
	 * @param context
	 * @param field_form
	 */
	public final void setField_Form(com.mendix.systemwideinterfaces.core.IContext context, testcases.proxies.Form field_form)
	{
		if (field_form == null)
			getMendixObject().setValue(context, MemberNames.Field_Form.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Field_Form.toString(), field_form.getMendixObject().getId());
	}

	/**
	 * @return value of Field_CurrentTestCaseStep
	 */
	public final testcases.proxies.TestCaseStep getField_CurrentTestCaseStep() throws com.mendix.core.CoreException
	{
		return getField_CurrentTestCaseStep(getContext());
	}

	/**
	 * @param context
	 * @return value of Field_CurrentTestCaseStep
	 */
	public final testcases.proxies.TestCaseStep getField_CurrentTestCaseStep(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		testcases.proxies.TestCaseStep result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Field_CurrentTestCaseStep.toString());
		if (identifier != null)
			result = testcases.proxies.TestCaseStep.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Field_CurrentTestCaseStep
	 * @param field_currenttestcasestep
	 */
	public final void setField_CurrentTestCaseStep(testcases.proxies.TestCaseStep field_currenttestcasestep)
	{
		setField_CurrentTestCaseStep(getContext(), field_currenttestcasestep);
	}

	/**
	 * Set value of Field_CurrentTestCaseStep
	 * @param context
	 * @param field_currenttestcasestep
	 */
	public final void setField_CurrentTestCaseStep(com.mendix.systemwideinterfaces.core.IContext context, testcases.proxies.TestCaseStep field_currenttestcasestep)
	{
		if (field_currenttestcasestep == null)
			getMendixObject().setValue(context, MemberNames.Field_CurrentTestCaseStep.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Field_CurrentTestCaseStep.toString(), field_currenttestcasestep.getMendixObject().getId());
	}

	/**
	 * @return value of Field_Table
	 */
	public final testcases.proxies.Table getField_Table() throws com.mendix.core.CoreException
	{
		return getField_Table(getContext());
	}

	/**
	 * @param context
	 * @return value of Field_Table
	 */
	public final testcases.proxies.Table getField_Table(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		testcases.proxies.Table result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Field_Table.toString());
		if (identifier != null)
			result = testcases.proxies.Table.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Field_Table
	 * @param field_table
	 */
	public final void setField_Table(testcases.proxies.Table field_table)
	{
		setField_Table(getContext(), field_table);
	}

	/**
	 * Set value of Field_Table
	 * @param context
	 * @param field_table
	 */
	public final void setField_Table(com.mendix.systemwideinterfaces.core.IContext context, testcases.proxies.Table field_table)
	{
		if (field_table == null)
			getMendixObject().setValue(context, MemberNames.Field_Table.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Field_Table.toString(), field_table.getMendixObject().getId());
	}

	/**
	 * @return value of Field_MxObjectMember
	 */
	public final mxmodelreflection.proxies.MxObjectMember getField_MxObjectMember() throws com.mendix.core.CoreException
	{
		return getField_MxObjectMember(getContext());
	}

	/**
	 * @param context
	 * @return value of Field_MxObjectMember
	 */
	public final mxmodelreflection.proxies.MxObjectMember getField_MxObjectMember(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mxmodelreflection.proxies.MxObjectMember result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Field_MxObjectMember.toString());
		if (identifier != null)
			result = mxmodelreflection.proxies.MxObjectMember.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Field_MxObjectMember
	 * @param field_mxobjectmember
	 */
	public final void setField_MxObjectMember(mxmodelreflection.proxies.MxObjectMember field_mxobjectmember)
	{
		setField_MxObjectMember(getContext(), field_mxobjectmember);
	}

	/**
	 * Set value of Field_MxObjectMember
	 * @param context
	 * @param field_mxobjectmember
	 */
	public final void setField_MxObjectMember(com.mendix.systemwideinterfaces.core.IContext context, mxmodelreflection.proxies.MxObjectMember field_mxobjectmember)
	{
		if (field_mxobjectmember == null)
			getMendixObject().setValue(context, MemberNames.Field_MxObjectMember.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Field_MxObjectMember.toString(), field_mxobjectmember.getMendixObject().getId());
	}

	/**
	 * @return value of Field_MxObjectReference
	 */
	public final mxmodelreflection.proxies.MxObjectReference getField_MxObjectReference() throws com.mendix.core.CoreException
	{
		return getField_MxObjectReference(getContext());
	}

	/**
	 * @param context
	 * @return value of Field_MxObjectReference
	 */
	public final mxmodelreflection.proxies.MxObjectReference getField_MxObjectReference(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mxmodelreflection.proxies.MxObjectReference result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Field_MxObjectReference.toString());
		if (identifier != null)
			result = mxmodelreflection.proxies.MxObjectReference.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Field_MxObjectReference
	 * @param field_mxobjectreference
	 */
	public final void setField_MxObjectReference(mxmodelreflection.proxies.MxObjectReference field_mxobjectreference)
	{
		setField_MxObjectReference(getContext(), field_mxobjectreference);
	}

	/**
	 * Set value of Field_MxObjectReference
	 * @param context
	 * @param field_mxobjectreference
	 */
	public final void setField_MxObjectReference(com.mendix.systemwideinterfaces.core.IContext context, mxmodelreflection.proxies.MxObjectReference field_mxobjectreference)
	{
		if (field_mxobjectreference == null)
			getMendixObject().setValue(context, MemberNames.Field_MxObjectReference.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Field_MxObjectReference.toString(), field_mxobjectreference.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return fieldMendixObject;
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
			final testcases.proxies.Field that = (testcases.proxies.Field) obj;
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
		return "TestCases.Field";
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
