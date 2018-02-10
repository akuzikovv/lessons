public class task4 {

    public static void task4() {
//        int i = 1;
//        int result = 1;
//        while (i<=n){
//            result
    }

    /////////////////// РЕКУРСИЯ ///////////////
    public static  int factorial(int n){
        return factotialLocal(n,1);
    }

   private static int factotialLocal(int n, int result) {
        if (n <= 1) {
            return result;
        } else {
            result *= n;
            return n * factotialLocal(n - 1, result);
        }
    }


    public static void main(String[] args){
        System.out.println(factorial(5));
    }
/////////////////////////////////////////////////////////
}
