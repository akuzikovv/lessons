package hw4;

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
        while (qty != 9) {
            n3 = 0;
            for (i = 0; i <= 9; i++) {
                for (j = 1; j <= 10; j++) {
                    int n1 = mas[i];
                    int n2 = mas[j];
                    if (n2 == 0) {
                        System.out.print(mas[i] + "." + '\n');
                        fillingMassivAfterSorting();
                        qty++;
                        zamena();
                    }
                    if (mas[i] > mas[j]) {
                        mas[i] = n2;
                        mas[j] = n1;
                        System.out.print(mas[i] + ",");
                        mas[i] = n1;
                        mas[n3] = n2;
                        i++;
                        n3++;
                    } else {
                        System.out.print(mas[i] + ",");
                        mas[i] = n2;
                        mas[n3] = n1;
                        i++;
                        n3++;
                    }
                }
            }
        }

    }
}
