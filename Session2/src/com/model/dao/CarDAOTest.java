package com.model.dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

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

	@Test
	public void testGetAllCars() {

		List<CarVO> list = new ArrayList<CarVO>();
		list = carDAO.getAllCars();
		assertEquals(100, list.size());
	}

	@Test
	public void testFindCarbyId() {
		List<CarVO> list = new ArrayList<CarVO>();
		list = carDAO.findCarbyId(10);
		assertEquals(1, list.size());

	}

	@Test 
	public void testInsert() {
		List<CarVO> list = new ArrayList<CarVO>();
		list = carDAO.findCarbyId(7);
		assertEquals(101, carDAO.insert(list.get(0)));
	}

	@Test
	public void testDeleteById() {
		assertEquals(true, carDAO.deleteById(5));
		
	}

	@Test
	public void testUpdate() {
		List<CarVO> list = new ArrayList<CarVO>();
		list = carDAO.findCarbyId(75);
		CarVO carvo = list.get(0);
		carvo.setModel("BMW s7");
		assertEquals(true, carDAO.update(carvo));
	}
	

}
