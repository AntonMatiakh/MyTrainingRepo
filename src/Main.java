import com.academy.models.Course;
import com.academy.models.Lecture;

public class Main {
    public static void main(String[] args) {

        Course firstCourse = new Course(777l);

        Lecture firstLecture = new Lecture();
        firstLecture.courseID = firstCourse.getID();
        Lecture secondLecture = new Lecture();
        secondLecture.courseID = firstCourse.getID();
        Lecture thirdLecture = new Lecture();
        thirdLecture.courseID = firstCourse.getID();
        Lecture fourthLecture = new Lecture();
        fourthLecture.courseID = firstCourse.getID();
        Lecture fifthLecture = new Lecture();
        fifthLecture.courseID = firstCourse.getID();
        Lecture sixthLecture = new Lecture();
        sixthLecture.courseID = firstCourse.getID();

        System.out.println("Number of lectures: " + Lecture.counter);
        System.out.println("Sixth lecture's id: " + sixthLecture.courseID);
    }
}