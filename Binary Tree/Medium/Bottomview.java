// https://www.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1
// Not Completed.

import java.util.*;

public class Bottomview {
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

        static class nodeInfo {
            Node node;
            int hd;

            public nodeInfo(Node node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }

        public static void bottomView(Node root) {
            Queue<nodeInfo> q = new LinkedList<>();
            Map<Integer, Node> map = new HashMap<>();

            int min = 0, max = 0;
            q.add(new nodeInfo(root, 0));
            q.add(null);

            while (!q.isEmpty()) {
                nodeInfo curr = q.remove();
                if (curr == null) {
                    if(q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    if(!map.containsKey(curr.hd)) {
                        map.put(curr.hd, curr.node);
                    }

                    if(curr.node.left != null) {
                        q.add(new nodeInfo(curr.node.left, curr.hd + 1));
                        min = Math.min(min, curr.hd + 1);
                    }

                    if(curr.node.right != null) {
                        q.add(new nodeInfo(curr.node.right, curr.hd - 1));
                        max = Math.max(max, curr.hd - 1);
                    }
                }
            }

            for (int i = min; i <= max; i++) {
                System.out.print(map.get(i).data + " ");
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        Node root = tree.buildTree(nodes);
        System.out.print("Bottom View : ");
        tree.bottomView(root);
    }
}