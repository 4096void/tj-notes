// https://leetcode.com/problems/symmetric-tree/description/

class Solution {
  public boolean isSymmetric(TreeNode root) {
    if (root == null) return true;

    return isSymmetricWith(root.left, root.right);
  }

  private boolean isSymmetricWith(TreeNode left, TreeNode right) {
    if (left == null && right == null) return true;
    if (left == null || right == null) return false;

    if (left.val != right.val) return false;

    return isSymmetricWith(left.left, right.right) && isSymmetricWith(left.right, right.left);
  }
}
