import java.util.Scanner;
//Home work 2 , Kuzikov A.
public class task2 extends Menu{
    public static Scanner input;

    public static void main() {
        input = new Scanner(System.in);
        vivod();
    }

    public static void vivod() {
        System.out.println("Введите натуральное двузначное число от 10 до 99 :");
        int n = Integer.parseInt(input.nextLine());
        if (n < 10 || n > 99) {
            System.out.println("Вы ввели неверное число.Введите натуральное двузначное число от 10 до 99 :");
            n = Integer.parseInt(input.nextLine());
        }
        int n1 = n % 10; //находим первое число делением  по модулю на 10
        int n2 = (n / 10) % 10; //  находим второе число
        int n3 = n1 + n2;
        System.out.println(n3);
        menu();
    }

    public static void menu() {
        System.out.println("Посчитать еще раз? (Введите '1' если да, '2' чтобы завершить)");
        int v = Integer.parseInt(input.nextLine());
        if (v == 1)  vivod();
        if (v == 2) Menu.menu();
    }

}

