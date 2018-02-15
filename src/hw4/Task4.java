package hw4;
public class Task4 extends Main {
/*Электронные часы показывают время в формате от 00:00 до 23:59.
Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация для той,
что справа от двоеточия (например, 02:20, 11:11 или 15:51).*/
    public static int q, w, e, r;
    public static int sum0 = 0;
    public static int mas[] = new int[60];

    public static void main() {
        counting();
        Main.menu();
    }

    private static void counting() {
        for (q = 0; q <= 23; q++) {
            for (w = 0; w == 0; w++) {
                for (e = 0; e < 6; e++) {
                    for (r = 0; r < 10; r++) {
                        mas[q] = q;
                        mas[w] = w;
                        mas[e] = e;
                        mas[r] = r;
//////////////////////////////////////// ВЫВОД В КОНСОЛЬ ВСЕГО ТАЙМИНГА  /////////////////
//                        if (q <= 9) {
//                            System.out.print(mas[w]);
//                            System.out.print(mas[q]);
//                        } else System.out.print(mas[q]);
//                        System.out.print(mas[e]);
//                        System.out.print(mas[r]);
//                        System.out.println("");
//////////////////////////////////////////////////////////////////////////
                        if ((mas[q] % 10 == mas[e] && mas[q] / 10 == mas[r])) {
                            sum0++;
                            if (q <= 9) {///отображение ведущего нуля до 10 часов
                                System.out.print(mas[w]);
                                System.out.print(mas[q]);
                            } else System.out.print(mas[q]);
                            System.out.print(":");
                            System.out.print(mas[e]);
                            System.out.print(mas[r]);
                            System.out.println("");
                        }
                    }
                }
            }
        }
        System.out.println("Количество совпадений: " + sum0);
    }
}


