package hw6;

public class Main {

    public static void main(String[] args) {
       getMinimarketProducts();
       getSuperMarketProducts();
       getGigaMarketProducts();
    }

    public static void getMinimarketProducts(){
            Shop mini = new MiniMarket(123,"Product from miniMarket",7);
        System.out.println(mini.toString());
    }

    public static void getSuperMarketProducts(){
        Shop superMarket = new SuperMarket(123,"Product from superMarket",43);
        System.out.println(superMarket.toString());
    }

    public static void getGigaMarketProducts(){
        Shop GigaMarket = new GigaMarket(123,"Product from gigaMarket",2465,12,"rebate code");
        System.out.println(GigaMarket.toString());
    }
}
