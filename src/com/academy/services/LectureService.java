package com.academy.services;

import com.academy.models.Lecture;

public class LectureService {

    public Lecture createLecture(String lectureName, int lectureID, int courseID){
        return new Lecture(lectureName, lectureID, courseID);
    }
//    public void selectCategory(int category){
//        switch (category) {
//            case 1:
//                System.out.println("You have selected 'Course' category");
//                break;
//            case 2:
//                System.out.println("You have selected 'Teacher' category");
//                break;
//            case 3:
//                System.out.println("You have selected 'Student' category");
//                break;
//            case 4:
//                System.out.println("You have selected 'Lecture' category");
//                break;
//            default:
//                System.out.println("Sorry, nothing found");
//        }
//    }
}
