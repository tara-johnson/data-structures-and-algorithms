package day12;

import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {
    // Create two queues, one for dogs and one for cats
    Queue<String> dogShelter = new LinkedList<>();
    Queue<String> catShelter = new LinkedList<>();

    // Add a dog or cat to the appropriate queue
    // If neither a dog or cat, print error message
    public String enqueue(String pet) {
        if (pet.equalsIgnoreCase("dog")) {
            dogShelter.add(pet);
        } else if (pet.equalsIgnoreCase("cat")) {
            catShelter.add(pet);
        } else {
            String wrongAnimal = "Sorry, we only take dogs and cats";
            return wrongAnimal;
        }
        String thankYou = "Thanks for stopping by";
        return thankYou;
    }

    public String dequeue(String pref) {
        // If preference is not for a dog or cat, return "only dogs or cats" message
        if (!pref.equalsIgnoreCase("dog") && !pref.equalsIgnoreCase("cat")) {
            String wrongAnimal = "Sorry, we only have dogs and cats";
            return wrongAnimal;
        }

        // Return "no animals" message if both shelters are empty
        if (dogShelter.isEmpty() && catShelter.isEmpty()) {
            String noAnimals = "Sorry, we don't have dogs or cats right now";
            return noAnimals;
        }

        // If preference is dog and shelter is empty, return "no dogs" message
        if (pref.equalsIgnoreCase("dog") && dogShelter.isEmpty()) {
            System.out.println("Sorry, we don't have any dogs");
        } else if (pref.equalsIgnoreCase("dog")) {
            // Remove the first dog from the queue
            dogShelter.poll();
        }

        // If preference is cat and shelter is empty, return "no cats" message
        if (pref.equalsIgnoreCase("cat") && catShelter.isEmpty()) {
            System.out.println("Sorry, we don't have any cats");
        } else if (pref.equalsIgnoreCase("cat")) {
            // Remove the first cat from the queue
            catShelter.poll();
        }

        String thankYou = "Thanks for stopping by";
        return thankYou;
    }
}