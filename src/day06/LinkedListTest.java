package day06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    public LinkedList empty;
    public LinkedList l1;
    public LinkedList l2;
    public LinkedList l5;
    public LinkedList repeated;

    @BeforeEach
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

        repeated = new LinkedList();
        repeated.prepend(4);
        repeated.prepend(3);
        repeated.prepend(3);
        repeated.prepend(1);
    }

    @Test
    void toStringEmptyList() {
        assertEquals("[]", empty.toString());
        System.out.println(empty);
    }

    @Test
    void toStringOneItemList() {
        assertEquals("[12]", l1.toString());
        System.out.println(l1);
    }

    @Test
    void toStringTwoItemList() {
        assertEquals("[12, 14]", l2.toString());
        System.out.println(l2);
    }

    @Test
    void toStringFiveItemList() {
        assertEquals("[12, 14, 19, 92, 45]", l5.toString());
        System.out.println(l5);
    }

    @Test
    void appendEmptyList() {
        empty.append(5);

        assertEquals("[5]", empty.toString());
        System.out.println(empty);
    }

    @Test
    void appendOneItemList() {
        l1.append(5);

        assertEquals("[12, 5]", l1.toString());
        System.out.println(l1);
    }

    @Test
    void appendTwoItemList() {
        l2.append(5);

        assertEquals("[12, 14, 5]", l2.toString());
        System.out.println(l2);
    }

    @Test
    void appendFiveItemList() {
        l5.append(5);

        assertEquals("[12, 14, 19, 92, 45, 5]", l5.toString());
        System.out.println(l5);
    }

    @Test
    void insertAfterOne() {
        l1.insertAfter(12,2);

        assertEquals("[12, 2]", l1.toString());
        System.out.println(l1);
    }

    @Test
    void insertAfterFive() {
        l5.insertAfter(92,4);

        assertEquals("[12, 14, 19, 92, 4, 45]", l5.toString());
        System.out.println(l5);
    }

    @Test
    void insertAfterDuplicates() {
        repeated.insertAfter(3,2);

        assertEquals("[1, 3, 2, 3, 4]", repeated.toString());
        System.out.println(repeated);
    }

    @Test
    void insertBeforeOne() {
        l1.insertBefore(12,2);

        assertEquals("[2, 12]", l1.toString());
        System.out.println(l1);
    }

    @Test
    void insertBeforeFive() {
        l5.insertBefore(92,4);

        assertEquals("[12, 14, 19, 4, 92, 45]", l5.toString());
        System.out.println(l5);
    }

    @Test
    void insertBeforeDuplicates() {
        repeated.insertBefore(3,2);

        assertEquals("[1, 2, 3, 3, 4]", repeated.toString());
        System.out.println(repeated);
    }
}