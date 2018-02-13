package Massivu;

public class Tickets {
    public static int q, w, e, r, t, y;
    public static int sum0 = 0;

    public static void main(String[] args) {
        int mas[]= new int[10];
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
//                                int sum1 = mas[q][0][0][0][0][0]+mas[0][w][0][0][0][0]+mas[0][0][e][0][0][0];
//                                int sum2 = mas[0][0][0][r][0][0]+mas[0][0][0][0][t][0]+mas[0][0][0][0][0][y];
//                                if (sum1==sum2) {
//                                    sum0++;
//                                    ///////////////////  ВЫВОД БИЛЕТОВ В КОНСОЛЬ //////////////////////
                                System.out.print(mas[r]);
                                System.out.print(mas[t]);
                                System.out.print(mas[y]);
                                System.out.println("");
                                System.out.print(mas[q]);
                                System.out.print(mas[w]);
                                System.out.print(mas[e]);
                                }
                            }
                        }
                    }
                }
            }
        }
//        System.out.println( sum0 + " счастливых билетов.");


}
