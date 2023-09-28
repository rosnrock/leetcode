package easy.trees;

// https://leetcode.com/problems/same-tree/
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return inorder(p).equals(inorder(q));
    }

    private String inorder(TreeNode root) {

        StringBuilder sb = new StringBuilder();
        if (root == null)
            return "";

        sb.append(inorder(root.left));
        sb.append(root.val);
        sb.append(inorder(root.right));

        return sb + ",";
    }
}
