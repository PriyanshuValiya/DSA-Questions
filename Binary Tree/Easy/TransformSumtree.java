// https://www.geeksforgeeks.org/problems/transform-to-sum-tree/1

public class TransformSumtree {
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

        public static int sumOfTree(Node root) {
            if(root == null) {
                return 0;
            }

            int leftSum = sumOfTree(root.left);
            int rightSum = sumOfTree(root.right);

            int newLeftSum = root.left == null ? 0 : root.left.data;
            int newRightSum = root.right == null ? 0 : root.right.data;

            int temp = root.data;
            root.data = leftSum + newLeftSum + rightSum + newRightSum;

            return temp;
        }

        public static void printSumTree(Node root) {
            if(root == null) {
                return;
            }

            System.out.print(root.data + " ");
            printSumTree(root.left);
            printSumTree(root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int nodes[] = {10, -2, 8, -1, -1, -4, -1, -1, 6, 7, -1, -1, 5, -1, -1};
        Node root = tree.buildTree(nodes);

        tree.sumOfTree(root);
        tree.printSumTree(root);
    }    
}