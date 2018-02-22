package hw7.Person.abstr;

import hw7.Person.abstr.AbstractPerson;

public abstract class Student extends AbstractPerson {

    public Student(String name,int age, String gender) {
        super(name,age,gender);
        this.name = name;
        this.age = age;
        this.gender = gender;
    }




}
