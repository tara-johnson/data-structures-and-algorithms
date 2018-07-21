package day10;

public class LinkedList {
    public ListNode root;

    public LinkedList() {
        this.root = null;
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    // 0(1) Add a new node at the front of the list
    public void prepend(int data) {
        // Make the node, point it to the front, then reset front to it
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

        // If the value is at the root of the list, then handle the special case
        // Replace explicitly the root and not just attaching it between two nodes in the middle of
        // the list
        if (this.root.data == value) {
            this.prepend(value);
        }

        // Step through the list until we get to a current node that has the newNode value
        while (current.next.data != value) {
            // If the current node equals the value of the node we want to insert
            // Assign the new node/value as the next node/value
            current = current.next;
        }

        // Now tie new node into the list
        newNode.next = current.next;
        current.next = newNode;
    }

    // Insert the newVal before the first occurrence of value
    // If value occurs multiple times in the list, it will be added in front of only the first time it appears
    //
    // value: Must be any existing value in the list
    // newVal: A new value to add to the list
    //
    // [1, 2, 3, 4].insertAfter(3, 2) => [1, 3, 2, 3, 4]
    public void insertAfter(int value, int newVal) {
        ListNode newNode = new ListNode(newVal);
        // Assigns first list item as root
        ListNode current = this.root;

        // Step through the list until we get to a current node that has the newNode value
        while (current.data != value) {
            // If the current node equals the value of the node we want to insert
            // Assign the new node/value as the next node/value
            current = current.next;
        }

        // Now tie new node into the list
        newNode.next = current.next;
        current.next = newNode;
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

    public ListNode kthElementFromEnd(int k) {
        ListNode current = this.root;
        // Get the total of elements in the list
        int total = this.size();
        // Declare newIndex that is the index from the front of the list
        int newIndex = (total - k) - 1;
        // Get the element of newIndex from the list
        this.get(newIndex);
        return current;
    }

    public static LinkedList mergeLists(LinkedList ll1, LinkedList ll2) {
        LinkedList temp = new LinkedList();
        ListNode cur1 = ll1.root;
        ListNode cur2 = ll2.root;

        temp.root = new ListNode(cur1.data);
        temp.root.next = new ListNode(cur2.data);

//        temp.append(cur2.data);

        while(cur1.next != null && cur2.next != null) {
            temp.append(cur1.next.data);
            temp.append(cur2.next.data);

            cur1 = cur1.next;
            cur2 = cur2.next;
        }

        if(cur1.next != null) {
            while(cur1.next !=  null) {
                temp.append(cur1.next.data);
                cur1 = cur1.next;
            }
        } else {
            while(cur2.next != null){
                temp.append(cur2.next.data);
                cur2 = cur2.next;
            }
        }
        return temp;
    }

    public boolean hasLoop() {
        // Initialize boolean hasLoop variable as false
        boolean hasLoop = false;

        // Check if the list is empty. If so, the list is circular.
        if (this.root == null) {
            hasLoop = true;
            return hasLoop;
        }

        // Set two ListNode variables to keep track of where we are in the list
        // cur1 is the root of the list
        // cur2 is two steps ahead
        ListNode cur1 = this.root;
        ListNode cur2 = cur1.next.next;

        // Step both variables through the list until either points to null (the list has an end and is not circular)
        while (cur1.next != null && cur2.next.next != null) {
            cur1 = cur1.next;
            cur2 = cur2.next.next;

            // If cur1 and cur2 meet, the list is circular
            if (cur1 == cur2) {
                hasLoop = true;
                return hasLoop;
            }
        }
        return hasLoop;
    }

    public static LinkedList reverse (LinkedList ll) {
        // Assigns first list item as root
        ListNode current = ll.root;
        // Set two ListNode variables initialized at null to keep track of where we are in the list
        ListNode future = null;
        ListNode previous = null;

        // LinkedList that is passed in
        // root (current) -> 1 -> 2 -> -> 3 -> null (future/previous)

        while (current != null) {
            // future will point to current.next
            future = current.next;
            // current.next will point to previous
            current.next = previous;
            // previous will be a marker for current
            previous = current;
            // current will be a marker for future
            current = future;
        }
        // root will be assigned to previous, which is now a marker for the last item in the list
        ll.root = previous;
        return ll;
    }

    public String toString() {
        String result = "";
        ListNode current = this.root;

        if (this.root == null) {
            return "[]";
        }

        while (current != null) {
            result += current.data;

            // If there's another node after this one, place a comma and a space
            if (current.next != null) {
                result += ", ";
            }
            current = current.next;
        }
        return "[" + result + "]";
    }
}