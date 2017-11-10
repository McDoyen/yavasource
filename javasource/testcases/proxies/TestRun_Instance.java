// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testcases.proxies;

public class TestRun_Instance
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject testRun_InstanceMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "TestCases.TestRun_Instance";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		TestType("TestType"),
		SprintrFeedbackNeeded("SprintrFeedbackNeeded"),
		TestRun_Instance_TestPackage("TestCases.TestRun_Instance_TestPackage");

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

	public TestRun_Instance(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "TestCases.TestRun_Instance"));
	}

	protected TestRun_Instance(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject testRun_InstanceMendixObject)
	{
		if (testRun_InstanceMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("TestCases.TestRun_Instance", testRun_InstanceMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a TestCases.TestRun_Instance");

		this.testRun_InstanceMendixObject = testRun_InstanceMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'TestRun_Instance.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static testcases.proxies.TestRun_Instance initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return testcases.proxies.TestRun_Instance.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static testcases.proxies.TestRun_Instance initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new testcases.proxies.TestRun_Instance(context, mendixObject);
	}

	public static testcases.proxies.TestRun_Instance load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return testcases.proxies.TestRun_Instance.initialize(context, mendixObject);
	}

	public static java.util.List<testcases.proxies.TestRun_Instance> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<testcases.proxies.TestRun_Instance> result = new java.util.ArrayList<testcases.proxies.TestRun_Instance>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//TestCases.TestRun_Instance" + xpathConstraint))
			result.add(testcases.proxies.TestRun_Instance.initialize(context, obj));
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
	 * Set value of TestType
	 * @param testtype
	 */
	public final testcases.proxies.TestTypes getTestType()
	{
		return getTestType(getContext());
	}

	/**
	 * @param context
	 * @return value of TestType
	 */
	public final testcases.proxies.TestTypes getTestType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.TestType.toString());
		if (obj == null)
			return null;

		return testcases.proxies.TestTypes.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of TestType
	 * @param testtype
	 */
	public final void setTestType(testcases.proxies.TestTypes testtype)
	{
		setTestType(getContext(), testtype);
	}

	/**
	 * Set value of TestType
	 * @param context
	 * @param testtype
	 */
	public final void setTestType(com.mendix.systemwideinterfaces.core.IContext context, testcases.proxies.TestTypes testtype)
	{
		if (testtype != null)
			getMendixObject().setValue(context, MemberNames.TestType.toString(), testtype.toString());
		else
			getMendixObject().setValue(context, MemberNames.TestType.toString(), null);
	}

	/**
	 * @return value of SprintrFeedbackNeeded
	 */
	public final java.lang.Boolean getSprintrFeedbackNeeded()
	{
		return getSprintrFeedbackNeeded(getContext());
	}

	/**
	 * @param context
	 * @return value of SprintrFeedbackNeeded
	 */
	public final java.lang.Boolean getSprintrFeedbackNeeded(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.SprintrFeedbackNeeded.toString());
	}

	/**
	 * Set value of SprintrFeedbackNeeded
	 * @param sprintrfeedbackneeded
	 */
	public final void setSprintrFeedbackNeeded(java.lang.Boolean sprintrfeedbackneeded)
	{
		setSprintrFeedbackNeeded(getContext(), sprintrfeedbackneeded);
	}

	/**
	 * Set value of SprintrFeedbackNeeded
	 * @param context
	 * @param sprintrfeedbackneeded
	 */
	public final void setSprintrFeedbackNeeded(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean sprintrfeedbackneeded)
	{
		getMendixObject().setValue(context, MemberNames.SprintrFeedbackNeeded.toString(), sprintrfeedbackneeded);
	}

	/**
	 * @return value of TestRun_Instance_TestPackage
	 */
	public final testcases.proxies.TestPackage getTestRun_Instance_TestPackage() throws com.mendix.core.CoreException
	{
		return getTestRun_Instance_TestPackage(getContext());
	}

	/**
	 * @param context
	 * @return value of TestRun_Instance_TestPackage
	 */
	public final testcases.proxies.TestPackage getTestRun_Instance_TestPackage(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		testcases.proxies.TestPackage result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TestRun_Instance_TestPackage.toString());
		if (identifier != null)
			result = testcases.proxies.TestPackage.load(context, identifier);
		return result;
	}

	/**
	 * Set value of TestRun_Instance_TestPackage
	 * @param testrun_instance_testpackage
	 */
	public final void setTestRun_Instance_TestPackage(testcases.proxies.TestPackage testrun_instance_testpackage)
	{
		setTestRun_Instance_TestPackage(getContext(), testrun_instance_testpackage);
	}

	/**
	 * Set value of TestRun_Instance_TestPackage
	 * @param context
	 * @param testrun_instance_testpackage
	 */
	public final void setTestRun_Instance_TestPackage(com.mendix.systemwideinterfaces.core.IContext context, testcases.proxies.TestPackage testrun_instance_testpackage)
	{
		if (testrun_instance_testpackage == null)
			getMendixObject().setValue(context, MemberNames.TestRun_Instance_TestPackage.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.TestRun_Instance_TestPackage.toString(), testrun_instance_testpackage.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return testRun_InstanceMendixObject;
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
			final testcases.proxies.TestRun_Instance that = (testcases.proxies.TestRun_Instance) obj;
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
		return "TestCases.TestRun_Instance";
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