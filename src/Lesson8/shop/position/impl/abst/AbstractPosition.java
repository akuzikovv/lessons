package Lesson8.shop.position.impl.abst;

import Lesson8.shop.position.Position;

/**
 * Created by cube on 21.02.2018.
 */
public abstract class AbstractPosition implements Position {

    public double price;
    public String name;
    public int count;

    public AbstractPosition(double price, String name, int count) {
        this.price = price;
        this.name = name;
        this.count = count;
    }

    @Override
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}