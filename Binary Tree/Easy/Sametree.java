// https://leetcode.com/problems/same-tree/description

public class Sametree {
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
        public static boolean isSame(Node root1, Node root2) {
            if(root1 == null || root2 == null) {
                return false;
            }

            if(root1.data == root2.data) {
                if(isSame(root1.left, root2.left) && isSame(root1.right, root2.right)) {
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

       Node root2 = new Node(1);
       root2.left = new Node(2);
       root2.right = new Node(3);

       if(tree.isSame(root1, root2)) {
        System.out.println("Both are Same Trees");
       } else {
        System.out.println("Both are Different Trees");
       }
    }    
}