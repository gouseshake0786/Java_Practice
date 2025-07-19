package BinaryTreeDemos;
class Node
{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
        left = null;
        right = null;
    }
}

public class BinaryTreeDemos {
    static int sum = 0;
    public static void print(Node root){
        if(root == null) return;
        System.out.print(root.val + " ");
        print(root.left);
        print(root.right);
    }

    public static int size(Node root){
        if(root == null) return 0;
        return 1+ size(root.right) + size(root.left);
    }

    public static int sum(Node root){
        if(root == null) return 0;
        return root.val+ sum(root.right) + sum(root.left);
    }

    public static int product(Node root){
        if(root == null) return 1;
        return root.val * sum(root.right) * sum(root.left);
    }

    public static int max(Node root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.val , Math.max(max(root.left),max(root.right)));
    }

    public static int levels(Node root){
        if(root == null) return 0;
        return 1 + Math.max(levels(root.left),levels(root.right));
    }

    public static void InvertTree(Node root){
        if(root == null) return;

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        System.out.print(root.val + " ");

        InvertTree(root.left);
        InvertTree(root.right);

    }

    public static void main(String[] args) {
        Node a= new Node(10);
        Node b= new Node(20);
        Node c= new Node(30);
        Node d= new Node(40);
        Node e= new Node(50);
        Node f= new Node(60);
        Node g= new Node(70);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

        print(a);
        System.out.println();
        System.out.println("Size of Node: " + size(a));
        System.out.println("Sum of No: " + sum(a));
        System.out.println("max of Node: " + max(a));
        System.out.println("Product of Node: " + product(a));
        System.out.println("Levels of Node: " + levels(a));
        InvertTree(a);
    }
}
