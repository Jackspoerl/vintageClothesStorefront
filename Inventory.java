import java.util.ArrayList;
import java.util.List;

class Inventory {

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


    public Product findProductById(int Id) {
        for (Product product : products) {
            if (product.getId() == Id) {
                return product;
            }
        }
        return null;
    }

    public void listAllProduct() {
        System.out.println("Products in Inventory:");
        for (Product product : products) {
            product.describe();
        }
    }
}