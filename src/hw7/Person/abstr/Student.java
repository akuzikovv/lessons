package hw7.Person.abstr;

public  class Student extends Person {
    public String idNumber;
    public String gpa;

    public Student(String name,String age, String gender,String idNumber, String gpa) {
        super(name,age,gender);
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                "idNumber='" + idNumber + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
