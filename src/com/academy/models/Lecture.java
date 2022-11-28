package com.academy.models;

public class Lecture {
    private long ID;
    public static long counter;
    public long courseID;
    private String name;


    private Homework homework;
    private ExtraMaterial extraMaterial;

    public Lecture(String name, long ID, long courseID) {
        this.name = name;
        this.ID = ID;
        this.courseID = courseID;
        counter++;
    }

    public String getName() {
        return name;
    }

}
