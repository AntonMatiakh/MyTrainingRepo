package com.academy.services;

public class LectureService {
    public void findLecture(String enteredName) {
        switch (enteredName) {
            case "Introduction":
                System.out.println("First");
                break;
            case "Variables":
                System.out.println("Second");
                break;
            default:
                System.out.println("Sorry, nothing found");
        }
    }
}
