// https://www.geeksforgeeks.org/problems/left-view-of-binary-tree/1

import java.util.*;

public class Leftview {
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
            int vd;

            public nodeInfo(Node node, int vd) {
                this.vd = vd;
                this.node = node;
            }
        }

        public static void leftView(Node root, int level, Map<Integer, Node> map) {
            if(root == null) {
                return;
            }

            if(!map.containsKey(level)) {
                System.err.print(root.data + " ");
                map.put(level, root);
            }

            leftView(root.left, level+1, map);
            leftView(root.right, level+1, map);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Map<Integer, Node> map = new HashMap<>();
        int nodes[] = {1, 2, 4, -1, 8, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        
        Node root = tree.buildTree(nodes);
        System.err.print("Left View : ");
        tree.leftView(root, 1, map);
    }
}