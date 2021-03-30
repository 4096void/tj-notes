// https://leetcode.com/problems/maximum-depth-of-binary-tree/description/

class Solution {
  public int maxDepth(TreeNode root) {
    return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
  }
}
