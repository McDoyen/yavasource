// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testcases.proxies;

public class Button
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject buttonMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "TestCases.Button";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		ExecuteLinkedTestCase("ExecuteLinkedTestCase"),
		Function("Function"),
		Button_Field("TestCases.Button_Field"),
		Button_Form("TestCases.Button_Form"),
		Button_TestCase("TestCases.Button_TestCase"),
		Button_Table("TestCases.Button_Table"),
		Button_CurrentTestCaseStep("TestCases.Button_CurrentTestCaseStep");

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

	public Button(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "TestCases.Button"));
	}

	protected Button(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject buttonMendixObject)
	{
		if (buttonMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("TestCases.Button", buttonMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a TestCases.Button");

		this.buttonMendixObject = buttonMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Button.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static testcases.proxies.Button initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return testcases.proxies.Button.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static testcases.proxies.Button initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new testcases.proxies.Button(context, mendixObject);
	}

	public static testcases.proxies.Button load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return testcases.proxies.Button.initialize(context, mendixObject);
	}

	public static java.util.List<testcases.proxies.Button> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<testcases.proxies.Button> result = new java.util.ArrayList<testcases.proxies.Button>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//TestCases.Button" + xpathConstraint))
			result.add(testcases.proxies.Button.initialize(context, obj));
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
	 * @return value of ExecuteLinkedTestCase
	 */
	public final java.lang.Boolean getExecuteLinkedTestCase()
	{
		return getExecuteLinkedTestCase(getContext());
	}

	/**
	 * @param context
	 * @return value of ExecuteLinkedTestCase
	 */
	public final java.lang.Boolean getExecuteLinkedTestCase(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ExecuteLinkedTestCase.toString());
	}

	/**
	 * Set value of ExecuteLinkedTestCase
	 * @param executelinkedtestcase
	 */
	public final void setExecuteLinkedTestCase(java.lang.Boolean executelinkedtestcase)
	{
		setExecuteLinkedTestCase(getContext(), executelinkedtestcase);
	}

	/**
	 * Set value of ExecuteLinkedTestCase
	 * @param context
	 * @param executelinkedtestcase
	 */
	public final void setExecuteLinkedTestCase(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean executelinkedtestcase)
	{
		getMendixObject().setValue(context, MemberNames.ExecuteLinkedTestCase.toString(), executelinkedtestcase);
	}

	/**
	 * @return value of Function
	 */
	public final java.lang.String getFunction()
	{
		return getFunction(getContext());
	}

	/**
	 * @param context
	 * @return value of Function
	 */
	public final java.lang.String getFunction(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Function.toString());
	}

	/**
	 * Set value of Function
	 * @param function
	 */
	public final void setFunction(java.lang.String function)
	{
		setFunction(getContext(), function);
	}

	/**
	 * Set value of Function
	 * @param context
	 * @param function
	 */
	public final void setFunction(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String function)
	{
		getMendixObject().setValue(context, MemberNames.Function.toString(), function);
	}

	/**
	 * @return value of Button_Field
	 */
	public final testcases.proxies.Field getButton_Field() throws com.mendix.core.CoreException
	{
		return getButton_Field(getContext());
	}

	/**
	 * @param context
	 * @return value of Button_Field
	 */
	public final testcases.proxies.Field getButton_Field(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		testcases.proxies.Field result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Button_Field.toString());
		if (identifier != null)
			result = testcases.proxies.Field.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Button_Field
	 * @param button_field
	 */
	public final void setButton_Field(testcases.proxies.Field button_field)
	{
		setButton_Field(getContext(), button_field);
	}

	/**
	 * Set value of Button_Field
	 * @param context
	 * @param button_field
	 */
	public final void setButton_Field(com.mendix.systemwideinterfaces.core.IContext context, testcases.proxies.Field button_field)
	{
		if (button_field == null)
			getMendixObject().setValue(context, MemberNames.Button_Field.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Button_Field.toString(), button_field.getMendixObject().getId());
	}

	/**
	 * @return value of Button_Form
	 */
	public final testcases.proxies.Form getButton_Form() throws com.mendix.core.CoreException
	{
		return getButton_Form(getContext());
	}

	/**
	 * @param context
	 * @return value of Button_Form
	 */
	public final testcases.proxies.Form getButton_Form(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		testcases.proxies.Form result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Button_Form.toString());
		if (identifier != null)
			result = testcases.proxies.Form.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Button_Form
	 * @param button_form
	 */
	public final void setButton_Form(testcases.proxies.Form button_form)
	{
		setButton_Form(getContext(), button_form);
	}

	/**
	 * Set value of Button_Form
	 * @param context
	 * @param button_form
	 */
	public final void setButton_Form(com.mendix.systemwideinterfaces.core.IContext context, testcases.proxies.Form button_form)
	{
		if (button_form == null)
			getMendixObject().setValue(context, MemberNames.Button_Form.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Button_Form.toString(), button_form.getMendixObject().getId());
	}

	/**
	 * @return value of Button_TestCase
	 */
	public final testcases.proxies.TestCase getButton_TestCase() throws com.mendix.core.CoreException
	{
		return getButton_TestCase(getContext());
	}

	/**
	 * @param context
	 * @return value of Button_TestCase
	 */
	public final testcases.proxies.TestCase getButton_TestCase(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		testcases.proxies.TestCase result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Button_TestCase.toString());
		if (identifier != null)
			result = testcases.proxies.TestCase.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Button_TestCase
	 * @param button_testcase
	 */
	public final void setButton_TestCase(testcases.proxies.TestCase button_testcase)
	{
		setButton_TestCase(getContext(), button_testcase);
	}

	/**
	 * Set value of Button_TestCase
	 * @param context
	 * @param button_testcase
	 */
	public final void setButton_TestCase(com.mendix.systemwideinterfaces.core.IContext context, testcases.proxies.TestCase button_testcase)
	{
		if (button_testcase == null)
			getMendixObject().setValue(context, MemberNames.Button_TestCase.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Button_TestCase.toString(), button_testcase.getMendixObject().getId());
	}

	/**
	 * @return value of Button_Table
	 */
	public final testcases.proxies.Table getButton_Table() throws com.mendix.core.CoreException
	{
		return getButton_Table(getContext());
	}

	/**
	 * @param context
	 * @return value of Button_Table
	 */
	public final testcases.proxies.Table getButton_Table(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		testcases.proxies.Table result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Button_Table.toString());
		if (identifier != null)
			result = testcases.proxies.Table.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Button_Table
	 * @param button_table
	 */
	public final void setButton_Table(testcases.proxies.Table button_table)
	{
		setButton_Table(getContext(), button_table);
	}

	/**
	 * Set value of Button_Table
	 * @param context
	 * @param button_table
	 */
	public final void setButton_Table(com.mendix.systemwideinterfaces.core.IContext context, testcases.proxies.Table button_table)
	{
		if (button_table == null)
			getMendixObject().setValue(context, MemberNames.Button_Table.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Button_Table.toString(), button_table.getMendixObject().getId());
	}

	/**
	 * @return value of Button_CurrentTestCaseStep
	 */
	public final testcases.proxies.TestCaseStep getButton_CurrentTestCaseStep() throws com.mendix.core.CoreException
	{
		return getButton_CurrentTestCaseStep(getContext());
	}

	/**
	 * @param context
	 * @return value of Button_CurrentTestCaseStep
	 */
	public final testcases.proxies.TestCaseStep getButton_CurrentTestCaseStep(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		testcases.proxies.TestCaseStep result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Button_CurrentTestCaseStep.toString());
		if (identifier != null)
			result = testcases.proxies.TestCaseStep.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Button_CurrentTestCaseStep
	 * @param button_currenttestcasestep
	 */
	public final void setButton_CurrentTestCaseStep(testcases.proxies.TestCaseStep button_currenttestcasestep)
	{
		setButton_CurrentTestCaseStep(getContext(), button_currenttestcasestep);
	}

	/**
	 * Set value of Button_CurrentTestCaseStep
	 * @param context
	 * @param button_currenttestcasestep
	 */
	public final void setButton_CurrentTestCaseStep(com.mendix.systemwideinterfaces.core.IContext context, testcases.proxies.TestCaseStep button_currenttestcasestep)
	{
		if (button_currenttestcasestep == null)
			getMendixObject().setValue(context, MemberNames.Button_CurrentTestCaseStep.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Button_CurrentTestCaseStep.toString(), button_currenttestcasestep.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return buttonMendixObject;
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
			final testcases.proxies.Button that = (testcases.proxies.Button) obj;
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
		return "TestCases.Button";
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
