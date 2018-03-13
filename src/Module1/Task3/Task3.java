package Module1.Task3;

import Module1.Main;

public class Task3 {
    public static int i, j, a, index,qty,indexdouble;
    public static int mas[] = new int[20];

    public static void main() {
        System.out.print("Массив случайных чисел от 1 до 20 : " + '\n');
        fillingMassiv();
        displayMassiv();
        countingIndex();
        Main.menu();
    }

    public static int generateRandom() {
        int random = (int) (Math.random() * 20 + 1) ;
        return random;
    }

    public static void fillingMassiv() {
        for (i = 0; i < mas.length; i++) {
                a = generateRandom();
                mas[i]= a;
        }
    }

    public static void displayMassiv() {
        for (i = 0; i < mas.length; i++) {
                System.out.print(mas[i] + ", ");
        }
    }

    public static void countingIndex() {
        qty = 0;
        index = 0;
        indexdouble = 0;
        for ( i = 0; i < mas.length; i++) {
            index++;
            for ( j = i + 1; j < mas.length; j++) {
                if (mas[j] == mas[i]) {
                    indexdouble++;
                }
            }
        }
        qty = index - indexdouble+1;
        System.out.println('\n' + "Количество различных элементов массива " + qty);
    }
}
