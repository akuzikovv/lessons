package hw6;

public class GigaMarket extends Shop {
    public static int discount;
    public static String rebate;

    public GigaMarket(int price, String name, int count, int discount, String rebate) {
        super(price, name, count);
        this.discount = discount;
        this.rebate = rebate;
    }

    public String getFree(String rebate) {
        return rebate;
    }

    public int getFree(int discount) {
        return discount;
    }

    public static int getDiscount() {
        return discount;
    }

    public static void setDiscount(int discount) {
        GigaMarket.discount = discount;
    }

    public static String getRebate() {
        return rebate;
    }

    public static void setRebate(String rebate) {
        GigaMarket.rebate = rebate;
    }

    @Override
    public String toString() {
        return "GigaMarket products: " + name + ", " + count + ", " + price + ", " + description + ", " + discount + ", " + rebate;

    }
}

