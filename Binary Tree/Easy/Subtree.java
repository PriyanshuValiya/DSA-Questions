// https://leetcode.com/problems/subtree-of-another-tree/description

public class Subtree {
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

        public static boolean isIdentical(Node root, Node subRoot) {
            if(root == null && subRoot == null) {
                return true;
            } else if(root == null || subRoot == null) {
                return false;
            }

            if(!isIdentical(root.left, subRoot.left)) {
                return false;
            }

            if(!isIdentical(root.right, subRoot.right)) {
                return false;
            }

            return true;
        }

        public static boolean isSubtree(Node root, Node subRoot) {
            if(root == null) {
                return false;
            }

            if(isIdentical(root, subRoot)) {
                return true;
            }

            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        Node root = new Node(3);
        root.left = new Node(4);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(2);
        
        Node subRoot = new Node(4);
        subRoot.left = new Node(1);
        subRoot.right = new Node(2);

        System.out.println("isSubTree : " + tree.isSubtree(root, subRoot));
    } 
}