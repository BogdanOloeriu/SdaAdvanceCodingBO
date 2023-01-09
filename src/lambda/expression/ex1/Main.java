package lambda.expression.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {


        Employee john = new Employee("john Wick", 30);
        Employee tim = new Employee("tim Mailer", 21);
        Employee jack = new Employee("jack Sparov", 45);
        Employee snow = new Employee("Snow White", 22);
        Employee red = new Employee("red Orange",35);
        Employee charming = new Employee("charming Miuller",42);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(john);
        employeeList.add(tim);
        employeeList.add(jack);
        employeeList.add(snow);
        employeeList.add(red);
        employeeList.add(charming);

        System.out.println("Employee over 30:");
        System.out.println("=================");
//        for(Employee employee : employeeList){
//            if(employee.getAge() > 30){
//                System.out.println(employee.getName());
//            }
//        }

        //cu lambda expression

        employeeList.forEach(employee -> {
            if(employee.getAge() >= 30){
                System.out.println(employee.getName());
            }
        });

        System.out.println("\nEmployee 30 or younger:");
        System.out.println("=============");
        employeeList.forEach(employee -> {
            if(employee.getAge() <= 30){
                System.out.println(employee.getName());
            }
        });

        System.out.println("Print Employee over 30 with lambda passing a function");

        printEmployeeList("Employees over 30",employeeList,employee -> employee.getAge() > 30);
        System.out.println("-------------------------");
        printEmployeeList("Employee under 30",employeeList,employee -> employee.getAge() < 30);

        //Using anonymous class for Predicate
        printEmployeeList("Employee over 25:", employeeList, new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getAge() > 25;
            }
        });

        IntPredicate greaterThen15 = i -> i > 15;
        IntPredicate lessThen100 = i -> i < 100;
        System.out.println(greaterThen15.test(10));

        System.out.println(greaterThen15.and(lessThen100).test(56));

        Random random = new Random();
        for(int i = 0; i < 10;i++){
            System.out.println(random.nextInt(100));
        }
        System.out.println("-------------------------------");
        Supplier<Integer> supplierInteger = () -> random.nextInt(100);
        for(int i=0;i<10;i++){
            System.out.println(supplierInteger.get()); // trebuie get ca sa luam, cum la predicate trebuie .test();
        }

        employeeList.forEach(employee -> {
            String lastName = employee.getName().substring(employee.getName().indexOf(' ') + 1);
            System.out.println("Last Name is: " + lastName);
        });

        Function<Employee,String> getLastName = employee -> {
            return employee.getName().substring(employee.getName().indexOf(" ") + 1);
        };

        Function<Employee,String> getFirstName = employee -> {
            return employee.getName().substring(0,employee.getName().indexOf(" "));
        };

        for(int i=0;i< employeeList.size();i++){
            String lastName = getLastName.apply(employeeList.get(i));
            System.out.println(lastName);
        }

        Function<Employee,String> upperCase = employee -> employee.getName().toUpperCase();
        Function<String,String> firstName = name -> name.substring(0,name.indexOf(" "));
        Function concatFunction = upperCase.andThen(firstName);
        System.out.println(concatFunction.apply(employeeList.get(0)));


    }

    private static void printEmployeeList(String text, List<Employee> employeeList, Predicate<Employee> ageCondition){
        System.out.println(text);
        System.out.println("=============");
        for(Employee employee : employeeList){
            if(ageCondition.test(employee)){
                System.out.println(employee.getName());
            }
        }
    }
}
