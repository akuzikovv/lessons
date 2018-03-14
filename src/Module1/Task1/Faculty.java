package Module1.Task1;

public class Faculty {
    private String faculty;
    private String students[];
    private int i =0;
    public static Student student;



    public Faculty(String faculty){
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }


    public void addStudent(){
//        students[i] = student.toString();
//        i++;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "faculty='" + faculty + '\'' +
                '}';
    }
}
