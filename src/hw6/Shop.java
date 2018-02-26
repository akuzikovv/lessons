package hw6;

public class Shop {
    public static int price,count;
    public static String name;
    public static String description = "Description of product";

    public Shop(int price, String name, int count) {
        Shop.count = count;
        Shop.name = name;
        Shop.price = price;
    }

    public static int getPrice() {
        return Shop.price;
    }

    public static void setPrice() {
        Shop.price = price;
    }

    public static String getName() {
        return Shop.name;
    }

    public static void setName() {
        Shop.name = name;
    }

    public static int getCount() {
        return Shop.count;
    }

    public static void setCount() {
        Shop.count = count;
    }

    public String productDescription(String description) {
        return description;
    }

    @Override
    public String toString() {
        return "Product: "+ name+ ", " + count+ ", " + price;
    }
}