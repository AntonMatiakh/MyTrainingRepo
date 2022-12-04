package com.academy.services;

import com.academy.models.Lecture;

public class LectureService {

    public Lecture createLecture(String lectureName, int lectureID, int courseID) {
        return new Lecture(lectureName, lectureID, courseID);
    }
}
