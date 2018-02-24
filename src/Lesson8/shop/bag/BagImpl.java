package Lesson8.shop.bag;

import Lesson8.shop.position.Position;
import Lesson8.shop.shelf.Shelf;

/**
 * Created by cube on 21.02.2018.
 */
public class BagImpl implements Bag {

    private static final int SIZE = 10;
    private Position[] positions =  new Position[SIZE];
    private int realIndex =0;
    private int iteratorIndex = 0;

    @Override
    public int getNotUsedSize() {
        return SIZE - realIndex;
    }

    public void add(Position position){
        positions[realIndex++] = position;
    }

    public boolean haveNext(){
        return iteratorIndex<realIndex;
    }

    public Position next(){
        return positions[iteratorIndex++];
    }

    public void initIterator(){
        iteratorIndex = 0;
    }
}
