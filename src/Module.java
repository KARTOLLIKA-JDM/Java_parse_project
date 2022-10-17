import java.util.ArrayList;

public class Module {
    private final String name;
    private final int maxScore;
    private final int maxHomeworksScore;
    private final int maxExercisesScore;
    private final int maxSeminarsScore;
    private final int maxActivitiesScore;
    private final ArrayList<Task> controlsQuestions;
    private final ArrayList<Task> homeworks;
    private final ArrayList<Task> exercises;

    public Module(String name, int maxHomeworksScore, int maxExercisesScore, int maxActivitiesScore, int maxSeminarsScore,
                  ArrayList<Task> homeworks, ArrayList<Task> exercises, ArrayList<Task> controlsQuestions) {
        this.name = name;
        this.maxHomeworksScore = maxHomeworksScore;
        this.maxExercisesScore = maxExercisesScore;
        this.maxActivitiesScore = maxActivitiesScore;
        this.maxSeminarsScore = maxSeminarsScore;
        maxScore = maxHomeworksScore + maxExercisesScore;
        this.homeworks = homeworks;
        this.exercises = exercises;
        this.controlsQuestions = controlsQuestions;
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

    public ArrayList<Task> getControlsQuestions() {
        return controlsQuestions;
    }

    public ArrayList<Task> getHomeworks() {
        return homeworks;
    }

    public ArrayList<Task> getExercises() {
        return exercises;
    }
}
