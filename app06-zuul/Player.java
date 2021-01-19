import java.util.HashMap;
	/**
	 * A player class that represents the user
	 * it contains the players Energy, inventory, and location
	 *
	 * @author Kamil Lesniewski
	 * @version 19/01/2012
	 */
	public class Player
	{
	    private int energy;
	

	    private HashMap<String, Item> inventory;
	

	    /**
	     * Constructor for objects of class Player
	     */
	    public Player()
	    {
	        energy = 20;
	

	        inventory = new HashMap<String, Item>();
	    }
	

	    /**
	     * adds an item to the inventory
	     */
	    public void addInventory()
	    {
	        
	    }
	}

