// https://leetcode.com/problems/maximum-depth-of-binary-tree/description/

public class MaxDepth {
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

        public static int getDepth(Node root) {
            if(root == null) {
                return 0;
            }

            int leftDepth = getDepth(root.left);
            int rightDepth = getDepth(root.right);

            return Math.max(leftDepth, rightDepth) + 1;
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int node[] = {3, 9, -1, -1, 20, 15, -1, -1, 7, -1, -1};
        
        Node root = tree.buildTree(node);
        
        System.out.println("Max Depth : " + tree.getDepth(root));
    }   
}