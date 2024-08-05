// https://www.geeksforgeeks.org/kth-ancestor-node-binary-tree-set-2

public class Kthancestor {
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

        public static int kthAncestor(Node root, int n, int k) {
            if(root == null) {
                return -1;
            }

            if(root.data == n) {
                return 0;
            }

            int leftDist = kthAncestor(root.left, n, k);
            int rightDist = kthAncestor(root.right, n, k);

            if(leftDist == -1 && rightDist == -1) {
                return -1;
            }
    
            int dist = Math.max(leftDist, rightDist);

            if(dist + 1 == k) {
                System.out.println("Kth Ancestor : " + root.data);
            }
            
            return dist + 1;
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, -1};
        Node root = tree.buildTree(nodes);
        tree.kthAncestor(root, 4, 2);
    }   
}