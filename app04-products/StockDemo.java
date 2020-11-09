/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 *
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 * @modyfied by Kamil Lesniewski
 * @version 09/11/2020
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;

        manager.addProduct(new Product(987, "Laptop"));
        manager.addProduct(new Product(986, "Keybord"));
        manager.addProduct(new Product(985, "Glass"));
        manager.addProduct(new Product(984, "Bike"));
        manager.addProduct(new Product(983, "Fridge"));
        manager.addProduct(new Product(982, "Door"));
        manager.addProduct(new Product(981, "Pen"));
        manager.addProduct(new Product(980, "Board"));
        manager.addProduct(new Product(989, "Ketchup"));
        manager.addProduct(new Product(988, "Cards"));
    }
    public void runDemo()
    {
        manager.printAllProducts();
        demoDelivery();
    }

    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void demoDelivery()
    {
        // Show details of all of the products.
        manager.printAllProducts();
        // Take delivery of 5 items of one of the products.
        manager.delivery(987, 1);
        manager.delivery(986, 11);
        manager.delivery(985, 111);
        manager.delivery(984, 2);
        manager.delivery(983, 22);
        manager.delivery(982, 222);
        manager.delivery(981, 3);
        manager.delivery(980, 33);
        manager.delivery(989, 333);
        manager.delivery(988, 4);

        manager.printAllProducts();
    }
    
    public void demoSell()
    {
        manager.printAllProducts();
        manager.sellProduct(1234);
        manager.sellProduct(2345);
        manager.sellProduct(3456);
        manager.sellProduct(4567);
        manager.sellProduct(5678);
        manager.sellProduct(6789);
        manager.sellProduct(7890);
        manager.sellProduct(8901);
        manager.sellProduct(9012);
        manager.sellProduct(0123);
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