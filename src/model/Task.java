package model;

public class Task {
    private final String name;
    private final int maxScore;
    private final String taskType;
    private String currScore;

    public Task(String name, int maxScore, String taskType) {
        this.name = name;
        this.maxScore = maxScore;
        this.taskType = taskType;
        this.currScore = null;
    }

    public String getName() {
        return name;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setCurrScore(String currScore) {
        this.currScore = currScore;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", name, maxScore, taskType, currScore);
    }
}
