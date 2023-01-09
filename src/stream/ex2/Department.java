package stream.ex2;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    private List<Employee> employeeList;

    public Department(String name) {
        this.name = name;
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        if(!employeeList.contains(employee)){
            employeeList.add(employee);
        }else {
            throw new RuntimeException("Employee already added to the list!");
        }
    }

    public List<Employee> getEmployee(){
        return new ArrayList<>(employeeList);
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", employeeList=" + employeeList +
                '}';
    }
}
