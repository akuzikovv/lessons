package Lesson5;

import java.util.Scanner;

public class Task105 {
    public static Scanner input = new Scanner(System.in);
    public static int matrix[][];
    public static int counter=0;
    public static int sum=0;

    public static void main(String[] args) {
//        int n = input.nextInt();
        processMatrix(matrix);

    }

    public static int[] processMatrix(int[][]matrix){
int[]result = new int[2];

        for (int i=0;i<matrix.length -1;i++){
            for (int j=0;j<matrix.length;j++){
                if (matrix[i][j]>0){
                    result[0]++;
                    result[1] +=matrix[i][j];
                }
            }

    }return result;
    }
}
