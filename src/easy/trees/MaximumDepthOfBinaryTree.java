package easy.trees;

// https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        if (left > right)
            return left + 1;
        else
            return right + 1;

     }
}
