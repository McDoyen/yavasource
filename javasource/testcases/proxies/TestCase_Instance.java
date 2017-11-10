// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testcases.proxies;

public class TestCase_Instance
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject testCase_InstanceMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "TestCases.TestCase_Instance";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		TestCaseNumber("TestCaseNumber"),
		ApplicationVersion("ApplicationVersion"),
		TestCaseTitle("TestCaseTitle"),
		Purpose("Purpose"),
		Prerequisits("Prerequisits"),
		Notes("Notes"),
		Status("Status"),
		TestCaseNumber_String("TestCaseNumber_String"),
		TestCaseOrder("TestCaseOrder"),
		TestCase_Instance_TestPackage_Instance("TestCases.TestCase_Instance_TestPackage_Instance"),
		TestCase_Instance_Test("TestCases.TestCase_Instance_Test");

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

	public TestCase_Instance(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "TestCases.TestCase_Instance"));
	}

	protected TestCase_Instance(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject testCase_InstanceMendixObject)
	{
		if (testCase_InstanceMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("TestCases.TestCase_Instance", testCase_InstanceMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a TestCases.TestCase_Instance");

		this.testCase_InstanceMendixObject = testCase_InstanceMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'TestCase_Instance.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static testcases.proxies.TestCase_Instance initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return testcases.proxies.TestCase_Instance.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static testcases.proxies.TestCase_Instance initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new testcases.proxies.TestCase_Instance(context, mendixObject);
	}

	public static testcases.proxies.TestCase_Instance load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return testcases.proxies.TestCase_Instance.initialize(context, mendixObject);
	}

	public static java.util.List<testcases.proxies.TestCase_Instance> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<testcases.proxies.TestCase_Instance> result = new java.util.ArrayList<testcases.proxies.TestCase_Instance>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//TestCases.TestCase_Instance" + xpathConstraint))
			result.add(testcases.proxies.TestCase_Instance.initialize(context, obj));
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
	 * @return value of TestCaseNumber
	 */
	public final java.lang.Long getTestCaseNumber()
	{
		return getTestCaseNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of TestCaseNumber
	 */
	public final java.lang.Long getTestCaseNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.TestCaseNumber.toString());
	}

	/**
	 * Set value of TestCaseNumber
	 * @param testcasenumber
	 */
	public final void setTestCaseNumber(java.lang.Long testcasenumber)
	{
		setTestCaseNumber(getContext(), testcasenumber);
	}

	/**
	 * Set value of TestCaseNumber
	 * @param context
	 * @param testcasenumber
	 */
	public final void setTestCaseNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long testcasenumber)
	{
		getMendixObject().setValue(context, MemberNames.TestCaseNumber.toString(), testcasenumber);
	}

	/**
	 * Set value of ApplicationVersion
	 * @param applicationversion
	 */
	public final testcases.proxies.ApplicationVersions getApplicationVersion()
	{
		return getApplicationVersion(getContext());
	}

	/**
	 * @param context
	 * @return value of ApplicationVersion
	 */
	public final testcases.proxies.ApplicationVersions getApplicationVersion(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ApplicationVersion.toString());
		if (obj == null)
			return null;

		return testcases.proxies.ApplicationVersions.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ApplicationVersion
	 * @param applicationversion
	 */
	public final void setApplicationVersion(testcases.proxies.ApplicationVersions applicationversion)
	{
		setApplicationVersion(getContext(), applicationversion);
	}

	/**
	 * Set value of ApplicationVersion
	 * @param context
	 * @param applicationversion
	 */
	public final void setApplicationVersion(com.mendix.systemwideinterfaces.core.IContext context, testcases.proxies.ApplicationVersions applicationversion)
	{
		if (applicationversion != null)
			getMendixObject().setValue(context, MemberNames.ApplicationVersion.toString(), applicationversion.toString());
		else
			getMendixObject().setValue(context, MemberNames.ApplicationVersion.toString(), null);
	}

	/**
	 * @return value of TestCaseTitle
	 */
	public final java.lang.String getTestCaseTitle()
	{
		return getTestCaseTitle(getContext());
	}

	/**
	 * @param context
	 * @return value of TestCaseTitle
	 */
	public final java.lang.String getTestCaseTitle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.TestCaseTitle.toString());
	}

	/**
	 * Set value of TestCaseTitle
	 * @param testcasetitle
	 */
	public final void setTestCaseTitle(java.lang.String testcasetitle)
	{
		setTestCaseTitle(getContext(), testcasetitle);
	}

	/**
	 * Set value of TestCaseTitle
	 * @param context
	 * @param testcasetitle
	 */
	public final void setTestCaseTitle(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String testcasetitle)
	{
		getMendixObject().setValue(context, MemberNames.TestCaseTitle.toString(), testcasetitle);
	}

	/**
	 * @return value of Purpose
	 */
	public final java.lang.String getPurpose()
	{
		return getPurpose(getContext());
	}

	/**
	 * @param context
	 * @return value of Purpose
	 */
	public final java.lang.String getPurpose(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Purpose.toString());
	}

	/**
	 * Set value of Purpose
	 * @param purpose
	 */
	public final void setPurpose(java.lang.String purpose)
	{
		setPurpose(getContext(), purpose);
	}

	/**
	 * Set value of Purpose
	 * @param context
	 * @param purpose
	 */
	public final void setPurpose(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String purpose)
	{
		getMendixObject().setValue(context, MemberNames.Purpose.toString(), purpose);
	}

	/**
	 * @return value of Prerequisits
	 */
	public final java.lang.String getPrerequisits()
	{
		return getPrerequisits(getContext());
	}

	/**
	 * @param context
	 * @return value of Prerequisits
	 */
	public final java.lang.String getPrerequisits(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Prerequisits.toString());
	}

	/**
	 * Set value of Prerequisits
	 * @param prerequisits
	 */
	public final void setPrerequisits(java.lang.String prerequisits)
	{
		setPrerequisits(getContext(), prerequisits);
	}

	/**
	 * Set value of Prerequisits
	 * @param context
	 * @param prerequisits
	 */
	public final void setPrerequisits(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String prerequisits)
	{
		getMendixObject().setValue(context, MemberNames.Prerequisits.toString(), prerequisits);
	}

	/**
	 * @return value of Notes
	 */
	public final java.lang.String getNotes()
	{
		return getNotes(getContext());
	}

	/**
	 * @param context
	 * @return value of Notes
	 */
	public final java.lang.String getNotes(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Notes.toString());
	}

	/**
	 * Set value of Notes
	 * @param notes
	 */
	public final void setNotes(java.lang.String notes)
	{
		setNotes(getContext(), notes);
	}

	/**
	 * Set value of Notes
	 * @param context
	 * @param notes
	 */
	public final void setNotes(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String notes)
	{
		getMendixObject().setValue(context, MemberNames.Notes.toString(), notes);
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final testcases.proxies.Testcase_status getStatus()
	{
		return getStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of Status
	 */
	public final testcases.proxies.Testcase_status getStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Status.toString());
		if (obj == null)
			return null;

		return testcases.proxies.Testcase_status.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final void setStatus(testcases.proxies.Testcase_status status)
	{
		setStatus(getContext(), status);
	}

	/**
	 * Set value of Status
	 * @param context
	 * @param status
	 */
	public final void setStatus(com.mendix.systemwideinterfaces.core.IContext context, testcases.proxies.Testcase_status status)
	{
		if (status != null)
			getMendixObject().setValue(context, MemberNames.Status.toString(), status.toString());
		else
			getMendixObject().setValue(context, MemberNames.Status.toString(), null);
	}

	/**
	 * @return value of TestCaseNumber_String
	 */
	public final java.lang.String getTestCaseNumber_String()
	{
		return getTestCaseNumber_String(getContext());
	}

	/**
	 * @param context
	 * @return value of TestCaseNumber_String
	 */
	public final java.lang.String getTestCaseNumber_String(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.TestCaseNumber_String.toString());
	}

	/**
	 * Set value of TestCaseNumber_String
	 * @param testcasenumber_string
	 */
	public final void setTestCaseNumber_String(java.lang.String testcasenumber_string)
	{
		setTestCaseNumber_String(getContext(), testcasenumber_string);
	}

	/**
	 * Set value of TestCaseNumber_String
	 * @param context
	 * @param testcasenumber_string
	 */
	public final void setTestCaseNumber_String(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String testcasenumber_string)
	{
		getMendixObject().setValue(context, MemberNames.TestCaseNumber_String.toString(), testcasenumber_string);
	}

	/**
	 * @return value of TestCaseOrder
	 */
	public final java.lang.String getTestCaseOrder()
	{
		return getTestCaseOrder(getContext());
	}

	/**
	 * @param context
	 * @return value of TestCaseOrder
	 */
	public final java.lang.String getTestCaseOrder(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.TestCaseOrder.toString());
	}

	/**
	 * Set value of TestCaseOrder
	 * @param testcaseorder
	 */
	public final void setTestCaseOrder(java.lang.String testcaseorder)
	{
		setTestCaseOrder(getContext(), testcaseorder);
	}

	/**
	 * Set value of TestCaseOrder
	 * @param context
	 * @param testcaseorder
	 */
	public final void setTestCaseOrder(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String testcaseorder)
	{
		getMendixObject().setValue(context, MemberNames.TestCaseOrder.toString(), testcaseorder);
	}

	/**
	 * @return value of TestCase_Instance_TestPackage_Instance
	 */
	public final testcases.proxies.TestPackage_Instance getTestCase_Instance_TestPackage_Instance() throws com.mendix.core.CoreException
	{
		return getTestCase_Instance_TestPackage_Instance(getContext());
	}

	/**
	 * @param context
	 * @return value of TestCase_Instance_TestPackage_Instance
	 */
	public final testcases.proxies.TestPackage_Instance getTestCase_Instance_TestPackage_Instance(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		testcases.proxies.TestPackage_Instance result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TestCase_Instance_TestPackage_Instance.toString());
		if (identifier != null)
			result = testcases.proxies.TestPackage_Instance.load(context, identifier);
		return result;
	}

	/**
	 * Set value of TestCase_Instance_TestPackage_Instance
	 * @param testcase_instance_testpackage_instance
	 */
	public final void setTestCase_Instance_TestPackage_Instance(testcases.proxies.TestPackage_Instance testcase_instance_testpackage_instance)
	{
		setTestCase_Instance_TestPackage_Instance(getContext(), testcase_instance_testpackage_instance);
	}

	/**
	 * Set value of TestCase_Instance_TestPackage_Instance
	 * @param context
	 * @param testcase_instance_testpackage_instance
	 */
	public final void setTestCase_Instance_TestPackage_Instance(com.mendix.systemwideinterfaces.core.IContext context, testcases.proxies.TestPackage_Instance testcase_instance_testpackage_instance)
	{
		if (testcase_instance_testpackage_instance == null)
			getMendixObject().setValue(context, MemberNames.TestCase_Instance_TestPackage_Instance.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.TestCase_Instance_TestPackage_Instance.toString(), testcase_instance_testpackage_instance.getMendixObject().getId());
	}

	/**
	 * @return value of TestCase_Instance_Test
	 */
	public final java.util.List<testcases.proxies.Test> getTestCase_Instance_Test() throws com.mendix.core.CoreException
	{
		return getTestCase_Instance_Test(getContext());
	}

	/**
	 * @param context
	 * @return value of TestCase_Instance_Test
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<testcases.proxies.Test> getTestCase_Instance_Test(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<testcases.proxies.Test> result = new java.util.ArrayList<testcases.proxies.Test>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.TestCase_Instance_Test.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(testcases.proxies.Test.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of TestCase_Instance_Test
	 * @param testcase_instance_test
	 */
	public final void setTestCase_Instance_Test(java.util.List<testcases.proxies.Test> testcase_instance_test)
	{
		setTestCase_Instance_Test(getContext(), testcase_instance_test);
	}

	/**
	 * Set value of TestCase_Instance_Test
	 * @param context
	 * @param testcase_instance_test
	 */
	public final void setTestCase_Instance_Test(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<testcases.proxies.Test> testcase_instance_test)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (testcases.proxies.Test proxyObject : testcase_instance_test)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.TestCase_Instance_Test.toString(), identifiers);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return testCase_InstanceMendixObject;
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
			final testcases.proxies.TestCase_Instance that = (testcases.proxies.TestCase_Instance) obj;
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
		return "TestCases.TestCase_Instance";
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