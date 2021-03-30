// https://leetcode.com/problems/invert-binary-tree/description/

class Solution {
  public TreeNode invertTree(TreeNode root) {
    if (root == null) return root;
    if (root.left == null && root.right == null) return root;

    TreeNode temp = invertTree(root.left);
    root.left = invertTree(root.right);
    root.right = temp;

    return root;
  }
}
