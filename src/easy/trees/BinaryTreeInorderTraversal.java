package easy.trees;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/binary-tree-inorder-traversal/
public class BinaryTreeInorderTraversal {

        public List<Integer> inorderTraversal(TreeNode root) {

            List<Integer> tmp = new ArrayList<>();
            if (root == null)
                return tmp;

            tmp.addAll(inorderTraversal(root.left));
            tmp.add(root.val);
            tmp.addAll(inorderTraversal(root.right));

            return tmp;
    }
}
