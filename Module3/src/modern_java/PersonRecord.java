package modern_java;

import java.util.Arrays;
import java.util.List;

public class PersonRecord {

    // Record declaration
    record Person(String name, int age) {}

    public static void main(String[] args) {

        Person person1 = new Person("Yash", 21);

        Person person2 = new Person("Aman", 17);

        Person person3 = new Person("Riya", 25);

        // Print record objects
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        // Store records in a List
        List<Person> people = Arrays.asList(
                person1,
                person2,
                person3
        );

        // Filter persons with age >= 18
        System.out.println("\nAdults:");

        people.stream()
                .filter(person -> person.age() >= 18)
                .forEach(System.out::println);
    }
}