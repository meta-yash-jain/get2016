/**
 * 
 */
package com.model.vo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Ajinkya
 *
 */
@XmlRootElement(name = "Employee")
public class EmployeeVO {
	int id,numberOfOrdes;
	String firstName, lastName, email, address;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the numberOfOrdes
	 */
	public int getNumberOfOrdes() {
		return numberOfOrdes;
	}

	/**
	 * @param numberOfOrdes the numberOfOrdes to set
	 */
	@XmlElement
	public void setNumberOfOrdes(int numberOfOrdes) {
		this.numberOfOrdes = numberOfOrdes;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	@XmlElement
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	@XmlElement
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	@XmlElement
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	@XmlElement
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	@XmlElement
	public void setAddress(String address) {
		this.address = address;
	}

}
