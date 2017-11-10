// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sdemigration.proxies;

public class PersonICT extends sdemigration.proxies.SDEObject
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SDEMigration.PersonICT";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Sequence("Sequence"),
		FirstName("FirstName"),
		MiddleName("MiddleName"),
		LastName("LastName"),
		FullName("FullName"),
		PersonCode("PersonCode"),
		Source("Source"),
		processed("processed"),
		SDEObject_MigrationItemRun("SDEMigration.SDEObject_MigrationItemRun"),
		IncomingRequest_SDEObject("InterfaceRequests.IncomingRequest_SDEObject");

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

	public PersonICT(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SDEMigration.PersonICT"));
	}

	protected PersonICT(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject personICTMendixObject)
	{
		super(context, personICTMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("SDEMigration.PersonICT", personICTMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SDEMigration.PersonICT");
	}

	/**
	 * @deprecated Use 'PersonICT.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static sdemigration.proxies.PersonICT initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sdemigration.proxies.PersonICT.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sdemigration.proxies.PersonICT initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sdemigration.proxies.PersonICT(context, mendixObject);
	}

	public static sdemigration.proxies.PersonICT load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sdemigration.proxies.PersonICT.initialize(context, mendixObject);
	}

	public static java.util.List<sdemigration.proxies.PersonICT> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<sdemigration.proxies.PersonICT> result = new java.util.ArrayList<sdemigration.proxies.PersonICT>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SDEMigration.PersonICT" + xpathConstraint))
			result.add(sdemigration.proxies.PersonICT.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of Sequence
	 */
	public final java.lang.String getSequence()
	{
		return getSequence(getContext());
	}

	/**
	 * @param context
	 * @return value of Sequence
	 */
	public final java.lang.String getSequence(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Sequence.toString());
	}

	/**
	 * Set value of Sequence
	 * @param sequence
	 */
	public final void setSequence(java.lang.String sequence)
	{
		setSequence(getContext(), sequence);
	}

	/**
	 * Set value of Sequence
	 * @param context
	 * @param sequence
	 */
	public final void setSequence(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String sequence)
	{
		getMendixObject().setValue(context, MemberNames.Sequence.toString(), sequence);
	}

	/**
	 * @return value of FirstName
	 */
	public final java.lang.String getFirstName()
	{
		return getFirstName(getContext());
	}

	/**
	 * @param context
	 * @return value of FirstName
	 */
	public final java.lang.String getFirstName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FirstName.toString());
	}

	/**
	 * Set value of FirstName
	 * @param firstname
	 */
	public final void setFirstName(java.lang.String firstname)
	{
		setFirstName(getContext(), firstname);
	}

	/**
	 * Set value of FirstName
	 * @param context
	 * @param firstname
	 */
	public final void setFirstName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String firstname)
	{
		getMendixObject().setValue(context, MemberNames.FirstName.toString(), firstname);
	}

	/**
	 * @return value of MiddleName
	 */
	public final java.lang.String getMiddleName()
	{
		return getMiddleName(getContext());
	}

	/**
	 * @param context
	 * @return value of MiddleName
	 */
	public final java.lang.String getMiddleName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MiddleName.toString());
	}

	/**
	 * Set value of MiddleName
	 * @param middlename
	 */
	public final void setMiddleName(java.lang.String middlename)
	{
		setMiddleName(getContext(), middlename);
	}

	/**
	 * Set value of MiddleName
	 * @param context
	 * @param middlename
	 */
	public final void setMiddleName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String middlename)
	{
		getMendixObject().setValue(context, MemberNames.MiddleName.toString(), middlename);
	}

	/**
	 * @return value of LastName
	 */
	public final java.lang.String getLastName()
	{
		return getLastName(getContext());
	}

	/**
	 * @param context
	 * @return value of LastName
	 */
	public final java.lang.String getLastName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LastName.toString());
	}

	/**
	 * Set value of LastName
	 * @param lastname
	 */
	public final void setLastName(java.lang.String lastname)
	{
		setLastName(getContext(), lastname);
	}

	/**
	 * Set value of LastName
	 * @param context
	 * @param lastname
	 */
	public final void setLastName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String lastname)
	{
		getMendixObject().setValue(context, MemberNames.LastName.toString(), lastname);
	}

	/**
	 * @return value of FullName
	 */
	public final java.lang.String getFullName()
	{
		return getFullName(getContext());
	}

	/**
	 * @param context
	 * @return value of FullName
	 */
	public final java.lang.String getFullName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FullName.toString());
	}

	/**
	 * Set value of FullName
	 * @param fullname
	 */
	public final void setFullName(java.lang.String fullname)
	{
		setFullName(getContext(), fullname);
	}

	/**
	 * Set value of FullName
	 * @param context
	 * @param fullname
	 */
	public final void setFullName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String fullname)
	{
		getMendixObject().setValue(context, MemberNames.FullName.toString(), fullname);
	}

	/**
	 * @return value of PersonCode
	 */
	public final java.lang.String getPersonCode()
	{
		return getPersonCode(getContext());
	}

	/**
	 * @param context
	 * @return value of PersonCode
	 */
	public final java.lang.String getPersonCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PersonCode.toString());
	}

	/**
	 * Set value of PersonCode
	 * @param personcode
	 */
	public final void setPersonCode(java.lang.String personcode)
	{
		setPersonCode(getContext(), personcode);
	}

	/**
	 * Set value of PersonCode
	 * @param context
	 * @param personcode
	 */
	public final void setPersonCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String personcode)
	{
		getMendixObject().setValue(context, MemberNames.PersonCode.toString(), personcode);
	}

	/**
	 * @return value of Source
	 */
	public final java.lang.String getSource()
	{
		return getSource(getContext());
	}

	/**
	 * @param context
	 * @return value of Source
	 */
	public final java.lang.String getSource(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Source.toString());
	}

	/**
	 * Set value of Source
	 * @param source
	 */
	public final void setSource(java.lang.String source)
	{
		setSource(getContext(), source);
	}

	/**
	 * Set value of Source
	 * @param context
	 * @param source
	 */
	public final void setSource(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String source)
	{
		getMendixObject().setValue(context, MemberNames.Source.toString(), source);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final sdemigration.proxies.PersonICT that = (sdemigration.proxies.PersonICT) obj;
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
		return "SDEMigration.PersonICT";
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
