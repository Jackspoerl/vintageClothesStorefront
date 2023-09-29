import java.util.Scanner;
public class Store {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();


        inventory.addProduct(new Product(1, "Levi", 49.99, Condition.USED, ClothingType.JEANS, Size.M));
        inventory.addProduct(new Product(2, "Wrangler", 79.99, Condition.NEW, ClothingType.JACKET, Size.L));


        inventory.listAllProduct();



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

        System.out.println("Enter Product Id to Delete: ");
        Scanner scanner1 = new Scanner(System.in);
        int removeId = scanner1.nextInt();
        inventory.removeProduct(removeId);
        System.out.println("Removed Product with ID " + removeId + ".");

        System.out.println("\nNew Inventory: ");
        inventory.listAllProduct();
    }
}
