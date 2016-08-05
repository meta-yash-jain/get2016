package DS_Assignment6;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
	int employeeId;
	String name;
	String address;
	/**
	 * @param employeeId
	 * @param name
	 * @param address
	 */
	public Employee(int employeeId, String name, String address) {
		setAddress(address);
		setName(name);
		setEmpId(employeeId);
	}
	public void setEmpId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	/**
	 * To convert object to string
	 */
	@Override
	public String toString() {
		String string = "\n" + getEmployeeId() + " " + getName() + " " + getAddress() + "\n";
		return string;
	}
	/**
	 * To set uniqueness as empId
	 */
	@Override
	public int hashCode() {
		Integer i = employeeId;
		return i.hashCode();
	}
	/**
	 * For equal objects
	 */
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj == null || obj.getClass() != getClass()) {
			result = false;
		} else {
			Employee emp = (Employee) obj;
			if (this.employeeId == emp.getEmployeeId()) {
				result = true;
			}
		}
		return result;
	}
	/**
	 * Compare by empId
	 */
	@Override
	public int compareTo(Employee object) {
		return this.getEmployeeId() - object.getEmployeeId();
	}
}
	class EmployeeNameSorted implements Comparator<Employee> {
		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.getName().compareTo(e2.getName());
	}
}