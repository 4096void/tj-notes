// https://leetcode.com/problems/sum-of-left-leaves/description/

class Solution {
  public int sumOfLeftLeaves(TreeNode root) {
    if (root == null) return 0;
    if (isLeaf(root.left)) return root.left.val + sumOfLeftLeaves(root.right);
    return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
  }
  private boolean isLeaf(TreeNode node) {
    if (node == null) return false;
    return node.left == null && node.right == null;
  }
}
