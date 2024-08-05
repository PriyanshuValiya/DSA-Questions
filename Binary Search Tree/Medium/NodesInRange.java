// https://www.geeksforgeeks.org/problems/count-bst-nodes-that-lie-in-a-given-range/1

public class NodesInRange {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if(root == null) {
            root = new Node(val);
            return root;
        }

        if(root.data > val) { 
           root.left = insert(root.left, val);
        } else { 
           root.right = insert(root.right, val);
        }

        return root;
    }

    static int count = 0;

    public static void printInRange(Node root, int k1, int k2) {
        if(root == null) {
            return;
        }

        if(root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            count++;
            printInRange(root.right, k1, k2);
        } else if (root.data < k1) {
            printInRange(root.left, k1, k2);
        } else {
            printInRange(root.right, k1, k2);
        }
    }

    public static void main(String[] args) {
        Node root = null;
        int values[] = {10, 5, 50, 1, 40, 100};

        for(int i=0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        
        printInRange(root, 5, 40);
        System.out.println("Total Nodes : " + ++count);
    }  
}