package problems.trees;

import com.sun.source.tree.Tree;
import common.TreeNode;

import java.util.Arrays;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if(preorder.length == 0 && inorder.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        int indx = 0;

        while (inorder[indx] != root.val) indx++;

        root.left = buildTree(
                Arrays.copyOfRange(preorder, 1, indx + 1),
                Arrays.copyOfRange(inorder, 0, indx));
        root.right = buildTree(
                Arrays.copyOfRange(preorder, indx + 1, preorder.length),
                Arrays.copyOfRange(inorder, indx + 1, inorder.length));
        return root;
    }
}
