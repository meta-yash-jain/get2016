package com.parser.sax;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import com.employee.Employee;

public class SaxEmployeeParser {

	public static void main(String[] args) throws Exception {
		//Creating SAX Parser Factory
		SAXParserFactory saxFactory = SAXParserFactory.newInstance();
		
		//Getting the SAX Parser
		SAXParser saxParser = saxFactory.newSAXParser(); 
		
		//Creating the SAX Event Handler
		SaxEventHandler eventHandler = new SaxEventHandler();
		
		//Registering the handler for the xml file
		saxParser.parse(ClassLoader.getSystemResourceAsStream("com/employee/employee.xml"), eventHandler);
		
		//Printing the Employee details
		for(Employee emp : eventHandler.getEmployeeList()) {
			System.out.println(emp);
		}
	}
}
