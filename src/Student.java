public class Student extends Person {
    private String group;


    public Student(String firstname, String lastname, int age, String gender, String email, String group) {
        super(firstname, lastname, age, gender, email);
        this.group = group;
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
}
