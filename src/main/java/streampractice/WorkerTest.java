package streampractice;

import java.util.*;
import java.util.stream.Collectors;

public class WorkerTest {
    public static void main(String[] args) {

        List<Worker> workers = Arrays.asList(new Worker("Steve", 33, "Male", "IT", 79000.00),
                                             new Worker("Andrew", 39, "Male", "Finance", 83700.00),
                                             new Worker("Emma", 27, "Female", "HR", 63500.00),
                                             new Worker("Mike", 29, "Male", "IT", 85000.00),
                                             new Worker("John", 30, "Male", "HR", 89700.00),
                                             new Worker("Hank", 26, "Male", "IT", 60000),
                                             new Worker("Ivy", 38, "Female", "Finance", 95000),
                                             new Worker("Sophia", 29, "Female", "IT", 72500.00),
                                             new Worker("Charlie", 30, "Male", "HR", 80000),
                                             new Worker("Jenny", 32, "Female", "IT", 70000),
                                             new Worker("Paul", 37, "Male", "Finance", 80000.00),
                                             new Worker("Alice", 26, "Female", "HR", 60000),
                                             new Worker("Eve", 31, "Female", "IT", 90000),
                                             new Worker("Bob", 35, "Male", "HR", 70000),
                                             new Worker("Kate", 30, "Female", "Finance", 75000),
                                             new Worker("David", 33, "Male", "HR", 50000),
                                             new Worker("Frank", 34, "Male", "IT", 80000),
                                             new Worker("Jack", 36, "Male", "Finance", 85000));


        // top 3 highest salaries worker from each department
        Map<String, List<Worker>> topSalariesWorker = workers.stream()
                                                             .collect(Collectors.groupingBy(Worker::department,
                                                                                            Collectors.collectingAndThen(
                                                                                                    Collectors.toList(),
                                                                                                    list -> list.stream()
                                                                                                                .sorted(Comparator.comparingDouble(
                                                                                                                                          Worker::salary)
                                                                                                                                  .reversed())
                                                                                                                .limit(3)
                                                                                                                .toList())));

        topSalariesWorker.forEach((department, topWorkers) -> {
            System.out.println("Department: " + department);
            topWorkers.forEach(System.out::println);
        });

        System.out.println("-------------------------------------------------------------------------------");

        // group by male and female workers
        Map<String, List<Worker>> workersByGender = workers.stream()
                                                           .collect(Collectors.groupingBy(Worker::gender));

        workersByGender.forEach((gender, workerList) -> {
            System.out.println("Gender: " + gender);
            workerList.forEach(System.out::println);
        });

        // third-highest salary worker
        Optional<Worker> thirdHighestSalary = workers.stream()
                                                     .sorted(Comparator.comparingDouble(Worker::salary)
                                                                       .reversed())
                                                     .skip(2)
                                                     .findFirst();
        thirdHighestSalary.ifPresentOrElse(thirdHighest -> System.out.println("The third highest salary is: "
                                                                              + thirdHighest),
                                           () -> System.out.println(
                                                   "Not enough labours to determine the third highest salary"));

    }
}
