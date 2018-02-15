package hw4;

public class Task7 extends Main {
/*74. Сортировка обменами. Дана последовательность чисел а 1 , а 2 , ..., а n .
Требуется переставить числа в порядке возрастания. Для этого сравниваются два соседних числа аi  и a i+1 .
Если а i  больше а i+1 , то делается перестановка.
Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количество перестановок.*/
public static int i, j, a, max, index;
    public static int proizv = 1;
    public static int mas[] = new int[100];
    public static int result[] = new int[mas.length];

    public static void main() {
        System.out.print("Массив случайных чисел от 1 до 99 : " + '\n');
        fillingMassiv();
        displayMassiv();
//        countingIndex();
        Main.menu();
    }

    public static int generateRandom() {
        int random = (int) (Math.random() * 99 + 1);
        return random;
    }

    public static void fillingMassiv() {
        for (i = 0; i <= 49; i++) {

                a = generateRandom();
                mas[i] = a;

        }
    }

    public static void displayMassiv() {
        for (i = 0; i <=49; i++) {

                System.out.print(mas[i] + ",");
//            System.out.print("\n");
        }
    }

}
