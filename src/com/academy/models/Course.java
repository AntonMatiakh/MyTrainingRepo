package com.academy.models;

public class Course {

    private String courseName;
    private long courseID;
    public static long counter;

    private Teacher teacher;
    private Student student;
    private Lecture lecture;

    public Course(String courseName, long courseID) {
        this.courseName = courseName;
        this.courseID = courseID;
    }

    public long getCourseID() {
        return courseID;
    }
}