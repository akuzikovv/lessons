package hw7.Person;

public interface Person {
//    String getName();
//    int getAge();
//    String getGender();
//    String getSubject();
//    double getSalary();
//    String getMajor();
//    int getYear();
//    String getIdNumber();
//    char getGpa();
}


/*
An exercise has a superclass - Person and a couple subclasses: Student and Teacher. CollegeStudent is a
subclass of Student. A Teacher will be like Person but will have additional properties such as salary (the
amount the teacher earns) and subject (e.g. "Computer Science", "Chemistry", "English", "Other"). The
CollegeStudent class will extend the Student class by adding a year (current level in college) and major
(e.g. "Electrical Engineering", "Communications", and “Undeclared"). The Student class is derived from
the Person class and used as a starting point for the CollegeStudent class. Gender can be "M" for male
and "F" for female. Acronym GPA stands for Grade Point Average.

Assignment:
1. Add methods to "set" and "get" the instance variables in the Person class. These would consist
of: getName, setName, etc.


2. Add methods to "set" and "get" the instance variables in the Student class.

3. Write a Teacher class that extends the parent class Person.

a. Add instance variables to the class for subject (e.g. "Computer Science", "Chemistry",
"English", "Other”) and salary (the teachers’ annual salary). Subject should be of type
String and salary of type double. Choose appropriate names for the instance variables.

b. Write a constructor for the Teacher class. The constructor will use five parameters to
initialize name, age, gender, subject, and salary. Use the super reference to use the
constructor in the Person superclass to initialize the inherited values.

c. Write "setter" and "getter" methods for all of the class variables.

d. Write the toString() method for the Teacher class. Use a super reference to do the
things already done by the superclass.

4. Write a CollegeStudent subclass that extends the Student class.



a. Add instance variables to the class for major (e.g. "Electrical Engineering",
"Communications", "Undeclared") and year. Major should be of type String and year of
type int. Choose appropriate names for the instance variables.


b. Write a constructor for the CollegeStudent class. The constructor will use seven
parameters to initialize name, age, gender, idNumber, gpa, year, and major. Use the
super reference to use the constructor in the Student superclass to initialize the
inherited values.


c. Write "setter" and "getter" methods for all of the class variables.

d. Write the toString() method for the CollegeStudent class. Use a super reference to do
the things already done by the superclass.

5. Write a testing class with a main() that constructs all of the classes (Person, Student, Teacher,
and CollegeStudent. Can be more than one instance for each) and place them into an array
(Person[]). By using for-each, print the information about everybody from the array (call
toString() on every instance)

A sample run of the program would give:

Coach Bob, age: 27, gender: M
Lynne Brooke, age: 16, gender: F, student id: HS95129, gpa: 3.5
Duke Java, age: 34, gender: M, subject: Computer Science, salary: 50000.0
Ima Frosh, age: 18, gender: F, student id: UCB123, gpa: 4.0, year: 1, major: English

 */