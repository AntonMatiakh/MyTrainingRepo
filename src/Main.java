import com.academy.models.Course;
import com.academy.models.Lecture;

public class Main {

    public static void main(String[] args) {

        Course firstCourse = new Course(777l);

        Lecture firstLecture = new Lecture(firstCourse.getID());
        Lecture secondLecture = new Lecture(firstCourse.getID());
        Lecture thirdLecture = new Lecture(firstCourse.getID());
        Lecture fourthLecture = new Lecture(firstCourse.getID());
        Lecture fifthLecture = new Lecture(firstCourse.getID());
        Lecture sixthLecture = new Lecture(firstCourse.getID());

        System.out.println("Number of lectures: " + Lecture.counter);
        System.out.println("Sixth lecture's id: " + sixthLecture.courseID);
    }
}