package com.model.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.model.vo.CarVO;


public interface CarDaoInterface {
	/**
	 * return all cars data
	 * @return
	 */
	public List<CarVO> getAllCars() ;
	
	/**
	 * find car by id
	 * @param id
	 * @return
	 */
	public CarVO findCarbyId(int id);
	
	/**
	 * insert carvo in database 
	 * @param carvo
	 * @return
	 */
	public void insert(CarVO carvo);
	
	/**
	 * delete by id
	 * @param id
	 * @return
	 */
	public void deleteById(int id);
	
	/**
	 * update carvo data
	 * @param carvo
	 * @return
	 */
	public void update(CarVO carvo);
}
