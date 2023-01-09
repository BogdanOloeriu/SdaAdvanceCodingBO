package practice.exercises.ex29;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("D:\\Curs_JAVA\\JavaAdvanceCodingBo\\resources\\ex29.txt");

        if (Files.isDirectory(filePath)) {
            System.err.println("File Path is a Directory!");
        } else {
            List<String> newFileContent = readContentFileAndReverseIt(filePath);
            writeContentFile(filePath,newFileContent);
        }
    }

    public static String reverseString(String input) {
        String reverseString = "";
        String[] elements = input.split(" ");
        for (int i = elements.length - 1; i >= 0; i--) {
            reverseString = reverseString + elements[i] + " ";
        }
        return reverseString;
    }

    public static List<String> readContentFileAndReverseIt(Path filePath) throws IOException {
        List<String> fileContent = Files.readAllLines(filePath);

        List<String> reverseContent = fileContent.stream()
                .map(s -> reverseString(s))
                .collect(Collectors.toList());

        List<String> newReverseContent = new ArrayList<>();
        for (int i = reverseContent.size() - 1; i >= 0; i--) {
            newReverseContent.add(reverseContent.get(i));
        }
        return newReverseContent;
    }

    public static void writeContentFile(Path filePath, List<String> newContent) throws IOException {
        Path newFilePath = filePath.getParent().resolve("ReEx29.txt");
        if (!Files.exists(newFilePath)) {
            Files.createFile(newFilePath);
        } else {
            System.err.println("File already exists");
        }
        Files.write(newFilePath, newContent);
    }
}
