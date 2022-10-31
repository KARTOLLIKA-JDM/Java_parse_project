package model;

import model.Gender;

public class Person {
    private final String name;
    private final int age;
    private final Gender gender;
    private final String email;

    public Person(String name, int age, String gender, String email) {
        this.name = name;
        this.age = age;
        this.gender = new Gender(gender);
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender.getGender();
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", name, age, gender.getGender(), email);
    }

    public String getName() {
        return name;
    }
}
