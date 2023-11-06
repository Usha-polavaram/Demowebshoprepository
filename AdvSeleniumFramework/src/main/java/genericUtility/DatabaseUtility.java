package genericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.Driver;

/**
 * 
 * @author Usha
 *
 */
public class DatabaseUtility implements IAutoConstants {
	
	Driver dbdriver;
	Connection connection;
	Statement statement;
	ResultSet result;

	/**
	 * This method is used to connect to the database
	 */
	public void establishingConnectionToDatabase() {
		try {
			 dbdriver=new Driver();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			DriverManager.registerDriver(dbdriver);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			connection = DriverManager.getConnection(Database_URL, Database_UN, Database_PWD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * This is used to read the data from database 
	 * @param query The SQL query to execute.
	 * @param columnName The name of the column to retrieve.
	 * @return Arraylist of results from the specified column
	 */
	public ArrayList readingDataFromDatabase(String query, String columnName) {
		try {
			statement = connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			 result = statement.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ArrayList list=new ArrayList();
		try {
			while(result.next()) {
			list.add(result.getString(columnName));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(list);
		return list;
	}
	
	/**
	 * This is used to close the connection from database
	 */
	public void closingConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
