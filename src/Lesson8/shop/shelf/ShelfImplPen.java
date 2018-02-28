package Lesson8.shop.shelf;

import Lesson8.shop.bag.Bag;
import Lesson8.shop.bag.BagImpl;
import Lesson8.shop.position.Position;
import Lesson8.shop.position.impl.Pen;
import Lesson8.shop.position.impl.abst.AbstractPosition;

public  class ShelfImplPen implements Shelf {

    private int sizePenShelf;
    private Pen arrayPen[] ;

    public ShelfImplPen(Pen[] arrayPen){
        this.sizePenShelf = arrayPen.length;
        this.arrayPen = arrayPen;
    }



    @Override
    public boolean put(AbstractPosition position) {
        if (sizePenShelf<=0){
            arrayPen[sizePenShelf]= null;
        }
        else {
            arrayPen[--sizePenShelf] = (Pen) position;
        }return true;
    }

    @Override
    public AbstractPosition get() {
        if (sizePenShelf>=arrayPen.length){
            arrayPen[sizePenShelf]= null;
        }
        sizePenShelf++;
        return arrayPen[sizePenShelf];
    }

    @Override
    public boolean checkAvailable() {
        if (sizePenShelf<arrayPen.length)return true;
        else return false;
    }



}
