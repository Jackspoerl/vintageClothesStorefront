import java.util.Scanner;

/**
 * Class that allows the user to interact with the storefront
 */
public class Store {

    /**
     * @param args creates the products in the inventory
     */
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        inventory.addProduct(new Product(1, "Levi", 49.99, Condition.USED, ClothingType.JEANS, Size.M));
        inventory.addProduct(new Product(2, "Wrangler", 79.99, Condition.NEW, ClothingType.JACKET, Size.L));

        inventory.listAllProduct();

        /**
         * Prompt the user for the method for the id
         */
        System.out.println("Enter Product Id to Search For: ");
        Scanner scanner = new Scanner(System.in);
        int searchId = scanner.nextInt();;
        Product foundProduct = inventory.findProductById(searchId);
        if (foundProduct != null) {
            System.out.println("Product with ID " + searchId + ": " );
            foundProduct.describe();
        } else {
            System.out.println("Product with ID " + searchId + " not found.");
        }

        /**
         * prompt the user for the method for the id
         */
        System.out.println("Enter Product Id to Delete: ");
        Scanner scanner1 = new Scanner(System.in);
        int removeId = scanner1.nextInt();
        inventory.removeProduct(removeId);
        System.out.println("Removed Product with ID " + removeId + ".");

        System.out.println("\nNew Inventory: ");
        inventory.listAllProduct();
    }
}
