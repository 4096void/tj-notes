// https://leetcode.com/problems/balanced-binary-tree/description/

class Solution {
  private boolean balanced = true;

  public boolean isBalanced(TreeNode root) {
    calDepthAndCompare(root);
    return balanced;
  }

  public int calDepthAndCompare(TreeNode root) {
    if (root == null) return 0;

    int l = calDepthAndCompare(root.left);
    int r = calDepthAndCompare(root.right);

    if (Math.abs(l - r) > 1) balanced = false;

    return Math.max(l, r) + 1;
  }
}
