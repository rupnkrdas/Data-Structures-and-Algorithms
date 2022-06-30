public class DoublyLL {
    private Node head;
    private int size;

    public DoublyLL() {
        this.size = 0;
    }

    public void insertFirstPosition(int value) {
        if (head == null) {
            Node node = new Node(value);
            head = node;
            return;
        }

        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        head.prev = node;
        head = node;

        size++;
    }

    public void insertLastPosition(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // temp is now pointing to the last node
        temp.next = node;
        node.prev = temp;
        node.next = null;

        size++;
    }

    public void insert(int after, int value) {
        Node p = find(after);

        if (p == null) {
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(value);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }

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

    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.value + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse:");
        while (last != null) {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }

        public Node(int value, DoublyLL.Node next, DoublyLL.Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
