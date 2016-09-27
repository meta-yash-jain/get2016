
package assignment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="employee")
@XmlAccessorType(XmlAccessType.FIELD)

public class Employee {

	private int id;
	private String name;
	private String city;
	private int age;
	private int salary;
	
	public Employee() {	}
	
	public Employee(int id, String name, String city, int age, int salary) {
		this.id = id;
		this.name= name;
		this.city = city;
		this.age = age;
		this.salary = salary;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
