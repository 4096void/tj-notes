// https://leetcode.com/problems/binary-tree-inorder-traversal/description/

class Solution {
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> ret = new ArrayList<>();
    if (root == null) return ret;

    Stack<TreeNode> stack = new Stack<>();
    TreeNode cur = root;
    while (cur != root || !stack.isEmpty()) {
      while (cur != null) {
        stack.push(cur);
        cur = cur.left;
      }
      TreeNode node = stack.pop();
      ret.add(node.val);
      cur = node.right;
    }

    return ret;
  }
}
