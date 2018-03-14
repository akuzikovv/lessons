package Module1.Task1;


public class Teacher {
    private String firstName;
    private String lastName;
    private String subjects;

    public Teacher( String firstName, String lastName , String subjects){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjects = subjects;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }


    void setRating(Student student, Rating rating){
        rating.getRating();
        System.out.println("Teacher is set  rating " + rating +  " for exam"  );

    }

    @Override
    public String toString() {
        return firstName + lastName + ", subjects = " + subjects;
    }
}
