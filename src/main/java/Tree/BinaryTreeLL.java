package Tree;

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

    //preorder traversal
    public void inOrder(BinaryNode node){
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " "); //root
        inOrder(node.right);
    }

    //preorder traversal
    public void postOrder(BinaryNode node){
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " "); //root

    }

    //First Assignment
    //Implement  Level order traversal
    //HINT = You will need a queue to implement this.


}


