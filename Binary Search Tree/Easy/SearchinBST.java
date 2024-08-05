// https://practice.geeksforgeeks.org/problems/minimum-element-in-bst/1

import java.util.ArrayList;

public class SearchinBST {
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

    public static void inorder(Node root, ArrayList<Integer> arr) {
        if(root == null) {
            return;
        }

        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int nodes[] = {5, 4, 6, 3, 7, 1};
        Node root = null;

        for(int i=0; i < nodes.length; i++) {
            root = insert(root, nodes[i]);
        }

        inorder(root, arr);

        System.out.println("Smmallest Element in BST : " + arr.get(0));
    }
}
