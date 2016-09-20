/**
 * 
 */
package model;

/**
 * @author admin
 *
 */
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
	
	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	/**
	 * @return the modelNumber
	 */
	public String getModelNumber() {
		return modelNumber;
	}
	
	@Override
	/**
	 * @param modelNumber the modelNumber to set
	 */
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	
	@Override
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	@Override
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	/**
	 * @return the fuelCapacity
	 */
	public double getFuelCapacity() {
		return fuelCapacity;
	}

	
	/**
	 * @param fuelCapacity the fuelCapacity to set
	 */
	public void setFuelCapacity(double fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	/**
	 * @return the milege
	 */
	public double getMilege() {
		return milege;
	}

	/**
	 * @param milege the milege to set
	 */
	public void setMilege(double milege) {
		this.milege = milege;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the roadTax
	 */
	public double getRoadTax() {
		return roadTax;
	}

	/**
	 * @param roadTax the roadTax to set
	 */
	public void setRoadTax(double roadTax) {
		this.roadTax = roadTax;
	}
	
	/**
	 * @return the isAcPresent
	 */
	public int isAcPresent() {
		return isAcPresent;
	}

	/**
	 * @param isAcPresent the isAcPresent to set
	 */
	public void setAcPresent(int isAcPresent) {
		this.isAcPresent = isAcPresent;
	}

	/**
	 * @return the isPowerSteeringPresent
	 */
	public int isPowerSteeringPresent() {
		return isPowerSteeringPresent;
	}

	/**
	 * @param isPowerSteeringPresent the isPowerSteeringPresent to set
	 */
	public void setPowerSteeringPresent(int isPowerSteeringPresent) {
		this.isPowerSteeringPresent = isPowerSteeringPresent;
	}

	/**
	 * @return the isAccessoryKitPresent
	 */
	public int isAccessoryKitPresent() {
		return isAccessoryKitPresent;
	}

	/**
	 * @param isAccessoryKitPresent the isAccessoryKitPresent to set
	 */
	public void setAccessoryKitPresent(int isAccessoryKitPresent) {
		this.isAccessoryKitPresent = isAccessoryKitPresent;
	}
}
