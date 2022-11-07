package model;

public class Task {
    private final String name;
    private final int maxScore;
    private final String taskType;
    private int currScore;

    public Task(String name, int maxScore, String taskType, int currScore) {
        this.name = name;
        this.maxScore = maxScore;
        this.taskType = taskType;
        this.currScore = currScore;
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

    public void setCurrScore(int currScore) {
        this.currScore = currScore;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", name, taskType, maxScore, currScore);
    }
}
