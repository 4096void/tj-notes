// https://leetcode.com/problems/longest-univalue-path/

class Solution {
  private int path = 0;

  public int longestUnivaluePath(TreeNode root) {
    dfs(root);
    return path;
  }

  private int dfs(TreeNode root) {
    if (root == null) return 0;
    int left = dfs(root.left);
    int right = dfs(root.right);

    int leftPath = root.left != null && root.left.val == root.val ? left + 1 : 0;
    int rightPath = root.right != null && root.right.val == root.val ? right + 1 : 0;

    path = Math.max(path, leftPath + rightPath);
    return Math.max(leftPath, rightPath);
  }
}
