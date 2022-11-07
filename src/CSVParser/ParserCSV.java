package CSVParser;

import model.*;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class ParserCSV {
    public static void main(String[] args) {
        Path pathToCSV = Path.of("D:\\basicprogramming_2.csv");
        try (Scanner scanner = new Scanner(pathToCSV)) {
            String DELIMITER = ";";
            scanner.useDelimiter(DELIMITER);
            boolean first = true;
            boolean second = true;
            boolean third = true;
            String[] tems = null;
            String[] namesAndHomeworks = null;
            String[] maxPoints = null;
            ArrayList<Student> students = new ArrayList<>();
            while (scanner.hasNextLine()) {
                if (first) {
                    first = false;
                    tems = scanner.nextLine().split(";");
                    continue;
                }
                if (second) {
                    second = false;
                    namesAndHomeworks = scanner.nextLine().split(";");
                    continue;
                }
                if (third) {
                    third = false;
                    maxPoints = scanner.nextLine().split(";");
                    continue;
                }
                var temp = scanner.nextLine().split(";");
                var result = completionStudents(namesAndHomeworks, maxPoints, temp);
                students.add(new Student(temp[0], 0, Gender.UNKNOWN, null, temp[1],
                        result.get(0), result.get(1), result.get(2), result.get(3)));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static ArrayList<ArrayList<Task>> completionStudents(String[] namesAndHomeworks, String[] maxPoints, String[] studentScores) {
        var result = new ArrayList<ArrayList<Task>>();
        var homeworks = new ArrayList<Task>();
        var exercises = new ArrayList<Task>();
        var activities = new ArrayList<Task>();
        var cem = new ArrayList<Task>();
        for (int i = 0; i < namesAndHomeworks.length; i++) {
            var task = namesAndHomeworks[i];
            var maxPoint = maxPoints[i];
            var studentScore = studentScores[i];
            if (i < 2) {
                i++;
                continue;
            } else if (task.split(": ")[0].equals("ДЗ")) {
                homeworks.add(new Task(task, Integer.parseInt(maxPoint), task.split(" ")[0], Integer.parseInt(studentScore)));
            } else if (task.split(": ")[0].equals("Упр")) {
                exercises.add(new Task(task, Integer.parseInt(maxPoint), task.split(" ")[0], Integer.parseInt(studentScore)));
            } else if (task.equals("Сем")) {
                cem.add(new Task(task, Integer.parseInt(maxPoint), task, Integer.parseInt(studentScore)));
            } else if (task.equals("Акт")) {
                activities.add(new Task(task, Integer.parseInt(maxPoint), task, Integer.parseInt(studentScore)));
            }
        }
        result.add(homeworks);
        result.add(exercises);
        result.add(activities);
        result.add(cem);
        return result;
    }
}
