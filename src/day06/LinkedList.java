package day06;

public class LinkedList {
    ListNode root;

    public LinkedList() {
        this.root = null;
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    // 0(1) Add a new node at the front of the list
    public void prepend(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = this.root;
        this.root = newNode;
    }

    // Add a new node to the end of the list
    public void append(int data) {
        ListNode newNode = new ListNode(data);
        ListNode current = this.root;
        while(null != current.next) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Add a new node before a specific element in the list
    public void insertBefore(int value, int newVal) {
        ListNode newNode = new ListNode(newVal);
        ListNode current = this.root;
        ListNode previous = null;
        while (current != null) {
            if (current.data == value) {
                newNode.next = current;
                if (previous !=  null) {
                    previous.next = newNode;
                }
            }
            previous = current;
            current = current.next;
        }
    }

    // Add a new node after a element in the list
    public void insertAfter(int value, int newVal) {
        ListNode newNode = new ListNode(newVal);
        ListNode current = this.root;
        while (current != null) {
            if (current.data == value) {
                newNode.next = current.next;
                current.next = newNode;
            }
            current = current.next;
        }
    }


    // Get the total number of elements in a list
    public int size() {
        int total = 0;
        ListNode current = this.root;
        while (current != null) {
            total++;
            current = current.next;
        }
        return total;
    }

    // Get the value of a node at a specific index
    public int get(int index) {
        int n = 0;
        ListNode current = this.root;
        while (n < index) {
            n++;
            current = current.next;
        }
        return current.data;
    }

    // Print list in readable format, ie 1 --> 2 --> null
    public void printList() {
        ListNode current = this.root;
        // Loop through each element in the list
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        // Last node points to null
        System.out.print(current);
    }
}