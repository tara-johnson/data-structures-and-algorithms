package day08;

import org.junit.jupiter.api.Test;

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
    void toStringEmptyList() {
        assertEquals("[]", empty.toString());
    }

    @Test
    void toStringOneItemList() {
        assertEquals("[12]", empty.toString());
    }

    @Test
    void toStringTwoItemList() {
        assertEquals("[12, 14]", empty.toString());
    }

    @Test
    void toStringFiveItemList() {
        assertEquals("[12, 14, 19, 92, 45]", empty.toString());
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

//    @Test
//    void insertBeforeDuplicates() {
//        l1.insertBefore(12,2);
//        assertEquals("[2, 12]", l1.toString());
//    }

//    @Test
//    void insertAfter() {
//    }

    @Test
    void kthOneItemList() {
        assertEquals(12, l1.kthElementFromEnd(0).data);
    }

    @Test
    void kthTwoItemList() {
        assertEquals(12, l2.kthElementFromEnd(1).data);
    }

    @Test
    void kthFiveItemList() {
        assertEquals(14, l5.kthElementFromEnd(3).data);
    }

    @Test
    void mergeListsTest() {
        System.out.println("Test cases to be added");
        // Add tests for:
        // One or both lists are empty
        // ll1 is longer
        // ll2 is longer
        // lists are equal length
        // lists of strings, integers, and mixed types
        // both lists have only one node
        // one list has only one node
    }
}