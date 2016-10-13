package com.utill;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
public class ConnectionFactory {
	private static ConnectionFactory instance = new ConnectionFactory();
	private static Connection connection = null;
	private static Properties properties;

	// Constructor
	private ConnectionFactory() {
		try {

			properties = loadPropertiesFile();

			if (properties != null) {

				String driverClass = properties.getProperty("DB_DRIVER_CLASS");
				Class.forName(driverClass).newInstance();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// To create connection
	private Connection createConnection() {

		if (connection == null) {
			try {
				String url = properties.getProperty("DB_URL");
				String username = properties.getProperty("DB_USERNAME");
				String password = properties.getProperty("DB_PASSWORD");
				connection = DriverManager.getConnection(url, username, password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return connection;
	}

	/**
	 * To get object of connection for database
	 * 
	 * @return
	 */
	public static Connection getConnection() {
		return instance.createConnection();
	}

	/**
	 * This method sets the property object
	 * 
	 * @return properties object
	 */
	public Properties loadPropertiesFile() {

		InputStream inputStream = null;

		try {

			Resource resource = new ClassPathResource("jdbc.properties");
			inputStream = resource.getInputStream();

			if (inputStream != null) {

				properties = new Properties();

				properties.load(inputStream);
			} else {

				System.out.println("input stream is null");
			}
		} catch (Exception ex) {

			System.out.println("Something went wrong: "
					+ ex.getLocalizedMessage());

			ex.printStackTrace();

		} finally {

			try {

				// inputStream.close();

			} catch (Exception ex) {

				ex.printStackTrace();
			}
		}

		return properties;
	}
}
