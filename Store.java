public class Store {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();


        inventory.addProduct(new Product(1, "Levi", 49.99, Condition.USED, ClothingType.JEANS, Size.M));
        inventory.addProduct(new Product(2, "Wrangler", 79.99, Condition.NEW, ClothingType.JACKET, Size.L));


        inventory.listAllProduct();


        int searchId = 1;
        Product foundProduct = inventory.findProductById(searchId);
        if (foundProduct != null) {
            System.out.println("Product with ID " + searchId + ": " );
            foundProduct.describe();
        } else {
            System.out.println("Product with ID " + searchId + " not found.");
        }


        int removeId = 2;
        inventory.removeProduct(removeId);
        System.out.println("Removed Product with ID " + removeId + ".");


        inventory.listAllProduct();
    }
}