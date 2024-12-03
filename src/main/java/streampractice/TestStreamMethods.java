package streampractice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestStreamMethods {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeDataBase.getAllEmployees();

        // get Employee name and Salary using forEach()
        //employees.forEach(e -> System.out.println(e.getName() + " : " + e.getSalary()));

        // Get all employee from 'Development' using filter()
        Map<String, Double> empFromDev = employees.stream()
                                                  .filter(e -> e.getDepartment()
                                                                .equalsIgnoreCase("DEVELOPMENT")
                                                               && e.getSalary() > 75000)
                                                  .collect(Collectors.toMap(Employee::getName, Employee::getSalary));
        System.out.println(empFromDev);

    }
}
