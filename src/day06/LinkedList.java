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
        // Assigns first list item as root
        ListNode current = this.root;
        // While the next item in list is not null (the end of the list), add the next item to the list
        while(current.next != null) {
            current = current.next;
        }
        // At the end of the list (current.next == null), add the new node
        current.next = newNode;
    }

    // Add a new node before a specific element in the list
    public void insertBefore(int value, int newVal) {
        ListNode newNode = new ListNode(newVal);
        // Assigns first list item as root
        ListNode current = this.root;
        ListNode previous = null;
        while (current != null) {
            // If current data equals the value of the node we want to insert
            // Assign the new node/value to the current node
            if (current.data == value) {
                newNode.next = current;
                // If previous isn't at the beginning of the list
                // Assign the next node as the new node/value
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
        // Assigns first list item as root
        ListNode current = this.root;
        while (current != null) {
            // If the current node equals the value of the node we want to insert
            // Assign the new node/value as the next node/value
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
    public String printList() {
        ListNode current = this.root;
        // Loop through each element in the list
        StringBuilder listOutput = new StringBuilder(" ");
        while (current != null) {
            listOutput.append(current.data + " --> ");
            current = current.next;
        }
        return listOutput.toString();
    }
}