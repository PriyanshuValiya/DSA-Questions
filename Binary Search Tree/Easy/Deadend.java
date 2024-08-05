// https://www.geeksforgeeks.org/problems/check-whether-bst-contains-dead-end/1

public class Deadend {
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

    public static boolean isDeadEnd(Node root) {
        if(root.left == null && root.right == null) {
            return true;
        }

        return isDeadEnd(root.left);
    }

    public static void main(String[] args) {
        int nodes[] = {8, 5, 9, 2, 7, 1};
        Node root = null;

        for(int i=0; i < nodes.length; i++) {
            root = insert(root, nodes[i]);
        }

        System.out.println("Dead-End : " + isDeadEnd(root));
    }
}
