// https://leetcode.com/problems/house-robber-iii/description/

class Solution {
  public int rob(TreeNode root) {
    if (root == null) return 0;
    int children = rob(root.left) + rob(root.right);
    int grandChildren = 0;
    if (root.left != null) grandChildren += valueOf(root.left.left) + valueOf(root.left.right);
    if (root.right != null) grandChildren += valueOf(root.right.left) + valueOf(root.right.right);

    root.val = Math.max(children, grandChildren + root.val);
    return root.val;
  }

  private int valueOf(TreeNode n) {
    if (n == null) return 0;
    return n.val;
  }
}
