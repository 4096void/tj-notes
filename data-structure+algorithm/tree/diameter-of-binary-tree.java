// https://leetcode.com/problems/diameter-of-binary-tree/description/

class Solution {
  public int diameterOfBinaryTree(TreeNode root) {
    return root == null ? 0 : maxDepth(root.left) + maxDepth(root.right);
  }

  private int maxDepth(TreeNode node) {
    return node == null ? 0 : Math.max(maxDepth(node.left), maxDepth(node.right)) + 1;
  }
}
