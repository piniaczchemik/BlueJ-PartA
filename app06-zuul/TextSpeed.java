
/**
	 * Takes a string and outputs it slowly one letter at a time
	 *
	 * @author kamil Lesniewski
	 * @version 19/01/2021
	 */
	public class TextSpeed
	{
	    /**
	     * prints out the text with a 60ms dely
	     */
	    public void slowText(String input)
	    {
	        for (int index = 0; index < input.length(); index++) 
	        {
	            System.out.print(input.charAt(index));
	            try {
	                Thread.sleep(60);
	            }
	            catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	        System.out.println("");
	    }
	

	    /**
	     * prints out the text with 40ms dely
	     */
	    public void fastText(String input)
	    {
	        for (int index = 0; index < input.length(); index++) 
	        {
	            System.out.print(input.charAt(index));
	            try {
	                Thread.sleep(40);
	            }
	            catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	        System.out.println("");
	    }
	

	    /**
	     * prints out the text with a 300ms dely
	     */
	    public void superSlowText(String input)
	    {
	        for (int index = 0; index < input.length(); index++) 
	        {
	            System.out.print(input.charAt(index));
	            try {
	                Thread.sleep(300);
	            }
	            catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	        System.out.println("");
	    }
	

	    /**
	     * prints out the text with 20ms dely
	     */
	    public void superFastText(String input)
	    {
	        for (int index = 0; index < input.length(); index++) 
	        {
	            System.out.print(input.charAt(index));
	            try {
	                Thread.sleep(20);
	            }
	            catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	        System.out.println("");
	    }
	}

