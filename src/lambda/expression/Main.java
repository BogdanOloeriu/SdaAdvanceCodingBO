package lambda.expression;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {


    public static void main(String[] args) {


        new Thread(new CodeToRun()).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Using anonymous class!");

            }
        }).start();

        // () is the argument list
        // -> error token
        // body of the method
        // functional interface -> interface with one method
        new Thread(() -> System.out.println("Using Lambda Expression for the runnable!")).start();

        new Thread(() -> {
            System.out.println("Printing multiple statements from the lambda expression!");
            System.out.println("Ths is a lambda expression!");
        }).start();

        Employee john = new Employee("john", 30);
        Employee tim = new Employee("tim", 21);
        Employee jack = new Employee("jack", 45);
        Employee snow = new Employee("Snow", 22);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(john);
        employeeList.add(tim);
        employeeList.add(jack);
        employeeList.add(snow);

        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Employee employee : employeeList) {
            System.out.println("Employee name is: " + employee.getName());
        }

        Collections.sort(employeeList, (employee1, employee2) -> employee1.getName().compareTo(employee2.getName()));

        employeeList.sort(((o1, o2) -> o1.getName().compareTo(o2.getName()))); // merge si asa

        employeeList.sort((employee1, employee2) -> employee1.getName().compareTo(employee2.getName()));

        System.out.println("----------------------------------- ");

        String sillyString = doStringStuff(new upperConcat() { // here is an anonymous class and we can pass a lambda expression
            @Override
            public String upperAndConcat(String s1, String s2) {
                return s1.toUpperCase() + s2.toUpperCase();
            }
        }, employeeList.get(0).getName(), employeeList.get(1).getName());
        System.out.println(sillyString);


        System.out.println("--------------------------------");
        upperConcat uc = (String s1, String s2) -> s1.toUpperCase() + s2.toUpperCase();
        String silly = doStringStuff(uc, employeeList.get(1).getName(), employeeList.get(2).getName());
        System.out.println(silly);

        upperConcat upperConcat = (String s1, String s2) -> s1.toLowerCase() + s2.toUpperCase();
        String s2 = doStringStuff(upperConcat, employeeList.get(3).getName(), employeeList.get(0).getName());
        System.out.println("-------------------------");
        System.out.println(s2);

        System.out.println("-----------------");
        Calculate calculate = (x1, x2) -> {
            Integer result = x1 * x2;
            return result;
        };
        System.out.println(calculate.calculate(2, 3));
        System.out.println("--------------");
        AnotherClass anotherClass = new AnotherClass();
        String s = anotherClass.doSomething();
        System.out.println(s);

        System.out.println("====================");
        System.out.println(anotherClass.doSomething2());

        System.out.println("=========================");
        System.out.println(anotherClass.doSomething3());

        System.out.println("-----------------------------");

        for(Employee employee : employeeList){
            System.out.println(employee.getName());
            new Thread(() -> {
                System.out.println(employee.getAge());
            }).start();
        }

        System.out.println("===================");
        // local variabies must be final because the variales can not be changed
        //Employee employee;
        for (int i=0; i< employeeList.size();i++){
          Employee employee = employeeList.get(i);
            System.out.println(employee.getName());
            new Thread(()->{
                System.out.println(employee.getAge());
            }).start();
        }

        System.out.println("+++++++++++++++++++++");
        employeeList.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });
    }


    public final static String doStringStuff(upperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }
}

class CodeToRun implements Runnable {

    @Override
    public void run() {
        System.out.println("Printing from the runnable!");
    }
}

class Employee {

    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

@FunctionalInterface
interface upperConcat {


    public String upperAndConcat(String s1, String s2);
}

interface Calculate {

    public Integer calculate(Integer x1, Integer x2);
}

class AnotherClass {

    public String doSomething() {
        System.out.println("The another class s name is: " + getClass().getSimpleName());
        return Main.doStringStuff(new upperConcat() {
            @Override
            public String upperAndConcat(String s1, String s2) {
                System.out.println("The anonymous class name is :" + getClass().getSimpleName());
                return s1.toUpperCase() + s2.toUpperCase();
            }
        }, "String1", "String2");
    }

    // lambda is like a nested isnt a class, the lambda is like a nested block of code!
    public String doSomething2() {
        upperConcat uc = (s1, s2) -> {
            System.out.println("The lambda expression s class is : " + getClass().getSimpleName());
            String result = s1.toLowerCase() + s2.toUpperCase();
            return result;
        };
        System.out.println("The AnotherClass class s name is:  " + getClass().getSimpleName());
        return Main.doStringStuff(uc, "Alex", "Bode");
    }

    // +
    public String doSomething3() {
        int i = 0;
        upperConcat upperConcat = new upperConcat() {
            @Override
            public String upperAndConcat(String s1, String s2) {
                System.out.println("print i" + i);
                return s1.toUpperCase() + s2.toUpperCase();
            }
        };
        System.out.println("The anonymous class name is :" + getClass().getSimpleName());
        return Main.doStringStuff(upperConcat, "Ionut", "Mciuca");
    }

    public void printValue() {
        int number = 25;
        Runnable e = () -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
            System.out.println("The value is: " + number);
        };
        new Thread(e).start();
    }
}
