package Room;

/**
* Class that manages the data and functionality
* of rooms
*/
public class Room extends People {

	private String roomName, category;
	private int capacity;

	public Room (String roomName, String category){

		this.roomName= roomName;
		this.category = category;
	}

	/* Set room name*/
	public void setRoomName(String roomName){

		this.roomName = roomName;
	}
	/*Set the room capacity*/

	public void setCapacity(int capacity){

		this.capacity = capacity;
	}
	/* Set room category*/

	public void setRoomCategory(String roomCategory){
		this.roomCategory = roomCategory;
	}
	/* Get room name*/
	public String getRoomName(){
		return roomName;
	}
	/* Get room category*/

	public String getRoomCategory(){
		return roomCategory;
	}

}