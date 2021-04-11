// https://leetcode.com/problems/binary-tree-postorder-traversal/description/

class Solution {
  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> ret = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();

    stack.push(root);
    while (!stack.isEmpty()) {
      TreeNode node = stack.pop();
      if (node == null) continue;
      ret.add(node.val);
      stack.push(node.left);
      stack.push(node.right);
    }
    Collections.reverse(ret);
    return ret;
  }
}
