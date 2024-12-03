package practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmployeeExample {
    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee(1, "aa", 46000));
        empList.add(new Employee(2, "bb", 49000));
        empList.add(new Employee(3, "cc", 55000));
        empList.add(new Employee(4, "dd", 32000));
        empList.add(new Employee(5, "ee", 67000));
        empList.add(new Employee(6, "ff", 71000));
        empList.add(new Employee(7, "gg", 57000));

        // third-highest salary
        Optional<Employee> employee = empList.stream()
                                             .sorted(Comparator.comparing(Employee::getSalary)
                                                               .reversed())
                                             .skip(2)
                                             .findFirst();
        //System.out.println(employee.getSalary());
        employee.ifPresentOrElse(emp -> System.out.println(emp.getSalary()),
                                 () -> System.out.println("No Employee Found"));

    }
}
