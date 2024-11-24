package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
    BinaryNode root;

    public BinaryTreeLL(){
        this.root = null;
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

    //Implement  Level order traversal

    // Search method using level order traversal
    public void search (String value) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.value == value) {
                System.out.println("The value - " + value + " is found in the tree");
                return;
            } else {
                if (presentNode.left != null) {
                    queue.add(presentNode.left);
                }
                if (presentNode.right != null) {
                    queue.add(presentNode.right);
                }
            }
            System.out.println("The value - " + value + " is not found in the queue");
        }
    }

    // Insert Method
    public void insert (String value) {
        BinaryNode newNode = new BinaryNode();
        newNode.value = value;
        if (root == null) {
            root = newNode;
            System.out.println("Inserted new node at root");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.left == null) {
                presentNode.left = newNode;
                System.out.println("Successfully Inserted");
                break;
            } else if (presentNode.right == null) {
                presentNode.right = newNode;
                System.out.println("Successfully Inserted");
                break;
            } else {
                queue.add(presentNode.left);
                queue.add(presentNode.right);

            }
        }
    }
    //First Assignment
    //Implement  Level order traversal. *HINT = You will need a queue to implement this.
    //Given a node, implement a delete method to delete a node
    //Implement a method to delete an entire binary tree

    // Delete a specific node
    public void deleteNode(String value) {
        if (root == null) {
            System.out.println("The tree is empty");
            return;
        }

        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            // If the value is found, remove this node
            if (presentNode.left != null && presentNode.left.value.equals(value)) {
                presentNode.left = null;
                System.out.println("Node deleted successfully");
                return;
            }
            if (presentNode.right != null && presentNode.right.value.equals(value)) {
                presentNode.right = null;
                System.out.println("Node deleted successfully");
                return;
            }
            // Continue traversal
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }

        System.out.println("Node with value " + value + " not found");
    }

    // Delete the entire binary tree
    public void deleteTree() {
        root = null;
        System.out.println("Binary tree deleted successfully");
    }
}


