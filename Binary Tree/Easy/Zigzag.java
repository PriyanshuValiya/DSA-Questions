// https://www.geeksforgeeks.org/problems/zigzag-tree-traversal/1
// Not Completed.

import java.util.*;

public class Zigzag {
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

        public static void zigzag(Node root) {
            Deque<Node> q = new LinkedList<>();
            boolean flag = true; // left -> right

            q.add(root);
            q.add(null);

            while(!q.isEmpty()) {
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Map<Integer, Node> map = new HashMap<>();
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        
        Node root = tree.buildTree(nodes);
        tree.zigzag(root);
    }
}