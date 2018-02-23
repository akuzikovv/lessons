package hw7;
import hw7.Person.abstr.Person;
import hw7.Person.abstr.Student;
import hw7.Person.Student.CollegeStudent;
import hw7.Person.Teacher.Teacher;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static String text;
    public static String Person[]= new String[100];
    public static Person person;
    public static Student student;
    public static CollegeStudent collegeStudent;
    public static Teacher teacher;

    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        System.out.println("1: Добавить персонажей");
        System.out.println("2: Отобразить персонажей");
        System.out.println("3: Выход.");
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Добавьте персонажей");
                addpersons();
                break;
            case 2:
                System.out.println("Отобразите персонажей");
                displayPersons();
                break;
            case 3:
                System.out.println("До встречи!");
                return;
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
        for (int i = 0 ;i<=2;i++){
            text = scanner.next();
            Person[i]=text.toString();
        }
        person = new Person(Person[0],Person[1],Person[2]);
        menu();
    }

    public static void addStudent() {
        for (int i = 0 ;i<=4;i++){
            text = scanner.next();
            Person[i]=text.toString();
        }
        student = new Student(Person[0],Person[1],Person[2],Person[3],Person[4]);
        menu();
    }

    public static void addTeacher() {
        for (int i = 0 ;i<=4;i++){
            text = scanner.next();
            Person[i]=text.toString();
        }
        teacher = new Teacher(Person[0],Person[1],Person[2],Person[3],Person[4]);
        menu();
    }

    public static void addCollegeStudent() {
        for (int i = 0 ;i<=6;i++){
            text = scanner.next();
            Person[i]=text.toString();
        }
        collegeStudent = new CollegeStudent(Person[0],Person[1],Person[2],Person[3],Person[4],Person[5],Person[6]);
        menu();
    }

    public static void displayPerson() {
        System.out.println(person.toString());
        menu();
    }

    public static void displayStudent() {
        System.out.println(student.toString());
        menu();
    }

    public static void displayTeacher() {
        System.out.println(teacher.toString());
        menu();
    }

    public static void displayCollegeStudent() {
        System.out.println(collegeStudent.toString());
        menu();
    }
}
