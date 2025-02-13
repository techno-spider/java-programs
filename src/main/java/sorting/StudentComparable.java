package sorting;

public class StudentComparable implements Comparable<StudentComparable> {

    String name;
    int age;

    public StudentComparable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(StudentComparable o) {
        return this.age - o.age; // Natural ordering by age
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
