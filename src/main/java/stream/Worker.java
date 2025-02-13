package stream;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.*;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter
public class Worker {

    private String name;
    private int age;
    private String department;
    private double salary;

    @Override
    public String toString() {
        return "Worker{"
               + "name='"
               + name
               + '\''
               + ", age="
               + age
               + ", department='"
               + department
               + '\''
               + ", salary="
               + salary
               + '}';
    }

    public static void main(String[] args) {

        List<Worker> workerList = new ArrayList<>();

        workerList.add(new Worker("Steve", 33, "IT", 79000.00));
        workerList.add(new Worker("Emma", 27, "HR", 63500.00));
        workerList.add(new Worker("Mike", 29, "IT", 85000.00));
        workerList.add(new Worker("Andrew", 39, "Finance", 83700.00));
        workerList.add(new Worker("John", 30, "HR", 89700.00));
        workerList.add(new Worker("Sophia", 29, "IT", 72500.00));
        workerList.add(new Worker("Paul", 37, "Finance", 80000.00));

        // Second-Highest Salary
        Optional<Worker> secondHighestSalary = workerList.stream()
                                                         .sorted(Comparator.comparingDouble(Worker::getSalary)
                                                                           .reversed())
                                                         .distinct()
                                                         .skip(1)
                                                         .findFirst();

        secondHighestSalary.ifPresentOrElse(salary -> System.out.println("second highest salary: " + salary),
                                            () -> System.out.println("There is no second highest number."));

        // group by department and get worker with max salary for each department
        Map<String, Optional<Worker>> maxSalaryByDept = workerList.stream()
                                                                  .collect(Collectors.groupingBy(Worker::getDepartment,
                                                                                                 Collectors.maxBy(
                                                                                                         Comparator.comparingDouble(
                                                                                                                 Worker::getSalary))));
        // print the department and worker with the max salary
        maxSalaryByDept.forEach((department, worker) -> {
            worker.ifPresent(value -> System.out.println("Department: "
                                                         + department
                                                         + ", Worker with max salary: "
                                                         + value));
        });

        // top 3 highest salaries for each department

    }
}
