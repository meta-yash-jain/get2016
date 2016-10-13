package com.parser.sax;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.employee.Employee;

public class SaxEventHandler extends DefaultHandler {
	
	private List<Employee> employeeList;
	private String content;
	private Employee employee;
	
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		
		content = new String(ch, start, length).trim();
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		
		//Selecting the operation to perform based on the end tag found
		switch(qName) {
		case "firstName" :
			employee.setFirstName(content);
			break;
		case "lastName" :
			employee.setLastName(content);
			break;
		case "location" :
			employee.setLocation(content);
			break;
		case "employee" :
			employeeList.add(employee);
			break;
		}
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		
		//Create a new employee object if the employee tag starts
		if(qName.equals("employee")) {
			employee = new Employee();
			employee.setId(attributes.getValue("id"));
		}
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	public SaxEventHandler() {
		employeeList = new ArrayList<Employee>();
	}
}
