package day10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void reverseListTest() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(7);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        LinkedList ll = new LinkedList();

        LinkedList result = ll.reverse(ll);
        System.out.println(ll);

        String expected = "5, 3, 2, 7, 1";

        assertEquals(expected, result);
    }
}