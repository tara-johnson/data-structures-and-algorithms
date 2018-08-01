package day12;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class AnimalShelterTest {

    @Test
    void emptyQueues() {
        AnimalShelter shelter = new AnimalShelter();

        String expectedDog = "[]";
        String resultsDog = shelter.dogShelter.toString();
        System.out.println("Expected dog queue: " + expectedDog);
        System.out.println("Results dog queue: " + resultsDog);

        String expectedCat = "[]";
        String resultsCat = shelter.catShelter.toString();
        System.out.println("Expected cat queue: " + expectedCat);
        System.out.println("Results cat queue: " + resultsCat);

        assertEquals(expectedDog, resultsDog);
        assertEquals(expectedCat, resultsCat);
    }

    @Test
    void enqueueOneDog() {
        AnimalShelter shelter = new AnimalShelter();
        shelter.enqueue("dog");

        String expectedDog = "[dog]";
        String resultsDog = shelter.dogShelter.toString();
        System.out.println("Expected dog queue: " + expectedDog);
        System.out.println("Results dog queue: " + resultsDog);

        String expectedCat = "[]";
        String resultsCat = shelter.catShelter.toString();
        System.out.println("Expected cat queue: " + expectedCat);
        System.out.println("Results cat queue: " + resultsCat);

        assertEquals(expectedDog, resultsDog);
        assertEquals(expectedCat, resultsCat);
    }

    @Test
    void enqueueOneCat() {
        AnimalShelter shelter = new AnimalShelter();
        shelter.enqueue("cat");

        String expectedDog = "[]";
        String resultsDog = shelter.dogShelter.toString();
        System.out.println("Expected dog queue: " + expectedDog);
        System.out.println("Results dog queue: " + resultsDog);

        String expectedCat = "[cat]";
        String resultsCat = shelter.catShelter.toString();
        System.out.println("Expected cat queue: " + expectedCat);
        System.out.println("Results cat queue: " + resultsCat);

        assertEquals(expectedDog, resultsDog);
        assertEquals(expectedCat, resultsCat);
    }

    @Test
    void enqueueManyAnimals() {
        AnimalShelter shelter = new AnimalShelter();
        shelter.enqueue("dog");
        shelter.enqueue("cat");
        shelter.enqueue("dog");
        shelter.enqueue("cat");
        shelter.enqueue("dog");
        shelter.enqueue("cat");
        shelter.enqueue("cat");

        String expectedDog = "[dog, dog, dog]";
        String resultsDog = shelter.dogShelter.toString();
        System.out.println("Expected dog queue: " + expectedDog);
        System.out.println("Results dog queue: " + resultsDog);

        String expectedCat = "[cat, cat, cat, cat]";
        String resultsCat = shelter.catShelter.toString();
        System.out.println("Expected cat queue: " + expectedCat);
        System.out.println("Results cat queue: " + resultsCat);

        assertEquals(expectedDog, resultsDog);
        assertEquals(expectedCat, resultsCat);

    }

    @Test
    void enqueueWrongAnimal() {
        AnimalShelter shelter = new AnimalShelter();
        shelter.enqueue("fish");

        String expectedDog = "[]";
        String resultsDog = shelter.dogShelter.toString();
        System.out.println("Expected dog queue: " + expectedDog);
        System.out.println("Results dog queue: " + resultsDog);

        String expectedCat = "[]";
        String resultsCat = shelter.catShelter.toString();
        System.out.println("Expected cat queue: " + expectedCat);
        System.out.println("Results cat queue: " + resultsCat);

        String expectedWrong = "Sorry, we only take dogs and cats";
        String resultsWrong = shelter.enqueue("fish");
        System.out.println("Expected wrong reply: " + expectedWrong);
        System.out.println("Results wrong reply: " + resultsWrong);

        assertEquals(expectedDog, resultsDog);
        assertEquals(expectedCat, resultsCat);
        assertEquals(expectedWrong, resultsWrong);
    }

    @Test
    void emptyQueueDequeue() {
        AnimalShelter shelter = new AnimalShelter();

        String expectedDog = "Sorry, we don't have dogs or cats right now";
        String resultsDog = shelter.dequeue("dog");
        System.out.println("Expected empty dog queue: " + expectedDog);
        System.out.println("Results empty dog queue: " + resultsDog);

        String expectedCat = "Sorry, we don't have dogs or cats right now";
        String resultsCat = shelter.dequeue("cat");
        System.out.println("Expected empty cat queue: " + expectedCat);
        System.out.println("Results empty cat queue: " + resultsCat);

        assertEquals(expectedDog, resultsDog);
        assertEquals(expectedCat, resultsCat);
    }

    @Test
    void dequeueFromSingleQueue() {
        AnimalShelter shelter = new AnimalShelter();

        shelter.enqueue("dog");
        shelter.enqueue("cat");
        shelter.dequeue("dog");
        shelter.dequeue("cat");

        String expectedDog = "[]";
        String resultsDog = shelter.dogShelter.toString();
        System.out.println("Expected dog queue: " + expectedDog);
        System.out.println("Results dog queue: " + resultsDog);

        String expectedCat = "[]";
        String resultsCat = shelter.catShelter.toString();
        System.out.println("Expected cat queue: " + expectedCat);
        System.out.println("Results cat queue: " + resultsCat);

        assertEquals(expectedDog, resultsDog);
        assertEquals(expectedCat, resultsCat);
    }

    @Test
    void dequeueOneEach() {
        AnimalShelter shelter = new AnimalShelter();

        shelter.enqueue("dog");
        shelter.enqueue("cat");
        shelter.enqueue("dog");
        shelter.enqueue("cat");
        shelter.enqueue("dog");
        shelter.enqueue("cat");
        shelter.enqueue("cat");
        shelter.dequeue("dog");
        shelter.dequeue("cat");

        String expectedDog = "[dog, dog]";
        String resultsDog = shelter.dogShelter.toString();
        System.out.println("Expected dog queue: " + expectedDog);
        System.out.println("Results dog queue: " + resultsDog);

        String expectedCat = "[cat, cat, cat]";
        String resultsCat = shelter.catShelter.toString();
        System.out.println("Expected cat queue: " + expectedCat);
        System.out.println("Results cat queue: " + resultsCat);

        assertEquals(expectedDog, resultsDog);
        assertEquals(expectedCat, resultsCat);
    }

    @Test
    void wrongAnimalDequeue() {
        AnimalShelter shelter = new AnimalShelter();

        String expectedWrong = "Sorry, we only have dogs and cats";
        String resultsWrong = shelter.dequeue("fish");
        System.out.println("Expected wrong animal message: " + expectedWrong);
        System.out.println("Results wrong animal message: " + resultsWrong);

        assertEquals(expectedWrong, resultsWrong);
    }
}