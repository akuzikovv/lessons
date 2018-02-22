package hw7.Person;

import hw7.Person.implementation.AbstractPerson;

public class Teacher extends AbstractPerson {

    public String subject;
    public double salary;

    public Teacher(String name, int age, String gender, String subject , double salary) {

        super(name,age,gender);
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.subject = subject;
        this.salary  = salary;
    }
    @Override
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                "subject='" + subject + '\'' +
                ", salary=" + salary +
                '}';
    }
}
