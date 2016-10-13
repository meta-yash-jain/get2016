package com.modal;

public class CarVO extends VehicleVO{
	private boolean ac;
	private boolean powerSteering;
	private boolean accessoryKit;

	/**
	 * @return the ac
	 */
	public boolean isAc() {
		return ac;
	}

	/**
	 * @param ac
	 *            the ac to set
	 */
	public void setAc(boolean ac) {
		this.ac = ac;
	}

	/**
	 * @return the powerSteering
	 */
	public boolean isPowerSteering() {
		return powerSteering;
	}

	/**
	 * @param powerSteering
	 *            the powerSteering to set
	 */
	public void setPowerSteering(boolean powerSteering) {
		this.powerSteering = powerSteering;
	}

	/**
	 * @return the accessoryKit
	 */
	public boolean isAccessoryKit() {
		return accessoryKit;
	}

	/**
	 * @param accessoryKit
	 *            the accessoryKit to set
	 */
	public void setAccessoryKit(boolean accessoryKit) {
		this.accessoryKit = accessoryKit;
	}

	@Override
	/**
	 * calculate the onroad price
	 */
	public int calculateRoadTax(int price) {
		return (int) (2.5 * price / 100);
	}
}
