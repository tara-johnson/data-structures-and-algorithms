package day14;

import java.util.Stack;

public class MaxStack extends Stack {

    // Set up a main stack
    public Stack<Integer> mainStack = new Stack<>();

    // Set up another stack to track the current maximum value
    public Stack<Integer> maxStack = new Stack<>();

    public void push(int n) {
        // If mainStack is empty, add 'n' to both stacks
        // The first element in maxStack is the maxValue, which starts off as 'n' if the stack is empty
        if (mainStack.isEmpty()) {
            mainStack.add(n);
            System.out.println("Starts empty mainStack: " + mainStack);
            maxStack.add(n);
            System.out.println("Starts empty maxStack: " + maxStack);
        } else {
            // If mainStack is not empty, add 'n' to mainStack
            mainStack.add(n);
            System.out.println("Starts with an element mainStack: " + mainStack);
            // Add 'n' to maxStack if it's value is greater than the top value in maxStack
            if (n >= maxStack.peek()) {
                maxStack.add(n);
                System.out.println("If n is greater than peek maxStack: " + maxStack);
            }
        }
    }

    public Integer remove() {
        // If there are elements in the mainStack compare the top element in both stacks
        try {
            // If they are equal, pop it from maxStack since it is no longer the maxValue
            if (mainStack.peek() == maxStack.peek()) {
                maxStack.pop();
                System.out.println("maxStack after pop: " + maxStack);
                return (int) mainStack.pop();
            } else {
                mainStack.pop();
                System.out.println("mainStack after pop: " + mainStack);
            }
        } catch (Exception e) {
            System.out.println("Stack is empty");
        }
        return null;
    }

    // The top element in maxStack is the maximum value
    // .peek() returns the value
    public Integer maxValue() {
        if (mainStack.isEmpty()) {
            return null;
        }
        System.out.println(maxStack.peek());
        return (int) maxStack.peek();
    }
}