// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description

public class LCAofBTS {
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

    public static Node LCA(Node root, int val1, int val2) {
        if(root == null) {
            return null;
        }

        if(root.data > val1 && root.data < val2) {
            return root;
        }

        if(root.data > val2) {
            root = LCA(root.left, val1, val2);
        } else {
            root = LCA(root.right, val1, val2);
        }

        return root;
    }

    // public static void inorder(Node root) {
    //     if(root == null) {
    //         return;
    //     }

    //     inorder(root.left);
    //     System.out.print(root.data+" ");
    //     inorder(root.right);
    // }

    public static void main(String[] args) {
        int nodes[] = {6, 2, 8, 0, 4, 7, 9, 3, 5};
        Node root = null;

        for(int i=0; i < nodes.length; i++) {
            root = insert(root, nodes[i]);
        }

        System.out.println("LCA : " + LCA(root, 0, 4).data);
    }   
}