package assignment_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// singleton class for DAO Manager 
// this class establishes connection through properties class
public class DAOManager {
	private Connection connection;
	private DAOManager(){
		connection = null;
	}
	/**
	 * This method establishes connection through property object
	 * 
	 * @return Connection
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public Connection getConnection() throws SQLException, ClassNotFoundException {

		String driverClass = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/library";
		String username = "root";
		String password = "yash123";
		Class.forName(driverClass);
		connection = DriverManager.getConnection(url, username, password);
		return connection;
	}

	/**
	 * This method opens the connection
	 * 
	 * @return true if connection is opened else false
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public boolean openConnection() throws SQLException, ClassNotFoundException{
		boolean result = false;
		if(this.connection == null || this.connection.isClosed()){
			this.connection = getConnection();
			result = true;
		}
		return result;
	}

	/**
	 * This method closes the connection
	 * 
	 * @return true if connection is closed else false
	 * @throws SQLException
	 */
	public boolean closeConnection() throws SQLException{
		boolean result = false;
		if(this.connection != null && !this.connection.isClosed()){
			this.connection.close();
			result = true;
		}
		return result;
	}

	/**
	 * 
	 * @return instance of DAO Manager
	 */
	public static DAOManager getInstance(){
		return new DAOManager();
	}
}