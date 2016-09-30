package com.model.vo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.vo.EmployeeVO;
import com.utill.ConnectionFactory;

public class EmployeeDAO implements EmployeeDAOInterface {
	String id = "id";
	String firstName = "firstName";
	String lastName = "lastName";
	String address = "address";
	String email = "email";
	Connection connection = ConnectionFactory.getConnection();

	@Override
	public List<EmployeeVO> getAllEmployees() {
		List<EmployeeVO> employeeList = new ArrayList<EmployeeVO>();
		String query = "SELECT `id`, `firstName`, `lastName`, `email`, `address` FROM `customers`";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();

			// add all the data to list of EmployeeList
			while (resultSet.next()) {
				EmployeeVO employeeVO = new EmployeeVO();
				employeeVO.setId(resultSet.getInt(id));
				employeeVO.setFirstName(resultSet.getString(firstName));
				employeeVO.setLastName(resultSet.getString(lastName));
				employeeVO.setEmail(resultSet.getString(email));
				employeeVO.setAddress(resultSet.getString(address));

				employeeList.add(employeeVO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employeeList;
	}

	@Override
	public int insert(EmployeeVO employeeVO) {
		int last_inserted_id = -1;
		String query = "INSERT INTO `customers`(`firstName`, `lastName`, `email`, `address`, `numberOforders`) VALUES "
				+ "(?,?,?,?,?)";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

			preparedStatement.setString(1, employeeVO.getFirstName());
			preparedStatement.setString(2, employeeVO.getLastName());
			preparedStatement.setString(3, employeeVO.getEmail());
			preparedStatement.setString(4,employeeVO.getAddress());
			preparedStatement.setInt(5, employeeVO.getNumberOfOrdes());
			
			preparedStatement.executeUpdate();

			ResultSet resultSet = preparedStatement.getGeneratedKeys();
			if (resultSet.next()) {
				last_inserted_id = resultSet.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return last_inserted_id;
	}

	@Override
	public boolean deleteById(int id) {
		int deletedRows = 0;
		boolean status = false;
		String query = "DELETE FROM `customers` WHERE  id= ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			deletedRows = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (deletedRows > 0) {
			status = true;
		}
		return status;
	}

	@Override
	public boolean update(EmployeeVO employeeVO) {
		boolean status = false;
		String query = "UPDATE `customers` SET "
				+ "`firstName`= ? ,`lastName`= ?,`email`= ?,`address`= ?,`numberOforders`=? "
				+ "WHERE id = " + employeeVO.getId();
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(query,
					Statement.RETURN_GENERATED_KEYS);

			preparedStatement.setString(1, employeeVO.getFirstName());
			preparedStatement.setString(2, employeeVO.getLastName());
			preparedStatement.setString(3, employeeVO.getEmail());
			preparedStatement.setString(4, employeeVO.getAddress());
			preparedStatement.setInt(5, employeeVO.getNumberOfOrdes());
			
			int effectedRow = preparedStatement.executeUpdate();
			if (effectedRow > 0) {
				status = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("status = " + status);

		return status;
	}

	@Override
	public List<EmployeeVO> findbyId(int empid) {
		List<EmployeeVO> employeeList = new ArrayList<EmployeeVO>();
		String query = "SELECT `id`, `firstName`, `lastName`, `email`, `address` FROM `customers` WHERE `id`=" + empid;
		Connection connection = ConnectionFactory.getConnection();
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();

			// add all the data to list of EmployeeList
			while (resultSet.next()) {
				EmployeeVO employeeVO = new EmployeeVO();
				employeeVO.setId(resultSet.getInt(id));
				employeeVO.setFirstName(resultSet.getString(firstName));
				employeeVO.setLastName(resultSet.getString(lastName));
				employeeVO.setEmail(resultSet.getString(email));
				employeeVO.setAddress(resultSet.getString(address));

				employeeList.add(employeeVO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employeeList;
	}
	
	public List<EmployeeVO> findbyName(String name) {
		List<EmployeeVO> employeeList = new ArrayList<EmployeeVO>();
		String query = "SELECT `id`, `firstName`, `lastName`, `email`, `address` FROM `customers` WHERE `firstName`= ?" ;
		Connection connection = ConnectionFactory.getConnection();
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, name);
			ResultSet resultSet = preparedStatement.executeQuery();

			// add all the data to list of EmployeeList
			while (resultSet.next()) {
				EmployeeVO employeeVO = new EmployeeVO();
				employeeVO.setId(resultSet.getInt(id));
				employeeVO.setFirstName(resultSet.getString(firstName));
				employeeVO.setLastName(resultSet.getString(lastName));
				employeeVO.setEmail(resultSet.getString(email));
				employeeVO.setAddress(resultSet.getString(address));

				employeeList.add(employeeVO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employeeList;
	}
}
