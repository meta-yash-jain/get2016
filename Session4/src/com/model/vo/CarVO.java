package com.model.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Entity
@Table(name="cars")
public class CarVO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	
	@Column(name="updateTime")
	String updateTime;
	
	@Column(name="updatedBy")
	String updatedBy;
	
	@Column(name="make")
	String make;
	
	@Column(name="model")
	String model ;
	
	@Column(name="engineInCC")
	int engineInCC;
	
	@Column(name="fuelCapacity")
	int fuelCapacity;
	
	@Column(name="milage")
	int milage;
	
	@Column(name="price")
	int price;
	
	@Column(name="roadTax")
	int roadTax;
	
	@Column(name="ac")
	int ac;
	
	@Column(name="powerSteering")
	int powerSteering;
	
	@Column(name="accessoryKit")
	int accessoryKit ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getEngineInCC() {
		return engineInCC;
	}
	public void setEngineInCC(int engineInCC) {
		this.engineInCC = engineInCC;
	}
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage = milage;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRoadTax() {
		return roadTax;
	}
	public void setRoadTax(int roadTax) {
		this.roadTax = roadTax;
	}
	public int getAc() {
		return ac;
	}
	public void setAc(int ac) {
		this.ac = ac;
	}
	public int getPowerSteering() {
		return powerSteering;
	}
	public void setPowerSteering(int powerSteering) {
		this.powerSteering = powerSteering;
	}
	public int getAccessoryKit() {
		return accessoryKit;
	}
	public void setAccessoryKit(int accessoryKit) {
		this.accessoryKit = accessoryKit;
	}	

}
