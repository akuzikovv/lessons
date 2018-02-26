package hw6;

public class GigaMarket extends Shop {
    public static int discount;
    public static String rebate;

    public GigaMarket(int price, String name, int count) {
        super(price, name, count);
    }

    public void main(String[] args) {
        Shop shop = new Shop(123,"Product",43);
        getFree(rebate);
        getFree(discount);
        }

        public String getFree( String rebate){
        return rebate;
        }

        public int getFree( int discount){
            return discount;
        }

    }

