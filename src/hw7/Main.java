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
    public static Student student;
    public static CollegeStudent collegeStudent;
    public static Teacher teacher;

    public static void main(String[] args) {
        switch (scanner.nextInt()) {
            case 1:
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

    public static void addpersons() {
        System.out.println("1: Добавить персону");
        System.out.println("2: Добавить Студента");
        System.out.println("3: Добавить Учителя");
        System.out.println("4: Добавить Студента Коледжа");
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Введите персону");
                Main.addperson();
                break;
            case 2:
                System.out.println("Введите Студента");
                Main.addStudent();
                break;
            case 3:
                System.out.println("Введите Учителя");
                Main.addTeacher();
                break;
            case 4:
                System.out.println("Введите Студента Коледжа");
                Main.addCollegeStudent();
                break;
            default:
                System.out.println("QWERTY");
        }
    }

    public static void displayPersons() {
        System.out.println("1: Отобразить персону");
        System.out.println("2: Отобразить Студента");
        System.out.println("3: Отобразить Учителя");
        System.out.println("4: Отобразить Студента Коледжа");
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Отображение персоны");
                Main.displayPerson();
                break;
            case 2:
                System.out.println("Отображение Студента");
                Main.displayStudent();
                break;
            case 3:
                System.out.println("Отображение Учителя");
                Main.displayTeacher();
                break;
            case 4:
                System.out.println("Отображение Студента Коледжа");
                Main.displayCollegeStudent();
                break;
            default:
                System.out.println("QWERTY");
        }
    }

    public static void addperson() {
        String name = scanner.nextLine();
        person = new Person(name, 25, "m");
        System.out.println("ОТобразите персону");
        System.out.println(person.toString());
    }

    public static void addStudent() {
        String name = scanner.nextLine();
        person = new Person(name, 25, "m");
        System.out.println("ОТобразите персону");
        System.out.println(person.toString());
    }

    public static void addTeacher() {
        String name = scanner.nextLine();
        person = new Person(name, 25, "m");
        System.out.println("ОТобразите персону");
        System.out.println(person.toString());
    }

    public static void addCollegeStudent() {
        String name = scanner.nextLine();
        person = new Person(name, 25, "m");
        System.out.println("ОТобразите персону");
        System.out.println(person.toString());
    }

    public static void displayPerson() {
        System.out.println(person.toString());
    }

    public static void displayStudent() {
        System.out.println(student.toString());
    }

    public static void displayTeacher() {
        System.out.println(teacher.toString());
    }

    public static void displayCollegeStudent() {
        System.out.println(collegeStudent.toString());
    }
}
