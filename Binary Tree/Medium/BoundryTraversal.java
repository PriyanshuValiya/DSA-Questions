// https://practice.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1

import java.util.*;

public class BoundryTraversal {
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

        public static Node buildTree(int node[]) {
            idx++;

            if(node[idx] == -1) {
                return null;
            }

            Node newNode = new Node(node[idx]);
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);

            return newNode;
        }

        public static boolean isLeaf(Node root) {
            return root.left == null && root.right == null;
        }

        public static void addLeftNode(Node root, ArrayList<Integer> arr) {
            if(root == null) {
                return;
            }

            Node curr = root;

            if(!isLeaf(curr)) {
                arr.add(curr.data);
            }

            if(curr.left != null) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }

            addLeftNode(curr, arr);
        }

        public static void addLeaves(Node root, ArrayList<Integer> arr) {
            if(root == null) {
                return;
            }

            Node curr = root;

            addLeaves(curr.left, arr);
            addLeaves(root.right, arr);

            if(isLeaf(curr)) {
             arr.add(curr.data);
            }
        }
        
        public static void addRightNode(Node root, ArrayList<Integer> arr) {
            if(root == null) {
                return;
            }

            Node curr = root;
            ArrayList<Integer> temp = new ArrayList<>();

            if(!isLeaf(curr)) {
                temp.add(curr.data);
            }

            if(curr.left != null) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }

            addRightNode(curr, arr);

            Collections.reverse(temp);

            for(int i : temp) {
                arr.add(i);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        ArrayList<Integer> arr = new ArrayList<>();
        int nodes[] = {1, 2, 4, -1, -1, 5, 8, -1, -1, 9, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        Node root = tree.buildTree(nodes);

        arr.add(root.data);
    
        tree.addLeftNode(root.left, arr);
        tree.addLeaves(root, arr);
        tree.addRightNode(root.right, arr);

        System.out.println("Boundry Nodes : " + arr);
    }    
}
