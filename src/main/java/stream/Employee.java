package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Employee {

    private String name;
    private int age;
    private String email;

    @Override
    public String toString() {
        return "Employee [name: " + name + ", age: " + age + ", email: " + email + "]";
    }

    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee("Randy", 26, "randy@eg.com"));
        empList.add(new Employee("Mike ", 27, "mike@eg.com"));
        empList.add(new Employee("Emma", 24, "emma@eg.com"));
        empList.add(new Employee("Andrew", 32, "andrew@eg.com"));
        empList.add(new Employee("Alice", 26, "alice@eg.com"));
        empList.add(new Employee("Steve", 27, "steve@eg.com"));
        empList.add(new Employee("Charlie", 28, "charlieeg.com"));
        empList.add(new Employee("Bob", 25, "bob@eg.com"));
        empList.add(new Employee("Alon", 29, "alon@eg.com"));
        empList.add(new Employee("Damien", 27, "damien@eg.com"));

        empList.stream()
                .filter(emp -> emp.getName().startsWith("A") && emp.getAge() > 26)
                .sorted(Comparator.comparing(Employee::getAge))
                .toList()
                .forEach(System.out::println);
    }
}

/*
 * output:
 * Employee [name: Alon, age: 29, email: alon@eg.com]
 * Employee [name: Andrew, age: 32, email: andrew@eg.com]
 */