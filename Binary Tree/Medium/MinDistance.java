// https://practice.geeksforgeeks.org/problems/min-distance-between-two-given-nodes-of-a-binary-tree/1

public class MinDistance {
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

        public static int getDis(Node root, int n) {
            if (root == null) {
                return -1;
            }

            if (root.data == n) {
                return 0;
            }

            int leftDist = getDis(root.left, n);
            if (leftDist != -1) {
                return leftDist + 1;
            }

            int rightDist = getDis(root.right, n);
            if (rightDist != -1) {
                return rightDist + 1;
            }

            return -1;
        }

        public static int getMinDis(Node root, int n1, int n2) {
            int d1 = getDis(root, n1);
            int d2 = getDis(root, n2);

            return d1 + d2;
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int nodes[] = {1, 2, -1, -1, 3, -1, -1};
        Node root = tree.buildTree(nodes);

        System.out.println("Min Distance : " + tree.getMinDis(root, 2, 3));
    } 
}