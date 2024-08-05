// https://www.geeksforgeeks.org/problems/predecessor-and-successor/1

import java.util.ArrayList;

public class PredecessorAndSuccessor {
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
        Node root = null;
        int nodes[] = {8, 1, 9, 4, 10, 3};
        int key = 8;
        boolean flag = true;

        for(int i=0; i < nodes.length; i++) {
            root = insert(root, nodes[i]);
        }

        inorder(root, arr);

        if(arr.get(arr.size()-1) == key) {
            System.out.println("Predecessor : " + arr.get(arr.size()-2));
            System.out.println("Successor : Null");
            flag = false;
        } else if(arr.get(0) == key) {
            System.out.println("Predecessor : Null");
            System.out.println("Successor : " + arr.get(arr.get(1)));
            flag = false;
        }

        for(int i=0; i < arr.size() && flag; i++) {
            if(arr.get(i) == key) {
                System.out.println("Predecessor : " + arr.get(i-1));
                System.out.println("Successor : " + arr.get(i+1));
                break;
            }
        }

    } 
}
