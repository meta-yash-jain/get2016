package com.model.vo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Employee")
public class EmployeeVO {
	int id,numberOfOrdes;
	String firstName, lastName, email, address;

	public int getId() {
		return id;
	}

	public int getNumberOfOrdes() {
		return numberOfOrdes;
	}

	@XmlElement
	public void setNumberOfOrdes(int numberOfOrdes) {
		this.numberOfOrdes = numberOfOrdes;
	}

	@XmlElement
	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	@XmlElement
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@XmlElement
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	@XmlElement
	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	@XmlElement
	public void setAddress(String address) {
		this.address = address;
	}
}
