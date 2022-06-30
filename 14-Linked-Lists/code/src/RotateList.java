// https://leetcode.com/problems/rotate-list/
// Facebook, Twitter, Google
public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if ((head == null) || (k == 0) || (head.next == null)) {
            return head;
        }

        int noOfRotations = k % length(head);
        if (noOfRotations == 0) {
            return head;
        }

        ListNode tail = findTail(head);
        ListNode newLast = head;
        for (int i = 1; newLast != null && i < (length(head) - noOfRotations); i++) {
            newLast = newLast.next;
        }

        tail.next = head;
        head = newLast.next;
        newLast.next = null;

        return head;

    }

    ListNode findTail(ListNode head) {
        ListNode tail = head;

        while (tail.next != null) {
            tail = tail.next;
        }

        return tail;
    }

    int length(ListNode head) {
        int length = 1;

        ListNode node = head;

        while (node.next != null) {
            length++;
            node = node.next;
        }

        return length;
    }
}
