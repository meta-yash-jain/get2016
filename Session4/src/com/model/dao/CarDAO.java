package com.model.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.vo.CarVO;

@Component
public class CarDAO implements CarDaoInterface {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<CarVO> getAllCars() {
		return (List<CarVO>) sessionFactory.getCurrentSession().createCriteria(CarVO.class).list();
	}

	@Override
	public CarVO findCarbyId(int id) {
		return (CarVO) sessionFactory.getCurrentSession().get(CarVO.class, id);
	}

	@Override
	public void insert(CarVO carvo) {
		sessionFactory.getCurrentSession().save(carvo);
	}

	@Override
	public void deleteById(int id) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM CarVO WHERE id = "+id).executeUpdate();
	}

	@Override
	public void update(CarVO carvo) {
		sessionFactory.getCurrentSession().update(carvo);
	}

}
