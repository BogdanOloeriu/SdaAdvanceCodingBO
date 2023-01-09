package practice.exercises.ex52;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("D:\\Curs_JAVA\\JavaAdvanceCodingBo\\resources\\ex2.txt");
        if(Files.isDirectory(filePath)){
            System.out.println("The path is a directory!");
            return;
        }
        if(!Files.exists(filePath)){
            System.out.println("Files does not exists!");
            return;
        }

        List<String> originalFileContent = Files.readAllLines(filePath);
        Map<String,Integer> numberOfOccurrences = new HashMap<>();
        for(String line : originalFileContent){
            for(String word : line.split(" ")){
                if(numberOfOccurrences.containsKey(word)){
                    numberOfOccurrences.put(word,numberOfOccurrences.get(word) +1);
                }else {
                    numberOfOccurrences.put(word,1);
                }
            }
        }

        Path writeContent = filePath.getParent().resolve("resultEx52.txt");
        List<String> newFileContent = new ArrayList<>();
        newFileContent.add("Word                       NumberOfOccurrences");
        for(Map.Entry<String,Integer> entry : numberOfOccurrences.entrySet()){
            newFileContent.add(entry.getKey() + "--------------------" + entry.getValue());
        }

        Files.write(writeContent,newFileContent);
    }
}
