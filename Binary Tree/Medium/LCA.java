// https://practice.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-binary-tree/1

public class LCA {
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

        public static Node lca(Node root, int n1, int n2) {
            if(root == null) {
                return null;
            }

            if(root.data == n1 || root.data == n2) {
                return root;
            }

            Node leftChild = lca(root.left, n1, n2);
            Node rightChild = lca(root.right, n1, n1);

            if(leftChild == null) {
                return rightChild;
            } else if(rightChild == null) {
                return leftChild;
            } else {
                return root;
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int nodes[] = {1, 2, -1, -1, 3, -1, -1};
        Node root = tree.buildTree(nodes);

        System.out.println("Lowest Common Ancestor : " + tree.lca(root, 2, 3).data);
    }  
}