import java.util.Scanner;

public class task3 extends Menu {
    public static void main() {
//        Cat cat = new Cat();
//        cat.setName("Kot");
//        cat.meow();
//
//        System.out.println(cat.getName());
//
//        Cat testCat = new Cat();
//        testCat.setName("Kot2");
//
//        System.out.println(cat.equals(testCat));

        /////////////////////  2 leson/////// a
//        int a =5;
//        int b = 5;
//        System.out.println(a++);
//        System.out.println(++b);
//
//        System.out.println(a);
//        System.out.println(b);

        ///////////////// b
//        System.out.println(-500>>3);
//        System.out.println(500>>3);
//        System.out.println(Integer.toBinaryString(127));

        ////////////////////////////////////// задача ///

//        Scanner in = new Scanner(System.in);
//      String result =  ( in.nextInt()%2 == 0 ) ? "четное" : " нечетное";
////        int a  = parseInt(in);
//        System.out.println(result);
//        if (a%2 ==0){
//            System.out.println("четное");
//        }
//        if (a%2 >0){
//            System.out.println("нечетное");
//        }

        ///////////////////// задача 2 
        System.out.println("Введите первое число");
        Scanner in = new Scanner(System.in);
        int numb1 = in.nextInt();
        System.out.println("Введите второе число");
        int numb2 = in.nextInt();
        if (numb1==numb2){
            System.out.println("Первое число = Второму числу"+'\n');
        }
        if (numb1 > numb2){
            System.out.println("Первое число > Второго числа"+'\n');
        }
        else {
            System.out.println("Первое число < Второго числа"+'\n');
        }
        Menu.menu();

    }
}
