package practice.exercises.ex15;

public class Laptop {

    private String name;
    private String model;
    private Integer yearOfFabrication;

    public Laptop(String name,String model, Integer yearOfFabrication){
        this.name = name;
        this.model = model;
        this.yearOfFabrication = yearOfFabrication;
    }

    public void laptopMethod(){
        System.out.println("Hello from the super class!");
    }



    class Processor{

        private String manufacturer;
        private Integer core;

        public Processor(String manufacturer, Integer core) {
            this.manufacturer = manufacturer;
            this.core = core;
        }

        public void processor(){
            System.out.println("Hello from the inner class!");
        }
    }
}
