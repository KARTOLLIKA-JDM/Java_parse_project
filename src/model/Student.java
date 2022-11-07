package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student extends Person {
    private String group;
    private final ArrayList<Task> homeworks;
    private final ArrayList<Task> exercises;

    private final ArrayList<Task> activities;
    private final ArrayList<Task> cem;


    public Student(String name, int age, Gender gender, String email,
                   String group, ArrayList<Task> homeworks, ArrayList<Task> exercises,ArrayList<Task> activities, ArrayList<Task> cem) {
        super(name, age, gender, email);
        this.group = group;
        this.homeworks = homeworks;
        this.exercises = exercises;
        this.activities = activities;
        this.cem = cem;
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
}
