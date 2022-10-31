package model;

import java.util.ArrayList;

public class Module {
    private final String name;
    private final int maxScore;
    private final int maxHomeworksScore;
    private final int maxExercisesScore;
    private final int maxSeminarsScore;
    private final int maxActivitiesScore;

    public Module(String name, int maxHomeworksScore, int maxExercisesScore,
                  int maxActivitiesScore, int maxSeminarsScore) {
        this.name = name;
        this.maxHomeworksScore = maxHomeworksScore;
        this.maxExercisesScore = maxExercisesScore;
        this.maxActivitiesScore = maxActivitiesScore;
        this.maxSeminarsScore = maxSeminarsScore;
        maxScore = maxHomeworksScore + maxExercisesScore;
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
}
