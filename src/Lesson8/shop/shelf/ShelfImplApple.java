package Lesson8.shop.shelf;

import Lesson8.shop.position.Position;
import Lesson8.shop.position.impl.Apple;
import Lesson8.shop.position.impl.abst.AbstractPosition;

public abstract class ShelfImplApple  implements Shelf {

    private int sizeAppleShelf;
    private Apple arrayApple[];

    public ShelfImplApple(Apple[] arrayApple){
        this.sizeAppleShelf = arrayApple.length;
        this.arrayApple = arrayApple;
    }


    @Override
    public boolean putApple(AbstractPosition position) {
        if (sizeAppleShelf>arrayApple.length){
            arrayApple[sizeAppleShelf]= null;
        }
        else
        sizeAppleShelf++;
        //проверка чтоб не больше размера массива
        arrayApple[sizeAppleShelf]= (Apple) position;
        return true;
    }

    @Override
    public AbstractPosition getApple(int index) {
        if (sizeAppleShelf<=0){
            arrayApple[sizeAppleShelf]= null;
        }
        else
            sizeAppleShelf--;
        //проверка чтоб не меньше размера массива
        return arrayApple[sizeAppleShelf];
    }

    @Override
    public boolean checkAppleAvailable(int index) {
        if (sizeAppleShelf>0)return true;
        else return false;
    }
}
