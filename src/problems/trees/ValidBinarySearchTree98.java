package problems.trees;

import common.TreeNode;

public class ValidBinarySearchTree98 {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isValid(TreeNode root, int min, int max) {
        if (root == null) {
            return true;
        }

        if (!(min < root.val && root.val < max) ) {
            return false;
        }

        return isValid(root.left, min, root.val)
                && isValid(root.right, root.val, max);
    }
}
