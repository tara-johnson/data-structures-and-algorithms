package day12;

import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {
    private Queue<Pet> shelter = new LinkedList<>();
    public Pet animal;

    public void enqueue(Pet pet) {
        shelter.add(pet);
    }

    public String dequeue(String pref) {
        if (pref != "dog" && pref != "cat") {
            // Converting toString will return the name of the pet
            return shelter.poll().toString();
        }

        // Determine which animal is next in the queue by the sound they make
        String sound = shelter.peek().sound();

        String yourPet = null;
        if (pref == "dog" && sound == "bark") {
            // Converting toString will return the name of the pet
            System.out.println(shelter.peek().toString());
            System.out.println(sound);
            return shelter.poll().toString();
        } else {
            for (int i = 0; i < (shelter.size() - 1); i++) {
                System.out.println(sound);
                if (pref == "dog" && sound != "bark") {
                    System.out.println(shelter);
                    enqueue(shelter.poll());
                    System.out.println(shelter);
                } else if (pref == "dog" && sound == "bark") {
                    yourPet = shelter.poll().toString();
                    System.out.println(yourPet);
                }

                return yourPet;
            }
        }
        return "?";
    }

    public String toString() {
        return shelter.toString();
    }

    public static String shelterToString(Queue<Pet> input) {
        String output = "";
        for (Pet pet : input) {
            output = output + pet.name + " , ";
        }
        return output;
    }
}