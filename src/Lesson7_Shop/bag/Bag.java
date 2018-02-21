package Lesson7_Shop.bag;

import Lesson7_Shop.position.Position;

public interface Bag {
    int getNotUsedSize();

    void add(Position position);

    boolean haveNext();

    Position next();

    void initIterator();
}
