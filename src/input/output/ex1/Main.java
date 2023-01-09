package input.output.ex1;

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
            System.err.println("Given path is a directory!");
        }else{
            List<String> newFileContent = readFileContentAndReverseIt(filePath);

            writeContentNewFile(filePath,newFileContent);
        }


    }

    private static void writeContentNewFile(Path filePath, List<String> newFileContent) throws IOException {
        Path baseDirectory = filePath.getParent();
        Path newFilePath = baseDirectory.resolve("writeEx1.txt");
        if(!Files.exists(newFilePath)){
            Files.createFile(newFilePath);
        }
        Files.write(newFilePath,newFileContent);

    }

    private static List<String> readFileContentAndReverseIt(Path filePath) throws IOException {
        List<String> originalFileContent = Files.readAllLines(filePath);
        System.out.println(originalFileContent);

        List<String> listWithReverseStrings = originalFileContent.stream()
                .map(s -> reverseString(s))
                .collect(Collectors.toList());
        List<String> newFileContent = new ArrayList<>();
        for(int i= listWithReverseStrings.size() - 1; i>= 0;i--){
            newFileContent.add(listWithReverseStrings.get(i));
        }
        return newFileContent;
    }


    public static String reverseString(String inputString){
        String reverseString = "";
        String[] stringElement = inputString.split(" ");
        for(int i = stringElement.length - 1; i >= 0; i--){
            reverseString = reverseString + stringElement[i] + " ";
        }
        return reverseString;
    }
}
