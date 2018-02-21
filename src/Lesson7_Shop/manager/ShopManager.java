package Lesson7_Shop.manager;

import Lesson7_Shop.bag.Bag;

public class ShopManager {
    public int sum(Bag bag) throws InterruptedException {
        int sum = 0;
        bag.initIterator();
        while (bag.haveNext()){
            System.out.println("PICK!");
            sum +=bag.next().getPrice();
            Thread.sleep(1000);
        }

        System.out.println("vvasha suma sostavlaet " + sum);
        return sum;

    }
}
