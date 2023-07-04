package walmart;

public class MergeSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        ListNode tmp = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tmp.next = new ListNode(list1.val);
                tmp = tmp.next;
                list1 = list1.next;
            } else {
                tmp.next = new ListNode(list2.val);
                tmp = tmp.next;
                list2 = list2.next;
            }
        }
        while (list1 != null) {
            tmp.next = new ListNode(list1.val);
            tmp = tmp.next;
            list1 = list1.next;
        }
        while (list2 != null) {
            tmp.next = new ListNode(list2.val);
            tmp = tmp.next;
            list2 = list2.next;
        }
        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}