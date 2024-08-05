// https://www.geeksforgeeks.org/flatten-bst-to-sorted-list-increasing-order

public class FlattenBST {
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
    
    public static void inorder(Node root) {
        if(root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = null;
        int values[] = {5, 3, 7, 2, 4, 6, 8};

        for(int i=0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        
        inorder(root);
    }  
}