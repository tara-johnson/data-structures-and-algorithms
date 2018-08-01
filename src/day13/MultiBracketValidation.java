package day13;

import java.util.Stack;

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String ss) {
        Stack<Character> bracketStack = new Stack<>();
        boolean balanced = true;

        // An empty string will return true
        if (ss.isEmpty()) {
            return balanced;
        }

        // Iterate through the string
        for (int i = 0; i < ss.length(); i++) {
            // Put opening brackets in the stack
            if (ss.charAt(i) == '(' || ss.charAt(i) == '[' || ss.charAt(i) == '{') {
                bracketStack.push(ss.charAt(i));
                System.out.println("Stack opening brackets: " + bracketStack.toString());
            }

            // When a closing brackets is identified
            // Compare it to the opening bracket at the top of the stack
            // If they match, pop the opening bracket from the stack
            if (ss.charAt(i) == ')' || ss.charAt(i) == ']' || ss.charAt(i) == '}') {
                // If the stack is empty when a closing bracket is identified, the brackets are unbalanced
                // Set balanced to false and return
                if (bracketStack.isEmpty()) {
                    balanced = false;
                    return balanced;
                }
                if (bracketStack.peek() == '(' && ss.charAt(i) == ')') {
                    System.out.println("Before ( pop: " + bracketStack.toString());
                    bracketStack.pop();
                    System.out.println("After ( pop: " + bracketStack.toString());
                } else if (bracketStack.peek() == '[' && ss.charAt(i) == ']') {
                    System.out.println("Before [ pop: " + bracketStack.toString());
                    bracketStack.pop();
                    System.out.println("After [ pop: " + bracketStack.toString());
                } else if (bracketStack.peek() == '{' && ss.charAt(i) == '}') {
                    System.out.println("After { pop: " + bracketStack.toString());
                    bracketStack.pop();
                    System.out.println("After } pop: " + bracketStack.toString());
                }
            }
        }
        // If there are still items in the stack after iterating through the string, the brackets are unbalanced
        // Set balanced to false
        if (!bracketStack.isEmpty()) {
            balanced = false;
        }
        return balanced;
    }
}
