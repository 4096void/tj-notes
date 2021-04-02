// https://leetcode.com/problems/minimum-depth-of-binary-tree/description/

class Solution {
  public int minDepth(TreeNode root) {
    if (root == null) return 0;

    int minLeft = minDepth(root.left);
    int minRight = minDepth(root.right);
    if (minLeft == 0 || minRight == 0) return minLeft + minRight + 1;

    return Math.min(minLeft, minRight) + 1;
  }
}
