
/**
 * Write a description of class Ticket here.
 *
 * @Kamil Lesniewski 21906354
 * @version (a version number or a date)
 */
public class Ticket
{
    //The tickets destination
    private String destination;
    //The tickets price
    private int price;
    //The date purchased of the ticket
    private String date;
    
    /**
     * the constructor of the class 
     */
    public Ticket(String destination, int price, String date)
    {
        this.destination = destination;
        this.price = price;
        this.date = date;
    }
    
    /**
     * returns the destination of the ticket
     */
    public String getDestination()
    {
        return this.destination;
    }
    
    /**
     * returns the price of the ticket the ticket 
     */
    public int getPrice()
    {
        return this.price;
    }
    
    /**
     * returns the date purchased of the ticket
     */
    public String getDate()
    {
        return this.date;
    }
    


}


