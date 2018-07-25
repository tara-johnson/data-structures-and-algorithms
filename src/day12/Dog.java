package day12;

public class Dog extends Pet {
    // Constructor that creates a Dog instance
    // Name is passed in when the Dog is created
    public Dog(String name) {
        // The way we handle name is set up in the super class (this.name = name)
        super(name);
    }

    // Method to see what kind of sound this specific type of Pet makes
    public String sound() {
        System.out.println("bark");
        return "bark";
    }
}
