package com.academy.services;

import com.academy.models.Lecture;

public class LectureService {

//    private long ID;
//    public static long counter;
//    public long courseID;
//    private String name;

    public Lecture createLecture(String name, long ID, long courseID){
        return new Lecture(name, ID, courseID);
    }
}
