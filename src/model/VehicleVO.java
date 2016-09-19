/**
 * 
 */
package model;

/**
 * @author admin
 */
public abstract class VehicleVO {
		
	/**
	 * @return the company name
	 */
	public abstract String getCompanyName();
	
	/**
	 * @param companyName the companyName to set
	 */
	public abstract void setCompanyName(String companyName);

	/**
	 * @return the modelNumber
	 */
	public abstract String getModelNumber();

	/**
	 * @param modelNumber the modelNumber to set
	 */
	public abstract void setModelNumber(String modelNumber);

	/**
	 * @return the name
	 */
	public abstract String getName();

	/**
	 * @param name the name to set
	 */
	public abstract void setName(String name);

	/**
	 * @return the fuelCapacity
	 */
	public abstract double getFuelCapacity();

	/**
	 * @param fuelCapacity the fuelCapacity to set
	 */
	public abstract void setFuelCapacity(double fuelCapacity);

	/**
	 * @return the milege
	 */
	public abstract double getMilege();

	/**
	 * @param milege the milege to set
	 */
	public abstract void setMilege(double milege);

	/**
	 * @return the price
	 */
	public abstract double getPrice();

	/**
	 * @param price the price to set
	 */
	public abstract void setPrice(double price);

	/**
	 * @return the roadTax
	 */
	public abstract double getRoadTax();

	/**
	 * @param roadTax the roadTax to set
	 */
	public abstract void setRoadTax(double roadTax);
	
	public abstract double calculateOnRoadPrice(double roadTax,double carPrice);
	
}
