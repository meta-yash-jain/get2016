package DS_Assignment4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class RoomAllotment {
	BufferedReader bufferedReader = null;
	public RoomAllotment(){
		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}
	public static void main(String[] args){
		RoomAllotment roomAllotment = new RoomAllotment();
		try{
			GuestHouse guestHouse = new GuestHouse("Yash Guest House", 97);
			List<Character> roomsList = guestHouse.assignRoomNumbers();
			char userPermission = '\0';
			int roomsOccupied = 0;
			do{
				System.out.println("Welcome to " + guestHouse.getGuestHouseName());
				String guestName = roomAllotment.getUserStringInput("Please enter your name");
				int guestAge = roomAllotment.getUserIntegerInput("Please enter your age");
				Guest guest = new Guest(guestName, guestAge);
				int roomAlloted = roomAllotment.allotRoomNumberToGuest(roomsList, guestAge, roomsOccupied);
				roomsOccupied++;
				if(roomAlloted == -1){
					System.out.println("Sorry " + guest.getGuestName() + " Cannot assign room.All the rooms are occupied");
				}else{
					System.out.println("Thank you " + guest.getGuestName() + " for using our service. " + "\n" + "The room alloted to you is: " + roomAlloted);
				}
				userPermission = roomAllotment.getUserStringInput("Press Y or y to continue").charAt(0);
			}while(userPermission == 'y' || userPermission == 'Y');
			System.out.println("Program Ended");
		}catch(Exception ex){
			System.out.println("Something went wrong: " + ex.getMessage());
		}finally{
			try{
				roomAllotment.bufferedReader.close();
			}catch(Exception ex){
				System.out.println("Something went wrong: " + ex.getMessage());
			}
		}	
	}
	/**
	 * This method computes for alloted room , if empty then returned else incremented until 
	 * alloted room is not empty(Linear Probing Method)
	 * @param roomsList
	 * @param guestAge
	 * @return alloted room
	 */
	public int allotRoomNumberToGuest(List<Character> roomsList, int guestAge, int roomsOccupied){
		// if all the rooms are occupied then return -1
		if(roomsOccupied == roomsList.size()){
			return -1;
		}
		// computed alloted room
		int allotedRoom = guestAge % roomsList.size();
		// until alloted room is not empty
		while(roomsList.get(allotedRoom) != 'E'){
			allotedRoom++;
			// if greater than size of rooms then reduce it
			allotedRoom = allotedRoom % roomsList.size();
		}
		roomsList.set(allotedRoom, 'F');
		return allotedRoom;
	}
	/**
	 * This method returns the user input for string variables
	 * @param message
	 * @return user input for string variables
	 */
	public String getUserStringInput(String message){			
		String userInput = "";
		try{
			System.out.println(message);
			userInput = bufferedReader.readLine();
		}catch(Exception ex){
			System.out.println("Something went wrong: " + ex.getMessage());
			getUserStringInput(message);
		}
		return userInput;
	}
	/**
	 * This method returns the user input for integer values
	 * @param message
	 * @return user input (integer)
	 */
	public int getUserIntegerInput(String message){
		int userInput = 0;
		try{
			System.out.println(message);
			userInput = Integer.parseInt(bufferedReader.readLine());
		}catch(Exception ex){
			System.out.println("Something went wrong: " + ex.getMessage());
			getUserIntegerInput(message);
		}
		return userInput;
	}
}
