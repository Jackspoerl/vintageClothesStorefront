/**
 * This documents "Condition"
 */
enum Condition {
    USED,NEW
}

/**
 * This documents "Clothing type"
 */
enum ClothingType {
    PANTS,SHORTS,JEANS,SHIRT,JACKET,HOODIE,HAT,DRESS,ACCESSORY
}

/**
 * This documents "Size"
 */
enum Size {
    XS,S,M,L,XL
}
/** Class to be used to create Product object for the storefront */
class Product {

    /**
     * The id property unique record identifier for the product
     * The nameBrand property stores the product brand
     * The price property stores the price of the product
     * The condition property stores the condition of the product
     * The clothingType property stores the type of the product
     * The size property stores the size of the product
     */
    private int id;
    private String nameBrand;
    private double price;
    private Condition condition;
    private ClothingType clothingType;
    private Size size;

    /**
     *
     * @param id The id property unique record identifier for the product
     * @param nameBrand The nameBrand property stores the product brand
     * @param price The price property stores the price of the product
     * @param condition The condition property stores the condition of the product
     * @param clothingType The clothingType property stores the type of the product
     * @param size The size property stores the size of the product
     */

    /**
     Constructor method for the Product
     */
    public Product(int id, String nameBrand, double price,Condition condition,ClothingType clothingType, Size size) {
        this.id = id;
        this.nameBrand = nameBrand;
        this.price = price;
        this.condition = condition;
        this.clothingType = clothingType;
        this.size = size;
    }

    /**
     * Getter method for the id
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Getter method for the nameBrand
     * @return nameBrand
     */
    public String getNameBrand() {
        return nameBrand;
    }

    /**
     * Getter method for the price
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Getter method for the condition
     * @return condition
     */
    public Condition getCondition() {
        return condition;
    }

    /**
     * Getter method for the clothingType
     * @return Clothing type
     */
    public ClothingType getClothingType() {
        return clothingType;
    }

    /**
     * Getter method for the size
     * @return size
     */
    public Size GetSize() {
        return size;
    }

    /**
     * This method describes the product
     */
    public void describe() {
        System.out.println("Product ID: " + id);
        System.out.println("Name Brand: " + nameBrand);
        System.out.println("Price: $" + price);
        System.out.println("Condition: " + condition);
        System.out.println("Type: " + clothingType);
        System.out.println("Size: " + size);
    }

}