package hw8.shop.bag;

import hw8.shop.position.Position;
import hw8.shop.position.impl.abst.AbstractPosition;
import hw8.shop.shelf.ShelfImplPen;

/**
 * Created by cube on 21.02.2018.
 */
public class BagImpl implements Bag {

    private static final int SIZE = 10;
    private Position[] positions = new Position[SIZE];
    private int realIndex = 0;
    private int iteratorIndex = 0;

    @Override
    public int getNotUsedSize() {
        return SIZE - realIndex;
    }

    public void add(Position position) {
        positions[realIndex++] = position;
        if (realIndex>1 && realIndex%2!=0) {
            positions[realIndex] = new Position() {
                @Override
                public String getName() {
                    return position.getName();
                }

                @Override
                public double getPrice() {
                    return 0;
                }
            };
        }
        }



    public boolean haveNext() {
        return iteratorIndex < realIndex;
    }

    public Position next() {
        return positions[iteratorIndex++];
    }

    public void initIterator() {
        iteratorIndex = 0;
    }
}
