/**
 * 
 */
package com.model.facade;

import java.util.List;

import com.model.vo.EmployeeVO;
import com.model.vo.dao.EmployeeDAO;

/**
 * @author Ajinkya
 *
 */
public class EmployeeFacade {

	EmployeeDAO employeeDao = new EmployeeDAO();

	/**
	 * return all data
	 * @return
	 */
	public List<EmployeeVO> findAll() {
		return employeeDao.getAllEmployees();
	}

	/**
	 * find employee by id
	 * @param id
	 * @return
	 */
	public List<EmployeeVO> findById(int id) {
		return employeeDao.findbyId(id);
	}
	
	/**
	 * find employee by Name
	 * @param name
	 * @return
	 */
	public List<EmployeeVO> findByName(String name) {
		return employeeDao.findbyName(name);
	}

	/**
	 * save or update employeevo data
	 * @param employeeVO
	 * @return success status
	 */
	public boolean save(EmployeeVO employeeVO) {

		boolean status = false;
		if (employeeVO.getId() == -1) {
			int tmp = employeeDao.insert(employeeVO);
			if (tmp > 0) {
				status = true;
			}
		} else {
			status = employeeDao.update(employeeVO);
		}
		return status;
	}
	
	public boolean removeById(int id) {
		return employeeDao.deleteById(id);
	}

	
}
