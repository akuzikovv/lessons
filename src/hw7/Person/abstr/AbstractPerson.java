package hw7.Person.abstr;

public abstract class AbstractPerson implements hw7.Person.Person {

    public String name;
    public int age;
    public String gender;

    public AbstractPerson(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
