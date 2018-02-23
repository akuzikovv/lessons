package hw7;
import hw7.Person.abstr.Person;
import hw7.Person.abstr.Student;
import hw7.Person.Student.CollegeStudent;
import hw7.Person.Teacher.Teacher;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static String text;
    public static int personsIndex,studentsIndex,collegeStudentsIndex,teachersIndex = 0;
    public static String Person[]= new String[100];
    public static String persons[] = new String[100];
    public static String students[] = new String[100];
    public static String collegeStudents[] = new String[100];
    public static String teachers[] = new String[100];
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
        System.out.println("1: Отобразить персон");
        System.out.println("2: Отобразить Студентов");
        System.out.println("3: Отобразить Учителей");
        System.out.println("4: Отобразить Студентов Коледжа");
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Отображение персон");
                Main.displayPerson();
                break;
            case 2:
                System.out.println("Отображение Студентов");
                Main.displayStudent();
                break;
            case 3:
                System.out.println("Отображение Учителей");
                Main.displayTeacher();
                break;
            case 4:
                System.out.println("Отображение Студентов Коледжа");
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
        persons[personsIndex]= person.toString();
        personsIndex++;
        menu();
    }

    public static void addStudent() {
        for (int i = 0 ;i<=4;i++){
            text = scanner.next();
            Person[i]=text.toString();
        }
        student = new Student(Person[0],Person[1],Person[2],Person[3],Person[4]);
        students[studentsIndex]= student.toString();
        studentsIndex++;
        menu();
    }

    public static void addTeacher() {
        for (int i = 0 ;i<=4;i++){
            text = scanner.next();
            Person[i]=text.toString();
        }
        teacher = new Teacher(Person[0],Person[1],Person[2],Person[3],Person[4]);
        teachers[teachersIndex]= teacher.toString();
        teachersIndex++;
        menu();
    }

    public static void addCollegeStudent() {
        for (int i = 0 ;i<=6;i++){
            text = scanner.next();
            Person[i]=text.toString();
        }
        collegeStudent = new CollegeStudent(Person[0],Person[1],Person[2],Person[3],Person[4],Person[5],Person[6]);
        collegeStudents[collegeStudentsIndex]= teacher.toString();
        collegeStudentsIndex++;
        menu();
    }

    public static void displayPerson() {
        for (int i =0; i<personsIndex;i++){
        System.out.println(persons[i]);
        }
        System.out.println();
        menu();
    }

    public static void displayStudent() {
        for (int i =0; i<studentsIndex;i++){
            System.out.println(students[i]);
        }
        System.out.println();
        menu();
    }

    public static void displayTeacher() {
        for (int i =0; i<teachersIndex;i++){
            System.out.println(teachers[i]);
        }
        System.out.println();
        menu();
    }

    public static void displayCollegeStudent() {
        for (int i =0; i<collegeStudentsIndex;i++){
            System.out.println(collegeStudents[i]);
        }
        System.out.println();
        menu();
    }
}
