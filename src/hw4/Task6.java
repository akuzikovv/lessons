package hw4;

public class Task6 extends Main{
/*Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5].
Вывести массив на экран. Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов.
Если таких строк несколько, то вывести индекс первой встретившейся из них.*/
public static int i, j, a;
    public static int mas[][] = new int[7][4];

    public static void main() {
        System.out.print("Массив случайных чисел от -5 до 5 : " + '\n');
        counting();
        Main.menu();
    }

    public static int generateRandom() {
        int random = (int) (Math.random() * 11) -5;
        return random;
    }

    private static void counting() {
        for (i = 0; i <= 6; i++) {
            for (j = 0; j <= 3; j++) {
                a = generateRandom();
                mas[i][j] = a;
            }
        }
        for (i = 0; i <=6; i++) {
            for (j = 0; j <= 3; j++)
                System.out.print(mas[i][j] + " ");
            System.out.print("\n");
        }
    }


}
