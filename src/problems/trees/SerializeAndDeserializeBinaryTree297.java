package problems.trees;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SerializeAndDeserializeBinaryTree297 {
    private int counter = 0;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<String> res = new ArrayList<>();
        serializeDfs(root, res);
        return String.join(",", res);
    }

    private void serializeDfs(TreeNode root, List<String> res) {
        if (root == null) {
            res.add("N");
            return;
        }

        res.add(String.valueOf(root.val));
        serializeDfs(root.left, res);
        serializeDfs(root.right, res);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        List<String> values = List.of(data.split(","));
        this.counter = 0;
        return deserializeDfs(values);
    }

    private TreeNode deserializeDfs(List<String> values) {
        if(values.get(counter).equals("N")) {
            this.counter++;
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(values.get(counter)));
        counter++;
        node.left = deserializeDfs(values);
        node.right = deserializeDfs(values);
        return node;
    }
}
