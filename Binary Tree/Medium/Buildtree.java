// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description

import java.util.*;

public class Buildtree {
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

        public static void buildTree(int preOrder[], int inOrder[], ArrayList<Integer> arr) {
            int preOrderPtr = 0;
            int inOrderPtr = 0;

            while(preOrderPtr < preOrder.length-1) {
                arr.add(preOrder[preOrderPtr]);
    
                if(preOrder[++preOrderPtr] == inOrder[inOrderPtr]) {
                    arr.add(preOrder[preOrderPtr]);
                    preOrderPtr++;
                    inOrderPtr++;
                }
    
                if(inOrder[inOrderPtr] == preOrder[preOrderPtr-2]) {
                    arr.add(-1);
                    arr.add(-1);
                    inOrderPtr++;
                }
            }

            arr.add(inOrder[inOrderPtr]);
            arr.add(-1);
            arr.add(-1);

            System.out.println("Tree : " + arr);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        ArrayList<Integer> arr = new ArrayList<>();
        int preOrder[] = {3, 9, 20, 15, 7};
        int inOrder[] = {9, 3, 15, 20, 7};

        tree.buildTree(preOrder, inOrder, arr);
    } 
}
