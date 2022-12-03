package com.academy.models;

public class Course {

    private String courseName;
    private int courseID;
    public static int counter;

    private Teacher teacher;
    private Student student;
    private Lecture lecture;

    public Course(String courseName, int courseID) {
        this.courseName = courseName;
        this.courseID = courseID;
    }

    public int getCourseID() {
        return courseID;
    }
}