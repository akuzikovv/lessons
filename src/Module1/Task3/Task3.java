package Module1.Task3;

import Module1.Main;

public class Task3 {
    public static int i, j, a, index,n3;
    public static int mas[] = new int[20];
    public static int qty = 0;

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
        index=20;
        j=0;
        while (j!=19){
            for (i = j; i <mas.length-1; i++) {
                    if (mas[j]==mas[i]){
                        index--;
            }}
            j++;
        }
        System.out.println('\n' + "Количество различных элементов массива " + index);
        /// В этом методе дичь.
    }


}
