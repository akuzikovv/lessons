package Lesson8.shop;

import Lesson8.shop.bag.ATBPacket;
import Lesson8.shop.bag.Bag;
import Lesson8.shop.bag.BagImpl;
import Lesson8.shop.manager.ShopManager;
import Lesson8.shop.position.impl.Apple;
import Lesson8.shop.position.impl.Pen;
import Lesson8.shop.shelf.ShelfImplApple;
import Lesson8.shop.shelf.ShelfImplPen;

import java.util.Scanner;


public class Main {
    public static ShelfImplPen shelfImplPen;
    public static ShelfImplApple shelfImplApple;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bag bag;
        System.out.println("S chem poidem vasia?");
        System.out.println("1: ATB power");
        System.out.println("2: Standart edition Galia");
        switch (scanner.nextInt()) {
            case 1:
                bag = new ATBPacket();
                break;
            case 2:
                bag = new BagImpl();
                break;
            default:
                System.out.println("sho zirkaech? pognali s rukzacom");
                bag = new BagImpl();

        }
        while (true) {
            System.out.println("Shito delaem desy?");
            System.out.println("1: go za pokupkami person-san");
            System.out.println("2: go na cassu");
            switch (scanner.nextInt()) {
                case 1:
                    doPokupki(bag);
                    break;
                case 2:
                    goNaCassu(bag);
                    break;
                default:
                    System.out.println("dich. ti vtiraech mne dich");
            }
        }
    }


    private static void doPokupki(Bag bag) {
        /////////////  ЗАПОЛНЯЕМ ПОЛКУ РУЧКАМИ ///////////////
        shelfImplPen = new ShelfImplPen(new Pen[10]);
        for (int i = 1; i < 11; i++) {
            shelfImplPen.put(new Pen(15 + i, "Pen" + i));
        }
        /////////////  ЗАПОЛНЯЕМ ПОЛКУ ЯБЛОКАМИ ///////////////
        shelfImplApple = new ShelfImplApple(new Apple[10]);
        for (int i = 1; i < 11; i++) {
            shelfImplApple.put(new Apple(25 + i, "Iablochko" + i));
        }
        ///////////////////////////////////////////////////////////////
        Scanner scanner = new Scanner(System.in);
        while (bag.getNotUsedSize() != 0) {
            System.out.println("1:Pen");
            System.out.println("2:Apple");
            System.out.println("3:dumay");
            switch (scanner.nextInt()) {
                case 1:
                    if (shelfImplPen.checkAvailable()) {
                        bag.add(shelfImplPen.get());
                    }
                    break;
                case 2:
                    if (shelfImplApple.checkAvailable()) {
                        bag.add(shelfImplApple.get());
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("dich. ti vtiraech mne dich");
            }
        }
        System.out.println("Galia, I te sho grushick");
    }

    private static void goNaCassu(Bag bag) {
        ShopManager babaGala = new ShopManager();
        try {
            babaGala.sum(bag);
            System.out.println("oi mama, hera tac dorogo");
            System.exit(0);
        } catch (InterruptedException e) {
            System.out.println("SCORUYY!!BABA GALA ");
        }
    }

}
