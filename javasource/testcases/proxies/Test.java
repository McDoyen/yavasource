// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testcases.proxies;

public class Test
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject testMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "TestCases.Test";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		TestNumber("TestNumber"),
		ApplicationVersion("ApplicationVersion"),
		TestCaseTitle("TestCaseTitle"),
		Purpose("Purpose"),
		Prerequisits("Prerequisits"),
		Notes("Notes"),
		Status("Status"),
		Tester("Tester"),
		BrowserUsed("BrowserUsed"),
		StartTime("StartTime"),
		CloseTime("CloseTime"),
		Test_TestCaseCategory("TestCases.Test_TestCaseCategory"),
		Test_Developers("TestCases.Test_Developers"),
		Test_Developers_Tester("TestCases.Test_Developers_Tester"),
		Test_TestCase("TestCases.Test_TestCase"),
		Test_TestRun("TestCases.Test_TestRun"),
		Test_TestCase_Instance("TestCases.Test_TestCase_Instance");

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

	public Test(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "TestCases.Test"));
	}

	protected Test(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject testMendixObject)
	{
		if (testMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("TestCases.Test", testMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a TestCases.Test");

		this.testMendixObject = testMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Test.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static testcases.proxies.Test initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return testcases.proxies.Test.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static testcases.proxies.Test initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new testcases.proxies.Test(context, mendixObject);
	}

	public static testcases.proxies.Test load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return testcases.proxies.Test.initialize(context, mendixObject);
	}

	public static java.util.List<testcases.proxies.Test> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<testcases.proxies.Test> result = new java.util.ArrayList<testcases.proxies.Test>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//TestCases.Test" + xpathConstraint))
			result.add(testcases.proxies.Test.initialize(context, obj));
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
	 * @return value of TestNumber
	 */
	public final java.lang.Long getTestNumber()
	{
		return getTestNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of TestNumber
	 */
	public final java.lang.Long getTestNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.TestNumber.toString());
	}

	/**
	 * Set value of TestNumber
	 * @param testnumber
	 */
	public final void setTestNumber(java.lang.Long testnumber)
	{
		setTestNumber(getContext(), testnumber);
	}

	/**
	 * Set value of TestNumber
	 * @param context
	 * @param testnumber
	 */
	public final void setTestNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long testnumber)
	{
		getMendixObject().setValue(context, MemberNames.TestNumber.toString(), testnumber);
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
	public final testcases.proxies.TestStatus getStatus()
	{
		return getStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of Status
	 */
	public final testcases.proxies.TestStatus getStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Status.toString());
		if (obj == null)
			return null;

		return testcases.proxies.TestStatus.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final void setStatus(testcases.proxies.TestStatus status)
	{
		setStatus(getContext(), status);
	}

	/**
	 * Set value of Status
	 * @param context
	 * @param status
	 */
	public final void setStatus(com.mendix.systemwideinterfaces.core.IContext context, testcases.proxies.TestStatus status)
	{
		if (status != null)
			getMendixObject().setValue(context, MemberNames.Status.toString(), status.toString());
		else
			getMendixObject().setValue(context, MemberNames.Status.toString(), null);
	}

	/**
	 * @return value of Tester
	 */
	public final java.lang.String getTester()
	{
		return getTester(getContext());
	}

	/**
	 * @param context
	 * @return value of Tester
	 */
	public final java.lang.String getTester(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Tester.toString());
	}

	/**
	 * Set value of Tester
	 * @param tester
	 */
	public final void setTester(java.lang.String tester)
	{
		setTester(getContext(), tester);
	}

	/**
	 * Set value of Tester
	 * @param context
	 * @param tester
	 */
	public final void setTester(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String tester)
	{
		getMendixObject().setValue(context, MemberNames.Tester.toString(), tester);
	}

	/**
	 * Set value of BrowserUsed
	 * @param browserused
	 */
	public final testcases.proxies.Browsers getBrowserUsed()
	{
		return getBrowserUsed(getContext());
	}

	/**
	 * @param context
	 * @return value of BrowserUsed
	 */
	public final testcases.proxies.Browsers getBrowserUsed(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.BrowserUsed.toString());
		if (obj == null)
			return null;

		return testcases.proxies.Browsers.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of BrowserUsed
	 * @param browserused
	 */
	public final void setBrowserUsed(testcases.proxies.Browsers browserused)
	{
		setBrowserUsed(getContext(), browserused);
	}

	/**
	 * Set value of BrowserUsed
	 * @param context
	 * @param browserused
	 */
	public final void setBrowserUsed(com.mendix.systemwideinterfaces.core.IContext context, testcases.proxies.Browsers browserused)
	{
		if (browserused != null)
			getMendixObject().setValue(context, MemberNames.BrowserUsed.toString(), browserused.toString());
		else
			getMendixObject().setValue(context, MemberNames.BrowserUsed.toString(), null);
	}

	/**
	 * @return value of StartTime
	 */
	public final java.util.Date getStartTime()
	{
		return getStartTime(getContext());
	}

	/**
	 * @param context
	 * @return value of StartTime
	 */
	public final java.util.Date getStartTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.StartTime.toString());
	}

	/**
	 * Set value of StartTime
	 * @param starttime
	 */
	public final void setStartTime(java.util.Date starttime)
	{
		setStartTime(getContext(), starttime);
	}

	/**
	 * Set value of StartTime
	 * @param context
	 * @param starttime
	 */
	public final void setStartTime(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date starttime)
	{
		getMendixObject().setValue(context, MemberNames.StartTime.toString(), starttime);
	}

	/**
	 * @return value of CloseTime
	 */
	public final java.util.Date getCloseTime()
	{
		return getCloseTime(getContext());
	}

	/**
	 * @param context
	 * @return value of CloseTime
	 */
	public final java.util.Date getCloseTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.CloseTime.toString());
	}

	/**
	 * Set value of CloseTime
	 * @param closetime
	 */
	public final void setCloseTime(java.util.Date closetime)
	{
		setCloseTime(getContext(), closetime);
	}

	/**
	 * Set value of CloseTime
	 * @param context
	 * @param closetime
	 */
	public final void setCloseTime(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date closetime)
	{
		getMendixObject().setValue(context, MemberNames.CloseTime.toString(), closetime);
	}

	/**
	 * @return value of Test_TestCaseCategory
	 */
	public final java.util.List<testcases.proxies.TestCategory> getTest_TestCaseCategory() throws com.mendix.core.CoreException
	{
		return getTest_TestCaseCategory(getContext());
	}

	/**
	 * @param context
	 * @return value of Test_TestCaseCategory
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<testcases.proxies.TestCategory> getTest_TestCaseCategory(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<testcases.proxies.TestCategory> result = new java.util.ArrayList<testcases.proxies.TestCategory>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Test_TestCaseCategory.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(testcases.proxies.TestCategory.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of Test_TestCaseCategory
	 * @param test_testcasecategory
	 */
	public final void setTest_TestCaseCategory(java.util.List<testcases.proxies.TestCategory> test_testcasecategory)
	{
		setTest_TestCaseCategory(getContext(), test_testcasecategory);
	}

	/**
	 * Set value of Test_TestCaseCategory
	 * @param context
	 * @param test_testcasecategory
	 */
	public final void setTest_TestCaseCategory(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<testcases.proxies.TestCategory> test_testcasecategory)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (testcases.proxies.TestCategory proxyObject : test_testcasecategory)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.Test_TestCaseCategory.toString(), identifiers);
	}

	/**
	 * @return value of Test_Developers
	 */
	public final testcases.proxies.Developers getTest_Developers() throws com.mendix.core.CoreException
	{
		return getTest_Developers(getContext());
	}

	/**
	 * @param context
	 * @return value of Test_Developers
	 */
	public final testcases.proxies.Developers getTest_Developers(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		testcases.proxies.Developers result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Test_Developers.toString());
		if (identifier != null)
			result = testcases.proxies.Developers.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Test_Developers
	 * @param test_developers
	 */
	public final void setTest_Developers(testcases.proxies.Developers test_developers)
	{
		setTest_Developers(getContext(), test_developers);
	}

	/**
	 * Set value of Test_Developers
	 * @param context
	 * @param test_developers
	 */
	public final void setTest_Developers(com.mendix.systemwideinterfaces.core.IContext context, testcases.proxies.Developers test_developers)
	{
		if (test_developers == null)
			getMendixObject().setValue(context, MemberNames.Test_Developers.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Test_Developers.toString(), test_developers.getMendixObject().getId());
	}

	/**
	 * @return value of Test_Developers_Tester
	 */
	public final testcases.proxies.Developers getTest_Developers_Tester() throws com.mendix.core.CoreException
	{
		return getTest_Developers_Tester(getContext());
	}

	/**
	 * @param context
	 * @return value of Test_Developers_Tester
	 */
	public final testcases.proxies.Developers getTest_Developers_Tester(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		testcases.proxies.Developers result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Test_Developers_Tester.toString());
		if (identifier != null)
			result = testcases.proxies.Developers.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Test_Developers_Tester
	 * @param test_developers_tester
	 */
	public final void setTest_Developers_Tester(testcases.proxies.Developers test_developers_tester)
	{
		setTest_Developers_Tester(getContext(), test_developers_tester);
	}

	/**
	 * Set value of Test_Developers_Tester
	 * @param context
	 * @param test_developers_tester
	 */
	public final void setTest_Developers_Tester(com.mendix.systemwideinterfaces.core.IContext context, testcases.proxies.Developers test_developers_tester)
	{
		if (test_developers_tester == null)
			getMendixObject().setValue(context, MemberNames.Test_Developers_Tester.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Test_Developers_Tester.toString(), test_developers_tester.getMendixObject().getId());
	}

	/**
	 * @return value of Test_TestCase
	 */
	public final testcases.proxies.TestCase getTest_TestCase() throws com.mendix.core.CoreException
	{
		return getTest_TestCase(getContext());
	}

	/**
	 * @param context
	 * @return value of Test_TestCase
	 */
	public final testcases.proxies.TestCase getTest_TestCase(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		testcases.proxies.TestCase result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Test_TestCase.toString());
		if (identifier != null)
			result = testcases.proxies.TestCase.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Test_TestCase
	 * @param test_testcase
	 */
	public final void setTest_TestCase(testcases.proxies.TestCase test_testcase)
	{
		setTest_TestCase(getContext(), test_testcase);
	}

	/**
	 * Set value of Test_TestCase
	 * @param context
	 * @param test_testcase
	 */
	public final void setTest_TestCase(com.mendix.systemwideinterfaces.core.IContext context, testcases.proxies.TestCase test_testcase)
	{
		if (test_testcase == null)
			getMendixObject().setValue(context, MemberNames.Test_TestCase.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Test_TestCase.toString(), test_testcase.getMendixObject().getId());
	}

	/**
	 * @return value of Test_TestRun
	 */
	public final testcases.proxies.TestPackage getTest_TestRun() throws com.mendix.core.CoreException
	{
		return getTest_TestRun(getContext());
	}

	/**
	 * @param context
	 * @return value of Test_TestRun
	 */
	public final testcases.proxies.TestPackage getTest_TestRun(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		testcases.proxies.TestPackage result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Test_TestRun.toString());
		if (identifier != null)
			result = testcases.proxies.TestPackage.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Test_TestRun
	 * @param test_testrun
	 */
	public final void setTest_TestRun(testcases.proxies.TestPackage test_testrun)
	{
		setTest_TestRun(getContext(), test_testrun);
	}

	/**
	 * Set value of Test_TestRun
	 * @param context
	 * @param test_testrun
	 */
	public final void setTest_TestRun(com.mendix.systemwideinterfaces.core.IContext context, testcases.proxies.TestPackage test_testrun)
	{
		if (test_testrun == null)
			getMendixObject().setValue(context, MemberNames.Test_TestRun.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Test_TestRun.toString(), test_testrun.getMendixObject().getId());
	}

	/**
	 * @return value of Test_TestCase_Instance
	 */
	public final testcases.proxies.TestCase_Instance getTest_TestCase_Instance() throws com.mendix.core.CoreException
	{
		return getTest_TestCase_Instance(getContext());
	}

	/**
	 * @param context
	 * @return value of Test_TestCase_Instance
	 */
	public final testcases.proxies.TestCase_Instance getTest_TestCase_Instance(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		testcases.proxies.TestCase_Instance result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Test_TestCase_Instance.toString());
		if (identifier != null)
			result = testcases.proxies.TestCase_Instance.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Test_TestCase_Instance
	 * @param test_testcase_instance
	 */
	public final void setTest_TestCase_Instance(testcases.proxies.TestCase_Instance test_testcase_instance)
	{
		setTest_TestCase_Instance(getContext(), test_testcase_instance);
	}

	/**
	 * Set value of Test_TestCase_Instance
	 * @param context
	 * @param test_testcase_instance
	 */
	public final void setTest_TestCase_Instance(com.mendix.systemwideinterfaces.core.IContext context, testcases.proxies.TestCase_Instance test_testcase_instance)
	{
		if (test_testcase_instance == null)
			getMendixObject().setValue(context, MemberNames.Test_TestCase_Instance.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Test_TestCase_Instance.toString(), test_testcase_instance.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return testMendixObject;
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
			final testcases.proxies.Test that = (testcases.proxies.Test) obj;
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
		return "TestCases.Test";
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
