// https://practice.geeksforgeeks.org/problems/leaf-at-same-level/1
// Not Completed.

import java.util.ArrayList;

public class LeavesAtSameLevel {
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

        static class nodeInfo {
            Node node;
            int ht;

            public nodeInfo(Node node, int ht) {
                this.node = node;
                this.ht = ht;
            }
        }

        public static nodeInfo getLeave(Node root, int height, ArrayList<Integer> arr) {
           if(root.left == null && root.right == null) {
             arr.add(root.data);
             return null;
           } 

           nodeInfo leftNode = getLeave(root.left, height+1, arr);
           nodeInfo rightNode = getLeave(root.right, height+1, arr);

           System.out.println(arr);

           return new nodeInfo(null, 0);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int nodes[] = {1, 2, -1, -1, 3, -1, -1};
        Node root = tree.buildTree(nodes);

        System.out.println(tree.getLeave(root, 1, new ArrayList<>()).node);
    }
}