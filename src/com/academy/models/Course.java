package com.academy.models;

public class Course {

    private long ID;
    public static long counter;
    private String name;

    private Teacher teacher;
    private Student student;
    private Lecture lecture;

    public Course(String name, long ID) {
        this.name = name;
        this.ID = ID;
    }

    public long getID() {
        return ID;
    }
}