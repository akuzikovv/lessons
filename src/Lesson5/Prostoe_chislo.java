package Lesson5;

import java.util.Scanner;

public class Prostoe_chislo {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int x = input.nextInt();
//        int second = input.nextInt();
        isSimple(x);
        System.out.println(isSimple(x));
    }

    public static boolean isSimple(int x){
        if (x==2){
            return true;
        }
        for (int i=3;i<x;i+=2){
            if ((x%i==0) && (x != i)){
                return false;
            }
        }
            return true;
    }

}
