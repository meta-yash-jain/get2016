package com.model.vo.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.model.vo.EmployeeVO;

public class EmployeeDAOTest {

	@Test
	public void testGetAllEmployees() {
		EmployeeDAO employeeDAO = new EmployeeDAO();
		List<EmployeeVO> list = employeeDAO.getAllEmployees();
		assertEquals(100, list.size());
	}

	@Test
	public void testInsert() {
		EmployeeDAO employeeDAO = new EmployeeDAO();
		List<EmployeeVO> list = employeeDAO.findbyId(5);
		assertEquals(100, employeeDAO.insert(list.get(0)));
	}

	@Test
	public void testDeleteById() {
		EmployeeDAO employeeDAO = new EmployeeDAO();
		assertEquals(true, employeeDAO.deleteById(101));
	}

	@Test
	public void testFindbyName() {
		EmployeeDAO employeeDAO = new EmployeeDAO();
		List<EmployeeVO> list = employeeDAO.findbyName("Anmol");
		assertEquals(2, list.size());
	}
	
	@Test
	public void testUpdate() {
		EmployeeDAO employeeDAO = new EmployeeDAO();
		List<EmployeeVO> list = employeeDAO.findbyId(7);
		list.get(0).setFirstName("Abhishek");
		assertEquals(true,employeeDAO.update(list.get(0)));
	}

	@Test
	public void testFindbyId() {
		EmployeeDAO employeeDAO = new EmployeeDAO();
		List<EmployeeVO> list = employeeDAO.findbyId(5);
		assertEquals(1, list.size());
	}

}
