import java.util.Scanner;

public class taskZ extends Menu {
    public static int i = 1;

    public static void main() {
        // prog — число созданное программой
        // user — число введённое пользователем

        int prog, user;
        // Генерируем случайное целое число от 1 до 10
        prog = (int) (Math.random() * 21) - 10;
        System.out.println("Я загадал число от 1 до 10, отгадайте его.");
        System.out.print("Вводите ваше число: ");
        Scanner input = new Scanner(System.in);
        // Проверяем, есть ли в потоке ввода целое число
        if (input.hasNextInt()) {
            do {
                // Читаем с потока ввода целое число
                user = input.nextInt();
                if (user == prog) {
                    System.out.println("Вы угадали! poputok:  " + i);
                } else {
                    i++;
                    // Проверяем, входит ли число в отрезок [1;10]
                    if (user >= -10 && user <= 10 && user != 0) {
                        System.out.print("Вы не угадали! ");
                        // Если число загаданное программой меньше...
                        if (prog < user) {
                            System.out.println("Моё число меньше.  " + prog);
                            if (prog > 0) {
                                System.out.println("Моё число больше 0.  ");
                            } else if (prog < 0) {
                                System.out.println("Моё число меньше 0.  ");
                            }
                        } else {
                            System.out.println("Моё число больше.   " + prog);
                        }
                    } else {
                        System.out.println("Ваше число вообще не из нужного отрезка!  " + prog);
                    }
                }
            } while (user != prog);
        } else {
            System.out.println("Ошибка. Вы не ввели целое число!");
        }
        Exit.main();

    }
}