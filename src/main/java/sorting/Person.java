package sorting;

import java.util.Comparator;

public record Person(String name, int age) implements Comparable<Person> {

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
            return Integer.compare(p1.age(), p2.age());
        }
    }

    // Sorting name using Comparator (custom comparison)
    public static class NameComparator implements Comparator<Person> {

        @Override
        public int compare(Person p1, Person p2) {
            return p1.name()
                     .compareTo(p2.name());
        }
    }
}