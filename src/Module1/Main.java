package Module1;

import Module1.Task2.Task2;
import Module1.Task3.Task3;
import hw4.*;

import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.println("");
        String n0 = '\n' + "Выберите задание, которое хотите выполнить: " + '\n';
        String n1 = "1- Задача 1 ''" + '\n';
        String n2 = "2- Задача 2 'Компьютер загадывает число от 1 до n. У пользователя k попыток отгадать. После\n" +
                "каждой неудачной попытки компьютер сообщает меньше или больше загаданное число. В\n" +
                "конце игры текст с результатом (или “Вы угадали”, или “Попытки закончились”).'" + '\n';
        String n3 = "3- Задача 3 'Найти количество различных элементов массива. Пример: для 1 4 5 1 1 3 ответ 4.'" + '\n';
        String n4 = "4- Задача 4 ''" + '\n';
        String n5 = "5- Задача 5 ''" + '\n';
        String nq = "6 - Выход.";
        System.out.println(n0 + n1 + n2 + n3 + n4 + n5 + nq);
        int i;
        i = input.nextInt();
        switch (i) {
            case 1:
                System.out.println("Задача 1: ");

                break;
            case 2:
                System.out.println("Задача 2 :");
                Task2.main();
                break;
            case 3:
                System.out.println("Задача 3 :");
                Task3.main();
                break;
            case 4:
                System.out.println("Задача 4: ");

                break;
            case 5:
                System.out.println("Задача 5: ");

                break;
            case 6:
                System.out.println("До встречи!");
                break;

            default:
                System.out.println("Неверный ввод" + '\n');
                menu();
                break;
        }
    }


}
