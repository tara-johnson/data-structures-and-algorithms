package day08;

import org.junit.jupiter.api.Test;

import static day08.LinkedList.mergeLists;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    public LinkedList empty;
    public LinkedList l1;
    public LinkedList l2;
    public LinkedList l5;
    public LinkedList mixed;

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
    void toStringEmptyList() {
        assertEquals("[]", empty.toString());
    }

    @Test
    void toStringOneItemList() {
        assertEquals("[12]", l1.toString());
    }

    @Test
    void toStringTwoItemList() {
        assertEquals("[12, 14]", l2.toString());
    }

    @Test
    void toStringFiveItemList() {
        assertEquals("[12, 14, 19, 92, 45]", l5.toString());
    }

    @Test
    void insertBefore() {
        l1.insertAfter(12,2);
        assertEquals("[12, 2]", l1.toString());
    }

    @Test
    void insertBeforeOne() {
        l1.insertAfter(12,2);
        assertEquals("[12, 2]", l1.toString());
        System.out.println(l1);
    }

    @Test
    void kthOneItemList() {
        assertEquals(12, l1.kthElementFromEnd(0));
    }

    @Test
    void kthTwoItemList() {
        assertEquals(12, l2.kthElementFromEnd(1));
    }

    @Test
    void kthFiveItemList() {
        assertEquals(14, l5.kthElementFromEnd(3));
    }

    // Add tests for:
    // lists of strings, integers, and mixed types

    @Test
    void mergeTwoEmptyListTest() {
        String result = "[]";
        String expected = mergeLists(empty,empty).toString();

        System.out.println("Result: " + result);
        System.out.println("Expected: " + expected);

        assertEquals(result, expected);
    }

    @Test
    void mergeOneEmptyListTest() {
        String result = "[12, 14, 19, 92, 45]";
        String expected = mergeLists(empty,l5).toString();

        System.out.println("Result: " + result);
        System.out.println("Expected: " + expected);

        assertEquals(result, expected);
    }

    @Test
    void mergeTwoListsOneNodeEachTest() {
        String result = "[12, 12]";
        String expected = mergeLists(l1,l1).toString();

        System.out.println("Result: " + result);
        System.out.println("Expected: " + expected);

        assertEquals(result, expected);
    }

    @Test
    void mergeList1LongerTest() {
        String result = "[12, 12, 14, 14, 19, 92, 45]";
        String expected = mergeLists(l5,l2).toString();

        System.out.println("Result: " + result);
        System.out.println("Expected: " + expected);

        assertEquals(result, expected);
    }

    @Test
    void mergeList2LongerTest() {
        String result = "[12, 12, 14]";
        String expected = mergeLists(l1,l2).toString();

        System.out.println("Result: " + result);
        System.out.println("Expected: " + expected);

        assertEquals(result, expected);
    }

    @Test
    void mergeOneEqualLengthTest() {
        String result = "[12, 12, 14, 14, 19, 19, 92, 92, 45, 45]";
        String expected = mergeLists(l5,l5).toString();

        System.out.println("Result: " + result);
        System.out.println("Expected: " + expected);

        assertEquals(result, expected);
    }
}