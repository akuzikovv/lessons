package hw7.Person.Student;

import hw7.Person.abstr.Student;

public  class CollegeStudent extends Student {
    public String major;
    public int year;


    public CollegeStudent(String name, int age, String gender, String idNumber, int gpa, int year, String major) {

        super(name, age, gender,idNumber,gpa);
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.idNumber = idNumber;
        this.gpa = gpa;
        this.year = year;
        this.major = major;
    }


    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }


    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "CollegeStudent{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", gpa=" + gpa +
                ", year=" + year +
                "major='" + major + '\'' +
                '}';
    }
}
