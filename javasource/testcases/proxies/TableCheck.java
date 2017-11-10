// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testcases.proxies;

public class TableCheck extends testcases.proxies.Check
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "TestCases.TableCheck";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		TableCheckType("TableCheckType"),
		Check("Check"),
		CheckType("CheckType"),
		CheckOn("CheckOn"),
		Visibility("Visibility"),
		Editability("Editability"),
		ExpectedValue("ExpectedValue"),
		ExpectedIdentifierValue("ExpectedIdentifierValue"),
		ExpectedBehaviour("ExpectedBehaviour"),
		ExpectedNumberOfEntries("ExpectedNumberOfEntries"),
		Result("Result"),
		ActualValue("ActualValue"),
		ActualIdentifierValue("ActualIdentifierValue"),
		ActualBehaviour("ActualBehaviour"),
		ActualNumberOfEntries("ActualNumberOfEntries"),
		Delete("Delete"),
		TableCheck_Table("TestCases.TableCheck_Table"),
		Check_TestCaseStep("TestCases.Check_TestCaseStep"),
		Check_TestStep("TestCases.Check_TestStep");

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

	public TableCheck(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "TestCases.TableCheck"));
	}

	protected TableCheck(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject tableCheckMendixObject)
	{
		super(context, tableCheckMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("TestCases.TableCheck", tableCheckMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a TestCases.TableCheck");
	}

	/**
	 * @deprecated Use 'TableCheck.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static testcases.proxies.TableCheck initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return testcases.proxies.TableCheck.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static testcases.proxies.TableCheck initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("TestCases.TestCaseTableCheck", mendixObject.getType()))
			return testcases.proxies.TestCaseTableCheck.initialize(context, mendixObject);

		if (com.mendix.core.Core.isSubClassOf("TestCases.TestTableCheck", mendixObject.getType()))
			return testcases.proxies.TestTableCheck.initialize(context, mendixObject);

		return new testcases.proxies.TableCheck(context, mendixObject);
	}

	public static testcases.proxies.TableCheck load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return testcases.proxies.TableCheck.initialize(context, mendixObject);
	}

	public static java.util.List<? extends testcases.proxies.TableCheck> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<testcases.proxies.TableCheck> result = new java.util.ArrayList<testcases.proxies.TableCheck>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//TestCases.TableCheck" + xpathConstraint))
			result.add(testcases.proxies.TableCheck.initialize(context, obj));
		return result;
	}

	/**
	 * Set value of TableCheckType
	 * @param tablechecktype
	 */
	public final testcases.proxies.TableCheckType getTableCheckType()
	{
		return getTableCheckType(getContext());
	}

	/**
	 * @param context
	 * @return value of TableCheckType
	 */
	public final testcases.proxies.TableCheckType getTableCheckType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.TableCheckType.toString());
		if (obj == null)
			return null;

		return testcases.proxies.TableCheckType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of TableCheckType
	 * @param tablechecktype
	 */
	public final void setTableCheckType(testcases.proxies.TableCheckType tablechecktype)
	{
		setTableCheckType(getContext(), tablechecktype);
	}

	/**
	 * Set value of TableCheckType
	 * @param context
	 * @param tablechecktype
	 */
	public final void setTableCheckType(com.mendix.systemwideinterfaces.core.IContext context, testcases.proxies.TableCheckType tablechecktype)
	{
		if (tablechecktype != null)
			getMendixObject().setValue(context, MemberNames.TableCheckType.toString(), tablechecktype.toString());
		else
			getMendixObject().setValue(context, MemberNames.TableCheckType.toString(), null);
	}

	/**
	 * @return value of TableCheck_Table
	 */
	public final testcases.proxies.Table getTableCheck_Table() throws com.mendix.core.CoreException
	{
		return getTableCheck_Table(getContext());
	}

	/**
	 * @param context
	 * @return value of TableCheck_Table
	 */
	public final testcases.proxies.Table getTableCheck_Table(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		testcases.proxies.Table result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TableCheck_Table.toString());
		if (identifier != null)
			result = testcases.proxies.Table.load(context, identifier);
		return result;
	}

	/**
	 * Set value of TableCheck_Table
	 * @param tablecheck_table
	 */
	public final void setTableCheck_Table(testcases.proxies.Table tablecheck_table)
	{
		setTableCheck_Table(getContext(), tablecheck_table);
	}

	/**
	 * Set value of TableCheck_Table
	 * @param context
	 * @param tablecheck_table
	 */
	public final void setTableCheck_Table(com.mendix.systemwideinterfaces.core.IContext context, testcases.proxies.Table tablecheck_table)
	{
		if (tablecheck_table == null)
			getMendixObject().setValue(context, MemberNames.TableCheck_Table.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.TableCheck_Table.toString(), tablecheck_table.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final testcases.proxies.TableCheck that = (testcases.proxies.TableCheck) obj;
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
		return "TestCases.TableCheck";
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