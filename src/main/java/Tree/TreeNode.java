package Tree;

import java.util.ArrayList;

public class TreeNode {
    String data;
    ArrayList<TreeNode> children;

    public TreeNode(String data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public addChild () {

    }

    private String repeat(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    public String print(int level) {
        String ret;
        ret = repeat("", level) + data + "\n";
        for ()
    }

    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks:");

        System.out.println(drinks.print(0));
    }

}
