import com.academy.models.Course;
import com.academy.models.Lecture;
import com.academy.services.LectureService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Course firstCourse = new Course("JAVA", 777l);

        Lecture firstLecture = new Lecture("Introduction", 1l, firstCourse.getID());
        Lecture secondLecture = new Lecture("Variables", 2l, firstCourse.getID());
        Lecture thirdLecture = new Lecture("DataTypes", 3l, firstCourse.getID());
        Lecture fourthLecture = new Lecture("Git", 4l, firstCourse.getID());
        Lecture fifthLecture = new Lecture("GitHub", 5l, firstCourse.getID());
        Lecture sixthLecture = new Lecture("Methods", 6l, firstCourse.getID());

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter lecture name:");
//        String enteredName = scanner.nextLine();
//        if (enteredName.equals("Introduction")){
//            System.out.println(firstLecture);
//            System.out.println(firstLecture.getName() + " " + firstLecture.courseID);
//        } else {
//            System.out.println("Sorry, nothing found");
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter lecture name:");
//        String enteredName = scanner.nextLine();
//        switch (enteredName) {
//            case "Introduction":
//                System.out.println(firstLecture);
//                break;
//            case "Variables":
//                System.out.println(secondLecture);
//                break;
//            default:
//                System.out.println("Sorry, nothing found");
//        }

//        Scanner scanner = new Scanner(System.in);
//        LectureService lectureService = new LectureService();
//        System.out.println("Enter lecture name:");
//        String enteredName = scanner.nextLine();
//        lectureService.findLecture(enteredName);

    }
}