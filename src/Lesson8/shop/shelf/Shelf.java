package Lesson8.shop.shelf;

import Lesson8.shop.position.impl.abst.AbstractPosition;

public interface Shelf  {
   boolean putApple(AbstractPosition position);
   AbstractPosition getApple(int index);
  boolean checkAvailable(int index);
}
