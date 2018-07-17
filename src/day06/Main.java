package day06;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.prepend(8);
        ll.prepend(34);
        ll.prepend(12);
        ll.append(7);
        ll.prepend(66);
        ll.insertBefore(8, 70);
        ll.insertAfter(12, 33);

        if (ll.isEmpty()) {
            System.out.println("empty!");
        }

        System.out.println("ll size: " + ll.size());
        ll.printList();
    }
}