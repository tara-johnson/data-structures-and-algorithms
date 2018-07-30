package day12;

public class Pet {
    public String name;
    public String sound;

    // Constructor that creates an instance of a Pet
    // name is passed in when the Pet is created
    public Pet(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    // This method is overwritten by the sub-classes Cat and Dog (or any animal that is created)
    public String sound() {
        return "";
    }

    // This method is used by and available to all sub-classes since all Pets will have a name when created
    public String name() {
        System.out.println(this.name);
        return this.name;
    }
}