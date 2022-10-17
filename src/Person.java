public class Person {
    private final String firstname;
    private final String lastname;
    private final int age;
    private final Gender gender;
    private final String email;

    public Person(String firstname, String lastname, int age, String gender, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.gender = new Gender(gender);
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
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
        return String.format("%s %s %s %s %s", firstname, lastname, age, gender.getGender(), email);
    }
}
