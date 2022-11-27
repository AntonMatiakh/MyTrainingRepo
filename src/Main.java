import com.academy.models.Course;
import com.academy.models.Lecture;
import com.academy.services.LectureService;

public class Main {

    public static void main(String[] args) {

        Course firstCourse = new Course("English",777l);

        Lecture firstLecture = new Lecture("Present_Simple", 1l, firstCourse.getID());
        Lecture secondLecture = new Lecture("Present_Continuous", 2l, firstCourse.getID());
        Lecture thirdLecture = new Lecture("Present_Perfect", 3l, firstCourse.getID());
        Lecture fourthLecture = new Lecture("Past_Simple", 4l, firstCourse.getID());
        Lecture fifthLecture = new Lecture("Past_Continuous", 5l, firstCourse.getID());
        Lecture sixthLecture = new Lecture("Future_Simple", 6l, firstCourse.getID());

//        LectureService lectureService = new LectureService();
//
//        Lecture lecture1 = lectureService.createLecture("PS", 1l, firstCourse.getID());
//        Lecture lecture2 = lectureService.createLecture("PC", 2l, firstCourse.getID());
//        Lecture lecture3 = lectureService.createLecture("PP", 3l, firstCourse.getID());
//        Lecture lecture4 = lectureService.createLecture("Past_S", 4l, firstCourse.getID());
//        Lecture lecture5 = lectureService.createLecture("Past_C", 5l, firstCourse.getID());
//        Lecture lecture6 = lectureService.createLecture("FS", 6l, firstCourse.getID());
    }
}