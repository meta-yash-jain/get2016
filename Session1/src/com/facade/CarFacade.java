package com.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CarDAO;
import com.dao.CarDAOImpl;
import com.modal.CarVO;

@Service
public class CarFacade {
	
	@Autowired
	private CarDAOImpl carDAO ;
	
	public CarDAO getCarDAO() {
		return carDAO;
	}

	public void setCarDAO(CarDAOImpl carDAO) {
		this.carDAO = carDAO;
	}

	/**
	 * creates a new car
	 */
	public void addCar(CarVO carVOObject) {
		carDAO.addCar(carVOObject);

	}

	/**
	 * updates an existing car
	 */
	public void updateCar(CarVO carVOObject) {
		carDAO.updateCar(carVOObject);
	}
	
	/**
	 * calculates the on road price of the car based on the price of the car
	 */
	public int calculateOnRoadPrice(CarVO carVO) {
		return carVO.getRoadTax()+carVO.getPrice();
	
	}

	/**
	 * returns list of car based on various parameters
	 */
	public List<CarVO> searchCar(String filter, String parameter) {
		
		return carDAO.searchCar(filter, parameter);
	}

	/**
	 * returns list of car based on various parameters
	 */
	public List<CarVO> searchCar(String filter, float minValue, float maxValue) {
		return carDAO.searchCar(filter, minValue, maxValue);
	}

	/**
	 * returns list of all cars 
	 */
	public List<CarVO> getAllCars() {
		return carDAO.getAllCars();
	}	
}
