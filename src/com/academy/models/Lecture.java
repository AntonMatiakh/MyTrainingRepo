package com.academy.models;

public class Lecture {
    private long ID;
    public static long counter;
    public long courseID;

    private Homework homework;
    private ExtraMaterial extraMaterial;

    public Lecture(long courseID) {
        this.courseID = courseID;
        ID = counter++;
    }
}
