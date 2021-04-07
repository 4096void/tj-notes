// https://leetcode.com/problems/average-of-levels-in-binary-tree/description/

class Solution {
  public List<Double> averageOfLevels(TreeNode root) {
    List<Double> ret = new ArrayList<>();
    if (root == null) return ret;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
      int cnt = queue.size();
      double sum = 0;
      for (int i = 0; i < cnt; i++) {
        TreeNode node = queue.poll();
        sum += node.val;
        if (node.right != null) queue.add(node.right);
        if (node.left != null) queue.add(node.left);
      }
      ret.add(sum / cnt);
    }

    return ret;
  }
}
