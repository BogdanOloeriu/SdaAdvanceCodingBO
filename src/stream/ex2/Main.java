package stream.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        Employee john = new Employee("John",30);
        Employee max = new Employee("Max",21);
        Employee andrew = new Employee("Andrew",35);
        Employee jack = new Employee("Jack",45);

        Department hr = new Department("Human Resources");
        hr.addEmployee(john);
        hr.addEmployee(max);
         Department accounting = new Department("Accounting");
         accounting.addEmployee(andrew);
         accounting.addEmployee(jack);

        List<Department> departmentList = new ArrayList<>();
        departmentList.add(hr);
        departmentList.add(accounting);

        departmentList.stream()
                .peek(department -> department.getEmployee())
                .forEach(department -> System.out.println(department));

        System.out.println("=====================");

        departmentList.stream()
                .flatMap(department -> department.getEmployee().stream()) // flatMap wants a functions that returns a stream
                .forEach(System.out::println);

        System.out.println("---------------------------------");


        List<String> someBingoNumber = Arrays.asList(
                "N40","N36","N14","B65","B32","N10",
                "I26","I76","I03",
                "G45","G19","G18","g15");

        List<String> sortedGList = someBingoNumber
                .stream()
                .map(n -> n.toUpperCase())
                .filter(n -> n.startsWith("G"))
                .sorted()
                .collect(Collectors.toList());

        List<String> sortedNewList = someBingoNumber
                .stream()
                .map(n -> n.toUpperCase())
                .filter(n -> n.startsWith("N"))
                .distinct()
                .sorted()
                .collect(ArrayList::new,ArrayList::add,ArrayList::addAll); // first argument is supplier, addAll method is the combiner, the combiner is used sometimes to improve the operations

        for(String n : sortedGList){
            System.out.println(n);
        }

        System.out.println("==========Try New Stream For N");
        for(String n : sortedNewList){
            System.out.println(n);
        }

        Map<Integer,List<Employee>> groupByAge = departmentList
                .stream()
                .flatMap(department -> department.getEmployee().stream())
                .collect(Collectors.groupingBy(employee -> employee.getAge()));

        System.out.println("-------------------------------");

        departmentList.stream()
                .flatMap(department -> department.getEmployee().stream())
                .reduce((e1,e2) -> e1.getAge() < e2.getAge() ? e1:e2)
                .ifPresent(System.out::println);
        // If we want to reuse it we will get IllegalStateException!
        // we can use intStream, longStream, doubleStream!
        // Parallel Stream we can execute in parallel to increase performance
    }

}
