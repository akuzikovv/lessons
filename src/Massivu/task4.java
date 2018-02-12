package Massivu;

public class task4 {

    public static int[][] m = {{42, 3, 12}, {12, 8, 7}, {13, 1, 5}};
//public static int[][] m = {{4, 4, 4}, {4, 4, 4}, {4, 4, 4}};
    public static void main(String[] args) {
//        System.out.println(factorial(4));
        sumLine(m);
    }

    public static void task4() {
//        int i = 1;
//        int result = 1;
//        while (i<=n){
//            result
    }

    /////////////////// РЕКУРСИЯ ///////////////
    public static int factorial(int n) {
        return factotialLocal(n, 1);
    }

    private static int factotialLocal(int n, int result) {
        if (n <= 1) {
            return result;
        } else {
            result *= n;
            return factotialLocal(n - 1, result);
        }
    }
////////////////////////МАССИВЫ  /////////////////////////////////
    public static boolean magic(int[][] m) {
//     for (int[] n :m)
        return true;
    }

    public static void sumLine(int[][] m) {
        int sum = 0;
        int v = 0;
        int g = 0;
        int length = m.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                v += m[i][j];
                g += m[j][i];
            }
            if (sum == 0) {
                sum = v;
            }
            if (v != g && v != sum) {
                System.out.println("fail");
            }else System.out.println("true");
        }


//
//         for (int i = 0; i< length; i++){
//             sum += m[0][i];
//         }return sum;
    }


}
