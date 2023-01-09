package input.output.ex3;

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

        if(   Files.isDirectory(filePath)){
            System.err.println("The path :" + filePath + " is a directory!");
            return;
        }else if(!Files.exists(filePath)){
            System.out.println("Files does not exist!");
            return;
        }


            List<String> fileContent = Files.readAllLines(filePath);


        Map<String,Integer> numberOfOccurrencesForEachWord = new HashMap<>();
        for(String line : fileContent){
            for(String word : line.split(" ")){
                if(numberOfOccurrencesForEachWord.containsKey(word)){
                    numberOfOccurrencesForEachWord.put(word,numberOfOccurrencesForEachWord.get(word) + 1);
                }else {
                    numberOfOccurrencesForEachWord.put(word,1);
                }
            }
        }

        Path newFilePath = filePath.getParent().resolve("writeEx3.txt");
        if(!Files.exists(newFilePath)){
            Files.createFile(newFilePath);
        }

        List<String> newFileContent = new ArrayList<>();
        newFileContent.add("Word                          NumberOfOccurrences");
        for(Map.Entry<String,Integer> entry : numberOfOccurrencesForEachWord.entrySet()){
            newFileContent.add(entry.getKey() + String.format("%1$" +(30-entry.getKey().length()) + "s",entry.getValue()));
        }

        Files.write(newFilePath,newFileContent);
    }
}
