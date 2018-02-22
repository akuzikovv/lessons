package hw4;

import hw1.Exit;

public class Task7 extends Main {
    /*74. Сортировка обменами. Дана последовательность чисел а 1 , а 2 , ..., а n .
    Требуется переставить числа в порядке возрастания. Для этого сравниваются два соседних числа аi  и a i+1 .
    Если а i  больше а i+1 , то делается перестановка.
    Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
    Составить алгоритм сортировки, подсчитывая при этом количество перестановок.*/
    public static int n3, i, j, a;
    public static int qty = 0;
    public static int mas[] = new int[100];

    public static void main() {
        System.out.print("Массив случайных чисел от 1 до 99 : " + '\n');
        fillingRandomMassiv();
        zamena();
        Main.menu();
    }

    public static int generateRandom() {
        int random = (int) (Math.random() * 99 + 1);
        return random;
    }

    public static void fillingRandomMassiv() {
        for (i = 0; i <= 9; i++) {
            mas[i] = generateRandom();
            System.out.print(mas[i] + ",");
        }
        System.out.println();
        System.out.println("Сортировка:");
    }

    public static void fillingMassivAfterSorting() {
        for (n3 = 0; n3 <= 9; n3++) {
            for (i = n3; i <= n3; i++) {
                mas[i] = mas[n3];
            }
        }
    }

    public static void zamena() {
            n3 = 0;
            for (i = 0; i <= 9; i++) {
                for (j = 1; j <= 10; j++) {
                    int num1 = mas[i];
                    int num2 = mas[j];
                    if (num2 == 0) {
                        if (qty==9){
                            System.out.print(mas[i] + "." + '\n');
                            System.out.println("Stop" + '\n');
                            Main.menu();
                        }else {
                        System.out.print(mas[i] + "." + '\n');
                        fillingMassivAfterSorting();
                        qty=0;//для остановки
                        zamena();
                    }}
                    if (mas[i] > mas[j]) {
                        mas[i] = num2;
                        mas[j] = num1;
                        System.out.print(mas[i] + ",");
                        mas[i] = num1;
                        mas[n3] = num2;
                        i++;
                        n3++;
                        qty = 0;

                    } else {
                        System.out.print(mas[i] + ",");
                        mas[i] = num2;
                        mas[n3] = num1;
                        i++;
                        n3++;
qty++;
                    }
                }
            }

    }
}
