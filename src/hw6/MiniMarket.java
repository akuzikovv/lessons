package hw6;

public class MiniMarket extends Shop {

    public MiniMarket(int price, String name, int count) {
        super(price, name, count);
    }

    public  void main(String[] args) {
        getName(name);
        getPrice(price);
        getCount(count);
    }



    public static String getName(String name) {
        System.out.println(name);
        return name;
    }


}
