// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package advancedsearch.proxies;

public class SearchConfiguration
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject searchConfigurationMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "AdvancedSearch.SearchConfiguration";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		SearchEnabled("SearchEnabled"),
		MaximumResults("MaximumResults"),
		IndexRequestAttachments("IndexRequestAttachments"),
		IndexRequestAffectedCIs("IndexRequestAffectedCIs"),
		IndexRequestExtReferences("IndexRequestExtReferences"),
		IndexRequestMessages("IndexRequestMessages"),
		IndexRequestNotes("IndexRequestNotes"),
		IndexRequestApplyPostWildcard("IndexRequestApplyPostWildcard"),
		IndexCMDBAttachments("IndexCMDBAttachments"),
		IndexCMDBDynAttributes("IndexCMDBDynAttributes"),
		IndexCMDBNotes("IndexCMDBNotes"),
		IndexCMDBCIPersons("IndexCMDBCIPersons"),
		IndexCMDBApplyPostWildcard("IndexCMDBApplyPostWildcard"),
		IndexPersonCIs("IndexPersonCIs"),
		IndexPersonApplyPostWildcard("IndexPersonApplyPostWildcard"),
		IndexProductApplyPostWildcard("IndexProductApplyPostWildcard"),
		IndexInterfaceApplyPostWildcard("IndexInterfaceApplyPostWildcard"),
		ReferenceIndexing("ReferenceIndexing"),
		ReferenceIndexingStart("ReferenceIndexingStart"),
		ReferenceIndexingEnd("ReferenceIndexingEnd");

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

	public SearchConfiguration(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "AdvancedSearch.SearchConfiguration"));
	}

	protected SearchConfiguration(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject searchConfigurationMendixObject)
	{
		if (searchConfigurationMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("AdvancedSearch.SearchConfiguration", searchConfigurationMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a AdvancedSearch.SearchConfiguration");

		this.searchConfigurationMendixObject = searchConfigurationMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'SearchConfiguration.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static advancedsearch.proxies.SearchConfiguration initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return advancedsearch.proxies.SearchConfiguration.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static advancedsearch.proxies.SearchConfiguration initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new advancedsearch.proxies.SearchConfiguration(context, mendixObject);
	}

	public static advancedsearch.proxies.SearchConfiguration load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return advancedsearch.proxies.SearchConfiguration.initialize(context, mendixObject);
	}

	public static java.util.List<advancedsearch.proxies.SearchConfiguration> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<advancedsearch.proxies.SearchConfiguration> result = new java.util.ArrayList<advancedsearch.proxies.SearchConfiguration>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//AdvancedSearch.SearchConfiguration" + xpathConstraint))
			result.add(advancedsearch.proxies.SearchConfiguration.initialize(context, obj));
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
	 * @return value of SearchEnabled
	 */
	public final java.lang.Boolean getSearchEnabled()
	{
		return getSearchEnabled(getContext());
	}

	/**
	 * @param context
	 * @return value of SearchEnabled
	 */
	public final java.lang.Boolean getSearchEnabled(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.SearchEnabled.toString());
	}

	/**
	 * Set value of SearchEnabled
	 * @param searchenabled
	 */
	public final void setSearchEnabled(java.lang.Boolean searchenabled)
	{
		setSearchEnabled(getContext(), searchenabled);
	}

	/**
	 * Set value of SearchEnabled
	 * @param context
	 * @param searchenabled
	 */
	public final void setSearchEnabled(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean searchenabled)
	{
		getMendixObject().setValue(context, MemberNames.SearchEnabled.toString(), searchenabled);
	}

	/**
	 * @return value of MaximumResults
	 */
	public final java.lang.Integer getMaximumResults()
	{
		return getMaximumResults(getContext());
	}

	/**
	 * @param context
	 * @return value of MaximumResults
	 */
	public final java.lang.Integer getMaximumResults(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.MaximumResults.toString());
	}

	/**
	 * Set value of MaximumResults
	 * @param maximumresults
	 */
	public final void setMaximumResults(java.lang.Integer maximumresults)
	{
		setMaximumResults(getContext(), maximumresults);
	}

	/**
	 * Set value of MaximumResults
	 * @param context
	 * @param maximumresults
	 */
	public final void setMaximumResults(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer maximumresults)
	{
		getMendixObject().setValue(context, MemberNames.MaximumResults.toString(), maximumresults);
	}

	/**
	 * @return value of IndexRequestAttachments
	 */
	public final java.lang.Boolean getIndexRequestAttachments()
	{
		return getIndexRequestAttachments(getContext());
	}

	/**
	 * @param context
	 * @return value of IndexRequestAttachments
	 */
	public final java.lang.Boolean getIndexRequestAttachments(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IndexRequestAttachments.toString());
	}

	/**
	 * Set value of IndexRequestAttachments
	 * @param indexrequestattachments
	 */
	public final void setIndexRequestAttachments(java.lang.Boolean indexrequestattachments)
	{
		setIndexRequestAttachments(getContext(), indexrequestattachments);
	}

	/**
	 * Set value of IndexRequestAttachments
	 * @param context
	 * @param indexrequestattachments
	 */
	public final void setIndexRequestAttachments(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean indexrequestattachments)
	{
		getMendixObject().setValue(context, MemberNames.IndexRequestAttachments.toString(), indexrequestattachments);
	}

	/**
	 * @return value of IndexRequestAffectedCIs
	 */
	public final java.lang.Boolean getIndexRequestAffectedCIs()
	{
		return getIndexRequestAffectedCIs(getContext());
	}

	/**
	 * @param context
	 * @return value of IndexRequestAffectedCIs
	 */
	public final java.lang.Boolean getIndexRequestAffectedCIs(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IndexRequestAffectedCIs.toString());
	}

	/**
	 * Set value of IndexRequestAffectedCIs
	 * @param indexrequestaffectedcis
	 */
	public final void setIndexRequestAffectedCIs(java.lang.Boolean indexrequestaffectedcis)
	{
		setIndexRequestAffectedCIs(getContext(), indexrequestaffectedcis);
	}

	/**
	 * Set value of IndexRequestAffectedCIs
	 * @param context
	 * @param indexrequestaffectedcis
	 */
	public final void setIndexRequestAffectedCIs(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean indexrequestaffectedcis)
	{
		getMendixObject().setValue(context, MemberNames.IndexRequestAffectedCIs.toString(), indexrequestaffectedcis);
	}

	/**
	 * @return value of IndexRequestExtReferences
	 */
	public final java.lang.Boolean getIndexRequestExtReferences()
	{
		return getIndexRequestExtReferences(getContext());
	}

	/**
	 * @param context
	 * @return value of IndexRequestExtReferences
	 */
	public final java.lang.Boolean getIndexRequestExtReferences(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IndexRequestExtReferences.toString());
	}

	/**
	 * Set value of IndexRequestExtReferences
	 * @param indexrequestextreferences
	 */
	public final void setIndexRequestExtReferences(java.lang.Boolean indexrequestextreferences)
	{
		setIndexRequestExtReferences(getContext(), indexrequestextreferences);
	}

	/**
	 * Set value of IndexRequestExtReferences
	 * @param context
	 * @param indexrequestextreferences
	 */
	public final void setIndexRequestExtReferences(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean indexrequestextreferences)
	{
		getMendixObject().setValue(context, MemberNames.IndexRequestExtReferences.toString(), indexrequestextreferences);
	}

	/**
	 * @return value of IndexRequestMessages
	 */
	public final java.lang.Boolean getIndexRequestMessages()
	{
		return getIndexRequestMessages(getContext());
	}

	/**
	 * @param context
	 * @return value of IndexRequestMessages
	 */
	public final java.lang.Boolean getIndexRequestMessages(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IndexRequestMessages.toString());
	}

	/**
	 * Set value of IndexRequestMessages
	 * @param indexrequestmessages
	 */
	public final void setIndexRequestMessages(java.lang.Boolean indexrequestmessages)
	{
		setIndexRequestMessages(getContext(), indexrequestmessages);
	}

	/**
	 * Set value of IndexRequestMessages
	 * @param context
	 * @param indexrequestmessages
	 */
	public final void setIndexRequestMessages(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean indexrequestmessages)
	{
		getMendixObject().setValue(context, MemberNames.IndexRequestMessages.toString(), indexrequestmessages);
	}

	/**
	 * @return value of IndexRequestNotes
	 */
	public final java.lang.Boolean getIndexRequestNotes()
	{
		return getIndexRequestNotes(getContext());
	}

	/**
	 * @param context
	 * @return value of IndexRequestNotes
	 */
	public final java.lang.Boolean getIndexRequestNotes(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IndexRequestNotes.toString());
	}

	/**
	 * Set value of IndexRequestNotes
	 * @param indexrequestnotes
	 */
	public final void setIndexRequestNotes(java.lang.Boolean indexrequestnotes)
	{
		setIndexRequestNotes(getContext(), indexrequestnotes);
	}

	/**
	 * Set value of IndexRequestNotes
	 * @param context
	 * @param indexrequestnotes
	 */
	public final void setIndexRequestNotes(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean indexrequestnotes)
	{
		getMendixObject().setValue(context, MemberNames.IndexRequestNotes.toString(), indexrequestnotes);
	}

	/**
	 * @return value of IndexRequestApplyPostWildcard
	 */
	public final java.lang.Boolean getIndexRequestApplyPostWildcard()
	{
		return getIndexRequestApplyPostWildcard(getContext());
	}

	/**
	 * @param context
	 * @return value of IndexRequestApplyPostWildcard
	 */
	public final java.lang.Boolean getIndexRequestApplyPostWildcard(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IndexRequestApplyPostWildcard.toString());
	}

	/**
	 * Set value of IndexRequestApplyPostWildcard
	 * @param indexrequestapplypostwildcard
	 */
	public final void setIndexRequestApplyPostWildcard(java.lang.Boolean indexrequestapplypostwildcard)
	{
		setIndexRequestApplyPostWildcard(getContext(), indexrequestapplypostwildcard);
	}

	/**
	 * Set value of IndexRequestApplyPostWildcard
	 * @param context
	 * @param indexrequestapplypostwildcard
	 */
	public final void setIndexRequestApplyPostWildcard(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean indexrequestapplypostwildcard)
	{
		getMendixObject().setValue(context, MemberNames.IndexRequestApplyPostWildcard.toString(), indexrequestapplypostwildcard);
	}

	/**
	 * @return value of IndexCMDBAttachments
	 */
	public final java.lang.Boolean getIndexCMDBAttachments()
	{
		return getIndexCMDBAttachments(getContext());
	}

	/**
	 * @param context
	 * @return value of IndexCMDBAttachments
	 */
	public final java.lang.Boolean getIndexCMDBAttachments(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IndexCMDBAttachments.toString());
	}

	/**
	 * Set value of IndexCMDBAttachments
	 * @param indexcmdbattachments
	 */
	public final void setIndexCMDBAttachments(java.lang.Boolean indexcmdbattachments)
	{
		setIndexCMDBAttachments(getContext(), indexcmdbattachments);
	}

	/**
	 * Set value of IndexCMDBAttachments
	 * @param context
	 * @param indexcmdbattachments
	 */
	public final void setIndexCMDBAttachments(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean indexcmdbattachments)
	{
		getMendixObject().setValue(context, MemberNames.IndexCMDBAttachments.toString(), indexcmdbattachments);
	}

	/**
	 * @return value of IndexCMDBDynAttributes
	 */
	public final java.lang.Boolean getIndexCMDBDynAttributes()
	{
		return getIndexCMDBDynAttributes(getContext());
	}

	/**
	 * @param context
	 * @return value of IndexCMDBDynAttributes
	 */
	public final java.lang.Boolean getIndexCMDBDynAttributes(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IndexCMDBDynAttributes.toString());
	}

	/**
	 * Set value of IndexCMDBDynAttributes
	 * @param indexcmdbdynattributes
	 */
	public final void setIndexCMDBDynAttributes(java.lang.Boolean indexcmdbdynattributes)
	{
		setIndexCMDBDynAttributes(getContext(), indexcmdbdynattributes);
	}

	/**
	 * Set value of IndexCMDBDynAttributes
	 * @param context
	 * @param indexcmdbdynattributes
	 */
	public final void setIndexCMDBDynAttributes(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean indexcmdbdynattributes)
	{
		getMendixObject().setValue(context, MemberNames.IndexCMDBDynAttributes.toString(), indexcmdbdynattributes);
	}

	/**
	 * @return value of IndexCMDBNotes
	 */
	public final java.lang.Boolean getIndexCMDBNotes()
	{
		return getIndexCMDBNotes(getContext());
	}

	/**
	 * @param context
	 * @return value of IndexCMDBNotes
	 */
	public final java.lang.Boolean getIndexCMDBNotes(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IndexCMDBNotes.toString());
	}

	/**
	 * Set value of IndexCMDBNotes
	 * @param indexcmdbnotes
	 */
	public final void setIndexCMDBNotes(java.lang.Boolean indexcmdbnotes)
	{
		setIndexCMDBNotes(getContext(), indexcmdbnotes);
	}

	/**
	 * Set value of IndexCMDBNotes
	 * @param context
	 * @param indexcmdbnotes
	 */
	public final void setIndexCMDBNotes(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean indexcmdbnotes)
	{
		getMendixObject().setValue(context, MemberNames.IndexCMDBNotes.toString(), indexcmdbnotes);
	}

	/**
	 * @return value of IndexCMDBCIPersons
	 */
	public final java.lang.Boolean getIndexCMDBCIPersons()
	{
		return getIndexCMDBCIPersons(getContext());
	}

	/**
	 * @param context
	 * @return value of IndexCMDBCIPersons
	 */
	public final java.lang.Boolean getIndexCMDBCIPersons(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IndexCMDBCIPersons.toString());
	}

	/**
	 * Set value of IndexCMDBCIPersons
	 * @param indexcmdbcipersons
	 */
	public final void setIndexCMDBCIPersons(java.lang.Boolean indexcmdbcipersons)
	{
		setIndexCMDBCIPersons(getContext(), indexcmdbcipersons);
	}

	/**
	 * Set value of IndexCMDBCIPersons
	 * @param context
	 * @param indexcmdbcipersons
	 */
	public final void setIndexCMDBCIPersons(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean indexcmdbcipersons)
	{
		getMendixObject().setValue(context, MemberNames.IndexCMDBCIPersons.toString(), indexcmdbcipersons);
	}

	/**
	 * @return value of IndexCMDBApplyPostWildcard
	 */
	public final java.lang.Boolean getIndexCMDBApplyPostWildcard()
	{
		return getIndexCMDBApplyPostWildcard(getContext());
	}

	/**
	 * @param context
	 * @return value of IndexCMDBApplyPostWildcard
	 */
	public final java.lang.Boolean getIndexCMDBApplyPostWildcard(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IndexCMDBApplyPostWildcard.toString());
	}

	/**
	 * Set value of IndexCMDBApplyPostWildcard
	 * @param indexcmdbapplypostwildcard
	 */
	public final void setIndexCMDBApplyPostWildcard(java.lang.Boolean indexcmdbapplypostwildcard)
	{
		setIndexCMDBApplyPostWildcard(getContext(), indexcmdbapplypostwildcard);
	}

	/**
	 * Set value of IndexCMDBApplyPostWildcard
	 * @param context
	 * @param indexcmdbapplypostwildcard
	 */
	public final void setIndexCMDBApplyPostWildcard(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean indexcmdbapplypostwildcard)
	{
		getMendixObject().setValue(context, MemberNames.IndexCMDBApplyPostWildcard.toString(), indexcmdbapplypostwildcard);
	}

	/**
	 * @return value of IndexPersonCIs
	 */
	public final java.lang.Boolean getIndexPersonCIs()
	{
		return getIndexPersonCIs(getContext());
	}

	/**
	 * @param context
	 * @return value of IndexPersonCIs
	 */
	public final java.lang.Boolean getIndexPersonCIs(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IndexPersonCIs.toString());
	}

	/**
	 * Set value of IndexPersonCIs
	 * @param indexpersoncis
	 */
	public final void setIndexPersonCIs(java.lang.Boolean indexpersoncis)
	{
		setIndexPersonCIs(getContext(), indexpersoncis);
	}

	/**
	 * Set value of IndexPersonCIs
	 * @param context
	 * @param indexpersoncis
	 */
	public final void setIndexPersonCIs(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean indexpersoncis)
	{
		getMendixObject().setValue(context, MemberNames.IndexPersonCIs.toString(), indexpersoncis);
	}

	/**
	 * @return value of IndexPersonApplyPostWildcard
	 */
	public final java.lang.Boolean getIndexPersonApplyPostWildcard()
	{
		return getIndexPersonApplyPostWildcard(getContext());
	}

	/**
	 * @param context
	 * @return value of IndexPersonApplyPostWildcard
	 */
	public final java.lang.Boolean getIndexPersonApplyPostWildcard(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IndexPersonApplyPostWildcard.toString());
	}

	/**
	 * Set value of IndexPersonApplyPostWildcard
	 * @param indexpersonapplypostwildcard
	 */
	public final void setIndexPersonApplyPostWildcard(java.lang.Boolean indexpersonapplypostwildcard)
	{
		setIndexPersonApplyPostWildcard(getContext(), indexpersonapplypostwildcard);
	}

	/**
	 * Set value of IndexPersonApplyPostWildcard
	 * @param context
	 * @param indexpersonapplypostwildcard
	 */
	public final void setIndexPersonApplyPostWildcard(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean indexpersonapplypostwildcard)
	{
		getMendixObject().setValue(context, MemberNames.IndexPersonApplyPostWildcard.toString(), indexpersonapplypostwildcard);
	}

	/**
	 * @return value of IndexProductApplyPostWildcard
	 */
	public final java.lang.Boolean getIndexProductApplyPostWildcard()
	{
		return getIndexProductApplyPostWildcard(getContext());
	}

	/**
	 * @param context
	 * @return value of IndexProductApplyPostWildcard
	 */
	public final java.lang.Boolean getIndexProductApplyPostWildcard(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IndexProductApplyPostWildcard.toString());
	}

	/**
	 * Set value of IndexProductApplyPostWildcard
	 * @param indexproductapplypostwildcard
	 */
	public final void setIndexProductApplyPostWildcard(java.lang.Boolean indexproductapplypostwildcard)
	{
		setIndexProductApplyPostWildcard(getContext(), indexproductapplypostwildcard);
	}

	/**
	 * Set value of IndexProductApplyPostWildcard
	 * @param context
	 * @param indexproductapplypostwildcard
	 */
	public final void setIndexProductApplyPostWildcard(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean indexproductapplypostwildcard)
	{
		getMendixObject().setValue(context, MemberNames.IndexProductApplyPostWildcard.toString(), indexproductapplypostwildcard);
	}

	/**
	 * @return value of IndexInterfaceApplyPostWildcard
	 */
	public final java.lang.Boolean getIndexInterfaceApplyPostWildcard()
	{
		return getIndexInterfaceApplyPostWildcard(getContext());
	}

	/**
	 * @param context
	 * @return value of IndexInterfaceApplyPostWildcard
	 */
	public final java.lang.Boolean getIndexInterfaceApplyPostWildcard(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IndexInterfaceApplyPostWildcard.toString());
	}

	/**
	 * Set value of IndexInterfaceApplyPostWildcard
	 * @param indexinterfaceapplypostwildcard
	 */
	public final void setIndexInterfaceApplyPostWildcard(java.lang.Boolean indexinterfaceapplypostwildcard)
	{
		setIndexInterfaceApplyPostWildcard(getContext(), indexinterfaceapplypostwildcard);
	}

	/**
	 * Set value of IndexInterfaceApplyPostWildcard
	 * @param context
	 * @param indexinterfaceapplypostwildcard
	 */
	public final void setIndexInterfaceApplyPostWildcard(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean indexinterfaceapplypostwildcard)
	{
		getMendixObject().setValue(context, MemberNames.IndexInterfaceApplyPostWildcard.toString(), indexinterfaceapplypostwildcard);
	}

	/**
	 * @return value of ReferenceIndexing
	 */
	public final java.lang.Boolean getReferenceIndexing()
	{
		return getReferenceIndexing(getContext());
	}

	/**
	 * @param context
	 * @return value of ReferenceIndexing
	 */
	public final java.lang.Boolean getReferenceIndexing(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ReferenceIndexing.toString());
	}

	/**
	 * Set value of ReferenceIndexing
	 * @param referenceindexing
	 */
	public final void setReferenceIndexing(java.lang.Boolean referenceindexing)
	{
		setReferenceIndexing(getContext(), referenceindexing);
	}

	/**
	 * Set value of ReferenceIndexing
	 * @param context
	 * @param referenceindexing
	 */
	public final void setReferenceIndexing(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean referenceindexing)
	{
		getMendixObject().setValue(context, MemberNames.ReferenceIndexing.toString(), referenceindexing);
	}

	/**
	 * @return value of ReferenceIndexingStart
	 */
	public final java.util.Date getReferenceIndexingStart()
	{
		return getReferenceIndexingStart(getContext());
	}

	/**
	 * @param context
	 * @return value of ReferenceIndexingStart
	 */
	public final java.util.Date getReferenceIndexingStart(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.ReferenceIndexingStart.toString());
	}

	/**
	 * Set value of ReferenceIndexingStart
	 * @param referenceindexingstart
	 */
	public final void setReferenceIndexingStart(java.util.Date referenceindexingstart)
	{
		setReferenceIndexingStart(getContext(), referenceindexingstart);
	}

	/**
	 * Set value of ReferenceIndexingStart
	 * @param context
	 * @param referenceindexingstart
	 */
	public final void setReferenceIndexingStart(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date referenceindexingstart)
	{
		getMendixObject().setValue(context, MemberNames.ReferenceIndexingStart.toString(), referenceindexingstart);
	}

	/**
	 * @return value of ReferenceIndexingEnd
	 */
	public final java.util.Date getReferenceIndexingEnd()
	{
		return getReferenceIndexingEnd(getContext());
	}

	/**
	 * @param context
	 * @return value of ReferenceIndexingEnd
	 */
	public final java.util.Date getReferenceIndexingEnd(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.ReferenceIndexingEnd.toString());
	}

	/**
	 * Set value of ReferenceIndexingEnd
	 * @param referenceindexingend
	 */
	public final void setReferenceIndexingEnd(java.util.Date referenceindexingend)
	{
		setReferenceIndexingEnd(getContext(), referenceindexingend);
	}

	/**
	 * Set value of ReferenceIndexingEnd
	 * @param context
	 * @param referenceindexingend
	 */
	public final void setReferenceIndexingEnd(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date referenceindexingend)
	{
		getMendixObject().setValue(context, MemberNames.ReferenceIndexingEnd.toString(), referenceindexingend);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return searchConfigurationMendixObject;
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
			final advancedsearch.proxies.SearchConfiguration that = (advancedsearch.proxies.SearchConfiguration) obj;
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
		return "AdvancedSearch.SearchConfiguration";
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