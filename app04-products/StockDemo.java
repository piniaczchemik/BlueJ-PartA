/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo()
    {
        manager = new StockManager();
        manager.addProduct(new Product(132, "Clock Radio,0"));
        manager.addProduct(new Product(37,  "Mobile Phone,0"));
        manager.addProduct(new Product(23,  "Microwave Oven,0"));
        manager.addProduct(new Product(12,  "Personal Computer,0"));
        manager.addProduct(new Product(15,  "Boxing Gloves,0"));
        manager.addProduct(new Product(18,  "Pen,0"));
        manager.addProduct(new Product(19,  "Smartwatch,0"));
        manager.addProduct(new Product(99,  "Desk,0"));
        manager.addProduct(new Product(821, "Smart TV,0"));
        manager.addProduct(new Product(999, "Mirror Glass,0"));
        
                manager.printALLProductDetails();
     }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void deliveryDemo()
    {
         System.out.println("New deliveries:");
        System.out.println("=================");
        manager.delivery(132, 4);
        manager.delivery(37, 12);
        manager.delivery(23, 6);
        manager.delivery(12, 2);
        manager.delivery(15, 20);
        manager.delivery(18, 9);
        manager.delivery(19, 1);
        manager.delivery(99, 11);
        manager.delivery(821, 3);
        manager.delivery(133, 5);
        System.out.println("=================");
    }
    
    /**
     * Show details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void showDetails(int id)
    {
        Product product = getProduct(id);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
       /**
     * Get the product with the given id from the manager.
     * An error message is printed if there is no match.
     * @param id The ID of the product.
     * @return The Product, or null if no matching one is found.
     */
    public Product getProduct(int id)
    {
        Product product = manager.findProduct(id);
        
        if(product == null) 
        {
            System.out.println("Product with ID: " + id +
                               " is not recognised.");
        }
        return product;
    }

    /**
     * @return The stock manager.
     */
    public StockManager getManager()
    {
        return manager;
    }
}
