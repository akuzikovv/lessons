package hw6;

public class MiniMarket extends Shops {
    public static String name = "Name of product";

    public  void main(String[] args) {
        getName();
        getName(name);
    }

    public static void getName() {
        System.out.println("qwerty");
        return;
    }

    public static String getName(String name) {
        System.out.println(name);
        return name;
    }


}
