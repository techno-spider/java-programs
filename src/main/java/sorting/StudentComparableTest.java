package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparableTest {
    public static void main(String[] args) {

        List<StudentComparable> students = new ArrayList<>();

        students.add(new StudentComparable("Alice", 25));
        students.add(new StudentComparable("Bob", 20));
        students.add(new StudentComparable("Charlie", 30));

        Collections.sort(students); // Uses compareTo() from Comparable
        System.out.println(students);
    }
}

/*
 * output:
 * [Bob (20), Alice (25), Charlie (30)]
 * */