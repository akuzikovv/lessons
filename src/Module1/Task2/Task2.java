package Module1.Task2;

import Module1.Main;

import java.util.Scanner;

public class Task2 {
    public static int qty = 4;
    public static int user, random;
    public static Scanner input = new Scanner(System.in);

    public static void main() {
        random = (int) (Math.random() * 20 + 1);
        System.out.println("Загаданное число от 1 до 20. У Вас 4 попытки.");
        compareIfTrue();
        Main.menu();
    }

    public static void compareIfTrue() {
        user = input.nextInt();
        if (user == random) {
            System.out.println("Поздравляю,вы угадали число!");
        } else if (qty != 1) {
            compareIfValid();
        } else System.out.println("Вы не угадали число. Количество попыток исчерпано. Верное число: " + random + '\n');
    }

    public static void compareIfValid() {
        if (user < 1 || user > 20) {
            qty--;
            System.out.println("Ваше число за пределами загаданного числа. Осталось попыток: " + qty);
            compareIfTrue();
        } else if (user != random) {
            qty--;
            if (user > random) {
                System.out.println("Загаданное число меньше. Осталось попыток: " + qty);
            }
            if (user < random) {
                System.out.println("Загаданное число больше.   Осталось попыток: " + qty);
            }
            compareIfTrue();
        }
    }
}
