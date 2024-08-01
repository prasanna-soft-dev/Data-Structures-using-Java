import java.util.*;

public class AVL {
    public class TreeNode {
        public int val;
        public int height;
        public TreeNode left;
        public TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.height = 1; // Starting height of a new node is 1
        }
    }

    public TreeNode root;

    AVL() {
        root = null;
    }

    // Preorder, Inorder, Postorder
    public void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public void postorder(TreeNode root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    // Level Order Traversal
    public void levelOrderTraversal() {
        if (root == null) {
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode presNode = q.remove();
            System.out.print(presNode.val + " ");
            if (presNode.left != null) {
                q.add(presNode.left);
            }
            if (presNode.right != null) {
                q.add(presNode.right);
            }
        }
    }

    // Searching a node in AVL tree
    TreeNode searching(TreeNode node, int value) {
        if (node == null) {
            System.out.println("Not found");
            return null;
        } else if (node.val == value) {
            System.out.println("Found " + node.val);
            return node;
        } else if (node.val < value) {
            return searching(node.right, value);
        } else {
            return searching(node.left, value);
        }
    }

    // Get height
    public int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    // Rotate right
    private TreeNode rotateRight(TreeNode disbalancedNode) {
        TreeNode newRoot = disbalancedNode.left;
        disbalancedNode.left = newRoot.right;
        newRoot.right = disbalancedNode;

        disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));

        return newRoot;
    }

    // Rotate left
    private TreeNode rotateLeft(TreeNode disbalancedNode) {
        TreeNode newRoot = disbalancedNode.right;
        disbalancedNode.right = newRoot.left;
        newRoot.left = disbalancedNode;

        disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));

        return newRoot;
    }

    // Get balanced node
    public int getbalancedNode(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return getHeight(node.left) - getHeight(node.right);
    }

    // Insert node
    private TreeNode inserNode(TreeNode node, int value) {
        if (node == null) {
            return new TreeNode(value);
        }

        if (value < node.val) {
            node.left = inserNode(node.left, value);
        } else if (value > node.val) {
            node.right = inserNode(node.right, value);
        } else {
            return node;
        }

        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));

        int balance = getbalancedNode(node);

        // Left Left condition
        if (balance > 1 && value < node.left.val) {
            return rotateRight(node);
        }

        // Left Right condition
        if (balance > 1 && value > node.left.val) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        // Right Right condition
        if (balance < -1 && value > node.right.val) {
            return rotateLeft(node);
        }

        // Right Left condition
        if (balance < -1 && value < node.right.val) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    // Public method to call the private method
    public void insert(int value) {
        root = inserNode(root, value);
    }


    //to get minimum node

    public static TreeNode minimumNode(TreeNode root)
    {
        if(root.left == null)
        {
            return root;
        }
        return minimumNode(root.left);
    }


    //delete node

    public TreeNode deleteNode(TreeNode node, int value)
    {
        if(node == null)
        {
            System.out.println("not found");
            return node;
        }
        if(value < node.val)
        {
            node.left = deleteNode(node.left, value);
        }
        else if(value >  node.val)
        {
            node.right = deleteNode(node.right, value);
        }
        else 
        {
            if(node.left != null && node.right != null)
            {
                TreeNode temp = node;
                TreeNode minNodeofRight = minimumNode(temp.right);

                node.val = minNodeofRight.val;
                node.right = deleteNode(node.right, minNodeofRight.val);
            }
            else if(node.left != null)
            {
                node = node.left;
            }
            else if(node.right != null)
            {
                node = node.right;
            }
            else
            {
                node = null;
            }
        }
        int balance = getbalancedNode(node);

        //left left condition
        if(balance > 1 && getbalancedNode(node.left) >= 0)
        {
            return rotateRight(node);
        }
        if(balance > 1 && getbalancedNode(node.left) < 0)
        {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }
        if(balance < -1 && getbalancedNode(node.right) <= 0)
        {
            return rotateLeft(node);
        }
        if(balance < -1 && getbalancedNode(node.right) > 0)
        {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
        
    }

    public void delete(int value)
    {
        root = deleteNode(root, value);
    }

    public static void main(String[] args) {
        AVL avl = new AVL();

        avl.insert(5);
        avl.insert(10);
        avl.insert(15);
        avl.insert(20);

        System.out.println("Level Order Traversal:");
        avl.levelOrderTraversal();

        System.out.println("\nPreorder Traversal:");
        avl.preorder(avl.root);

        System.out.println("\nInorder Traversal:");
        avl.inorder(avl.root);

        System.out.println("\nPostorder Traversal:");
        avl.postorder(avl.root);

        avl.searching(avl.root, 15);
        avl.searching(avl.root, 25);


        System.out.println("before deleting");
        avl.levelOrderTraversal();
        System.out.println();
        System.out.println("after deleting");
        avl.delete(15);
        avl.levelOrderTraversal();

    }
}
