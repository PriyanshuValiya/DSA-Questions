// https://www.geeksforgeeks.org/minimum-swap-required-convert-binary-tree-binary-search-tree
// Not Completed.
// Topic : Binary Search Tree

public class MinSwap {
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

        public static void getMinSwap(Node root) {

        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int nodes[] = {5, 6, 8, -1, -1, 9, -1, -1, 7, 10, -1, -1, 11, -1, -1};
        Node root = tree.buildTree(nodes);
    }    
}