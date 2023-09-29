enum Condition {
    USED,NEW
}
enum ClothingType {
    PANTS,SHORTS,JEANS,SHIRT,JACKET,HOODIE,HAT,DRESS,ACCESSORY
}
enum Size {
    XS,S,M,L,XL
}
class Product {
    private int id;
    private String nameBrand;
    private double price;
    private Condition condition;
    private ClothingType clothingType;
    private Size size;

    public Product(int id, String nameBrand, double price,Condition condition,ClothingType clothingType, Size size) {
        this.id = id;
        this.nameBrand = nameBrand;
        this.price = price;
        this.condition = condition;
        this.clothingType = clothingType;
        this.size = size;
    }

    public int getId() {
        return id;
    }
    public String getNameBrand() {
        return nameBrand;
    }
    public double getPrice() {
        return price;
    }
    public Condition getCondition() {
        return condition;
    }
    public ClothingType getClothingType() {
        return clothingType;
    }
    public Size GetSize() {
        return size;
    }

    public void describe() {
        System.out.println("Name Brand: " + nameBrand);
        System.out.println("Price: $" + price);
        System.out.println("Condition: " + condition);
        System.out.println("Type: " + clothingType);
        System.out.println("Size: " + size);
    }

}