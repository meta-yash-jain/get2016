package com.modal;

public abstract class VehicleVO {

    private int vehicleId;
    private String make;
    private String model;
    private float engineInCC;
    private float fuelCapacity;
    private float milage;
    private int roadTax;
    private int price;

    /**
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the engineInCC
     */
    public float getEngineInCC() {
        return engineInCC;
    }

    /**
     * @param engineInCC the engineInCC to set
     */
    public void setEngineInCC(float engineInCC) {
        this.engineInCC = engineInCC;
    }

    /**
     * @return the milage
     */
    public float getMilage() {
        return milage;
    }

    /**
     * @param milage the milage to set
     */
    public void setMilage(float milage) {
        this.milage = milage;
    }

    /**
     * @return the roadTax
     */
    public int getRoadTax() {
        return roadTax;
    }

    /**
     * @param roadTax the roadTax to set
     */
    public void setRoadTax(int roadTax) {
        this.roadTax = roadTax;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    public abstract int calculateRoadTax(int price);

    public float getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(float fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }
}
