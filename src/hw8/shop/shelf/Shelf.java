package hw8.shop.shelf;

import hw8.shop.position.impl.abst.AbstractPosition;

public interface Shelf  {
    boolean put(AbstractPosition position);
 AbstractPosition get();
 boolean checkAvailable();


}
