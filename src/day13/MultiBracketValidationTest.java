package day13;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class MultiBracketValidationTest {

    Stack<Character> bracketStack = new Stack<>();

    @Test
    void emptyStringTest() {
        boolean result = MultiBracketValidation.multiBracketValidation("");
        boolean expected = true;

        assertEquals(expected, result);
    }

    @Test
    void bracketsOnlyBalanced() {
        boolean result = MultiBracketValidation.multiBracketValidation("{}(){}");
        boolean expected = true;

        assertEquals(expected, result);
    }

    @Test
    void bracketsOnlyUnbalanced() {
        boolean result = MultiBracketValidation.multiBracketValidation("([(");
        boolean expected = false;

        assertEquals(expected, result);
    }

    @Test
    void mixedCharacterBalanced() {
        boolean result = MultiBracketValidation.multiBracketValidation("{}{Code}[Fellows](())");
        boolean expected = true;

        assertEquals(expected, result);
    }

    @Test
    void mixedCharacterUnbalanced() {
        boolean result = MultiBracketValidation.multiBracketValidation("()[[Extra Characters]");
        boolean expected = false;

        assertEquals(expected, result);
    }
}