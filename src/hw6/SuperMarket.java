package hw6;

public class SuperMarket extends Shop {

    public SuperMarket(int price, String name, int count) {
        super(price, name, count);
    }

    public void main(String[] args) {
        productDescription(description);
    }

    @Override
    public String productDescription(String description) {
        description = "New description";
        return description;
    }

    @Override
    public String toString() {
        return "SuperMarket products: " + name + ", " + count + ", " + price + ", " + description;
    }
}
