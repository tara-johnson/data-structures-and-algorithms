package day09;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

//    @BeforeEach
//    void setUp() {
//    }

    @Test
    void hasLoopTrue() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(7);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n2; // point n5 back to n2 to create the loop

        LinkedList ll = new LinkedList();
        ll.root = n1; // attach n1 as the root manually.

        assertEquals(true, ll.hasLoop());
    }

    void hasLoopFalse() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(7);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
//        n5.next = n2; // point n5 back to n2 to create the loop

        LinkedList ll = new LinkedList();
        ll.root = n1; // attach n1 as the root manually.

        assertEquals(false, ll.hasLoop());
    }
}