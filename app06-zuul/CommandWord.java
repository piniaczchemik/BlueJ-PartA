/**
	 * Representations for all the valid command words for the game
	 * along with a string in a particular language.
	 * 
	* @version 19/01/2012
	 * 
	 * Modified and extended by Kamil Lesniewski
	 */
	public enum CommandWord
	{
	    // A value for each command word along with its
	    // corresponding user interface string.
	    GO("go"), QUIT("quit"), HELP("help"), UNKNOWN("?"), USE("use"), DROP("drop"),
	    LOOK("look"), TAKE("take"), STATS("stats");
	    // The command string.
	    private String commandString;
	    
	    /**
	     * Initialise with the corresponding command string.
	     * @param commandString The command string.
	     */
	    CommandWord(String commandString)
	    {
	        this.commandString = commandString;
	    }
	    
	    /**
	     * @return The command word as a string.
	     */
	    public String toString()
	    {
	        return commandString;
	    }
	}

