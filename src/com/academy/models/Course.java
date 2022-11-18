package com.academy.models;

public class Course {

    private long ID;
    public static long counter;
    public String name;

    private Teacher teacher;
    private Student student;
    private Lecture lecture;

    public Course(long ID) {
        this.ID = ID;
    }

    public long getID() {
        return ID;
    }
    }