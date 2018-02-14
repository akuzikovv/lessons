package Lesson5;

import java.util.Scanner;

public class Delitel {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int first = input.nextInt();
        int second = input.nextInt();
        getCommonDelitel1(first,second);
        getCommonDelitel2(first,second);

    }

    public static int getCommonDelitel1(int first, int second) {
        int counter = 0;
        if (first > second) {
            for (int i = first; i > 0; i--) {
                if (first % i == second % i) {
                    counter = i;
                }
            }
        } else {
            for (int i = second; i > 0; i--) {
                if (first % i == second % i) {
                    counter = i;
                }
            }
        }return counter;
    }

    public static int getCommonDelitel2(int first, int second) {
        int counter = 0;
        if ( first==second){return first;}
        if (first<second){counter=first;}
        else {counter=second;}
        for (int i=counter;i>0;i--){
            if( (first%i==0)&&(second%i==0)){
                return i;
            }
        }return 0;
    }
    }

