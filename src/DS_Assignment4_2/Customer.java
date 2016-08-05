package DS_Assignment4_2;

public class Customer {
	private String name;
	private int age;
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/**
	 * @return the custName
	 */
	public String getCustomerName() {
		return name;
	}
	/**
	 * @return the custAge
	 */
	public int getCustomerAge() {
		return age;
	}
}
