// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package databasereplication.actions;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import mxmodelreflection.proxies.MxObjectMember;
import mxmodelreflection.proxies.MxObjectReference;
import mxmodelreflection.proxies.MxObjectType;
import replication.ReplicationSettings.KeyType;
import replication.ReplicationSettings.MendixReplicationException;
import replication.implementation.MFValueParser;
import replication.interfaces.IValueParser;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.logging.ILogNode;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import databasereplication.implementation.DBUpdateSettings;
import databasereplication.implementation.DatabaseConnector;
import databasereplication.implementation.ObjectBaseDBSettings;
import databasereplication.interfaces.IDatabaseSettings;
import databasereplication.proxies.AssociationKeyOption;
import databasereplication.proxies.Column;
import databasereplication.proxies.ColumnMapping;
import databasereplication.proxies.Database;
import databasereplication.proxies.MappingType;
import databasereplication.proxies.QueryType;
import databasereplication.proxies.TableMapping;
import databasereplication.proxies.UpdateConfiguration;
import databasereplication.proxies.UpdateType;
import databasereplication.proxies.YesNo;

public class UpdateByMapping extends CustomJavaAction<java.lang.Boolean>
{
	private IMendixObject __Mapping;
	private databasereplication.proxies.TableMapping Mapping;
	private IMendixObject UpdatedObject;
	private IMendixObject __UpdateConfig;
	private databasereplication.proxies.UpdateConfiguration UpdateConfig;

	public UpdateByMapping(IContext context, IMendixObject Mapping, IMendixObject UpdatedObject, IMendixObject UpdateConfig)
	{
		super(context);
		this.__Mapping = Mapping;
		this.UpdatedObject = UpdatedObject;
		this.__UpdateConfig = UpdateConfig;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.Mapping = __Mapping == null ? null : databasereplication.proxies.TableMapping.initialize(getContext(), __Mapping);

		this.UpdateConfig = __UpdateConfig == null ? null : databasereplication.proxies.UpdateConfiguration.initialize(getContext(), __UpdateConfig);

		// BEGIN USER CODE
		if( this.Mapping == null )
			throw new CoreException("Please provide a valid mapping");
		if( this.Mapping == null )
			throw new CoreException("Please provide an object to send to the other database");
		
		IContext context = this.getContext();
		Database CurDatabase = this.Mapping.getTableMapping_Database(context);
		ObjectBaseDBSettings dbSettings = new ObjectBaseDBSettings( context, CurDatabase.getMendixObject() );
		updateDatabase(context, this.Mapping, this.UpdateConfig, dbSettings, this.UpdatedObject);
		
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "UpdateByMapping";
	}

	// BEGIN EXTRA CODE
	private static ILogNode _logger = Core.getLogger("UpdateMapping");
	
