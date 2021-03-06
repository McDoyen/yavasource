// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package advancedsearch.proxies;

public class Fragment
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject fragmentMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "AdvancedSearch.Fragment";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Field("Field"),
		Fragment("Fragment"),
		Tokens("Tokens"),
		Order("Order"),
		Fragment_HTMLExplanation("AdvancedSearch.Fragment_HTMLExplanation"),
		Fragment_TextExplanation("AdvancedSearch.Fragment_TextExplanation");

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

	public Fragment(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "AdvancedSearch.Fragment"));
	}

	protected Fragment(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject fragmentMendixObject)
	{
		if (fragmentMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("AdvancedSearch.Fragment", fragmentMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a AdvancedSearch.Fragment");

		this.fragmentMendixObject = fragmentMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Fragment.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static advancedsearch.proxies.Fragment initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return advancedsearch.proxies.Fragment.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static advancedsearch.proxies.Fragment initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new advancedsearch.proxies.Fragment(context, mendixObject);
	}

	public static advancedsearch.proxies.Fragment load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return advancedsearch.proxies.Fragment.initialize(context, mendixObject);
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
	 * @return value of Field
	 */
	public final java.lang.String getField()
	{
		return getField(getContext());
	}

	/**
	 * @param context
	 * @return value of Field
	 */
	public final java.lang.String getField(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Field.toString());
	}

	/**
	 * Set value of Field
	 * @param field
	 */
	public final void setField(java.lang.String field)
	{
		setField(getContext(), field);
	}

	/**
	 * Set value of Field
	 * @param context
	 * @param field
	 */
	public final void setField(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String field)
	{
		getMendixObject().setValue(context, MemberNames.Field.toString(), field);
	}

	/**
	 * @return value of Fragment
	 */
	public final java.lang.String getFragment()
	{
		return getFragment(getContext());
	}

	/**
	 * @param context
	 * @return value of Fragment
	 */
	public final java.lang.String getFragment(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Fragment.toString());
	}

	/**
	 * Set value of Fragment
	 * @param fragment
	 */
	public final void setFragment(java.lang.String fragment)
	{
		setFragment(getContext(), fragment);
	}

	/**
	 * Set value of Fragment
	 * @param context
	 * @param fragment
	 */
	public final void setFragment(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String fragment)
	{
		getMendixObject().setValue(context, MemberNames.Fragment.toString(), fragment);
	}

	/**
	 * @return value of Tokens
	 */
	public final java.lang.String getTokens()
	{
		return getTokens(getContext());
	}

	/**
	 * @param context
	 * @return value of Tokens
	 */
	public final java.lang.String getTokens(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Tokens.toString());
	}

	/**
	 * Set value of Tokens
	 * @param tokens
	 */
	public final void setTokens(java.lang.String tokens)
	{
		setTokens(getContext(), tokens);
	}

	/**
	 * Set value of Tokens
	 * @param context
	 * @param tokens
	 */
	public final void setTokens(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String tokens)
	{
		getMendixObject().setValue(context, MemberNames.Tokens.toString(), tokens);
	}

	/**
	 * @return value of Order
	 */
	public final java.lang.Integer getOrder()
	{
		return getOrder(getContext());
	}

	/**
	 * @param context
	 * @return value of Order
	 */
	public final java.lang.Integer getOrder(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Order.toString());
	}

	/**
	 * Set value of Order
	 * @param order
	 */
	public final void setOrder(java.lang.Integer order)
	{
		setOrder(getContext(), order);
	}

	/**
	 * Set value of Order
	 * @param context
	 * @param order
	 */
	public final void setOrder(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer order)
	{
		getMendixObject().setValue(context, MemberNames.Order.toString(), order);
	}

	/**
	 * @return value of Fragment_HTMLExplanation
	 */
	public final advancedsearch.proxies.Explanation getFragment_HTMLExplanation() throws com.mendix.core.CoreException
	{
		return getFragment_HTMLExplanation(getContext());
	}

	/**
	 * @param context
	 * @return value of Fragment_HTMLExplanation
	 */
	public final advancedsearch.proxies.Explanation getFragment_HTMLExplanation(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		advancedsearch.proxies.Explanation result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Fragment_HTMLExplanation.toString());
		if (identifier != null)
			result = advancedsearch.proxies.Explanation.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Fragment_HTMLExplanation
	 * @param fragment_htmlexplanation
	 */
	public final void setFragment_HTMLExplanation(advancedsearch.proxies.Explanation fragment_htmlexplanation)
	{
		setFragment_HTMLExplanation(getContext(), fragment_htmlexplanation);
	}

	/**
	 * Set value of Fragment_HTMLExplanation
	 * @param context
	 * @param fragment_htmlexplanation
	 */
	public final void setFragment_HTMLExplanation(com.mendix.systemwideinterfaces.core.IContext context, advancedsearch.proxies.Explanation fragment_htmlexplanation)
	{
		if (fragment_htmlexplanation == null)
			getMendixObject().setValue(context, MemberNames.Fragment_HTMLExplanation.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Fragment_HTMLExplanation.toString(), fragment_htmlexplanation.getMendixObject().getId());
	}

	/**
	 * @return value of Fragment_TextExplanation
	 */
	public final advancedsearch.proxies.Explanation getFragment_TextExplanation() throws com.mendix.core.CoreException
	{
		return getFragment_TextExplanation(getContext());
	}

	/**
	 * @param context
	 * @return value of Fragment_TextExplanation
	 */
	public final advancedsearch.proxies.Explanation getFragment_TextExplanation(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		advancedsearch.proxies.Explanation result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Fragment_TextExplanation.toString());
		if (identifier != null)
			result = advancedsearch.proxies.Explanation.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Fragment_TextExplanation
	 * @param fragment_textexplanation
	 */
	public final void setFragment_TextExplanation(advancedsearch.proxies.Explanation fragment_textexplanation)
	{
		setFragment_TextExplanation(getContext(), fragment_textexplanation);
	}

	/**
	 * Set value of Fragment_TextExplanation
	 * @param context
	 * @param fragment_textexplanation
	 */
	public final void setFragment_TextExplanation(com.mendix.systemwideinterfaces.core.IContext context, advancedsearch.proxies.Explanation fragment_textexplanation)
	{
		if (fragment_textexplanation == null)
			getMendixObject().setValue(context, MemberNames.Fragment_TextExplanation.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Fragment_TextExplanation.toString(), fragment_textexplanation.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return fragmentMendixObject;
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
			final advancedsearch.proxies.Fragment that = (advancedsearch.proxies.Fragment) obj;
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
		return "AdvancedSearch.Fragment";
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
