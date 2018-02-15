package hw4;

public class Task5 extends Main {
    /*Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99].
    Вывести массив на экран.*/
    public static int i, j, a;
    public static int mas[][] = new int[8][5];

    public static void main() {
        System.out.print("Массив случайных чисел от 10 до 99 : " + '\n');
        counting();
        Main.menu();
    }

    public static int generateRandom() {
        int random = (int) (Math.random() * 90 + 10);
        return random;
    }

    private static void counting() {
        for (i = 0; i <= 7; i++) {
            for (j = 0; j <= 4; j++) {
                a = generateRandom();
                mas[i][j] = a;
            }
        }
        for (i = 0; i < 8; i++) {
            for (j = 0; j < 5; j++)
                System.out.print(mas[i][j] + " ");
            System.out.print("\n");
        }
    }
}
