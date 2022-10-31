package CSVParser;

import model.Student;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
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
                students.add(new Student(temp[0], 0, "men", null, temp[1],
                        null, null, Arrays.stream(temp).skip(2).toArray(String[]::new)));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
