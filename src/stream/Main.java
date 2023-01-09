package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {


        List<String> someBingoNumber = Arrays.asList(
                "N40","N36","N14","B65","B32","N10",
                "I26","I76","I03",
                "G45","G19","G18","g15");


        List<String> gNumbers = new ArrayList<>();
        someBingoNumber.forEach(number -> {
            if(number.toUpperCase().startsWith("G")){
                gNumbers.add(number);
                //System.out.println(number);
            }
        });

       gNumbers.sort((number1, number2) -> number1.compareTo(number2));
       gNumbers.forEach(number -> System.out.println(number));

        System.out.println("-------------------");

        someBingoNumber
                .stream()
                .map(s -> s.toUpperCase()) // cu map transform stringur, map want a function, nut a BiFunction!!,means two arguments, map will return a stream
                .filter(s -> s.startsWith("G"))
                .sorted((s1,s2) -> s1.compareTo(s2))
                .forEach(s -> System.out.println(s));

        System.out.println("------------------------");

        Stream<String> ioStreamNumber = Stream.of("I1","I2","I3","I5");
        Stream<String> inStreamNumber = Stream.of("N1","N2","N3","I1","I2");
        Stream<String> concatString = Stream.concat(inStreamNumber,ioStreamNumber);
        System.out.println(
                concatString
                        .distinct()
                        .peek(s -> System.out.println(s))
                        .count());
    }


}
