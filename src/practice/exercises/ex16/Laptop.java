package practice.exercises.ex16;

import java.util.Date;

public class Laptop {


    private String name;
    private String model;
    private Date dateOfFabrication;

    public Laptop(String name, String model, Date dateOfFabrication) {
        this.name = name;
        this.model = model;
        this.dateOfFabrication = dateOfFabrication;
    }

    public void superClassMethod(){
        System.out.println("This is a super class method call!");
    }


    static class Processor{

        private String manufacturer;
        private Integer coreNumber;

        public Processor(String manufacturer, Integer coreNumber) {
            this.manufacturer = manufacturer;
            this.coreNumber = coreNumber;
        }

        public void nestedClassMethod(){
            System.out.println("This is a nested class!");
        }
    }
}
