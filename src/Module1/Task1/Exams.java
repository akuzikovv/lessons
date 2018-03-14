package Module1.Task1;

import java.util.Scanner;

public class Exams {
     private String examination;
    public static Scanner input = new Scanner(System.in);

     public Exams(String examination){
         this.examination = examination;
     }

    public String getExamination() {
        return examination;
    }

    public void setExamination(String examination) {
        this.examination = examination;
    }


    public void goExam(){
        System.out.println("question1");
        System.out.println("question2");
        System.out.println("question3");
    }

    @Override
    public String toString() {
        return "Exams{" +
                "examination='" + examination + '\'' +
                '}';
    }
}
