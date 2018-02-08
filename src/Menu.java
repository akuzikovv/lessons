import java.util.Scanner;

public class Menu {
    public static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        menu();
    }

    public static void menu() {
        String n0 = "Выберите функцию, которую хотите выполнить: ";
        String n1 = "1.Калькулятор";
        String n2 = "2.Угадать число от 1 до 10";
        String n3 = "3.Подсчет суммы цифр натурального двузначного числа n";
        String nq = "4 - Выход.";
        System.out.println(n0 + '\n' + n1 + '\n' + n2 + '\n' + n3 + '\n' + nq);
        int a = Integer.parseInt(input.nextLine());
        if (a == 2) task1.main();
        if (a == 3) task2.main();
        if (a == 4) System.out.println("До встречи!" + '\n');
        if (a >= 5 || a <= 1) {
            System.out.println("Выберите один из вариантов" + '\n');
            menu();
        }

    }
}
