// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testcases.proxies;

public class TestData
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject testDataMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "TestCases.TestData";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		TestData("TestData"),
		DataFor("DataFor"),
		TestData_Test("TestCases.TestData_Test");

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

	public TestData(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "TestCases.TestData"));
	}

	protected TestData(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject testDataMendixObject)
	{
		if (testDataMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("TestCases.TestData", testDataMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a TestCases.TestData");

		this.testDataMendixObject = testDataMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'TestData.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static testcases.proxies.TestData initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return testcases.proxies.TestData.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static testcases.proxies.TestData initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new testcases.proxies.TestData(context, mendixObject);
	}

	public static testcases.proxies.TestData load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return testcases.proxies.TestData.initialize(context, mendixObject);
	}

	public static java.util.List<testcases.proxies.TestData> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<testcases.proxies.TestData> result = new java.util.ArrayList<testcases.proxies.TestData>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//TestCases.TestData" + xpathConstraint))
			result.add(testcases.proxies.TestData.initialize(context, obj));
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
	 * @return value of TestData
	 */
	public final java.lang.String getTestData()
	{
		return getTestData(getContext());
	}

	/**
	 * @param context
	 * @return value of TestData
	 */
	public final java.lang.String getTestData(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.TestData.toString());
	}

	/**
	 * Set value of TestData
	 * @param testdata
	 */
	public final void setTestData(java.lang.String testdata)
	{
		setTestData(getContext(), testdata);
	}

	/**
	 * Set value of TestData
	 * @param context
	 * @param testdata
	 */
	public final void setTestData(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String testdata)
	{
		getMendixObject().setValue(context, MemberNames.TestData.toString(), testdata);
	}

	/**
	 * @return value of DataFor
	 */
	public final java.lang.String getDataFor()
	{
		return getDataFor(getContext());
	}

	/**
	 * @param context
	 * @return value of DataFor
	 */
	public final java.lang.String getDataFor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DataFor.toString());
	}

	/**
	 * Set value of DataFor
	 * @param datafor
	 */
	public final void setDataFor(java.lang.String datafor)
	{
		setDataFor(getContext(), datafor);
	}

	/**
	 * Set value of DataFor
	 * @param context
	 * @param datafor
	 */
	public final void setDataFor(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String datafor)
	{
		getMendixObject().setValue(context, MemberNames.DataFor.toString(), datafor);
	}

	/**
	 * @return value of TestData_Test
	 */
	public final testcases.proxies.Test getTestData_Test() throws com.mendix.core.CoreException
	{
		return getTestData_Test(getContext());
	}

	/**
	 * @param context
	 * @return value of TestData_Test
	 */
	public final testcases.proxies.Test getTestData_Test(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		testcases.proxies.Test result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TestData_Test.toString());
		if (identifier != null)
			result = testcases.proxies.Test.load(context, identifier);
		return result;
	}

	/**
	 * Set value of TestData_Test
	 * @param testdata_test
	 */
	public final void setTestData_Test(testcases.proxies.Test testdata_test)
	{
		setTestData_Test(getContext(), testdata_test);
	}

	/**
	 * Set value of TestData_Test
	 * @param context
	 * @param testdata_test
	 */
	public final void setTestData_Test(com.mendix.systemwideinterfaces.core.IContext context, testcases.proxies.Test testdata_test)
	{
		if (testdata_test == null)
			getMendixObject().setValue(context, MemberNames.TestData_Test.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.TestData_Test.toString(), testdata_test.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return testDataMendixObject;
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
			final testcases.proxies.TestData that = (testcases.proxies.TestData) obj;
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
		return "TestCases.TestData";
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
