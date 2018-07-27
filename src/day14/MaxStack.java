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
            if (n > maxStack.peek()) {
                maxStack.add(n);
                System.out.println("If n is greater than peek maxStack: " + maxStack);
            }
        }
    }

    public int remove() {
        // If there are elements in the mainStack compare the top element in both stacks
        if (!mainStack.isEmpty()) {
            // If they are equal, pop it from maxStack since it is no longer the maxValue
            if (mainStack.peek() == maxStack.peek()) {
                maxStack.pop();
                System.out.println("max stack after pop: " + maxStack);
                System.out.println("main stack before pop: " + mainStack);
                return mainStack.pop();
            } else {
                mainStack.pop();
                System.out.println("main stack after pop: " + mainStack);
            }
        }
        return 0;
    }

    // The top element in maxStack is the maximum value
    // .peek() returns the value
    public int maxValue() {
        if (mainStack.isEmpty()) {
            return 0;
        }
        System.out.println(maxStack.peek());
        return maxStack.peek();
    }
}

// This solution may not meet the requirements of the challenge
//public class MaxStack extends Stack {
//
//    // Method accepts an argument of a stack
//    public static int maxStack(Stack<Integer> s1) {
//        // Set up two stacks, one to hold the max values
////        s1 = new Stack<>();
//        Stack<Integer> maxStack = new Stack<>();
//
//        if (s1.isEmpty()) {
//            return 0;
//        }
//
//        // Get the size of the stack
//        int s1Length = s1.size();
//
//        // Set the maxValue variable to keep track of the maxValue
//        int maxValue = maxStack.push(s1.peek());
//
//        // Iterate through the stack and compare maxValue to the value of each element in the stack
//        for (int value : s1) {
//            // if maxValue is less than the value of the element in the stack
//            // set the maxValue to value
//            // push the value into maxStack
//            if (maxValue < value) {
//                System.out.println("maxValue: " + maxValue);
//                System.out.println("value: " + value);
//                maxValue = value;
//                System.out.println("value: " + value);
//                maxStack.push(value);
//                System.out.println("maxStack: " + maxStack);
//            }
//        }
//
//        System.out.println("maxStack: " + maxStack);
//        System.out.println("maxStack peek: " + maxStack.peek());
//        return maxStack.peek();
//    }
//}