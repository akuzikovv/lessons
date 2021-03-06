package hw8.shop.bag;

import hw8.shop.position.Position;

/**
 * Created by cube on 21.02.2018.
 */
public interface Bag {
    int getNotUsedSize();

    void add(Position position);

    boolean haveNext();

    Position next();

    void initIterator();

}
