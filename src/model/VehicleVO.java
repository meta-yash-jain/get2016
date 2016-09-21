package model;
public abstract class VehicleVO {
	
	public abstract String getCompanyName();
	public abstract void setCompanyName(String companyName);
	public abstract String getModelNumber();
	public abstract void setModelNumber(String modelNumber);
	public abstract String getName();
	public abstract void setName(String name);
	public abstract double getFuelCapacity();
	public abstract void setFuelCapacity(double fuelCapacity);
	public abstract double getMilege();
	public abstract void setMilege(double milege);
	public abstract double getPrice();
	public abstract void setPrice(double price);
	public abstract double getRoadTax();
	public abstract void setRoadTax(double roadTax);
}
