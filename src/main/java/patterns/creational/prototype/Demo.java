package patterns.creational.prototype;

public class Demo {
    public static void main(String[] args) {
        Person person = new Person("Max");
        Person clonedPerson = (Person) person.clone();
        System.out.println(person);
        System.out.println(clonedPerson);

        Dog dog = new Dog("Woof-wof!");
        Dog clonedDog = (Dog) dog.clone();
        System.out.println(dog);
        System.out.println(clonedDog);
    }
}
