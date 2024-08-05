// https://www.geeksforgeeks.org/problems/preorder-to-postorder4423/1

public class PreorderToBST {
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

    public static Node insert(Node root, int val) {
        if(root == null) {
            root = new Node(val);
            return root;
        }

        if(root.data > val) { 
           root.left = insert(root.left, val);
        } else { 
           root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root) {
        if(root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void postOrder(Node root) {
        if(root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Node root = null;
        int values[] = {40, 30, 35, 80, 100};

        for(int i=0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        
        // inorder(root);
        System.out.print("Postorder : ");
        postOrder(root);
    }     
}