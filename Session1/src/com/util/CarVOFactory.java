package com.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.modal.CarVO;

public class CarVOFactory {
	public CarVO getCarVO() {
		CarVO car = null;
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");){
			
			car = (CarVO) context.getBean("car",CarVO.class);
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return car;
	}
}
