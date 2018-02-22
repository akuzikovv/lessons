package hw7;


import hw7.Person.abstr.Person;
import hw7.Person.abstr.Student;
import hw7.Person.Student.CollegeStudent;
import hw7.Person.Teacher.Teacher;

import java.util.Scanner;


public class Main {
    public static Scanner scanner = new Scanner(System.in);
     public static int mas[];
   public static Person person;

    public static void main(String[] args) {

        Student student;
        CollegeStudent collegeStudent;
        Teacher teacher;
        switch (scanner.nextInt()){
            case 1 :
                System.out.println("Добавьте персонажей");
                addpersons();

                break;
            case 2:
                System.out.println("Отобразите персонажей");
                displayPersons();
                break;
            default:
                System.out.println("QWERTY");
        }
    }

    public static void addpersons(){
        switch (scanner.nextInt()){
            case 1 :
                System.out.println("Введите персону");
                Main.addperson();

                break;
//            case 2:
//
//                break;
//            case 3:  collegeStudent = new CollegeStudent(scanner.nextLine(),
//                    scanner.nextInt(),scanner.nextLine(),
//                    scanner.nextLine(),scanner.nextInt(),
//                    scanner.nextInt(),scanner.nextLine());
//            case 4: teacher = new Teacher(scanner.nextLine(),scanner.nextInt(),
//                    scanner.nextLine(),scanner.nextLine(),scanner.nextDouble());
            default:
                System.out.println("QWERTY");
        }
    }

    public static void displayPersons(){
        switch (scanner.nextInt()){
            case 1 :
                System.out.println("ОТобразите персону");
                Main.displayperson();

                break;
//            case 2:  student = new Student(scanner.nextLine(),scanner.nextInt(),scanner.nextLine(),scanner.nextLine(),scanner.nextInt());
//                break;
//            case 3:  collegeStudent = new CollegeStudent(scanner.nextLine(),
//                    scanner.nextInt(),scanner.nextLine(),
//                    scanner.nextLine(),scanner.nextInt(),
//                    scanner.nextInt(),scanner.nextLine());
//            case 4: teacher = new Teacher(scanner.nextLine(),scanner.nextInt(),
//                    scanner.nextLine(),scanner.nextLine(),scanner.nextDouble());
            default:
                System.out.println("QWERTY");
        }
    }

    public static void addperson(){
        String name = scanner.nextLine();
//        int age = scanner.nextInt();
        person = new Person(name,25,"m");
        System.out.println("ОТобразите персону");
        System.out.println(person.toString());
    }

    public static void displayperson(){
        System.out.println(person.toString());
    }
}
