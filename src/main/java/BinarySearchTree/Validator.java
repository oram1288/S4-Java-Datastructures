package BinarySearchTree;

public class Validator {
    public boolean isValidBST(CheckerNodeTest root) {
        return validate(root, null, null);
    }
    private boolean validate(CheckerNodeTest node, Integer min, Integer max) {
        if (node == null) {
            return true;
        }
        // check if the current node value is within the valid range
        if ((min != null && node.val <= min) || (max != null && node.val >= max)) {
            return false;
        }
        // check this recursively
        return validate(node.left, min, node.val) && validate(node.right, node.val, max);
    }

    public static CheckerNodeTest createValidBST() {
        CheckerNodeTest root = new CheckerNodeTest(5);
        root.left = new CheckerNodeTest(3);
        root.right = new CheckerNodeTest(7);
        root.left.left = new CheckerNodeTest(2);
        root.right.right = new CheckerNodeTest(4);
        return root;
    }

    // Invalid test
    public static CheckerNodeTest createInValidBST() {
        CheckerNodeTest root = new CheckerNodeTest(5);
        root.left = new CheckerNodeTest(7);
        root.right = new CheckerNodeTest(3);
        root.left.left = new CheckerNodeTest(2);
        root.left.right = new CheckerNodeTest(4);
        return root;
    }

    public static void main(String[] args) {
        Validator validator = new Validator();
        CheckerNodeTest valid = createValidBST();
        CheckerNodeTest invalid = createInValidBST();

        System.out.println("Is valid BST" + validator.isValidBST(valid));
        System.out.println("Is valid BST" + validator.isValidBST(invalid));
    }
}
