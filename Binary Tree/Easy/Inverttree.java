// https://leetcode.com/problems/invert-binary-tree/description

import java.util.*;

public class Inverttree {
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

        public static void invert(Node root) {
            if(root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);

            while(!q.isEmpty()) {
                Node currNode = q.remove();

                // swap nodes
                Node temp = currNode.left;
                currNode.left = currNode.right;
                currNode.right = temp;

                System.out.print(currNode.data + " ");

                if(currNode.left != null) {
                    q.add(currNode.left);
                }

                if(currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int node[] = {4, 2, 1, -1, -1, 3, -1, -1, 7, 6, -1, -1, 9, -1, -1};

        Node root = tree.buildTree(node);

        tree.invert(root);
    }    
}