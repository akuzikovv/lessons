package Lesson7_Shop.position.implementation.abst;

import Lesson7_Shop.position.Position;

public abstract class AbstractPosition implements Position {

    public double price;
    public String name;

    public AbstractPosition(double price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
