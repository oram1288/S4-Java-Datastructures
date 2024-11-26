package BinarySearchTree;

public class BinarySearchTree {
    BinaryNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    // Insert method
    private BinaryNode insert(BinaryNode currentNode, int value) {
        if (currentNode == null) {
            BinaryNode newNode = new BinaryNode();
            newNode.value = value;
            System.out.println("The value is successfully inserted");
            return newNode;
        } else if (value <= currentNode.value) {
            currentNode.left = insert(currentNode.left, value);
            return currentNode;
        } else {
            currentNode.right = insert(currentNode.right, value);
            return currentNode;
        }
    }
    public void insert (int value) {
        root = insert(root, value);
    }

    //preorder traversal
    public void preOrder(BinaryNode node){
        if (node == null) {
            return;
        }
        System.out.print(node.value + " "); //root
        preOrder(node.left);
        preOrder(node.right);
    }

    //inorder traversal
    public void inOrder(BinaryNode node){
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " "); //root
        inOrder(node.right);
    }

    //postorder traversal
    public void postOrder(BinaryNode node){
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " "); //root

    }

    //Levelorder

    //search method
    public BinaryNode search(BinaryNode node, int value) {
        if (node == null) {
            System.out.println("Value: " + value + " not found in the BST");
            return null;
        } else if (node.value == value) {
            System.out.println("Value: " + value + " found in the BST");
            return node;
        } else if (value < node.value) {
            return search(node.left, value);
        } else {
            return search(node.right, value);
        }
    }

    //delete method
    public static BinaryNode minNode(BinaryNode root) {
        if (root.left == null) {
            return root;
        } else {
            return minNode(root.left);
        }
    }

    public static BinaryNode maxNode(BinaryNode root) {
        if (root.right == null) {
            return root;
        } else {
            return maxNode(root.right);
        }
    }

    public BinaryNode deleteNode (BinaryNode root, int value) {
        if (root == null) {
            System.out.println("Value not found in the BST");
            return null;
        }

        if (value < root.value) {
            root.left = deleteNode(root.left, value);
        } else if (value > root.value) {
            root.right = deleteNode(root.right, value);
        } else {
            if (root.left != null && root.right != null) {
                BinaryNode temp = root;
                BinaryNode minNodeForRight = minNode(temp.right);
                root.value = minNodeForRight.value;
                root.right = deleteNode(root.right, minNodeForRight.value);
            } else if (root.left != null) {
                root = root.left;
            } else if (root.right != null) {
                root = root.right;
            } else {
                root = null;
            }
        }
        return root;
    }

    //delete entire BST
    public void deleteBST() {
        root = null;
        System.out.println("BST has been deleted successfully");
    }
}
