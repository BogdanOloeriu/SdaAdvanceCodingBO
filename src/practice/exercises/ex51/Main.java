package practice.exercises.ex51;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        try {
            Path filePath = Paths.get("D:\\Curs_JAVA\\JavaAdvanceCodingBo\\resources\\ex1.txt");
            if (Files.isDirectory(filePath)) {
                System.err.println("File path is a Directory");
            } else {
               List<String> newFleContent = readFileContextAndReverseIt(filePath);
            writeFileContent(filePath,newFleContent);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String reverseString(String input) {
        String reverseString = "";
        String[] elements = input.split(" ");
        for (int i = elements.length -1; i > 0; i--) {
            reverseString = reverseString + elements[i] + " ";
        }
        return reverseString;
    }

    public static List<String> readFileContextAndReverseIt(Path filePath) throws IOException {
        List<String> originalFileContent = Files.readAllLines(filePath);

        List<String> reverseFileContent = originalFileContent.stream()
                .map(string -> reverseString(string))
                .collect(Collectors.toList());

        List<String> newFileContent = new ArrayList<>();
        for (int i = reverseFileContent.size() -1; i > 0; i--) {
            newFileContent.add(reverseFileContent.get(i));
        }
        return newFileContent;
    }

    public static void writeFileContent(Path filePath, List<String> newFileContent) throws IOException {
        Path newFilePath = filePath.getParent().resolve("resultEx51");
        if(!Files.exists(newFilePath)){
            Files.createFile(newFilePath);
        }
        Files.write(newFilePath,newFileContent);
    }
}
