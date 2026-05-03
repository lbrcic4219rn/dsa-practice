package problems.trees;

import common.TreeNode;

public class CountGoodNodesInBinaryTree1448 {
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }

    private int dfs(TreeNode root, int max) {
        if (root == null) {
            return 0;
        }

        int count = 0;
        if (max <= root.val) count++;
        max = Math.max(max, root.val);
        int leftCount = dfs(root.left, max);
        int rightCount = dfs(root.right, max);

        return leftCount + rightCount + count;
    }
}
