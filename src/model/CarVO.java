
package model;

public class CarVO extends VehicleVO {
	
	private String companyName;
	private String modelNumber;
	private String name;
	private double fuelCapacity;
	private double milege;
	private double price;
	private double roadTax;
	private int isAcPresent;
	private int isPowerSteeringPresent;
	private int isAccessoryKitPresent;
	
	public CarVO(){
		companyName = null;
		modelNumber = null;
		name = null;
		fuelCapacity = 0;
		milege = 0;
		price = 0;
		roadTax = 0;
		isAcPresent = 0;
		isPowerSteeringPresent = 0;
		isAccessoryKitPresent = 0;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	
	public String getModelNumber() {
		return modelNumber;
	}
	
	@Override
	
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	
	@Override
	
	public String getName() {
		return name;
	}
	
	@Override
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	
	public double getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(double fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public double getMilege() {
		return milege;
	}

	public void setMilege(double milege) {
		this.milege = milege;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getRoadTax() {
		return roadTax;
	}

	public void setRoadTax(double roadTax) {
		this.roadTax = roadTax;
	}
	
	public int isAcPresent() {
		return isAcPresent;
	}

	public void setAcPresent(int isAcPresent) {
		this.isAcPresent = isAcPresent;
	}

	public int isPowerSteeringPresent() {
		return isPowerSteeringPresent;
	}

	public void setPowerSteeringPresent(int isPowerSteeringPresent) {
		this.isPowerSteeringPresent = isPowerSteeringPresent;
	}

	public int isAccessoryKitPresent() {
		return isAccessoryKitPresent;
	}

	public void setAccessoryKitPresent(int isAccessoryKitPresent) {
		this.isAccessoryKitPresent = isAccessoryKitPresent;
	}
}
