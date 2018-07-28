package day15;

import java.util.Queue;

public class EeneyMeeney {
    public static String eeneyMeeneyMineyMoe(Queue<String> qq, int n) {
        while (qq.size() > 1) {
            // Iterate through the queue 'n' times and move the people you are passing over to the back of the queue
            for (int count = 0; count < n - 1; count++) {
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
