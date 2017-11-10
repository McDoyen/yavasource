// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testcases.proxies;

public class TestCaseFormCheck extends testcases.proxies.FormCheck
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "TestCases.TestCaseFormCheck";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FormCheckType("FormCheckType"),
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
		FormCheck_Form("TestCases.FormCheck_Form"),
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

	public TestCaseFormCheck(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "TestCases.TestCaseFormCheck"));
	}

	protected TestCaseFormCheck(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject testCaseFormCheckMendixObject)
	{
		super(context, testCaseFormCheckMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("TestCases.TestCaseFormCheck", testCaseFormCheckMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a TestCases.TestCaseFormCheck");
	}

	/**
	 * @deprecated Use 'TestCaseFormCheck.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static testcases.proxies.TestCaseFormCheck initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return testcases.proxies.TestCaseFormCheck.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static testcases.proxies.TestCaseFormCheck initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new testcases.proxies.TestCaseFormCheck(context, mendixObject);
	}

	public static testcases.proxies.TestCaseFormCheck load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return testcases.proxies.TestCaseFormCheck.initialize(context, mendixObject);
	}

	public static java.util.List<testcases.proxies.TestCaseFormCheck> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<testcases.proxies.TestCaseFormCheck> result = new java.util.ArrayList<testcases.proxies.TestCaseFormCheck>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//TestCases.TestCaseFormCheck" + xpathConstraint))
			result.add(testcases.proxies.TestCaseFormCheck.initialize(context, obj));
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final testcases.proxies.TestCaseFormCheck that = (testcases.proxies.TestCaseFormCheck) obj;
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
		return "TestCases.TestCaseFormCheck";
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
