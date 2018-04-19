package patterns.creational.prototype;

public class Person implements Prototype {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person(Person person) {
        this.name = person.name;
    }

    @Override
    public Prototype clone() {
        return new Person(this);
    }

    @Override
    public String toString() {
        return "my name is " + name;
    }
}
