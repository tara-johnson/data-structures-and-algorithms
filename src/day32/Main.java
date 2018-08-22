package day32;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Creating an empty array list
        HashSet<Integer> bags = new HashSet<>();

        // Add values in the bags Set.
        bags.add(6);
        bags.add(5);
        bags.add(4);

        // Creating another empty array list
        HashSet<Integer> boxes = new HashSet<>();

        // Add values in the boxes list.
        boxes.add(6);
        boxes.add(5);
        boxes.add(2);
        boxes.add(1);
        boxes.add(3);

        // Before Applying method print both list and set.
        System.out.println("Bags Contains :" + bags);
        System.out.println("Boxes Contains :" + boxes);

        // Apply retainAll() method to boxes passing bags as parameter
        boxes.retainAll(bags);

        // Displaying both the lists after operation
        System.out.println("\nAfter Applying retainAll()" +
                " method to Boxes\n");
        System.out.println("Bags Contains :" + bags);
        System.out.println("Boxes Contains :" + boxes);
    }
}
