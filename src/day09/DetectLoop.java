package day09;

public class DetectLoop {
    public ListNode root;

    public boolean hasLoop() {
        boolean hasLoop = false;
        ListNode cur1 = this.root;
        ListNode cur2 = cur1.next.next;
        while (cur1.next != null && cur2.next.next != null) {
            cur1 = cur1.next;
            cur2 = cur2.next.next;
            if (cur1 == cur2) {
                hasLoop = true;
                return hasLoop;
            }
        }
        return hasLoop;
    }
}