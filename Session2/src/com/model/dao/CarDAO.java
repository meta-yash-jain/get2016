package com.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.model.vo.CarVO;
import com.mysql.jdbc.Statement;
import com.utill.ConnectionFactory;

@Component
public class CarDAO implements CarDaoInterface {
	
	Connection connection = ConnectionFactory.getConnection();
	
	static String id = "id", updateTime = "updateTime",
			updatedBy = "updatedBy", make = "make", model = "model",
			engineInCC = "engineInCC", fuelCapacity = "fuelCapacity",
			milage = "milage", price = "price", roadTax = "roadTax", ac = "ac",
			powerSteering = "powerSteering", accessoryKit = "accessoryKit";

	@Override
	public List<CarVO> getAllCars() {
		List<CarVO> carList = new ArrayList<CarVO>();
		String query = "SELECT * FROM cars";
		PreparedStatement st;
		try {
			st = connection.prepareStatement(query);
			ResultSet resultset = st.executeQuery();

			// add all the data to list of CarVO
			while (resultset.next()) {
				CarVO carvo = new CarVO();
				carvo.setId(resultset.getInt(id));
				carvo.setUpdatedBy(resultset.getString(updatedBy));
				carvo.setUpdateTime(resultset.getString(updateTime));
				carvo.setUpdatedBy(resultset.getString(updatedBy));
				carvo.setMake(resultset.getString(make));
				carvo.setModel(resultset.getString(model));
				carvo.setEngineInCC(resultset.getInt(engineInCC));
				carvo.setFuelCapacity(resultset.getInt(fuelCapacity));
				carvo.setMilage(resultset.getInt(milage));
				carvo.setPrice(resultset.getInt(price));
				carvo.setRoadTax(resultset.getInt(roadTax));
				carvo.setAc(resultset.getInt(ac));
				carvo.setPowerSteering(resultset.getInt(powerSteering));
				carvo.setAccessoryKit(resultset.getInt(accessoryKit));
				carList.add(carvo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return carList;
	}

	@Override
	public List<CarVO> findCarbyId(int idToFind) {

		String query = "SELECT * FROM cars where id = " + idToFind;
		PreparedStatement st;
		List<CarVO> carList = new ArrayList<CarVO>();
		try {
			st = connection.prepareStatement(query);
			ResultSet resultset = st.executeQuery();

			// add all the data to list of CarVO
			while (resultset.next()) {
				CarVO carvo = new CarVO();
				carvo.setId(resultset.getInt(id));
				carvo.setUpdatedBy(resultset.getString(updatedBy));
				carvo.setUpdateTime(resultset.getString(updateTime));
				carvo.setUpdatedBy(resultset.getString(updatedBy));
				carvo.setMake(resultset.getString(make));
				carvo.setModel(resultset.getString(model));
				carvo.setEngineInCC(resultset.getInt(engineInCC));
				carvo.setFuelCapacity(resultset.getInt(fuelCapacity));
				carvo.setMilage(resultset.getInt(milage));
				carvo.setPrice(resultset.getInt(price));
				carvo.setRoadTax(resultset.getInt(roadTax));
				carvo.setAc(resultset.getInt(ac));
				carvo.setPowerSteering(resultset.getInt(powerSteering));
				carvo.setAccessoryKit(resultset.getInt(accessoryKit));
				carList.add(carvo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return carList;
	}

	@Override
	public int insert(CarVO carvo) {

		int last_inserted_id = -1;
		String query = "INSERT  INTO `cars` (`make`,`model`,`engineInCC`,`fuelCapacity`,`milage`,`price`,`roadTax`,`ac`,`powerSteering`,`accessoryKit`) "
				+ "VALUES (?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(query,
					Statement.RETURN_GENERATED_KEYS);

			preparedStatement.setString(1, carvo.getMake());
			preparedStatement.setString(2, carvo.getModel());
			preparedStatement.setInt(3, carvo.getEngineInCC());
			preparedStatement.setInt(4, carvo.getFuelCapacity());
			preparedStatement.setInt(5, carvo.getMilage());
			preparedStatement.setInt(6, carvo.getPrice());
			preparedStatement.setInt(7, carvo.getRoadTax());
			preparedStatement.setInt(8, carvo.getAc());
			preparedStatement.setInt(9, carvo.getPowerSteering());
			preparedStatement.setInt(10, carvo.getAccessoryKit());
			preparedStatement.executeUpdate();

			ResultSet rs = preparedStatement.getGeneratedKeys();
			if (rs.next()) {
				last_inserted_id = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return last_inserted_id;
	}

	@Override
	public boolean deleteById(int id) {
		int deletedRows = 0;
		boolean status = false;
		String query = "DELETE FROM cars WHERE id= ?";
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement(query);
			preparedStatement.setInt(1, id);
			deletedRows = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (deletedRows > 0) {
			status = true;
		}
		return status;
	}

	@Override
	public boolean update(CarVO carvo) {

		boolean status = false;
		String query = "UPDATE `cars` SET `make`=?,`model`=?,`engineInCC`=?,`fuelCapacity`=?,`milage`=?,`price`=?,`roadTax`=?,`ac`=?,`powerSteering`=?,`accessoryKit`=? "
				+ " WHERE id = " + carvo.getId();
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(query,
					Statement.RETURN_GENERATED_KEYS);

			preparedStatement.setString(1, carvo.getMake());
			preparedStatement.setString(2, carvo.getModel());
			preparedStatement.setInt(3, carvo.getEngineInCC());
			preparedStatement.setInt(4, carvo.getFuelCapacity());
			preparedStatement.setInt(5, carvo.getMilage());
			preparedStatement.setInt(6, carvo.getPrice());
			preparedStatement.setInt(7, carvo.getRoadTax());
			preparedStatement.setInt(8, carvo.getAc());
			preparedStatement.setInt(9, carvo.getPowerSteering());
			preparedStatement.setInt(10, carvo.getAccessoryKit());
			int effectedRow = preparedStatement.executeUpdate();
			if (effectedRow > 0) {
				status = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("status = " + status);

		return status;
	}

}