	public static void updateDatabase(IContext context, TableMapping mapping, UpdateConfiguration updateConfig, IDatabaseSettings dbSettings, IMendixObject updatedObject) 
		throws MendixReplicationException, CoreException 
	{
		String tableName = mapping.getTableMapping_Table(context).getName();
		DBUpdateSettings settings = new DBUpdateSettings(context, dbSettings, updatedObject.getType(), updateConfig.getUpdateType(), null);		
		settings.setUpdateTable( mapping.getTableMapping_Table(context).getName() );		
		List<IMendixObject> colMapping = Core.retrieveXPathQuery(context, "//" + ColumnMapping.getType() + "[" + ColumnMapping.MemberNames.ColumnMapping_TableMapping + "=" + mapping.getMendixObject().getId().toLong() + "]");
		for( IMendixObject object : colMapping ) {
			IMendixObject member = Core.retrieveId(context, (IMendixIdentifier)object.getValue(context, ColumnMapping.MemberNames.ColumnMapping_MxObjectMember.toString()));

			AssociationKeyOption isKeyOption = AssociationKeyOption.valueOf( (String)object.getValue(context, ColumnMapping.MemberNames.IsAssociationKey.toString()));
			KeyType isKey = null;
			switch (isKeyOption) {
			case No:
				isKey = KeyType.NoKey;
				break;
			case YesOnlyMainObject:
				isKey = KeyType.ObjectKey;
				break;
			case YesOnlyAssociatedObject:
				isKey = KeyType.AssociationKey;
				break;
			case YesMainAndAssociatedObject:
				isKey = KeyType.AssociationAndObjectKey;
				break;
			}

			IValueParser parser = null;
			if( YesNo.Yes == YesNo.valueOf((String)object.getValue(context, ColumnMapping.MemberNames.UseFormatMicroflow.toString()) ) ) {
				IMendixIdentifier mfId = (IMendixIdentifier)object.getValue(context, ColumnMapping.MemberNames.ColumnMapping_Microflows.toString());
				if( mfId == null )
					throw new CoreException("No format microflow found when there should be one");
				parser = new MFValueParser(context, Core.retrieveId(context, mfId ));
			}

			if( QueryType.Automatic.toString().equals(object.getValue(context, ColumnMapping.MemberNames.QueryType.toString())) ) {
				Core.retrieveId(context, (IMendixIdentifier) object.getValue(context, ColumnMapping.MemberNames.ColumnMapping_AdditionalJoins.toString()));
				IMendixObject column = Core.retrieveId(context, (IMendixIdentifier)object.getValue(context, ColumnMapping.MemberNames.ColumnMapping_Column.toString()));

				if( MappingType.Attribute.toString().equals(object.getValue(context, ColumnMapping.MemberNames.MappingType.toString())) ) {
					settings.addColumnMapping(tableName, (String)column.getValue(context, Column.MemberNames.Name.toString()),
							(String) column.getValue(context, Column.MemberNames.DataType.toString()),
							(String)member.getValue(context, MxObjectMember.MemberNames.AttributeName.toString()), isKey,
							(Boolean)object.getValue(context, ColumnMapping.MemberNames.SearchCaseSensitive.toString()), parser );
				}
				else {
					IMendixObject reference = Core.retrieveId(context, (IMendixIdentifier)object.getValue(context, ColumnMapping.MemberNames.ColumnMapping_MxObjectReference.toString()));
					IMendixObject objectType = Core.retrieveId(context, (IMendixIdentifier)object.getValue(context, ColumnMapping.MemberNames.ColumnMapping_MxObjectType.toString()));

					settings.addAssociationMapping(tableName, (String)column.getValue(context, Column.MemberNames.Name.toString()),
							(String) column.getValue(context, Column.MemberNames.DataType.toString()),
							(String)reference.getValue(context, MxObjectReference.MemberNames.CompleteName.toString()),
							(String)objectType.getValue(context, MxObjectType.MemberNames.CompleteName.toString()),
							(String)member.getValue(context, MxObjectMember.MemberNames.AttributeName.toString()), parser,
							isKey, (Boolean)object.getValue(context, ColumnMapping.MemberNames.SearchCaseSensitive.toString()) );
				}
			}
			else
				throw new MendixReplicationException("Custom columns not allowed for an update mapping.");
		}
		
		if (mapping.getUseCustomConstraints() == YesNo.Yes)
			settings.setConstraint(mapping.getSQLConstraint(context));
		
		String query = settings.getQuery(updatedObject);
		_logger.debug(query);
		DatabaseConnector dbc = new DatabaseConnector(dbSettings);
		Statement statement = dbc.connect();
		try {
			int nrOfUpdates = statement.executeUpdate(query);
			_logger.debug("Updated " + nrOfUpdates + " records using query: " + query);
			if( nrOfUpdates == 0 ) {
				query = settings.getUpdateQuery(UpdateType.AlwaysInsert, updatedObject);
				_logger .debug(query);
				int nrOfInserts = statement.executeUpdate(query);
				_logger.debug("Inserted " + nrOfInserts + " records using query: " + query);
			}
		} catch (SQLException e) {
			throw new MendixReplicationException(e);
		}
	}
	// END EXTRA CODE
}
