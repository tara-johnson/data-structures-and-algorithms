package day14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxStackTest {

    @Test
    void emptyStackTest() {
        MaxStack s1 = new MaxStack();
        Integer result = s1.maxValue();
        assertEquals(null, result);
    }

    @Test
    void maxStackPushTest() {
        MaxStack s1 = new MaxStack();

        s1.push(2);
        s1.push(6);
        s1.push(5);
        int result1 = s1.maxValue();
        s1.push(4);
        s1.push(7);
        s1.push(3);
        int result2 = s1.maxValue();

        assertEquals(6, result1);
        assertEquals(7, result2);
    }

    @Test
    void maxValueDuplicateTest() {
        MaxStack s1 = new MaxStack();
        s1.push(2);
        s1.push(6);
        s1.push(5);
        s1.push(4);
        s1.push(7);
        s1.push(7);
        int result1 = s1.maxValue();
        s1.remove();
        int result2 = s1.maxValue();

        System.out.println(result1);
        System.out.println(result2);

        assertEquals(7, result1);
        assertEquals(7, result2);
        assertEquals(result1, result2);
    }

    @Test
    void maxStackRemoveTest() {
        MaxStack s1 = new MaxStack();

        s1.push(2);
        s1.push(6);
        s1.push(5);
        int result1 = s1.maxValue(); // expect result1 = 6
        s1.remove();
        int result2 = s1.maxValue(); // expect result2 = 6
        s1.remove();
        int result3 = s1.maxValue(); // expect result3 = 2
        s1.push(4);
        s1.push(7);
        s1.push(3);
        int result4 = s1.maxValue(); // expect result4 = 7
        s1.remove();
        int result5 = s1.maxValue(); // expect result5 = 7

        assertEquals(6, result1);
        assertEquals(6, result2);
        assertEquals(2, result3);
        assertEquals(7, result4);
        assertEquals(7, result5);
    }
}