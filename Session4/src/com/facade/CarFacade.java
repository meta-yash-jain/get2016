package com.facade;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.dao.CarDAO;
import com.model.vo.CarVO;

@Component
@Transactional
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
	public CarVO findById(int id) {
		return cardao.findCarbyId(id);
	}

	/**
	 * save or update carvo data
	 * @param carVO
	 * @return success status
	 */
	public void save(CarVO carVO) {
		if (carVO.getId() == -1) {
			cardao.insert(carVO);
		} else {
			cardao.update(carVO);
		}
	}
	
	public void removeById(int id) {
		cardao.deleteById(id);
	}

}
