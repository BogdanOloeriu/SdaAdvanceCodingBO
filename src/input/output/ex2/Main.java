package input.output.ex2;


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

        if(!Files.exists(filePath)){
            Files.createFile(filePath);
        }else{

            List<String> newFileContent=readFileContentAndReverseIt(filePath);
            writeInNewFile(filePath,newFileContent);

        }
    }

    private static String reverseString(String inputString){
        String reverseString = "";
        String[] stringElement = inputString.split(" ");
        for(int i = stringElement.length - 1; i>= 0; i--){
            reverseString = reverseString + stringElement[i] + " ";
        }
        return reverseString;
    }

    private static List<String> readFileContentAndReverseIt(Path filePath) throws IOException {
        List<String> originalContent = Files.readAllLines(filePath);

        List<String> reverseContent =
                originalContent.stream()
                .map(s -> reverseString(s))
                .collect(Collectors.toList());

        List<String> newFileContent = new ArrayList<>();
        for(int i= reverseContent.size() - 1; i>= 0 ; i--){
            newFileContent.add(reverseContent.get(i));
        }
        return newFileContent;
    }

    private static void writeInNewFile(Path filePath, List<String> newFileContent) throws IOException {
        Path newFilePath = filePath.getParent().resolve("writeEx2.txt");
        if(!Files.exists(newFilePath)){
            Files.createFile(newFilePath);
        }
        Files.write(newFilePath,newFileContent);
    }
}
