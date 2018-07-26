package day12;

import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {
    private Queue<Pet> shelter = new LinkedList<>();
    public Pet animal;

    public static String shelterToString(Queue<Pet> input) {
        String output = "";
        for (Pet pet : input) {
            output = output + pet.name + " , ";
        }
        return output;
    }

    public String toString() {
        return shelter.toString();
    }

    public void enqueue(Pet pet) {
        shelter.add(pet);
    }

//    public void dequeue(String pref) {
//    }
}