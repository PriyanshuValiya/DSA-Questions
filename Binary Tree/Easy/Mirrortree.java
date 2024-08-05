// https://www.geeksforgeeks.org/create-a-mirror-tree-from-the-given-binary-tree

import java.util.*;

public class Mirrortree {
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

        public static void mirror(Node root) {
            if(root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);

            while(!q.isEmpty()) {
                Node currNode = q.remove();

                Node temp = currNode.left;
                currNode.left = currNode.right;
                currNode.right = temp;

                if(currNode.left != null) {
                    q.add(currNode.left);
                }

                if(currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }

        public static void inorder(Node root) { 
            if (root == null) {
                return;
            }

            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int nodes[] = {5, 3, 2, -1, -1, 4, -1, -1, 6, -1, -1};

        Node root = tree.buildTree(nodes);
        tree.mirror(root);
        System.out.print("Mirror Tree : ");
        tree.inorder(root);
    }
}