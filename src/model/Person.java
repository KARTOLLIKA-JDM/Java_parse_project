package model;

import model.Gender;

public class Person {
    private final String name;
    private final int age;
    private final Gender gender;
    private final String email;

    public Person(String name, int age, Gender gender, String email) {
        this.name = name;
        this.age = age;
        this.gender = Gender.UNKNOWN;
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }


    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", name, age, gender, email);
    }

    public String getName() {
        return name;
    }
}
