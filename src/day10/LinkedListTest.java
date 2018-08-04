package day10;

import org.junit.jupiter.api.Test;

import static day10.LinkedList.reverse;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    public LinkedList empty;
    public LinkedList l1;
    public LinkedList l2;
    public LinkedList l5;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        empty = new LinkedList();

        l1 = new LinkedList();
        l1.prepend(12);

        l2 = new LinkedList();
        l2.prepend(14);
        l2.prepend(12);

        l5 = new LinkedList();
        l5.prepend(45);
        l5.prepend(92);
        l5.prepend(19);
        l5.prepend(14);
        l5.prepend(12);
    }

    @Test
    void emptyListTest() {
        String expected = "[]";

        String result = reverse(empty).toString();
        System.out.println(empty);

        assertEquals(expected, result);
    }

    @Test
    void singleNodeTest() {
        String expected = "[12]";

        String result = reverse(l1).toString();
        System.out.println(l1);

        assertEquals(expected, result);
    }

    @Test
    void twoNodeTest() {
        String expected = "[14, 12]";

        String result = reverse(l2).toString();
        System.out.println(l2);

        assertEquals(expected, result);
    }

    @Test
    void reverseListTest() {
        String expected = "[45, 92, 19, 14, 12]";

        String result = reverse(l5).toString();
        System.out.println(l5);

        assertEquals(expected, result);
    }
}