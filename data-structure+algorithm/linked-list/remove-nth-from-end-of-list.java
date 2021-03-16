// https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/

public ListNode removeNthFromEnd(ListNode head, int n) {
  ListNode fast = head;

  while (n-- > 0) {
    fast = fast.next;
  }
  // list's length less then nth ...
  if (fast == null) return head.next; 

  ListNode slow = head;

  while (fast.next != null) {
    fast = fast.next;
    slow = slow.next;
  }

  slow.next = slow.next.next;
  return head;
}
