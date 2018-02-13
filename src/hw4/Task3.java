package hw4;

public class Task3 extends Main {
    /*
    В городе N проезд в трамвае осуществляется по бумажным отрывным билетам.
    Каждую неделю трамвайное депо заказывает в местной типографии рулон билетов с номерами от 000001 до 999999.
    «Счастливым» считается билетик у которого сумма первых трёх цифр номера равна сумме последних трёх цифр, как, например,
    в билетах с номерами 003102 или 567576. Трамвайное депо решило подарить сувенир обладателю каждого счастливого билета
    и теперь раздумывает, как много сувениров потребуется.
    С помощью программы подсчитайте сколько счастливых билетов в одном рулоне?
    */
    public static int q, w, e, r, t, y;
    public static int sum0 = 0;
    public static int mas[] = new int[10];

    public static void main() {
        counting();
    }

    public static void counting() {
        for (q = 0; q <= 9; q++) {
            for (w = 0; w <= 9; w++) {
                for (e = 0; e <= 9; e++) {
                    for (r = 0; r <= 9; r++) {
                        for (t = 0; t <= 9; t++) {
                            for (y = 0; y <= 9; y++) {
                                mas[q] = q;
                                mas[w] = w;
                                mas[e] = e;
                                mas[r] = r;
                                mas[t] = t;
                                mas[y] = y;
                                int sum1 = mas[q] + mas[w] + mas[e];
                                int sum2 = mas[r] + mas[t] + mas[y];
                                if (sum1 == sum2) {
                                    sum0++;
                                }
                                /////////////////////  ВЫВОД БИЛЕТОВ В КОНСОЛЬ //////////////////////
//                                System.out.print(mas[r]);
//                                System.out.print(mas[t]);
//                                System.out.print(mas[y]);
//                                System.out.println("");
//                                System.out.print(mas[q]);
//                                System.out.print(mas[w]);
//                                System.out.print(mas[e]);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(sum0 + " счастливых билетов.");
    }
}




