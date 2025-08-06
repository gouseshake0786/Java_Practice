package com.mahamad.linkedlist;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }

    public void addBegin(int val) {
        Node newNode = new Node(val);

    }
}

public class LinkedListDemo {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(10);
        Node e = new Node(19);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node f = new Node(19);
        f.next = a;

        System.out.println(a.next.val);
    }
}
