import java.util.ArrayList;
import java.util.List;

/**
 * Class to create the list for the Product objects for the storefront
 */
class Inventory {
    /**
     * The products property creates a list of all products in the inventory
     * Constructor method for the products
     * Method for adding products and removing products
     */
    private List<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(int Id) {
        products.removeIf(product -> product.getId() == Id);
    }

    /**
     * Getter method for the product
     * @param Id of the product
     * @return product
     */

    /**
     *Method to search for the product in the inventory using the id
     */
    public Product findProductById(int Id) {
        for (Product product : products) {
            if (product.getId() == Id) {
                return product;
            }
        }
        return null;
    }

    /**
     * Method that prints out all the products in the Inventory using the describe method
     */
    public void listAllProduct() {
        System.out.println("Products in Inventory:");
        for (Product product : products) {
            product.describe();
        }
    }
}