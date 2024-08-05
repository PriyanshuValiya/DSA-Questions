// https://www.geeksforgeeks.org/problems/reverse-level-order-traversal/1

public class ReverseTraversal {
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

        public static void getReverseOrder(Node root) {
            if(root == null) {
                return;
            }

            getReverseOrder(root.left);
            getReverseOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int node[] = {1, 3, -1, -1, 2, -1, -1};
        
        Node root = tree.buildTree(node);
        
        System.out.print("Reverse Level Order : ");
        tree.getReverseOrder(root);
    }   
}