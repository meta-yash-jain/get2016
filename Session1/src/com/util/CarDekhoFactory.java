package com.util;

import java.sql.Connection;

import com.facade.CarFacade;
import com.modal.CarVO;

public class CarDekhoFactory {
	public CarVO getCar(){
		CarVOFactory carVOFactory = new CarVOFactory();
		return carVOFactory.getCarVO();
	}
	
	public Connection getConnection(){
		ConnectionFactory connectionFactory = new ConnectionFactory();
		return connectionFactory.getConnection();
	}
	
	public CarFacade getFacade(){
		FacadeFactory facadeFactory = new FacadeFactory();
		return facadeFactory.getFacade();
	}
}
