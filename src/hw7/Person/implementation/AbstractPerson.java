package hw7.Person.implementation;

public abstract class AbstractPerson implements hw7.Person.Person {

    public String name;
    public String gender;

    public AbstractPerson(String name,String gender){
        this.name = name;
        this.gender = gender;
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
