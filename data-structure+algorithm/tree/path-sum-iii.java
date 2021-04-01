// https://leetcode.com/problems/path-sum-iii/description/

class Solution {
  public int pathSum(TreeNode root, int sum) {
    if (root == null) return 0;
    int ret = pathSumStartWithRoot(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    return ret;
  }

  private int pathSumStartWithRoot(TreeNode root, int sum) {
    if (root == null) return 0;

    int ret = 0;
    if (root.val == sum) ret++;
    ret += pathSumStartWithRoot(root.left, sum - root.val) + pathSumStartWithRoot(root.right, sum - root.val);
    return ret;
  }
}
