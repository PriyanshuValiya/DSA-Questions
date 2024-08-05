// https://www.geeksforgeeks.org/problems/check-for-balanced-tree/1

public class Balancedtree {
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
        
        public static int height(Node root) {
            if (root == null) {
                return 0;
            }

            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            return Math.max(leftHeight, rightHeight) + 1;
        }      
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);

        int leftHeight = tree.height(root.left);
        int rightHeight = tree.height(root.right);

        if(Math.abs(leftHeight - rightHeight) > 1) {
            System.out.println("Unbalanced Tree");
        } else {
            System.out.println("Balanced Tree");
        }
    }    
}