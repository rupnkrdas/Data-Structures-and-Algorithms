/*
 * 876. Middle of the Linked List
 * https://leetcode.com/problems/middle-of-the-linked-list/
 */
public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        ListNode node = head;
        int length = findLength(head);

        if (head.next == null) {
            return head;
        }

        int i = 1;
        while (node.next != null && i < length / 2) {
            node = node.next;
            i++;
        }

        return node.next;
    }

    private int findLength(ListNode head) {
        if (head == null) {
            return 0;
        }
        if (head.next == null) {
            return 1;
        }

        ListNode node = head;
        int length = 1;

        while (node.next != null) {
            node = node.next;
            length++;
        }

        return length;
    }

    /*
     * 876. Middle of the Linked List
     * https://leetcode.com/problems/middle-of-the-linked-list/
     * Using fast and slow pointers
     */

    // this function will return the middle node of a linked list and in case of two
    // middle nodes, it will return the second mid
    public ListNode getMid(ListNode head) {
        // using the concept of fast and slow pointers
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // this function returns the exact middle node of a linked list
    // in case of even number of nodes, it returns the first middle node
    // just like (arr.length - 1) / 2 in case of arrays
    public ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}
