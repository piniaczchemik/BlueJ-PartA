/**
 * Model some details of a product sold by a company.
 * 
 * @author Kamil Lesniewski
 * @version 09/11/2020
 */
public class Product
{
    // An identifying number for this product.
    private int id;
    // The name of this product.
    private String name;
    // The quantity of this product in stock.
    private int quantity;

    /**
     * Constructor for objects of class Product.
     * The initial stock quantity is zero.
     * @param id The product's identifying number.
     * @param name The product's name.
     */
    public Product(int id, String name)
    {
        this.id = id;
        this.name = name;
        quantity = 0;
    }

    /**
     * @return The product's id.
     */
    public int getID()
    {
        return id;
    }

    /**
     * @return The product's name.
     */
    public String getName()
    {
        return name;
    }

    /**
     * @return The quantity in stock.
     */
    public int getQuantity()
    {
        return quantity;
    }

    /**
     * @return The id, name and quantity in stock.
     */
    public String toString()
    {
        return id + ": " +  name + " stock level: " + quantity;
    }

      /**
     * adds a * next to products that have recently excepted a delivery
     */
     public String acceptingDelivery()
    {
        return id + ": " +  name + " (stock level: " + quantity + "*)";
    }
    
    /**
     * Restock with the given amount of this product.
     * The current quantity is incremented by the given amount.
     * @param amount The number of new items added to the stock.
     *               This must be greater than zero.
     */
    public void increaseQuantity(int amount)
    {
        if(amount > 0) 
        {
            quantity += amount;
        }
        else 
        {
            System.out.println("Attempt to restock " + name +
                               " with a non-positive amount: " + amount);
        }
    }

       /**
     * Sell one of these products.
     * An error is reported if there appears to be no stock.
     */
    public void sell(int amount)
    {
        System.out.println(toString());
        if(quantity > 0) 
        {
            if (amount < 0)
            {
               System.out.println("Amount can not be less than 0");
            }
            else if(amount <= quantity)
            {
                this.quantity = this.quantity - amount;
                System.out.println("Sold: " + amount + " " + name + "s");
                toString();
            }
            else 
            {
                System.out.println("Amount to sell is greater than current stock level");
            }
        }
        else 
        {
           System.out.println(
                "Attempt to sell an out of stock item: " + name);
        }
    }
}
