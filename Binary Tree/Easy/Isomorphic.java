// https://practice.geeksforgeeks.org/problems/check-if-tree-is-isomorphic/1

public class Isomorphic {
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
        public static boolean isIsomorphic(Node root1, Node root2) {
            if(root1 == null || root2 == null) {
                return false;
            }

            if(root1.data == root2.data) {
                if((root1.left == root2.left) && (root1.right == root2.right)
                 || (root1.left == root2.right) && (root1.left == root2.right)) {
                    return true;
                }
            }

            return false;
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        
        Node root2 = new Node(1);
        root2.left = new Node(3);
        root2.right = new Node(2);
        root2.left.left = new Node(4);

        if(tree.isIsomorphic(root1, root2)) {
            System.out.println("Both are Isomorphic Trees");
        } else {
            System.out.println("Both are Non-Isomorphic Trees");
        }
    }    
}
