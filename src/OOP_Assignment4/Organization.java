package OOP_Assignment4;

public class Organization extends Entity {
	public String Name, ContactNumber, EmailID ;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}
	public String getEmailID() {
		return EmailID;
	}
	public void setEmailID(String emailID) {
		EmailID = emailID;
	}
}