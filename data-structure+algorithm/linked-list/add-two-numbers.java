// https://leetcode.com/problems/add-two-numbers-ii/description/

public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
  Stack<Integer> l1Stack = buildStack(l1);
  Stack<Integer> l2Stack = buildStack(l2);

  ListNode head = new ListNode(-1);
  int carry = 0;

  while (!l1Stack.isEmpty() || !l2Stack.isEmpty() || carry != 0) {
    int x = l1Stack.isEmpty() ? 0 : l1Stack.pop();
    int y = l2Stack.isEmpty() ? 0 : l2Stack.pop();
    int sum = x + y + carry;

    ListNode node = new ListNode(sum % 10);
    node.next = head.next;
    head.next = node;

    carry = sum / 10;
  }
}

private Stack<Integer> buildStack(ListNode l) {
  Stack<Integer> stack = new Stack<>();

  while (l != null) {
    stack.push(l.val);
    l = l.next;
  }

  return stack;
}
