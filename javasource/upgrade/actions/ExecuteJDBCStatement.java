// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package upgrade.actions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class ExecuteJDBCStatement extends CustomJavaAction<java.lang.String>
{
	private java.lang.String StatementPar;
	private java.lang.Boolean IsQuery;
	private java.lang.Boolean IsBatch;
	private java.lang.String JDBCURL;
	private java.lang.String JDBCUser;
	private java.lang.String JDBCPassword;
	private java.lang.String JDBCStatementSeparatorPar;

	public ExecuteJDBCStatement(IContext context, java.lang.String StatementPar, java.lang.Boolean IsQuery, java.lang.Boolean IsBatch, java.lang.String JDBCURL, java.lang.String JDBCUser, java.lang.String JDBCPassword, java.lang.String JDBCStatementSeparatorPar)
	{
		super(context);
		this.StatementPar = StatementPar;
		this.IsQuery = IsQuery;
		this.IsBatch = IsBatch;
		this.JDBCURL = JDBCURL;
		this.JDBCUser = JDBCUser;
		this.JDBCPassword = JDBCPassword;
		this.JDBCStatementSeparatorPar = JDBCStatementSeparatorPar;
	}

	@Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		Core.getLogger(this.toString()).debug("Executing " + StatementPar);
		Connection connection = null;
		String resultStr = null;
		Statement statement = null;
		try {
		    connection = DriverManager.getConnection(JDBCURL, JDBCUser, JDBCPassword);
		    if (IsBatch) {
				Core.getLogger(this.toString()).trace("Batch with separator " + JDBCStatementSeparatorPar);
				statement = connection.createStatement();
		    	for(String individualStatement:StatementPar.split(JDBCStatementSeparatorPar)) {
					Core.getLogger(this.toString()).debug("Individual statement: " + individualStatement);
		    		statement.addBatch(individualStatement);
		    	}
		    	int[] resultsArray = statement.executeBatch();
    			Core.getLogger(this.toString()).trace(resultsArray.length + " results.");
    			resultStr = "Executed " + resultsArray.length + " statements.";
		    	for (int results:resultsArray) {
		    		if (results==PreparedStatement.SUCCESS_NO_INFO) {
		    			resultStr = resultStr + "\nSuccesfull modification, no info on number of affected rows.";
		    			Core.getLogger(this.toString()).debug("Succesfull modification, no info on number of affected rows.");
		    		} else if (results==PreparedStatement.EXECUTE_FAILED) {
		    			resultStr = resultStr + "\nModification failed.";
		    			Core.getLogger(this.toString()).debug("Modification failed.");
		    		} else {
		    			resultStr = resultStr + "\n" + results + " affected rows.";
		    			Core.getLogger(this.toString()).debug(results + " affected rows.");		    			
		    		}
		    	}
			} else if (IsQuery) {
				Core.getLogger(this.toString()).trace("Query");
				statement = connection.prepareStatement(StatementPar);
				PreparedStatement preparedStatement = (PreparedStatement) statement;
		    	ResultSet resultSet = preparedStatement.executeQuery();
		    	ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
		    	resultStr = "";
		    	for(int i=1;i<=resultSetMetaData.getColumnCount();i++) {
					Core.getLogger(this.toString()).trace("Resultset column " + resultSetMetaData.getColumnName(i));
		    		resultStr = resultStr + resultSetMetaData.getColumnName(i) + "; ";
		    	}
		    	resultStr = resultStr + "\n";
		    	int results = 0;
		    	while (resultSet.next()) {
			    	for(int i=1;i<=resultSetMetaData.getColumnCount();i++) {
			    		resultStr = resultStr + (resultSet.getObject(i)==null?"NULL":resultSet.getObject(i).toString()) + "; ";
			    	}		    		
			    	resultStr = resultStr + "\n";
			    	results++;
		    	}
		    	//resultStr = resultStr + "\n" + results + " rows.\n";
				Core.getLogger(this.toString()).debug(results + " rows.");
		    } else {
				Core.getLogger(this.toString()).trace("Modification statement");
				statement = connection.prepareStatement(StatementPar);
				PreparedStatement preparedStatement = (PreparedStatement) statement;
		    	int results = preparedStatement.executeUpdate();
		    	resultStr = "";
	    		if (results==PreparedStatement.SUCCESS_NO_INFO) {
	    			resultStr = resultStr + "\nSuccesfull modification, no info on number of affected rows.";
	    			Core.getLogger(this.toString()).debug("Succesfull modification, no info on number of affected rows.");
	    		} else if (results==PreparedStatement.EXECUTE_FAILED) {
	    			resultStr = resultStr + "\nModification failed.";
	    			Core.getLogger(this.toString()).debug("Modification failed.");
	    		} else {
	    			resultStr = resultStr + "\n" + results + " affected rows.";
	    			Core.getLogger(this.toString()).debug(results + " affected rows.");		    			
	    		}
		    }
		} catch (SQLException e) {
			resultStr = "SQL Exception " + e.getMessage();
			SQLException ne = e.getNextException();
			while (ne != null) {
				resultStr = resultStr + "\n\n" + ne.getMessage();
				ne = ne.getNextException();
			}
			Core.getLogger(this.toString()).error(resultStr);
		} catch (Exception e) {
			resultStr = "Other Exception " + e.getMessage();
			Core.getLogger(this.toString()).error(resultStr);
		} finally {
		    if (statement != null) {
		        statement.close();
		    }
		    if (connection != null) {
		        connection.close();
		    }
		}
		return resultStr;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "ExecuteJDBCStatement";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
