package day12;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class AnimalShelterTest {

    @Test
    void enqueueAnimals() {
        AnimalShelter shelter = new AnimalShelter();
        Dog dog1 = new Dog("Schweppes");
        Cat cat1 = new Cat("Patches");
        Dog dog2 = new Dog("Shane");
        Cat cat2 = new Cat("Chloe");
        Dog dog3 = new Dog("Lex");
        Cat cat3 = new Cat("Dylan");
        Cat cat4 = new Cat("Delilah");
        shelter.enqueue(dog1);
        shelter.enqueue(cat1);
        shelter.enqueue(dog2);
        shelter.enqueue(cat2);
        shelter.enqueue(dog3);
        shelter.enqueue(cat3);
        shelter.enqueue(cat4);

        String expected = "[Schweppes, Patches, Shane, Chloe, Lex, Dylan, Delilah]";
        String result = shelter.toString();
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);

        assertEquals(expected, result);
    }

    @Test
    void dequeueNotCatOrDogTest() {
        AnimalShelter shelter = new AnimalShelter();
        Dog dog1 = new Dog("Schweppes");
        Cat cat1 = new Cat("Patches");
        Dog dog2 = new Dog("Shane");
        Cat cat2 = new Cat("Chloe");
        Dog dog3 = new Dog("Lex");
        Cat cat3 = new Cat("Dylan");
        Cat cat4 = new Cat("Delilah");
        shelter.enqueue(dog1);
        shelter.enqueue(cat1);
        shelter.enqueue(dog2);
        shelter.enqueue(cat2);
        shelter.enqueue(dog3);
        shelter.enqueue(cat3);
        shelter.enqueue(cat4);

        String result = shelter.dequeue("bird");
        String expected = "Schweppes";

        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);
    }

    @Test
    void dequeueDogFirstTest() {
        AnimalShelter shelter = new AnimalShelter();
        Dog dog1 = new Dog("Schweppes");
        Cat cat1 = new Cat("Patches");
        Dog dog2 = new Dog("Shane");
        Cat cat2 = new Cat("Chloe");
        Dog dog3 = new Dog("Lex");
        Cat cat3 = new Cat("Dylan");
        Cat cat4 = new Cat("Delilah");
        shelter.enqueue(dog1);
        shelter.enqueue(cat1);
        shelter.enqueue(dog2);
        shelter.enqueue(cat2);
        shelter.enqueue(dog3);
        shelter.enqueue(cat3);
        shelter.enqueue(cat4);

        String result = shelter.dequeue("dog");
        String expected = "Schweppes";

        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);
    }

    @Test
    void dequeueDogNotFirstTest() {
        AnimalShelter shelter = new AnimalShelter();
        Cat cat1 = new Cat("Patches");
        Cat cat2 = new Cat("Chloe");
        Dog dog3 = new Dog("Lex");
        Cat cat3 = new Cat("Dylan");
        Cat cat4 = new Cat("Delilah");
        shelter.enqueue(cat1);
        shelter.enqueue(cat2);
        shelter.enqueue(dog3);
        shelter.enqueue(cat3);
        shelter.enqueue(cat4);

        String result = shelter.dequeue("dog");
        String expected = "Lex";

        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);
    }

    @Test
    void makeCatTest() {
        Cat cat1 = new Cat("Fluffy");
        assertEquals("Fluffy", cat1.name());
        assertEquals("meow", cat1.sound());
    }

    @Test
    void makeDogTest() {
        Dog dog1 = new Dog("Spike");
        assertEquals("Spike", dog1.name());
        assertEquals("bark", dog1.sound());
    }
}