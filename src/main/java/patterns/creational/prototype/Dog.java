package patterns.creational.prototype;

public class Dog implements Prototype {
    private String sound;

    public Dog(String sound) {
        this.sound = sound;
    }

    public Dog(Dog dog) {
        this.sound = dog.sound;
    }

    @Override
    public Prototype clone() {
        return new Dog(this);
    }

    @Override
    public String toString() {
        return "dog barks " + sound;
    }
}
