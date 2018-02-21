package Lesson7_Shop;

import Lesson7_Shop.bag.Bag;
import Lesson7_Shop.bag.BagImpl;
import Lesson7_Shop.manager.ShopManager;
import Lesson7_Shop.position.implementation.Apple;
import Lesson7_Shop.position.implementation.Pen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bag bag = new BagImpl();

        while (true){
            System.out.println("Shito delaem desy?");
            System.out.println("1: go za pokupkami");
            System.out.println("2: go na kassu");
            switch (scanner.nextInt()){
                case  1:
                    doPokupki(bag);
                    break;
                case  2:

                    goNaCassu(bag);
                    break;
                default:
                    System.out.println("dich. ti vtiraesh mne dich");
            }
        }


    }
    private static void doPokupki(Bag bag){
        Scanner scanner = new Scanner(System.in);

        while (bag.getNotUsedSize() !=0){

            System.out.println("1: Pen");
            System.out.println("2: Apple ");
            System.out.println("3: dumay");
            switch (scanner.nextInt()){
                case 1 : bag.add(new Pen(10,"karandashik"));
                break;
                case 2: bag.add(new Apple(25,"yablochko"));
                break;
                case 3: return;
                default:
                    System.out.println("dich. ti vtiraesh mne dich");

            }
        }
        System.out.println("dich. ti vtiraesh mne dich");
    }
     private static void goNaCassu(Bag bag){
         ShopManager babaGala = new ShopManager();
         try {
             babaGala.sum(bag);
             System.out.println("oi mama, hera tac dorogo");
             System.exit(0);
         }catch (InterruptedException e){
             System.out.println("SCORUY!!!BABA GALA ");
         }

     }
}
