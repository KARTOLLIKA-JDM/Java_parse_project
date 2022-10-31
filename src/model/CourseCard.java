package model;

import java.util.ArrayList;

public class CourseCard {
    private final Course course;
    private final ArrayList<Student> students;
    private final ArrayList<Module> modules;

    public CourseCard(Course course, ArrayList<Student> students, ArrayList<Module> modules) {
        this.course = course;
        this.students = students;
        this.modules = modules;
    }

    public Course getCourse() {
        return course;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }
}
