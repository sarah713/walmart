package walmart;

public class MiddleOfLL {
    public ListNode middleNode(ListNode head) {
        if (head == null)
            return head;

        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
