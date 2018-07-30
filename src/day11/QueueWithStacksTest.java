package day11;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class QueueWithStacksTest {

    @Test
    void enqueueNothing() {
        QueueWithStacks fakeQ = new QueueWithStacks();

        String expected = "[]";
        String result = fakeQ.toString();

        System.out.println(expected);
        System.out.println(result);
        assertEquals(expected, result);
    }

    @Test
    void enqueueSingleValue() {
        QueueWithStacks fakeQ = new QueueWithStacks();

        fakeQ.enqueue(3);

        String expected = "[3]";
        String result = fakeQ.toString();

        System.out.println(expected);
        System.out.println(result);
        assertEquals(expected, result);
    }

    @Test
    void enqueueMultipleValues() {
        QueueWithStacks fakeQ = new QueueWithStacks();

        fakeQ.enqueue(2);
        fakeQ.enqueue(3);
        fakeQ.enqueue(7);
        fakeQ.enqueue(12);
        fakeQ.enqueue(21);
        fakeQ.enqueue(18);

        String expected = "[2, 3, 7, 12, 21, 18]";
        String result = fakeQ.toString();

        System.out.println(expected);
        System.out.println(result);
        assertEquals(expected, result);
    }

    @Test
    void dequeueEmpty() {
        QueueWithStacks fakeQ = new QueueWithStacks();

        int expected = 0;
        int result = fakeQ.dequeue();

        System.out.println(expected);
        System.out.println(result);
        assertEquals(expected, result);
    }

    @Test
    void dequeueSingleValue() {
        QueueWithStacks fakeQ = new QueueWithStacks();

        fakeQ.enqueue(3);

        int expected = 3;
        int result = fakeQ.dequeue();

        System.out.println(expected);
        System.out.println(result);
        assertEquals(expected, result);
    }

    @Test
    void enqueueAndDequeue() {
        QueueWithStacks fakeQ = new QueueWithStacks();

        fakeQ.enqueue(2);
        fakeQ.enqueue(3);
        fakeQ.enqueue(7);
        int result1 = fakeQ.dequeue(); // expect result1 = 2;
        fakeQ.enqueue(12);
        fakeQ.enqueue(21);
        int result2 = fakeQ.dequeue(); // expect result2 = 3;
        fakeQ.enqueue(18);
        fakeQ.enqueue(24);

        String expected3 = "[7, 12, 21, 18, 24]";
        String result3 = fakeQ.toString();

        assertEquals(2, result1);
        assertEquals(3, result2);
        assertEquals(expected3, result3);
    }
}