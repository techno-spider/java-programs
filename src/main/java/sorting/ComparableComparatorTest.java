package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableComparatorTest {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Mike", 33));
        persons.add(new Person("Alice", 27));
        persons.add(new Person("Steve", 30));
        persons.add(new Person("Charlie", 29));
        persons.add(new Person("Bob", 30));

        // Sorting using Comparable (natural sorting order)
        Collections.sort(persons);
        System.out.println("Sorted by age (Comparable): ");
        System.out.println(persons);

        // Sorting age using Comparator (Custom Comparison)
        Collections.sort(persons, new Person.AgeComparator());
        System.out.println("\nSorted by age (Comparator): ");
        System.out.println(persons);

        // Sorting name using Comparator (Custom Comparison)
        Collections.sort(persons, new Person.NameComparator());
        System.out.println("\nSorted by name (Comparator): ");
        System.out.println(persons);
    }
}

/*
 * output:
 * Sorted by age (Comparable):
 * [Person [name=Alice, age=27], Person [name=Bob, age=30], Person
 * [name=Charlie, age=29], Person [name=Mike, age=33], Person [name=Steve,
 * age=30]]
 *
 * Sorted by age (Comparator):
 * [Person [name=Alice, age=27], Person [name=Charlie, age=29], Person
 * [name=Bob, age=30], Person [name=Steve, age=30], Person [name=Mike, age=33]]
 *
 * Sorted by name (Comparator):
 * [Person [name=Alice, age=27], Person [name=Bob, age=30], Person
 * [name=Charlie, age=29], Person [name=Mike, age=33], Person [name=Steve,
 * age=30]]
 *
 */