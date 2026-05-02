package problems.trees;

import common.TreeNode;

public class LowestCommonAncestorInBinarySearchTree235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (root.val < p.val && root.val < q.val) {
                root = root.right;
                continue;
            }

            if (root.val > p.val && root.val > q.val) {
                root = root.left;
                continue;
            }

            return root;
        }

        return null;
    }
}
