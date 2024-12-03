package streampractice;

import java.util.Arrays;
import java.util.List;

public class EmployeeDataBase {

    public static List<Employee> getAllEmployees() {
        Project p1 = new Project("P001", "Alpha", "ABC Corp", "Alice");
        Project p2 = new Project("P002", "Beta", "ABC Corp", "Bob");
        Project p3 = new Project("P003", "Gamma", "XYZ Group", "Charlie");
        Project p4 = new Project("P004", "Delta", "Tech World", "Alice");
        Project p5 = new Project("P005", "Zeta", "Money Matters", "Daniel");
        Project p6 = new Project("P006", "Eta", "Smart Tech", "Eva");
        Project p7 = new Project("P007", "Theta", "Techno Soft", "George");
        Project p8 = new Project("P008", "Epsilon", "Fast Track", "Hannah");
        Project p9 = new Project("P009", "Iota", "Inno Soft", "Martin");
        Project p10 = new Project("P010", "Kappa", "Digital Wave", "Jessica");

        // Employee instance
        Employee e1 = new Employee(1, "John Deo", "Development", List.of(p1, p7), 82000.50, "Male");
        Employee e2 = new Employee(2, "Jane Smith", "HR", List.of(p4), 76000.22, "Female");
        Employee e3 = new Employee(3, "Robert Brown", "Development", List.of(p5, p9), 87000.50, "Male");
        Employee e4 = new Employee(4, "Lisa White", "Sales", List.of(p5), 69000.00, "Female");
        Employee e5 = new Employee(5, "Michael Green", "Finance", List.of(p10, p2), 78000.50, "Male");
        Employee e6 = new Employee(6, "Andrew Tate", "Marketing", List.of(p3), 75000.50, "Male");
        Employee e7 = new Employee(7, "Sophia Brown", "Development", List.of(p8), 61000.90, "Female");
        Employee e8 = new Employee(8, "Olivia Harris", "Sales", List.of(p2), 82000.50, "Female");
        Employee e9 = new Employee(9, "William Lee", "HR", List.of(p6), 66000.50, "Male");
        Employee e10 = new Employee(10, "Emily Clerk", "Development", List.of(p9), 73000.70, "Female");

        return Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);
    }
}
