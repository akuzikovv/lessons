package hw4;

public class Task6 extends Main {
    /*Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5].
    Вывести массив на экран. Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов.
    Если таких строк несколько, то вывести индекс первой встретившейся из них.*/
    public static int i, j, a, max;
    public static int mas[][] = new int[7][4];
    public static int result[] = new int[mas.length];

    public static void main() {
        System.out.print("Массив случайных чисел от -5 до 5 : " + '\n');
        fillingMassiv();
        countingIndex();
        Main.menu();
    }

    public static int generateRandom() {
        int random = (int) (Math.random() * 11) - 5;
        return random;
    }

    public static void fillingMassiv() {
        for (i = 0; i <= 6; i++) {
            for (j = 0; j <= 3; j++) {
                a = generateRandom();
                mas[i][j] = a;
            }
        }
        for (i = 0; i <= 6; i++) {
            for (j = 0; j <= 3; j++)
                System.out.print(mas[i][j] + " ");
            System.out.print("\n");
        }
    }

    public static void countingIndex() {
        int index = 0;
        int proizv = 1;
        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j <= 3; j++) {
                proizv *= Math.abs(mas[i][j]);
            }
            result[i] = proizv;
            System.out.println("Строка [" + i + "]  Произведение элементов: " + proizv);
            proizv = 1;
        }
        max = result[0];
        for (int i = 0; i < result.length; i++) {
            if (max < result[i]) {
                max = result[i];
                index = i;
            }
        }
        System.out.println();
        System.out.println("Индекс строки с наибольшим по модулю произведением элементов: " + index);
    }


}
