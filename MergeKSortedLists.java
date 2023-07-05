package walmart;

import java.util.PriorityQueue;

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> heap = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode node : lists) {
            if (node != null) {
                heap.offer(node);
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode tmp = dummy;

        while (!heap.isEmpty()) {
            ListNode node = heap.poll();
            tmp.next = node;
            tmp = tmp.next;
            if (node.next != null) {
                heap.offer(node.next);
            }
        }
        return dummy.next;
    }
}
