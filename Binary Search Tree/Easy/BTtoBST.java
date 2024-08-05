// https://practice.geeksforgeeks.org/problems/binary-tree-to-bst/1

import java.util.*;

public class BTtoBST {
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

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;

            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void inorder(Node root, ArrayList<Integer> arr) { 
            if (root == null) {
                return;
            }

            inorder(root.left, arr);
            arr.add(root.data);
            inorder(root.right, arr);
        }

        public static void buildBST(ArrayList<Integer> arr) {
            Collections.sort(arr);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int nodes[] = {1, 2, -1, -1, 3, -1, -1};
        ArrayList<Integer> arr = new ArrayList<>();

        Node root = tree.buildTree(nodes);

        tree.inorder(root, arr);

        System.out.println(arr);
        tree.buildBST(arr);
        System.out.println(arr);
    }   
}