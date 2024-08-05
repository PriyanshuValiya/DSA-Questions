// https://leetcode.com/problems/delete-node-in-a-bst/description

public class DeleteNode {
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

    public static Node inorderSuccessor(Node root) {
        while(root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static Node deleteNode(Node root, int key) {
        if(root == null) {
            return null;
        } else if(root.data < key) {
            root.right = deleteNode(root.right, key);
        } else if(root.data > key) {
            root.left = deleteNode(root.left, key);
        } else {
            if(root.left == null && root.right == null) {
                return null;
            }

            if(root.left == null) {
                return root.right;
            } else if(root.right == null) {
                return root.left;
            } 

            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = deleteNode(root.right, IS.data);
        }

        return root;
    }

    public static void main(String[] args) {
        int nodes[] = {6, 2, 8, 0, 4, 7, 9, 3, 5};
        Node root = null;

        for(int i=0; i < nodes.length; i++) {
            root = insert(root, nodes[i]);
        }

        inorder(root);
        System.out.println();
        
        deleteNode(root, 5);
        inorder(root);
    }   
}