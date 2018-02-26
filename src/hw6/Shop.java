package hw6;

public class Shop {
    public static int price;
    public static String name;
    public static int count;

    public Shop(int price, String name, int count) {
        this.count = count;
        this.name = name;
        this.price = price;
    }

    public static int getPrice(int price) {
        return Shop.price;
    }

    public static void setPrice(int price) {
        Shop.price = price;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Shop.name = name;
    }

    public static int getCount(int count) {
        return Shop.count;
    }

    public static void setCount(int count) {
        Shop.count = count;
    }

    public  void productDescription() {
        return;
    }


}