package com.utill;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
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
