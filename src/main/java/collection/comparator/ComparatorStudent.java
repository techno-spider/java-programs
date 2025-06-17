package collection.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorStudent {

    public static void main(String[] args) {

        Student[] students = {new Student("John", 31), new Student("Sophie", 72), new Student("Mike", 10),
                              new Student("Dave", 29)};

        Arrays.sort(students, Comparator.comparing(student -> student.name));

        for (Student student : students)
            System.out.println(student);
    }
}
