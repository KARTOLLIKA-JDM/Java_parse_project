public class Gender {
    private final String gender;

    public Gender(String gender) {
        if (isCorrectGender(gender)) {
            throw new IllegalArgumentException("Неверно введен пол!");
        }
        this.gender = gender;
    }

    private boolean isCorrectGender(String g) {
        if (g.equals("men")) {
            return true;
        } else return g.equals("woman");
    }

    public String getGender() {
        return gender;
    }
}
