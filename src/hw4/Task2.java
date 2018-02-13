package hw4;
public class Task2 extends Main {
    /*
    Выведите на экран первые 11 членов последовательности Фибоначчи.
     Напоминаем, что первый и второй члены последовательности равны единицам,
      а каждый следующий — сумме двух предыдущих.
     */

    public static int n3;
    public static int i = 0;

    public static void main() {
        System.out.println("Последовательность Фибоначчи: ");
        int n1 = 0;
        int n2 = 1;
        sum(n1, n2);
    }

    public static void sum(int n1, int n2) {
        while (i != 11) {
            if (n2 != 0) {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
                System.out.print(n3+",");
                i++;
                sum(n1, n2);
            }
        }
    }
}
