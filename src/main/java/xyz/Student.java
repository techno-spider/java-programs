package xyz;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Student {

    private String name;
    private int age;
    private String branch;

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", branch=" + branch + "]";
    }

    public List<String> convertToUpperCase(List<String> names) {

        List<String> upNames = names.stream()
                .map(name -> name.toUpperCase())
                .toList();

        return upNames;
    }

    public static void main(String[] args) {

        List<Student> stdList = new ArrayList<>();

        stdList.add(new Student("Bahubali", 19, "cse"));
        stdList.add(new Student("Devasena", 17, "cse"));
        stdList.add(new Student("Bhallaldeva", 18, "electronics"));
        stdList.add(new Student("Mahismati", 25, "mechanical"));
        stdList.add(new Student("Katappa", 25, "civil"));
        stdList.add(new Student("Sivgami", 24, "electrical"));
        stdList.add(new Student("Kalkeya", 23, "Mechanical"));
        stdList.add(new Student("Avantika", 16, "cse"));
        stdList.add(new Student("Shiva", 19, "electronics"));
        stdList.add(new Student("Rajamouli", 25, "cse"));

        stdList.stream()
                .filter(std -> std.getName().startsWith("K"))
                .forEach(System.out::println);
    }

}
