// https://leetcode.com/problems/reverse-linked-list/description/

// recursive manner
public ListNode reverList(ListNode head) {
  if (head == null || head.next == null) return head;

  ListNode rest = head.next;
  // dont forget to return head
  ListNode newHead = reverList(rest);

  rest.next = head;
  head.next = null;
  
  return newHead;
}

// add2head manner
public ListNode reverList2(ListNode head) {
  ListNode newHead = new ListNode(-1);

  while (head != null) {
    ListNode next = head.next;
    head.next = newHead.next;
    newHead.next = head;
    head = next;
  }

  // newHead is just a duplicated ListNode
  return newHead.next;
}
