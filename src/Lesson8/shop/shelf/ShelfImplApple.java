package Lesson8.shop.shelf;

import Lesson8.shop.position.Position;
import Lesson8.shop.position.impl.Apple;
import Lesson8.shop.position.impl.abst.AbstractPosition;

public class ShelfImplApple  implements Shelf {

    private int sizeAppleShelf;
    private Apple arrayApple[];

    public ShelfImplApple(Apple[] arrayApple){
        this.sizeAppleShelf = arrayApple.length;
        this.arrayApple = arrayApple;
    }


    @Override
    public boolean putApple(AbstractPosition position) {
        sizeAppleShelf++;
        arrayApple[sizeAppleShelf]= (Apple) position;
        return true;
    }

    @Override
    public AbstractPosition getApple(int index) {
        sizeAppleShelf--;
        return arrayApple[sizeAppleShelf];
    }

    @Override
    public boolean checkAvailable(int index) {
        if (sizeAppleShelf>0)return true;
        else return false;
    }
}
