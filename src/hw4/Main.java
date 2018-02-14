package hw4;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        System.out.println("");
        String n0 = '\n'+"Выберите задание, которое хотите выполнить: "+ '\n';
        String n1 = "1- Задача 1"+ '\n';
        String n2 = "2- Задача 2 'Последовательность Фибоначчи'"+ '\n';
        String n3 = "3- Задача 3"+ '\n';
        String n4 = "4- Задача 4"+ '\n';
        String n5 = "5- Задача 5"+ '\n';
        String n6 = "6- Задача 6"+ '\n';
        String nq = "9 - Выход.";
        System.out.println(n0 + n1 + n2 + n3 + n4 + n5 + n6 + nq);
        int i;
        i = input.nextInt();
        switch (i) {
            case 1:
                System.out.println("Задача 1: ");
                Task1.main();
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
                Task4.main();
                break;
            case 9:
                System.out.println("До встречи!");
                break;

            default: System.out.println("Неверный ввод"+ '\n');
            menu();
                break;
        }
    }



}
