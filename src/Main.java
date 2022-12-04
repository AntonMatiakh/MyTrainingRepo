import com.academy.models.Course;
import com.academy.models.Lecture;
import com.academy.services.LectureService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Course firstCourse = new Course("Java", 2022);

        LectureService lectureService = new LectureService();

        Lecture lecture1 = lectureService.createLecture("Introduction", 1, firstCourse.getCourseID());
        Lecture lecture2 = lectureService.createLecture("Variables", 2, firstCourse.getCourseID());
        Lecture lecture3 = lectureService.createLecture("DataTypes", 3, firstCourse.getCourseID());
        Lecture lecture4 = lectureService.createLecture("Git", 4, firstCourse.getCourseID());
        Lecture lecture5 = lectureService.createLecture("GitHub", 5, firstCourse.getCourseID());
        Lecture lecture6 = lectureService.createLecture("Methods", 6, firstCourse.getCourseID());

        Scanner scanner = new Scanner(System.in);

        System.out.println("We have the following categories:");
        System.out.println("1.Course  2.Teacher  3.Student  4.Lecture");
        System.out.println("Please, select necessary category and input appropriate number:");

        int category = scanner.nextInt();

        switch (category) {
            case 1:
                System.out.println("You have selected 'Course' category");
                break;
            case 2:
                System.out.println("You have selected 'Teacher' category");
                break;
            case 3:
                System.out.println("You have selected 'Student' category");
                break;
            case 4:
                System.out.println("You have selected 'Lecture' category");
                break;
            default:
                System.out.println("Sorry, nothing found... :(");
        }

        System.out.println("We have already " + Lecture.counter + " lectures");
        System.out.println("Would you like to create new lecture?");
        System.out.println("If 'Yes' - input 1, if 'No' - input 2");
        System.out.println("Please, input appropriate number:");
        int answer = scanner.nextInt();
        while (answer == 1) {
            System.out.println("Enter lecture name:");
            String lectureName = scanner.next();
            System.out.println("Enter lecture id:");
            int lectureID = scanner.nextInt();
            System.out.println(lectureService.createLecture(lectureName, lectureID, firstCourse.getCourseID()));
            System.out.println("Now we have " + Lecture.counter + " lectures");
            System.out.println("Would you like to create another lecture?");
            System.out.println("If 'Yes' - input 1, if 'No' - input 2");
            System.out.println("Please, input appropriate number:");
            answer = scanner.nextInt();
        }
        if (answer == 2) {
            System.out.println("That's all, thank you for attention, see you next time :)");
        } else {
            System.out.println("Unfortunately, something went terribly wrong... :(");
        }
        scanner.close();
    }
}
