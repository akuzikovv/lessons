package Lesson8.shop.shelf;

import Lesson8.shop.position.impl.Pen;
import Lesson8.shop.position.impl.abst.AbstractPosition;

public abstract class ShelfImplPen implements Shelf {

    private int sizePenShelf;
    private Pen arrayPen[];

    public ShelfImplPen(Pen[] arrayPen){
        this.sizePenShelf = arrayPen.length;
        this.arrayPen = arrayPen;
    }


    @Override
    public boolean putApple(AbstractPosition position) {
        if (sizePenShelf>arrayPen.length){
            arrayPen[sizePenShelf]= null;
        }
        else
        sizePenShelf++;
        arrayPen[sizePenShelf]= (Pen) position;
        return true;
    }

    @Override
    public AbstractPosition getPen(int index) {
        if (sizePenShelf<=0){
            arrayPen[sizePenShelf]= null;
        }
        else
        sizePenShelf--;
        return arrayPen[sizePenShelf];
    }

    @Override
    public boolean checkPenAvailable(int index) {
        if (sizePenShelf>0)return true;
        else return false;
    }
}
