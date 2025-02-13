package stream;

import java.util.*;
import java.util.stream.Collectors;

record Labour(int id, String name, int age, String gender, int yearOfJoining, double salary) {
}

public class ThirdHighestSalary {
    public static void main(String[] args) {

        List<Labour> labours = Arrays.asList(new Labour(1, "Alice", 30, "Female", 2015, 70000),
                                             new Labour(2, "Bob", 35, "Male", 2012, 80000),
                                             new Labour(3, "Charlie", 28, "Male", 2018, 90000),
                                             new Labour(4, "Diana", 32, "Female", 2014, 60000),
                                             new Labour(5, "Eve", 29, "Female", 2019, 95000));

        // third-highest salary
        Optional<Labour> thirdHighestSalary = labours.stream()
                                                     .sorted(Comparator.comparingDouble(Labour::salary)
                                                                       .reversed())
                                                     .skip(2)
                                                     .findFirst();
        thirdHighestSalary.ifPresentOrElse(thirdHighest -> System.out.println("The third highest salary is: "
                                                                              + thirdHighest),
                                           () -> System.out.println(
                                                   "Not enough labours to determine the third highest salary"));

        // highest salary labour
        labours.stream()
               .min(Comparator.comparingDouble(Labour::salary))
               .ifPresentOrElse(highestSalary -> System.out.println("The highest salary labour name is: "
                                                                    + highestSalary.name()),
                                () -> System.out.println("Not enough labours to determine the highest salary"));

        // labours by gender
        Map<String, Long> labByGen = labours.stream()
                                            .collect(Collectors.groupingBy(Labour::gender, Collectors.counting()));
        System.out.println(labByGen);
    }
}
