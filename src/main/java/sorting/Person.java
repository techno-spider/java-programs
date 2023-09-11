package sorting;

import java.util.Comparator;

public class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Sorting age using Comparable (natural sorting)
    @Override
    public int compareTo(Person person) {
        return this.name.compareTo(person.name);
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    // Sorting age using Comparator (custom comparison)
    public static class AgeComparator implements Comparator<Person> {

        @Override
        public int compare(Person p1, Person p2) {
            return Integer.compare(p1.getAge(), p2.getAge());
        }
    }

    // Sorting name using Comparator (custom comparison)
    public static class NameComparator implements Comparator<Person> {

        @Override
        public int compare(Person p1, Person p2) {
            return p1.getName().compareTo(p2.getName());
        }
    }
}