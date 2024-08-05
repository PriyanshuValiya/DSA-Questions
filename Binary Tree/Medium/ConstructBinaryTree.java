// https://www.geeksforgeeks.org/construct-binary-tree-string-bracket-representation
// Not Completed.

import java.util.*;

public class ConstructBinaryTree {
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

        public static void constructTree(Node root, String str) {
            
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        String str = "4(2(3)(1))(6(5))";

        Node root = new Node(str.charAt(0));
        
    }    
}

