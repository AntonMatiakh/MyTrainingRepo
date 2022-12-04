package com.academy.models;

public class Lecture {

    private String lectureName;
    private long lectureID;
    public long courseID;
    public static long counter;

    private Homework homework;
    private ExtraMaterial extraMaterial;

    public Lecture(String lectureName, long lectureID, long courseID) {
        this.lectureName = lectureName;
        this.lectureID = lectureID;
        this.courseID = courseID;
        counter++;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "lectureName='" + lectureName + '\'' +
                ", lectureID=" + lectureID +
                ", courseID=" + courseID +
                '}';
    }
}
