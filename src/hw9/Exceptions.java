package hw9;

public class Exceptions {
    public static void main(String[] args) {

        //ClassCastException = RuntimeException
        int i = 25;
        long j = i;
        if (i == j) {
            System.out.println(i);
        } else {
            System.out.println("This way is wrong");
        }

        //NullPointerException = RuntimeException
        Integer age = null;
        if (age != null) {
            System.out.println(age);
        } else {
            System.out.println("age is null");
        }

        //NumberFormatException = RuntimeException
        String q = "QWERTY";
        Object w = q;
        System.out.println(validFormat(q, w));

        //ArrayIndexOutOfBoundsException= RuntimeException
        String[] mas = new String[]{"qwer 1", "qwer 2", "qwer 3"};
        for (int m = 0; m < mas.length; m++) {
            if (m >= mas.length) {
                System.out.println("Going beyond the array");
                mas[m] = null;
            } else {
                System.out.println("Array is " + mas[m]);
            }
        }
    }

    static boolean validFormat(String q, Object w) {
        if (w.equals(q)) {
            System.out.println("Format is valid");
        } else {
            System.out.println("Format isn't valid");
        }
        return true;
    }

}
