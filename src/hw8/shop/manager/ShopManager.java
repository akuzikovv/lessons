package hw8.shop.manager;

import hw8.shop.bag.Bag;

/**
 * Created by cube on 21.02.2018.
 */
public class ShopManager {

    public int sum(Bag bag) throws InterruptedException {
        int sum = 0;
        bag.initIterator();
        while (bag.haveNext()){
            System.out.println("PICK!!");
            System.out.println(bag.next().getPrice());
            sum +=bag.next().getPrice();
            Thread.sleep(1000);
        }
        System.out.println("vvasha suma sostavlaet " + sum);
        return sum;
    }
}
