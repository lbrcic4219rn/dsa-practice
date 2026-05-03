package problems.trees;

import common.TreeNode;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = new TreeNode(preorder[0]);
        TreeNode curr = root;
        int p = 1, i = 0;
        boolean left = true;
        while (p < preorder.length) {
            if (preorder[p] == inorder[i]) {

            }
            if (left)
            p++;
        }

        return root;
    }
}
