
/**
	 * This class creates an instance of the Game
	 * class and then calls on its run method.
	 *
	  * @version 19/01/2012
	 * 
	 * Modified and extended by kamil Lesniewski
	 */
	public class Program
	{
	    private static Game game;
	

	    /**
	     * This class creates and runs an instance of
	     * the Game class
	     */
	    public static void main()
	    {
	        game = new Game();
	        game.play();
	    }
	}

