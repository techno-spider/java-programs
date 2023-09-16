package scenariobased;

import java.util.function.Function;

public class PersonTest {
    public static void main(String[] args) {

        Function<String, Person> personFactory = Person::new;
        Person person = personFactory.apply("John");
        System.out.println(person.getName());
    }
}
