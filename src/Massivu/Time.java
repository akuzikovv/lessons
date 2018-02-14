package Massivu;

public class Time {


    public static int q, w, e, r, sum1, sum2;
    public static int sum0 = 0;
    //    public static int mas1[] = new int[24];
    public static int mas[] = new int[100];

    public static void main(String[] args) {
        counting();

    }

    private static void counting() {

        for (q = 00; q <= 23; q++) {
            for (w = 0; w == 0; w++) {
                mas[q] = q;
                mas[w] = w;
                if (q <= 9) {
                    System.out.print(mas[w]);
                    System.out.print(mas[q]);
                } else System.out.print(mas[q]);
                System.out.println("");
            }
        }
    }
}