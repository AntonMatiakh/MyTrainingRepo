import com.academy.models.Course;
import com.academy.models.Lecture;
import com.academy.services.LectureService;
import com.academy.services.MainService;

public class Main {

    public static void main(String[] args) {

        LectureService lectureService = new LectureService();

        Course firstCourse = new Course("Java", 2022l);

        Lecture firstLecture = new Lecture("Introduction", 1l, firstCourse.getCourseID());
        Lecture secondLecture = new Lecture("Variables", 2l, firstCourse.getCourseID());
        Lecture thirdLecture = new Lecture("DataTypes", 3l, firstCourse.getCourseID());
        Lecture fourthLecture = new Lecture("Git", 4l, firstCourse.getCourseID());
        Lecture fifthLecture = new Lecture("GitHub", 5l, firstCourse.getCourseID());
        Lecture sixthLecture = new Lecture("Methods", 6l, firstCourse.getCourseID());

        MainService.selectCategory(MainService.chooseCategory());
        MainService.realisationLecture(MainService.optionLecture());

//         int category = MainService.chooseCategory();
//         MainService.selectCategory(category);

//        int choice = MainService.optionLecture();
//        MainService.realisationLecture(choice);
    }
}