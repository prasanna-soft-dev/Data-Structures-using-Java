import java.util.ArrayList;

public class Tree {
    static class TreeNode {
        String data;
        ArrayList<TreeNode> children;

        public TreeNode(String data) {
            this.data = data;
            this.children = new ArrayList<TreeNode>();
        }

        public void addChild(TreeNode node) {
            this.children.add(node);
        }

        public String print(int level) {
            StringBuilder ret = new StringBuilder();
            for (int i = 0; i < level; i++) {
                ret.append(" ");
            }
            ret.append(data).append("\n");

            for (TreeNode node : this.children) {
                ret.append(node.print(level + 1));
            }
            return ret.toString();
        }
    }

    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");
        drinks.addChild(hot);
        drinks.addChild(cold);
        System.out.print(drinks.print(0));
    }
}
