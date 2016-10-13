package com.dao;

import java.util.List;

import com.modal.CarVO;

public interface CarDAO {
	/**
	 * creates a new car object
	 * @param carVOObject
	 */
	public void addCar(CarVO carVOObject);

	/**
	 * updates an existing car
	 * @param carVOObject
	 */
	public void updateCar(CarVO carVOObject);

	/**
	 * searches a car based on filter and the value of the parameter
	 * @param filter
	 * @param parameter
	 * @return
	 */
	public List<CarVO> searchCar(String filter, String parameter);

	/**
	 *  searches a car based on filter and the values of the parameter
	 * @param filter
	 * @param minValue
	 * @param maxValue
	 * @return
	 */
	public List<CarVO> searchCar(String filter, float minValue, float maxValue);

	/**
	 * retrieves the list of all cars
	 * @return
	 */
	public List<CarVO> getAllCars();
	
}
