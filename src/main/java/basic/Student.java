package basic;

// If a class has an entity reference, it is known as 'Aggregation'
// 'Aggregation' represents HAS-A relationship
// 'Aggregation' used for code re-usability
// In this example, 'Student' has an object of 'address', 'address' object contains its own information such as "city, state, country". In such a case the relationship is "Student HAS-A address"

public class Student {

    int id;
    String name;
    Address address;

    public Student(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void showDetails() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }

    public static void main(String[] args) {
        Address add1 = new Address("Mumbai", "Maharashtra", "India");
        Address add2 = new Address("Surat", "Gujrat", "India");

        Student s1 = new Student(15, "Mike", add1);
        Student s2 = new Student(16, "Steve", add2);

        s1.showDetails();
        s2.showDetails();
    }
}

/*
 * output:
 * 15 Mike
 * Mumbai Maharashtra India
 * 16 Steve
 * Surat Gujrat India
 */