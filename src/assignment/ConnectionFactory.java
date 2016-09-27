package assignment;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	private static Connection connection;	
	/**
	 * Private constructor to make it a singleton class
	 */
	private ConnectionFactory() {}	
	/**
	 * Method to create a new connection with the database
	 */
	private static void createConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "yash123");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Method to get the connection object
	 * @return The connection object
	 */
	public static Connection getConnection() {
		//Checking if the connection is already made or not
		if(connection == null) {
			createConnection();
		}
		return connection;
	}
	
	/**
	 * Method to close the connection
	 */
	public static void closeConnection() {
		try {
			connection.close();
		} catch (Exception e) {
			try {
				connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
