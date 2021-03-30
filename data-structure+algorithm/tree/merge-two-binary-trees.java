// https://leetcode.com/problems/merge-two-binary-trees/description/

class Solution {
  public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
    if (root1 == null && root2 == null) return null;
    if (root1 == null) return root2;
    if (root2 == null) return root1;

    int val1 = root1 == null ? 0 : root1.val;
    int val2 = root2 == null ? 0 : root2.val;

    TreeNode merged = new TreeNode(val1 + val2);

    merged.left = mergeTrees(root1.left, root2.left);
    merged.right = mergeTrees(root1.right, root2.right);

    return merged;
  }
}
