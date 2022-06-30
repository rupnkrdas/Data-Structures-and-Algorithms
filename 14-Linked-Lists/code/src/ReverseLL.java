// https://leetcode.com/problems/reverse-linked-list/submissions/
// Google, Apple, Amazon, Microsoft
public class ReverseLL {
    // recursive reversal solution
    // refer to Anuj Bhaiya's playlist
    public ListNode recursiveReversal(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = recursiveReversal(head.next);

        ListNode headNext = head.next;
        headNext.next = head;
        head.next = null;

        return newHead;
    }

    // in place reversal of linked list
    // iterative reversal solution
    public ListNode iterativeReversal(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode left = null;
        ListNode node = head;

        while (node != null) {
            ListNode temp = node.next;
            node.next = left;
            left = node;
            node = temp;
        }

        return left;
    }
}

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}