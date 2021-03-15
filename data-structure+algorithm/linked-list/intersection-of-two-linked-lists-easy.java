// https://leetcode.com/problems/intersection-of-two-linked-lists/description/

public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
  ListNode l1 = headA;
  ListNode l2 = headB;

  /*
    there's no JavaScript's `===` equivalent in Java
    and tailNode.next == null
   */
  while (l1 != l2) {
    l1 = (l1 == null) ? headB : l1.next;
    l2 = (l2 == null) ? headA : l2.next;
  }

  return l1;
}
