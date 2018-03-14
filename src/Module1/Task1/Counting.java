package Module1.Task1;

public class Counting {



    public static void main(String[] args) {

        Student student = new Student("John","Watson");
        Teacher teacher = new Teacher("Stephen", "Hawking", "Physics");

        student.registration(new Faculty("Physics"));
        student.doExams(new Exams("String theory1"));
        teacher.setRating(student,new Rating((int) (Math.random() * 5 + 1)));
        student.doExams(new Exams("String theory2"));
        teacher.setRating(student,new Rating((int) (Math.random() * 5 + 1)));
    }

    public static void countingAverageScore(Student student,Rating rating){
        int AverageScore = rating.getRating();
        System.out.println(rating);
    }

}
