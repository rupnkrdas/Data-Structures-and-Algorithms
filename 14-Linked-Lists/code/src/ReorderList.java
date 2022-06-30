// https://leetcode.com/problems/reorder-list/
// Google, Facebook
public class ReorderList {
    /*
     * approach 1:
     * reversing the list again an again starting from the second node
     * moving on to next node until we reach the 2nd last node.
     */
    public void reorderList1(ListNode head) {
        if (head.next == null) {
            return;
        }

        ListNode node = head, prev = null, current = head.next, temp;

        while (node.next != null) {
            while (current != null) {
                temp = current.next;
                current.next = prev;
                prev = current;
                current = temp;
            }
            node.next = prev;
            node = prev;
            prev = null;
            current = node.next;
        }
    }

    /*
     * approach 2:
     * reversing the linked list from the mid
     * then moving counters i and j simultaneously
     */
    public void reorderList2(ListNode head) {
        ListNode mid = findMid(head);
        ListNode i = head;
        ListNode j = mid.next;
        mid.next = null;

        j = reverse(j);

        while (i != null && j != null) {
            ListNode iNext = i.next;
            ListNode jNext = j.next;

            i.next = j;
            i = iNext;
            j.next = i;
            j = jNext;
        }
    }

    ListNode reverse(ListNode head) {
        ListNode prev = null, current = head, temp;

        while (current != null) {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        return prev;
    }

    ListNode findMid(ListNode head) {
        ListNode slow = head, fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
