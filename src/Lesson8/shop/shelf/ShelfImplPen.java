package Lesson8.shop.shelf;

import Lesson8.shop.position.impl.Pen;
import Lesson8.shop.position.impl.abst.AbstractPosition;

public class ShelfImplPen implements Shelf {

    private int sizePenShelf;
    private Pen arrayPen[];

    public ShelfImplPen(Pen[] arrayPen){
        this.sizePenShelf = arrayPen.length;
        this.arrayPen = arrayPen;
    }


    @Override
    public boolean putApple(AbstractPosition position) {
        sizePenShelf++;
        arrayPen[sizePenShelf]= (Pen) position;
        return true;
    }

    @Override
    public AbstractPosition getApple(int index) {
        sizePenShelf--;
        return arrayPen[sizePenShelf];
    }

    @Override
    public boolean checkAvailable(int index) {
        if (sizePenShelf>0)return true;
        else return false;
    }
}
