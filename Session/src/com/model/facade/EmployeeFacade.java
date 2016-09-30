
package com.model.facade;

import java.util.List;

import com.model.vo.EmployeeVO;
import com.model.vo.dao.EmployeeDAO;

public class EmployeeFacade {

	EmployeeDAO employeeDao = new EmployeeDAO();

	public List<EmployeeVO> findAll() {
		return employeeDao.getAllEmployees();
	}

	public List<EmployeeVO> findById(int id) {
		return employeeDao.findbyId(id);
	}
	
	public List<EmployeeVO> findByName(String name) {
		return employeeDao.findbyName(name);
	}

	public boolean save(EmployeeVO employeeVO) {
		boolean status = false;
		if (employeeVO.getId() == -1) {
			int temp = employeeDao.insert(employeeVO);
			if (temp > 0) {
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
