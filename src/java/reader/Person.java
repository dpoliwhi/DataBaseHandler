package reader;

public class Person {
    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                '}';
    }

    private String lastName;

    public Person(String lastname) {
        this.lastName = lastname;
    }

    public String getLastname() {
        return lastName;
    }
}
