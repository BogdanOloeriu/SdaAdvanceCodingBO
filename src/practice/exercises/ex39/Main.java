package practice.exercises.ex39;

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

        Path filePath = Paths.get("D:\\Curs_JAVA\\JavaAdvanceCodingBo\\resources\\ex1.txt");
        if(Files.isDirectory(filePath)){
            System.err.println("File path is a directory!");
        }else{
           List<String> fileContent =  readContentAndReverseIt(filePath);
            writeContentFile(filePath,fileContent);

        }
    }

    public static String reverseString(String input){
        String result = "";
        String[] elements = input.split(" ");
        for(int i = elements.length - 1; i >= 0; i --){
            result = result + elements[i] + " ";
        }
        return result;
    }

    public static List<String> readContentAndReverseIt(Path filePath) throws IOException {
        List<String> originalFileContent = Files.readAllLines(filePath);

        List<String> listWithReverseString = originalFileContent.stream()
                .map(s -> reverseString(s))
                .collect(Collectors.toList());
        List<String> newFileContent = new ArrayList<>();
        for(int i = listWithReverseString.size() - 1; i >= 0; i--){
            newFileContent.add(listWithReverseString.get(i));
        }
        return newFileContent;
    }

    public static void writeContentFile(Path filePath, List<String> contentToWrite) throws IOException {
        Path newFilePath = filePath.getParent().resolve("ex39Write.txt");
        if(!Files.exists(newFilePath)){
            Files.createFile(newFilePath);
        }
        Files.write(newFilePath,contentToWrite);
    }
}
