package com.utill;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

public class ConnectionFactoryTest {

	@Test
	public void testGetConnection() {
		Connection con = ConnectionFactory.getConnection();
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
