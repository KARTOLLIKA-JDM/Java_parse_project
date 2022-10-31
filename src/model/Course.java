package model;

import java.util.ArrayList;;

public class Course {
    private final String name;
    private final int maxScore;
    private final int maxHomeworksScore;
    private final int maxExercisesScore;
    private final int maxSeminarsScore;
    private final int maxActivitiesScore;
    private final ArrayList<Module> modules;
    private final ArrayList<Student> students;

    public Course(String name, int maxHomeworksScore, int maxExercisesScore,
                  int maxActivitiesScore, int maxSeminarsScore, ArrayList<Module> modules, ArrayList<Student> students) {
        this.name = name;
        this.maxHomeworksScore = maxHomeworksScore;
        this.maxExercisesScore = maxExercisesScore;
        this.maxActivitiesScore = maxActivitiesScore;
        this.maxSeminarsScore = maxSeminarsScore;
        maxScore = maxHomeworksScore + maxExercisesScore;
        this.modules = modules;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public int getMaxHomeworksScore() {
        return maxHomeworksScore;
    }

    public int getMaxExercisesScore() {
        return maxExercisesScore;
    }

    public int getMaxSeminarsScore() {
        return maxSeminarsScore;
    }

    public int getMaxActivitiesScore() {
        return maxActivitiesScore;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
