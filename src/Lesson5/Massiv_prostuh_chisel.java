package Lesson5;

public class Massiv_prostuh_chisel {

    public static int mas[] = new int[100];

    public static void main(String[] args) {
        for (int i: findOneHundredSimpleNumbers()){
            System.out.println(i+"");
        }
    }

    public static int[] findOneHundredSimpleNumbers() {
        int index = 0;
        mas[0] = 2;
        int currentValue = mas[0];

        for (int j = 0; j < 99 ;j++) {
            for (int i = 0; i <= index; i++) {
                if (currentValue % mas[i] == 0) {
                    ++currentValue;
                    i=-1;
                }
            }
            mas[++index] = currentValue++;
        }
        return mas;
    }
}
