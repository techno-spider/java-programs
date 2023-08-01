package javaexamples;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Steve", 27, 67000));
        employeeList.add(new Employee("Emma", 24, 43000));
        employeeList.add(new Employee("Jack", 25, 45000));
        employeeList.add(new Employee("Alex", 27, 68000));
        employeeList.add(new Employee("Alice", 21, 36000));
        employeeList.add(new Employee("Bob", 29, 69000));
        employeeList.add(new Employee("Mike", 21, 37000));
        employeeList.add(new Employee("Sophie", 24, 44000));
        employeeList.add(new Employee("Andrew", 31, 71000));
        employeeList.add(new Employee("Dani", 23, 40000));

        List<Employee> result = employeeList.stream()
                .filter(employee -> employee.getAge() > 27)
                .filter(employee -> employee.getSalary() > 40000)
                .toList();
        result.forEach(System.out::println);
    }
}

/*
 * output:
 * Employee{name='Bob', age=29, salary=69000.0}
 * Employee{name='Andrew', age=31, salary=71000.0}
 */