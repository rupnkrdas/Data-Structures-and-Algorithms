public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirstPosition(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    // insert using recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index - 1, node.next);
        return node;
    }

    public void insertLastPosition(int val) {
        if (tail == null) {
            insertFirstPosition(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int index, int val) {
        if (index == 0) {
            insertFirstPosition(val);
            return;
        } else if (index == size) {
            insertLastPosition(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;

        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        // int val = tail.value;

        // Node temp = head;
        // for (int i = 1; i < size - 1; i++) {
        // temp = temp.next;
        // }

        // // temp points to the 2nd last element
        // temp.next = null;

        Node secondLast = getNode(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;

        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        } else if (index == size - 1) {
            return deleteLast();
        }

        int value = getNode(index).value;

        Node prev = getNode(index - 1);
        prev.next = getNode(index + 1);

        return value;
    }

    public Node getNode(int index) {
        Node temp = head;
        for (int i = 1; i <= index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // QUESTIONS:
    // https://leetcode.com/problems/remove-duplicates-from-sorted-list/
    public void removeDuplicates() {
        Node node = head;

        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }

        tail = node;
        tail.next = null;
    }

    // https://leetcode.com/problems/merge-two-sorted-lists/
    public static LL merge(LL first, LL second) {
        LL ans = new LL();
        Node i = first.head;
        Node j = second.head;

        while (i != null && j != null) {
            if (i.value < j.value) {
                ans.insertLastPosition(i.value);
                i = i.next;
            } else {
                ans.insertLastPosition(j.value);
                j = j.next;
            }
        }

        while (i != null) {
            ans.insertLastPosition(i.value);
            i = i.next;
        }

        while (j != null) {
            ans.insertLastPosition(j.value);
            j = j.next;
        }

        return ans;
    }

    private void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            Node first = getNode(col);
            Node second = getNode(col + 1);

            if (first.value > second.value) {
                // swap
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = getNode(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = getNode(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        } else {
            bubbleSort(row - 1, 0);
        }
    }

    public static void main(String[] args) {
        // LL list = new LL();
        // list.insertLastPosition(1);
        // list.insertLastPosition(1);
        // list.insertLastPosition(1);
        // list.insertLastPosition(2);
        // list.insertLastPosition(4);
        // list.insertLastPosition(4);

        // System.out.println("before: ");
        // list.display();
        // list.removeDuplicates();
        // System.out.println("after: ");
        // list.display();

        LL first = new LL();
        LL second = new LL();

        first.insertLastPosition(1);
        first.insertLastPosition(3);
        first.insertLastPosition(5);

        second.insertLastPosition(1);
        second.insertLastPosition(2);
        second.insertLastPosition(9);
        second.insertLastPosition(14);

        LL ans = LL.merge(first, second);
        ans.display();
    }

}
