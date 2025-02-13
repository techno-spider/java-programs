package sorting;

import java.util.ArrayList;
import java.util.List;

public class StudentComparatorTest {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 25));
        students.add(new Student("Bob", 20));
        students.add(new Student("Charlie", 30));

        //Collections.sort(students, new StudentAgeComparator());
        students.sort(new StudentAgeComparator()); // Uses compare() from Comparator
        System.out.println(students);
    }
}

/*
 * output:
 * [Bob (20), Alice (25), Charlie (30)]
 * */
