package hw7.Person.Teacher;

import hw7.Person.abstr.Person;

public  class Teacher extends Person  {

    public String subject;
    public String salary;

    public Teacher(String name, String age, String gender, String subject , String salary) {

        super(name,age,gender);
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.subject = subject;
        this.salary  = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher " + "name: " + name  + ", age: " + age + ", gender: " + gender + "subject: " + subject +
                ", salary: " + salary ;
    }
}
