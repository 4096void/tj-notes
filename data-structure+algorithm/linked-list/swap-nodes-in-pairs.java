// https://leetcode.com/problems/swap-nodes-in-pairs/description/

public ListNode swapPairs(ListNode head) {
  ListNode node = new ListNode(-1);
  node.next = head;

  ListNode pre = node;

  while (pre.next != null && pre.next.next != null) {
    ListNode l1 = pre.next;
    ListNode l2 = pre.next.next;
    ListNode nextPre = l2.next;

    l1.next = nextPre;
    l2.next = l1;
    pre.next = l2; // pre points to node, node need points to head (or the starting point of current loop)

    pre = l1;
  }

  return node.next;
}
