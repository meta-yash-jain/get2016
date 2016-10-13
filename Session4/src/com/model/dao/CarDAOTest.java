package com.model.dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.model.vo.CarVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class CarDAOTest {

	@Autowired
	CarDAO carDAO ;
	
	@Autowired
	private SessionFactory sessionFactory;

	@Test
	public void testGetAllCars() {

		List<CarVO> list = new ArrayList<CarVO>();
		list = carDAO.getAllCars();
		assertEquals(100, list.size());
	}

	@Test
	public void testFindCarbyId() {
		CarVO carvo = (CarVO)sessionFactory.getCurrentSession().get(CarVO.class, 10);
		assertEquals(10, carvo.getId());
	}

	@Test 
	public void testInsert() {
		List<CarVO> list = new ArrayList<CarVO>();
		list = carDAO.getAllCars();
		CarVO carvo = new CarVO();
		carvo.setAc(4);
		carvo.setAccessoryKit(4);
		carvo.setEngineInCC(4);
		carvo.setFuelCapacity(4);
		carvo.setId(list.size()+1);
		carvo.setMake("abc");
		carvo.setMilage(4);
		carvo.setModel("asda");
		carvo.setPowerSteering(3);
		carvo.setPrice(13312);
		carvo.setRoadTax(34);
		carvo.setUpdatedBy("sadasd");
		carvo.setUpdateTime("sadasd");
		carDAO.insert(carvo);
		List<CarVO> listUpdated = new ArrayList<CarVO>();
		listUpdated = carDAO.getAllCars();
		assertEquals(list.size()+1, listUpdated.size());
	}

	@Test
	public void testDeleteById() {
		List<CarVO> list = new ArrayList<CarVO>();
		list = carDAO.getAllCars();
		carDAO.deleteById(list.size()-1);
		List<CarVO> listUpdated = new ArrayList<CarVO>();
		listUpdated = carDAO.getAllCars();
		assertEquals(list.size()-1, listUpdated.size());
		
	}

	@Test
	public void testUpdate() {
		CarVO carvo = carDAO.findCarbyId(75);
		carvo.setModel("BMW s7");
		carDAO.update(carvo);
		assertEquals("BMW s7", carDAO.findCarbyId(75).getModel());
	}
}
