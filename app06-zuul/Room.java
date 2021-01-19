import java.util.Set;
	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.Collection;
	

	/**
	 * Class Room - a room in an adventure game.
	 *
	 * This class is part of the "World of Zuul" application. 
	 * "World of Zuul" is a very simple, text based adventure game.  
	 *
	 * A "Room" represents one location in the scenery of the game.  It is 
	 * connected to other rooms via exits.  For each existing exit, the room 
	 * stores a reference to the neighboring room.
	 * 
	 * @version 19/01/2021
	 * 
	 * Modified and extended by Kamil Lesniewski
	 */
	

	public class Room 
	{
	    private TextSpeed textSpeed;
	    private String name;
	    private String description;
	    private HashMap<String, Room> exits;        // stores exits of this room.
	    private HashMap<String, Item> itemsInRoom;  // stores the items in the room
	    /**
	     * Create a room described "description". Initially, it has
	     * no exits. "description" is something like "a kitchen" or
	     * "an open court yard".
	     * @param description The room's description.
	     */
	    public Room(String name, String description) 
	    {
	        this.name = name;
	        this.description = description;
	        exits = new HashMap<>();
	        itemsInRoom = new HashMap<>();
	        textSpeed = new TextSpeed();
	    }
	

	    /**
	     * Sets the items for a given room 
	     */
	    public void setItems(String name, Item itemInRoom)
	    {
	        itemsInRoom.put(name, itemInRoom);
	    }
	 
	    /**
	     * set the descripiton of the room
	     */
	    public void setDescription(String description)
	    {
	        this.description = description;
	    }
	    
	    /**
	     * add the item in the room to the players inventory
	     */
	    public HashMap getItemsInRoom()
	    {
	        return itemsInRoom;
	    }
	    
	    /**
	     * prints out the items within the room
	     */
	    public void printItems()
	    {
	        String returnString = "You look around and see ";
	        String noItems = "nothing of interest";
	        Collection<Item> items = itemsInRoom.values();
	        Boolean empty = true;
	

	        for (Item item : items)
	        {
	            itemsInRoom.get(item);
	            String things = (item.getName() + ": " + item.getDescription());
	            textSpeed.superFastText(returnString);
	            textSpeed.fastText(things);
	            empty = false;
	            break;
	        }
	        if (empty){
	            textSpeed.superFastText(returnString + noItems);
	        }
	    }
	

	    /**
	     * Define an exit from this room.
	     * @param direction The direction of the exit.
	     * @param neighbor  The room to which the exit leads.
	     */
	

	    public void setExit(String direction, Room neighbor) 
	    {
	        exits.put(direction, neighbor);
	    }
	

	    /**
	     * @return The short description of the room
	     * (the one that was defined in the constructor).
	     */
	    public String getShortDescription()
	    {
	        return description;
	    }
	

	    /**
	     * Return a description of the room in the form:
	     *     You are in the kitchen.
	     *     Exits: north west
	     * @return A long description of this room
	     */
	    public String getLongDescription()
	    {
	        return "You are in " + description + ".\n" + getExitString();
	    }
	

	    /**
	     * Return a string describing the room's exits, for example
	     * "Exits: north west".
	     * @return Details of the room's exits.
	     */
	    private String getExitString()
	    {
	        String returnString = "Exits:";
	        Set<String> keys = exits.keySet();
	

	        for(String exit : keys) 
	        {
	            returnString += "|" + exit;
	        }
	        return returnString;
	    }
	

	    /**
	     * Return the room that is reached if we go from this room in direction
	     * "direction". If there is no room in that direction, return null.
	     * @param direction The exit's direction.
	     * @return The room in the given direction.
	     */
	    public Room getExit(String direction) 
	    {
	        return exits.get(direction);
	    }
	}

