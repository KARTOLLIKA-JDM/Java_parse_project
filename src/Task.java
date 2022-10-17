public class Task {
    private final String name;
    private final int maxScore;
    private final String taskType;

    public Task(String name, int maxScore, String taskType) {
        this.name = name;
        this.maxScore = maxScore;
        this.taskType = taskType;
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

    @Override
    public String toString() {
        return String.format("%s %s %s", name, maxScore, taskType);
    }
}
