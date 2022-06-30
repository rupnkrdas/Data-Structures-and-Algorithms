public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirstPosition(3);
        list.insertFirstPosition(2);
        list.insertFirstPosition(8);
        list.insertFirstPosition(17);
        list.insertLastPosition(99);
        list.insert(3, 100);

        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
        list.insertRec(88, 2);
        list.display();

        // DoublyLL list = new DoublyLL();
        // list.insertFirstPosition(3);
        // list.insertFirstPosition(2);
        // list.insertFirstPosition(8);
        // list.insertFirstPosition(17);
        // list.insertLastPosition(99);
        // list.insert(99, 65);

        // list.display();

        // CircularLL list = new CircularLL();
        // list.insert(23);
        // list.insert(3);
        // list.insert(19);
        // list.insert(75);
        // list.display();
        // list.delete(19);
        // list.display();
    }
}
