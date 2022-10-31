package model;

import java.util.ArrayList;

public class Student extends Person {
    private String group;
    private final ArrayList<Task> homeworks;
    private final ArrayList<Task> exercises;
    private final String[] scoresStudent;


    public Student(String name, int age, String gender, String email,
                   String group, ArrayList<Task> homeworks, ArrayList<Task> exercises, String[] score) {
        super(name, age, gender, email);
        this.group = group;
        this.homeworks = homeworks;
        this.exercises = exercises;
        this.scoresStudent = score;
    }

    private void completionScores() {
        for(var score : scoresStudent){
            homeworks.get(0).setCurrScore(score);
        }
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String newGroup) {
        group = newGroup;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" %s", group);
    }

    public ArrayList<Task> getHomeworks() {
        return homeworks;
    }

    public ArrayList<Task> getExercises() {
        return exercises;
    }

    public String[] getScoresStudent() {
        return scoresStudent;
    }
}
