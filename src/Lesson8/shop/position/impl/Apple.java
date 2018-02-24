package Lesson8.shop.position.impl;


import Lesson8.shop.position.impl.abst.AbstractPosition;
import Lesson8.shop.shelf.Shelf;
import Lesson8.shop.shelf.ShelfImplApple;

/**
 * Created by cube on 21.02.2018.
 */
public class Apple extends AbstractPosition {

    public Apple(double price, String name,int count)    {
        super(price, name,count);
    }



}
