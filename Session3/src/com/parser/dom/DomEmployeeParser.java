package com.parser.dom;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.employee.Employee;

public class DomEmployeeParser {

	public static void main(String[] args) throws Exception {
		//Getting the DOM builder factory
		DocumentBuilderFactory parser = DocumentBuilderFactory.newInstance();
		
		//Getting the DOM builder
		DocumentBuilder builder = parser.newDocumentBuilder();
		
		//Loading the xml file into DOM
		//DOM contains the elements as a tree structure
		Document document = builder.parse(
				ClassLoader.getSystemResourceAsStream("com/employee/employee.xml"));
		
		//List to store the employee objects
		List<Employee> employeeList = new ArrayList<Employee>();
				
		//Getting the nodes for the employee
		NodeList employeeNodeList = document.getElementsByTagName("employee");
		
		//iterate over every node for the employee details
		for(int i = 0; i < employeeNodeList.getLength(); i++) {
			Element employeeElement = (Element) employeeNodeList.item(i);
			
			//checking if the node is an element or not
			if(employeeElement.getNodeType() == Node.ELEMENT_NODE) {
				//setting the employee details into employee object
				Employee employee = new Employee();
				
				employee.setId(employeeElement.getAttribute("id"));
				employee.setFirstName(employeeElement.getElementsByTagName("firstName").item(0).getTextContent());
				employee.setLastName(employeeElement.getElementsByTagName("lastName").item(0).getTextContent());
				employee.setLocation(employeeElement.getElementsByTagName("location").item(0).getTextContent());
				
				employeeList.add(employee);
			}
		}
		
		//Printing the Employee details
		for(Employee emp : employeeList) {
			System.out.println(emp);
		}
	}
}
