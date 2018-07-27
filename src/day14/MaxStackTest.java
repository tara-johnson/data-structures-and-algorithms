package day14;

import org.junit.jupiter.api.Test;

import java.util.Stack;

//import static day14.MaxStack.maxStack;
import static org.junit.jupiter.api.Assertions.*;

class MaxStackTest {

    @Test
    void emptyStackTest() {
        MaxStack s1 = new MaxStack();
        int result = s1.maxValue();
        assertEquals(0, result);
    }

    @Test
    void maxStackPushTest() {
        MaxStack s1 = new MaxStack();

        s1.push(2);
        s1.push(6);
        s1.push(5);
        s1.push(4);
        s1.push(7);
        s1.push(3);

        System.out.println(s1.toString());
        int result = s1.maxValue();
        assertEquals(7, result);
    }

    @Test
    void maxStackPopTest() {
        MaxStack s1 = new MaxStack();

        s1.push(2);
        s1.push(6);
        s1.push(5);
        s1.push(4);
        s1.push(7);
        s1.remove();
        s1.push(2);
        s1.push(6);
        s1.push(5);
        s1.push(4);
        s1.remove();
        s1.push(7);
        s1.push(3);
        s1.remove();
        s1.remove();

        System.out.println(s1.toString());
        int result = s1.maxValue();
        assertEquals(6, result);
    }

    @Test
    void maxStackPushAndPopTest() {
        MaxStack mainStack = new MaxStack();

        mainStack.push(2);
        mainStack.push(6);
        mainStack.push(5);
        mainStack.push(4);
        mainStack.push(7);
        mainStack.remove();
        mainStack.push(3);

        System.out.println(mainStack.toString());
        int result = mainStack.maxValue();
        assertEquals(6, result);
    }

    @Test
    void maxValueDuplicateTest() {
        MaxStack s1 = new MaxStack();
        s1.push(2);
        s1.push(6);
        s1.push(5);
        s1.push(4);
        s1.push(7);
        s1.remove();
        s1.push(7);
        s1.push(3);
        System.out.println(s1.toString());
        int result = s1.maxValue();
        assertEquals(7, result);
    }
}

//    @Test
//    void maxValuePushTest() {
//        Stack<Integer> s1 = new Stack<>();
//        s1.push(2);
//        s1.push(6);
//        s1.push(5);
//        s1.push(4);
//        s1.push(7);
//        s1.push(3);
//        maxStack(s1);
//        assertEquals(7, maxStack(s1));
//    }
//
//    @Test
//    void maxValuePopTest() {
//        Stack<Integer> s1 = new Stack<>();
//        s1.push(2);
//        s1.push(6);
//        s1.push(5);
//        s1.push(4);
//        s1.push(7);
//        s1.push(10);
//        s1.pop();
//        s1.push(2);
//        maxStack(s1);
//        assertEquals(7, maxStack(s1));
//    }
//
//    @Test
//    void maxValuePushAndPopTest() {
//        Stack<Integer> s1 = new Stack<>();
//        s1.push(2);
//        s1.push(6);
//        s1.pop();
//        s1.push(5);
//        s1.push(4);
//        s1.push(7);
//        s1.pop();
//        s1.push(3);
//        maxStack(s1);
//        assertEquals(5, maxStack(s1));
//    }
//
//    @Test
//    void maxValueFirstElementTest() {
//        Stack<Integer> s1 = new Stack<>();
//        s1.push(10);
//        s1.push(6);
//        s1.pop();
//        s1.push(5);
//        s1.push(4);
//        s1.push(7);
//        s1.pop();
//        s1.push(3);
//        MaxStack.maxStack(s1);
//        assertEquals(10, maxStack(s1));
//    }
//
//    @Test
//    void emptyStackTest() {
//        Stack<Integer> s1 = new Stack<>();
//        maxStack(s1);
//        assertEquals(0, maxStack(s1));
//    }
//}