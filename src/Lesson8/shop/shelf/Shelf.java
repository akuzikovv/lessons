package Lesson8.shop.shelf;

import Lesson8.shop.position.impl.abst.AbstractPosition;

public interface Shelf  {
    boolean put(AbstractPosition position);
 AbstractPosition get();
 boolean checkAvailable();


}
