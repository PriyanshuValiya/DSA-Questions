// https://practice.geeksforgeeks.org/problems/populate-inorder-successor-for-all-nodes/1

public class InorderSuccessor {
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

    public static Node inOrderSuccessor(Node root) {
        if(root == null) {
            return null;
        }

        while(root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static void main(String[] args) {
        Node root = null;
        int values[] = {10, 8, 12, 3};

        for(int i=0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        
        Node IS = inOrderSuccessor(root);
        System.out.println("Inorder Successor : " + IS.data);
    }  
}