package day15;

import java.util.Queue;

public class EeneyMeeney {
    public static String eeneyMeeneyMineyMoe(Queue<String> qq, int n) {
        // Only count through the queue if there is more than 1 person in it
        while (qq.size() > 1) {
            // Iterate through the queue 'n' times and move the people you are passing over to the back of the queue
            for (int i = 0; i < n - 1; i++) {
                String passedPerson = qq.poll();
                qq.add(passedPerson);
            }
            // Remove the person at 'n' from the queue
            String removed = qq.poll();
            System.out.println("Person removed: " + removed);
        }
        // Return the name of the last person left in the list
        String lastPerson = qq.peek();
        System.out.println("Last person left: " + lastPerson);
        return lastPerson;
    }
}
