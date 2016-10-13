package com.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.facade.CarFacade;

public class FacadeFactory {

	public CarFacade getFacade() {
		CarFacade facade = null;
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanContext.xml");) {
			facade = (CarFacade) context.getBean("carfasade", CarFacade.class);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return facade;
	}

}
