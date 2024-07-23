import java.util.*;

public class LinkedListTree {

    public static class BinaryNode {
        public String value;
        public BinaryNode left;
        public BinaryNode right;
        int height;

        public BinaryNode(String value) {
            this.value = value;
            this.left = null;
            this.right = null;
            this.height = 0;
        }
    }

    public static class BinaryTreeLL {
        BinaryNode root;

        public BinaryTreeLL() {
            this.root = null;
        }

        void preOrder(BinaryNode node) {
            if (node == null) {
                return;
            }
            System.out.print(node.value + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
        void inOrder(BinaryNode node)
        {
            if (node == null) {
                return;
            }
            inOrder(node.left);
            System.out.print(node.value + " ");
            inOrder(node.right);
        }
        void postOrder(BinaryNode node)
        {
            if (node == null) {
                return;
            }
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.value + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTreeLL binaryTree = new BinaryTreeLL();
        BinaryNode b1 = new BinaryNode("b1");
        BinaryNode b2 = new BinaryNode("b2");
        BinaryNode b3 = new BinaryNode("b3");
        BinaryNode b4 = new BinaryNode("b4");
        BinaryNode b5 = new BinaryNode("b5");
        BinaryNode b6 = new BinaryNode("b6");

        b1.left = b2;
        b1.right = b3;
        b2.left = b4;
        b2.right = b5;
        b3.left = b6;

        binaryTree.root = b1;
        binaryTree.preOrder(binaryTree.root);
        System.out.println();
        binaryTree.inOrder(binaryTree.root);
        System.out.println();
        binaryTree.postOrder(binaryTree.root);
    }
}
