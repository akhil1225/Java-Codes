class Node {
    int val;
    Node left, right;

    public Node(int val) {
        this.val = val;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;


    public BinarySearchTree() {
        root = null;
    }

    // Method to insert a new node into the BST
    public void insert(int val) {
        root = insertRecursive(root, val);
    }

    // Recursive method to insert a new node into the BST
    private Node insertRecursive(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (val < root.val) {
            root.left = insertRecursive(root.left, val);
        } else if (val > root.val) {
            root.right = insertRecursive(root.right, val);
        }

        return root;
    }

    // Method to perform inorder traversal
    public void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.val + " ");
            inorderTraversal(node.right);
        }
    }

    // Method to perform preorder traversal
    public void preorderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.val + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    // Method to perform postorder traversal
    public void postorderTraversal(Node node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.val + " ");
        }
    }
}

public class BST {
    public static void main(String[] args) {
        int[] values = {1, 3, 20, 5, 6, 9, 10, 12, 15, 20, 90};
        
        BinarySearchTree bst = new BinarySearchTree();

        // Insert values into the BST
        for (int val : values) {
            bst.insert(val);
        }

        System.out.println("Inorder Traversal:");
        bst.inorderTraversal(bst.root);
        System.out.println();

        System.out.println("Preorder Traversal:");
        bst.preorderTraversal(bst.root);
        System.out.println();

        System.out.println("Postorder Traversal:");
        bst.postorderTraversal(bst.root);
        System.out.println();
    }

}
