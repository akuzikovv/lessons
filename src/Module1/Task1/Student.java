package Module1.Task1;


import java.util.Scanner;

public class Student {
    public String firstName;
    public String lastName;
    public static Scanner input = new Scanner(System.in);

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
                return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void registration(Faculty faculty ){
        faculty.addStudent();
    }

    public void   doExams(Exams exams){
            exams.goExam();

    }



    @Override
    public String toString() {
        return firstName + lastName;
    }
}
