package hw4;

public class Task1 extends Main {
/*Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр
(заранее не известно сколько цифр будет в числе).*/
    public static void main() {
        System.out.println("Введите натуральное число");
        counting();
        Main.menu();
    }

    public static void counting() {
        int sum = 0;
        int i = input.nextInt();
        while (i!=0){
            sum +=i%10;
            i/=10;
        }
        System.out.println("Сумма чисел = "+ sum);
    }
}
