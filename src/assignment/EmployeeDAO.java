package assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	
	private static EmployeeDAO employeeDAO = null;	//EmployeeDAO for implementing singleton pattern
	private EmployeeDAO() {	}
	
	/**
	 * To get the employee details by its id
	 * @param id - ID of the employee
	 * @return The List of employee
	 */
	public List<Employee> getEmployeeById(int id) {
		List<Employee> listEmployee = new ArrayList<Employee>();
		Connection connection = ConnectionFactory.getConnection();
		try {
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM employee WHERE employeeid = ?");
			statement.setInt(1, id);
			ResultSet result = statement.executeQuery();
			
			while(result.next()) {
				Employee employee = new Employee();
				employee.setId(result.getInt("employeeid"));
				employee.setName(result.getString("name"));
				employee.setCity(result.getString("city"));
				employee.setAge(result.getInt("age"));
				employee.setSalary(result.getInt("salary"));
				
				listEmployee.add(employee);
			}
			result.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listEmployee;
	}
	
	/**
	 * To get the employee details by its name
	 * @param name - name of the employee
	 * @return The List of employee
	 */
	public List<Employee> getEmployeeByName(String name) {
		List<Employee> listEmployee = new ArrayList<Employee>();
		Connection connection = ConnectionFactory.getConnection();
		try {
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM employee WHERE name = ?");
			statement.setString(1, name);
			ResultSet result = statement.executeQuery();
			
			while(result.next()) {
				Employee employee = new Employee();
				employee.setId(result.getInt("employeeid"));
				employee.setName(result.getString("name"));
				employee.setCity(result.getString("city"));
				employee.setAge(result.getInt("age"));
				employee.setSalary(result.getInt("salary"));
				
				listEmployee.add(employee);
			}
			result.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listEmployee;
	}
	
	/**
	 * To get all the employees
	 * @return - List of all employees
	 */
	public List<Employee> getEmployees() {
		List<Employee> listEmployee = new ArrayList<Employee>();
		Connection connection = ConnectionFactory.getConnection();
		try {
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM employee");
			ResultSet result = statement.executeQuery();
			
			while(result.next()) {
				Employee employee = new Employee();
				employee.setId(result.getInt("employeeid"));
				employee.setName(result.getString("name"));
				employee.setCity(result.getString("city"));
				employee.setAge(result.getInt("age"));
				employee.setSalary(result.getInt("salary"));
				
				listEmployee.add(employee);
			}
			result.close();
			statement.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listEmployee;
	}
	
	/**
	 * To delete the employee record by its id
	 * @param id - The employee id to be deleted
	 * @return - true if the record is deleted successfully else false
	 */
	public boolean deleteEmployee(int id) {
		Connection connection = ConnectionFactory.getConnection();
		try {
			PreparedStatement statement = connection.prepareStatement("DELETE FROM employee WHERE employeeid = ?");
			statement.setInt(1, id);

			int rowsAffected = statement.executeUpdate();
			statement.close();
			
			if(rowsAffected > 0) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	/**
	 * To insert a record for the employee
	 * @param employee - The employee object
	 * @return - true if the record is created else false
	 */
	public boolean insertEmployee(Employee employee) {
		Connection connection = ConnectionFactory.getConnection();
		try {
			PreparedStatement statement = connection.prepareStatement(
					"INSERT INTO employee (name, city, age, salary) "
					+ "VALUES (?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
			statement.setString(1, employee.getName());
			statement.setString(2, employee.getCity());
			statement.setInt(3, employee.getAge());
			statement.setInt(4, employee.getSalary());
			System.out.println(statement);
			statement.executeUpdate();			
			ResultSet resultSet = statement.getGeneratedKeys();
			if(resultSet.next()) {
            }
			statement.close();
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * To get EmployeeDAO Object
	 * @return - The EmployeeDAO object
	 */
	public static EmployeeDAO getObject() {
		//Checking if facade object already exists or not
		if(employeeDAO == null) {
			employeeDAO = new EmployeeDAO();
		}
		return employeeDAO;
	}
	
	/**
	 * To close EmployeeDAO object
	 */
	public static void closeEmployeeDAO() {
		ConnectionFactory.closeConnection();
	}
}
