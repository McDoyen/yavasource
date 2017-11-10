// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testcases.proxies;

public class TestCaseFieldCheck extends testcases.proxies.FieldCheck
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "TestCases.TestCaseFieldCheck";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FieldCheckType("FieldCheckType"),
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
		FieldCheck_Field("TestCases.FieldCheck_Field"),
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

	public TestCaseFieldCheck(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "TestCases.TestCaseFieldCheck"));
	}

	protected TestCaseFieldCheck(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject testCaseFieldCheckMendixObject)
	{
		super(context, testCaseFieldCheckMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("TestCases.TestCaseFieldCheck", testCaseFieldCheckMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a TestCases.TestCaseFieldCheck");
	}

	/**
	 * @deprecated Use 'TestCaseFieldCheck.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static testcases.proxies.TestCaseFieldCheck initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return testcases.proxies.TestCaseFieldCheck.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static testcases.proxies.TestCaseFieldCheck initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new testcases.proxies.TestCaseFieldCheck(context, mendixObject);
	}

	public static testcases.proxies.TestCaseFieldCheck load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return testcases.proxies.TestCaseFieldCheck.initialize(context, mendixObject);
	}

	public static java.util.List<testcases.proxies.TestCaseFieldCheck> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<testcases.proxies.TestCaseFieldCheck> result = new java.util.ArrayList<testcases.proxies.TestCaseFieldCheck>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//TestCases.TestCaseFieldCheck" + xpathConstraint))
			result.add(testcases.proxies.TestCaseFieldCheck.initialize(context, obj));
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final testcases.proxies.TestCaseFieldCheck that = (testcases.proxies.TestCaseFieldCheck) obj;
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
		return "TestCases.TestCaseFieldCheck";
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