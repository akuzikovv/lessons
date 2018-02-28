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
    public boolean put(AbstractPosition position) {
        if (sizeAppleShelf<=0){
            arrayApple[sizeAppleShelf]= null;
        }
        else {
            arrayApple[--sizeAppleShelf] = (Apple) position;
        }return true;
    }

    @Override
    public AbstractPosition get() {
        if (sizeAppleShelf>=arrayApple.length){
            arrayApple[sizeAppleShelf]= null;
        }
        else {
            sizeAppleShelf++;
        }return arrayApple[sizeAppleShelf];
    }

    @Override
    public boolean checkAvailable(){
        if (sizeAppleShelf<arrayApple.length) return true;
        else return false;
    }
}

