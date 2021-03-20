# Intersection of two linked lists

[leetcode #160, easy](https://leetcode.com/problems/intersection-of-two-linked-lists/description/)  

Linked list listA: a1 -> a2 -> a3 -> c1 -> c2  
Linked list listB: b1 -> b2 -> b3 -> b4 -> c1 -> c2  
Common part C: c1 -> c2  

So:

Linked list A distinct part, A: a1 -> a2 -> a3  
Linked list B distinct part, B: b1 -> b2 -> b3 -> b4  

listA + listB = A + C + B + C  
listB + listA = B + C + A + C  
A + B + C = B + A + C  

So just compare above two linked lists' listNode directly one by one, then will get the intersection node finally.

```java
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
```
