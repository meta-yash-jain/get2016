package com.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.dao.CarDAO;
import com.model.vo.CarVO;

@Component
public class CarFacade {
	
	@Autowired
	CarDAO cardao;

	/**
	 * return all data
	 * @return
	 */
	public List<CarVO> findAll() {
		return cardao.getAllCars();
	}

	/**
	 * find car by id
	 * @param id
	 * @return
	 */
	public List<CarVO> findById(int id) {
		return cardao.findCarbyId(id);
	}

	/**
	 * save or update carvo data
	 * @param carVO
	 * @return success status
	 */
	public boolean save(CarVO carVO) {

		boolean status = false;
		if (carVO.getId() == -1) {
			int tmp = cardao.insert(carVO);
			if (tmp > 0) {
				status = true;
			}
		} else {
			status = cardao.update(carVO);
		}
		return status;
	}
	
	public boolean removeById(int id) {
		return cardao.deleteById(id);
	}

}
