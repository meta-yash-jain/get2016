package com.model.vo.dao;

import java.util.List;

import com.model.vo.EmployeeVO;

public interface EmployeeDAOInterface {
	
	public List<EmployeeVO> getAllEmployees() ;
	public List<EmployeeVO> findbyId(int id);
	public int insert(EmployeeVO employeeVO);
	public boolean deleteById(int id);
	public boolean update(EmployeeVO employeeVO);
}
