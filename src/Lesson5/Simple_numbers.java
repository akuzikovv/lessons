package Lesson5;

import java.util.Scanner;

public class Simple_numbers {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int x = input.nextInt();
        isSimple(x);
        System.out.println(isSimple(x));
    }

    public static boolean isSimple(int x){
        if (x==2 ||x==1){
            return true;
        }
        if (x%2==0){
            return false;
        }
        for (int i=2;i<x;i++){
            if ((x%i==0) && (x != i)){
                return false;
            }
        }
        return true;
    }
}
