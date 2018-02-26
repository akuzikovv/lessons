package hw6;

public class MiniMarket extends Shop {

    public MiniMarket(int price, String name, int count) {
        super(price, name, count);
    }

    @Override
    public String toString() {
        return "MiniMarket products: " + name + ", " + count + ", " + price;
    }
}
