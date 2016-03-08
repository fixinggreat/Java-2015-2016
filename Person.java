/**
 * Created by Henok on 3/7/2016.
 */
public class Person {
    int age;
    String location;

    public Person(int PersonAge, String PersonLocation) {
        location=PersonLocation;
        age = PersonAge;
    }

    public String toString() {

        return "Age: " + age + " Location: " + location;
    }
}