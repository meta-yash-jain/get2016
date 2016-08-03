package DS_Assignment4;

public class Guest {
	private String guestName;
	private int guestAge;
	/**
	 * Parameterized constructor for setting guest name and guest age
	 * @param guestName
	 * @param guestAge
	 */
	public Guest(String guestName, int guestAge){
		this.guestName = guestName;
		this.guestAge = guestAge;
	}
	public String getGuestName(){
		return this.guestName;
	}
	public int getGuestAge(){
		return this.guestAge;
	}
}