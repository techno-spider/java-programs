package stream.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class TestEmployee {

    static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {

        employees.add(new Employee(200, "John Doe", 30, "Male", "Software Development", 2018, 9500.0));
        employees.add(new Employee(201, "Jane Smith", 28, "Female", "Finance", 2017, 8500.0));
        employees.add(new Employee(202, "Michael Brown", 35, "Male", "Finance", 2015, 12000.0));
        employees.add(new Employee(203, "Emily Davis", 26, "Female", "Sales And Marketing", 2019, 10500.0));
        employees.add(new Employee(204, "David Wilson", 32, "Male", "IT Support", 2016, 9000.0));
        employees.add(new Employee(205, "Sarah Martinez", 29, "Female", "Product Management", 2018, 11000.0));
        employees.add(new Employee(206, "James Anderson", 34, "Male", "Sales And Marketing", 2014, 13000.0));
        employees.add(new Employee(207, "Linda Thomas", 27, "Female", "Software Development", 2020, 10000.0));
        employees.add(new Employee(208, "Robert Taylor", 31, "Male", "Finance", 2017, 11500.0));
        employees.add(new Employee(209, "Patricia Hernandez", 33, "Female", "Human Resources", 2016, 9500.0));
        employees.add(new Employee(210, "Charles Moore", 28, "Male", "IT Support", 2019, 8500.0));
        employees.add(new Employee(211, "Jennifer Lee", 30, "Female", "Product Management", 2018, 12000.0));
        employees.add(new Employee(212, "Daniel Clark", 29, "Male", "Software Development", 2017, 10500.0));
        employees.add(new Employee(213, "Elizabeth Lewis", 26, "Female", "Sales And Marketing", 2021, 9000.0));
        employees.add(new Employee(214, "Matthew Walker", 36, "Male", "Finance", 2015, 12500.0));


        /* sort by name */
        //sortByName();

        /* count by gender */
        //genderCount();

        /* print name of all departments */
        //nameofDepartments();

        /* average age by gender */
        //averageAgeByGender();

        /* highest paid employee */
        //highestPaidEmployee();

        /* names of all employees who have joined before 2017 */
        //employeeJoinedBeforeYear();

        /* count of employees in each department */
        //countOfEmployeesInEachDepartment();

        /* average salary by department */
        //averageSalaryByDepartment();

        // second highest paid employee
        //secondHighestSalary();

        // top 3 highest-paid employees
        //topThreeHighestPaid();

        // most working experience employee in the organization
        //mostWorkingExperience();

        // youngest male employee in finance
        //youngestMaleEmployeeInFinance();

        // how many males and females employee are there in finance
        //genderCountInFinance();

        // total salary of whole organization
        //totalSalaryOfOrganization();

        // Separate the employees who are younger or equal to 30 years from those and employees who are older than 30 years
        //separateEmployeesByAge();

        // Who is the oldest employee in the organization? What is his age? and Which department he belongs to?
        oldestEmployee();
    }

    // sort by name
    static void sortByName() {
        employees.stream()
                 .sorted(Comparator.comparing(Employee::getName))
                 .forEach(System.out::println);
    }

    // count of male and female employees
    static void genderCount() {
        Map<String, Long> result = employees.stream()
                                            .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(result);
    }

    // print the name of all departments
    static void nameofDepartments() {
        employees.stream()
                 .map(Employee::getDepartment)
                 .distinct()
                 .forEach(System.out::println);

        // or
        /*employees.stream()
                 .collect(Collectors.groupingBy(Employee::getDepartment))
                 .keySet()
                 .forEach(System.out::println);*/
    }

    // average age of male and female employees
    static void averageAgeByGender() {
        employees.stream()
                 .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)))
                 .forEach((gender, avgAge) -> System.out.println(gender + " average age: " + avgAge));
    }

    // highest paid employee
    static void highestPaidEmployee() {
        employees.stream()
                 .max(Comparator.comparingDouble(Employee::getSalary))
                 .ifPresent(System.out::println);
    }

    // names of all employees who have joined before 2017
    static void employeeJoinedBeforeYear() {
        employees.stream()
                 .filter(emp -> emp.getYearOfJoining() < 2017)
                 .map(Employee::getName)
                 .forEach(System.out::println);
    }

    // count the number of employees in each department
    static void countOfEmployeesInEachDepartment() {
        employees.stream()
                 .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                 .forEach((dept, count) -> System.out.println(dept + ": " + count));
    }

    // average salary of each department
    static void averageSalaryByDepartment() {
        employees.stream()
                 .collect(Collectors.groupingBy(Employee::getDepartment,
                                                Collectors.averagingDouble(Employee::getSalary)))
                 .forEach((dept, avgSalary) -> System.out.println(dept + ": " + avgSalary));
    }

    // get the second-highest salary
    static void secondHighestSalary() {
        employees.stream()
                 .sorted(Comparator.comparingDouble(Employee::getSalary)
                                   .reversed())
                 .skip(1)
                 .findFirst()
                 .ifPresent(System.out::println);
    }

    // top 3 highest-paid employees
    static void topThreeHighestPaid() {
        employees.stream()
                 .sorted(Comparator.comparingDouble(Employee::getSalary)
                                   .reversed())
                 .limit(3)
                 .forEach(System.out::println);
    }

    // most working experience in the organization
    static void mostWorkingExperience() {
        employees.stream()
                 .min(Comparator.comparingInt(Employee::getYearOfJoining))
                 .ifPresent(emp -> System.out.println("Employee with most working experience: " + emp.getName()));
    }

    // youngest male employee in finance
    static void youngestMaleEmployeeInFinance() {
        employees.stream()
                 .filter(emp -> emp.getGender()
                                   .equals("Male") && emp.getDepartment()
                                                         .equals("Finance"))
                 .min(Comparator.comparingInt(Employee::getAge))
                 .ifPresent(emp -> System.out.println("Youngest male employee in finance: " + emp.getName()));
    }

    // how many males and females employee are there in finance
    static void genderCountInFinance() {
        employees.stream()
                 .filter(emp -> emp.getDepartment()
                                   .equals("Finance"))
                 .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()))
                 .forEach((gender, count) -> System.out.println(gender + ": " + count));
    }

    // total salary of the whole organization
    static void totalSalaryOfOrganization() {
        double totalSalary = employees.stream()
                                      .mapToDouble(Employee::getSalary)
                                      .sum();
        System.out.println("Total salary of organization: " + totalSalary);
    }

    // Separate the employees who are younger or equal to 30 years from those and employees who are older than 30 years
    static void separateEmployeesByAge() {
        employees.stream()
                 .collect(Collectors.partitioningBy(emp -> emp.getAge() <= 30))
                 .forEach((isYoungerOrEqual30, empList) -> {
                     System.out.println(isYoungerOrEqual30 ?
                                        "\nEmployees younger or equal to 30  years:" :
                                        "\nEmployees older than 30 years:");
                     empList.forEach(System.out::println);
                 });
    }

    // Who is the oldest employee in the organization? What is his age? and Which department he belongs to?
    static void oldestEmployee() {
        employees.stream()
                 .max(Comparator.comparingInt(Employee::getAge))
                 .ifPresent(emp -> {
                     System.out.println("Oldest employee name: " + emp.getName());
                     System.out.println("Age: " + emp.getAge());
                     System.out.println("Department: " + emp.getDepartment());
                 });
    }
}
