// Linkedin, Google, Facebook,Microsoft, Amazon, Apple
// https://leetcode.com/problems/palindrome-linked-list/
public class PalindromeLinkedList {
    /*
     * approach: find the middle node using fast and slow pointers
     * reverse the second half of the linked list
     * compare the values from both sides again using two pointers till one of them
     * becomes null
     */
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head.next, prev, current, temp;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // slow points towards the middle
        fast = head;
        prev = null;
        current = slow;
        while (current != null) {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        // prev points towards the end
        slow = prev;
        // fast points towards the head
        while (fast != null && slow != null) {
            if (fast.val == slow.val) {
                fast = fast.next;
                slow = slow.next;
            } else {
                return false;
            }
        }

        return true;
    }
}
