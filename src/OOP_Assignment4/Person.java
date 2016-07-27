package OOP_Assignment4;

public class Person extends Entity {	
	private String pName, pContactNumber, pEmailID;
	public String getName() {
		return pName;
	}
	public void setName(String pName) {
		this.pName = pName;
	}
	public String getContactNumber() {
		return pContactNumber;
	}
	public void setContactNumber(String pContactNumber) {
		this.pContactNumber = pContactNumber;
	}
	public String getEmailID() {
		return pEmailID;
	}
	public void setEmailID(String pEmailID) {
		this.pEmailID = pEmailID;
	}
}