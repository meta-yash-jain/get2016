package DS_Assignment4;

import java.util.ArrayList;
import java.util.List;

public class GuestHouse {
	private String guestHouseName;
	private int guestHouseTotalRooms;
	/**
	 * Parameterized constructor for initializing name and total rooms
	 * @param guestHouseName
	 * @param guestHouseTotalRooms
	 */
	public GuestHouse(String guestHouseName, int guestHouseTotalRooms){
		this.guestHouseName = guestHouseName;
		this.guestHouseTotalRooms = guestHouseTotalRooms;
	}
	public String getGuestHouseName(){
		return this.guestHouseName;
	}
	/**
	 * This method initially makes all the rooms empty
	 * @return list of rooms
	 */
	public List<Character> assignRoomNumbers(){
		List<Character> roomsList = new ArrayList<Character>();
		for(int i = 0; i < guestHouseTotalRooms; ++i ){
			roomsList.add('E');
		}
		return roomsList;
	}
}