# Reverse linked list

[leetcode #206, easy](https://leetcode.com/problems/reverse-linked-list/description/)

## Recirsive manner

A: a1 -> a2 -> a3, and for each ListNode in list, apply below procedure individually  
`ListNode n => null <- node <- node.next`  

## Add2head manner

A: a1 -> a2 -> a3  
Apply below procedure to each ListNode in list  
`ListNode n, n.next = currentNode.next, currentNode.next = n, current = n`  

```java
public ListNode reverList(ListNode head) {
  if (head == null || head.next == null) return head;

  ListNode rest = head.next;
  ListNode newHead = reverList(rest);

  rest.next = head;
  head.next = null;
  
  return newHead;
}

public ListNode reverList2(ListNode head) {
  ListNode newHead = new ListNode(-1);

  while (head != null) {
    ListNode next = head.next;
    head.next = newHead.next;
    newHead.next = head;
    head = next;
  }

  return newHead.next;
}

```
