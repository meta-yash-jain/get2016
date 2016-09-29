package com.model.vo.dao;

import java.util.List;

import com.model.vo.EmployeeVO;

public interface EmployeeDAOInterface {
	
	/**
	 * return all cars data
	 * @return
	 */
	public List<EmployeeVO> getAllEmployees() ;
	
	/**
	 * find car by id
	 * @param id
	 * @return
	 */
	public List<EmployeeVO> findbyId(int id);
	
	/**
	 * insert employeeVO in database 
	 * @param employeeVO
	 * @return
	 */
	public int insert(EmployeeVO employeeVO);
	
	/**
	 * delete by id
	 * @param id
	 * @return
	 */
	public boolean deleteById(int id);
	
	/**
	 * update employeeVO data
	 * @param employeeVO
	 * @return
	 */
	public boolean update(EmployeeVO employeeVO);

}
