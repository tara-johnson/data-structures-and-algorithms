package day07;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.prepend(8);
        ll.prepend(34);
        ll.prepend(12);
        ll.append(7);
        ll.prepend(66);
        ll.insertBefore(8, 70);
        ll.insertBefore(34, 90);
        ll.insertAfter(12, 33);

        if (ll.isEmpty()) {
            System.out.println("empty!");
        }

        System.out.println("ll size: " + ll.size());
        System.out.println("ll get: " + ll.get(7));
        System.out.println("ll string: " + ll);
    }
}