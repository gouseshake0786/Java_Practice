package LinkedList;

public class DLL {
    private Node head;

    private class Node {
        private int data;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.data = val;
        }

        public Node(int val, Node next, Node prev) {
            this.data = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int val) {
        Node node = new Node(val);

        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        node.next = null;

        Node last = head;
        if (head == null) {
            insertFirst(val);
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }

    public void displayRev() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.data + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Print LL in reverse order");
        while (last != null) {
            System.out.print(last.data + " -> ");
            last = last.prev;
        }
        System.out.println("END");
    }

    public static void main(String args[]) {
        DLL dll = new DLL();
        dll.insertFirst(10);
        dll.insertFirst(20);
        dll.insertFirst(25);

        dll.insertLast(2);

        dll.display();

        //dll.displayRev();
    }
}
