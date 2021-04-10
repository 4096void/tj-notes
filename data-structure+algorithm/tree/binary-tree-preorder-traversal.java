// https://leetcode.com/problems/binary-tree-preorder-traversal/description/

class Solution {
  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> ret = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();

    stack.push(root);
    while (!stack.isEmpty()) {
      TreeNode node = stack.pop();
      if (node == null) continue;
      ret.add(node.val);
      stack.push(node.right);
      stack.push(node.left);
    }

    return ret;
  }
}
