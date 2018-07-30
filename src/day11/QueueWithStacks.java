package day11;

import java.util.Stack;

public class QueueWithStacks {
    public Stack<Integer> s1 = new Stack<>();
    public Stack<Integer> s2 = new Stack<>();

    public void enqueue(int value) {
        s1.push(value);
    }

    public int dequeue() {
        if (s1.isEmpty()) {
            return 0; // Couldn't figure out how to make this null
        }

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        int popped = s2.pop();
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return popped;
    }

    public String toString() {
        return s1.toString();
    }
}