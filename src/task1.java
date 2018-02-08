import java.util.Scanner;
//Home work 2 , Kuzikov A.
public class task1 extends Menu {
    public static int random;
    public static Scanner input;
    public static int a;
    public static int qty = 3; // количество попыток

    public static void main() {
        random = (int) (Math.random() * 10 + 1);
        input = new Scanner(System.in);
        System.out.println("Введите число от 1 до 10. У Вас 3 попытки.");
        compareIfTrue();
        Exit.main();
    }

    public static void compareIfTrue() {
        a = Integer.parseInt(input.nextLine());
        if (a == random) { //если введенное число совпадает с сгенерированным
            System.out.println("Поздравляю,вы угадали число!");
        } else if (qty != 1) {
            compareIfValid();
        } // если еще есть попытки, то выполняем проверку
        else System.out.println("Вы не угадали число. Верное число: " + random);
    }

    public static void compareIfValid() {
        if (a < 1 || a > 10) { //проверка на валидность введенных чисел
            qty = qty - 1; // уменьшаем количество попыток
            System.out.println("Введенное число должно быть от 1 до 10. Попробуйте еще раз.Осталось попыток: " + qty);
            compareIfTrue();
        } else if (a != random) { // если введенное число не равно сгенерированному
            qty = qty - 1; // уменьшаем количество попыток
            System.out.println("Вы не угадали число.Осталось попыток: " + qty);
            compareIfTrue();
        }
    }


}
