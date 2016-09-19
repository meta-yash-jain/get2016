package daoLayer;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

// singleton class for DAO Manager 
// this class establishes connection through properties class
public class ConnectionFactory {
	private Connection connection;
	private Properties properties;

	/**
	 * Empty Constructor for class
	 */
	private ConnectionFactory(){
		connection = null;
		properties = null;

	}

	/**
	 * This method sets the property object
	 * 
	 * @return properties object
	 */
	public Properties loadPropertiesFile(){
		InputStream inputStream =  null;
		try{
			inputStream = this.getClass().getClassLoader().getResourceAsStream("jdbc.properties");
			if(inputStream != null){
				properties = new Properties();
				properties.load(inputStream);
			}else{
				System.out.println("input stream is null");
			}
		}catch(Exception ex){
			System.out.println("Something went wrong: " + ex.getLocalizedMessage());
			ex.printStackTrace();
		}finally{
			try{
				//inputStream.close();
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		return properties;
	}
	/**
	 * This method establishes connection through property object
	 * 
	 * @return Connection
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		try{
			properties = loadPropertiesFile();
			if(properties != null){
				String driverClass = properties.getProperty("DB_DRIVER_CLASS");
				String url = properties.getProperty("DB_URL");
				String username = properties.getProperty("DB_USERNAME");
				String password = properties.getProperty("DB_PASSWORD");
				if(driverClass != null){
					// register driver
					Class.forName(driverClass);
				}
				if(url != null && username != null && password != null){
					// get connection
					connection = DriverManager.getConnection(url, username, password);
				}
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
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
		try{
			if(this.connection == null || this.connection.isClosed()){
				this.connection = getConnection();
				result = true;
			}
		}catch(Exception ex){
			ex.printStackTrace();
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
		try{
			if(this.connection != null && !this.connection.isClosed()){
				this.connection.close();
				result = true;
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return result;
	}

	/**
	 * @return instance of DAO Manager
	 */
	public static ConnectionFactory getInstance(){
		return ConnectionFactorySingleton.INSTANCE.get();
	}

	/**
	 * Anonymous inner singleton class which sets the new instance of DAO Manager 
	 * which is Thread Local that is in 
	 * case of Multithreading also only
	 * one connection can be established at a time
	 * 
	 */
	private static class ConnectionFactorySingleton{
		// Thread local Dao Manager instance
		public static final ThreadLocal<ConnectionFactory> INSTANCE ;
		static{
			ThreadLocal<ConnectionFactory> connectionFactory;
			try{
				// initializing daoManager object
				connectionFactory = new ThreadLocal<ConnectionFactory>(){
					@Override
					protected ConnectionFactory initialValue(){
						try{
							return new ConnectionFactory();
						}catch(Exception ex){
							return null;
						}
					}
				};
			}catch(Exception ex){
				connectionFactory = null;
			}
			// set instance to daoManager
			INSTANCE = connectionFactory;
		}
	}
}