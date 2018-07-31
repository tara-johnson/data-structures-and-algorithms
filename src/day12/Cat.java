package day12;

public class Cat extends Pet {
    // Constructor that creates a Cat instance
    // Name is passed in when the Cat is created
    public Cat(String name) {
        // The way we handle name is set up in the super class (this.name = name)
        super(name);
    }

    // Method to see what kind of sound this specific type of Pet makes
    public String sound() {
        return "meow";
    }
}