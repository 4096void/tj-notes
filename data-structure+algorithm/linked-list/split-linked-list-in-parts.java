// https://leetcode.com/problems/split-linked-list-in-parts/description/


public ListNode[] splitListToParts(ListNode root, int k) {
  int N = 0;
  ListNode cur = root;

  while (cur != null) {
    N ++;
    cur = cur.next;
  }

  int mod = N % k;
  int size = N / k;

  ListNode[] result = new ListNode[k];
  cur = root;

  for (int i = 0; cur != null & i < k; i++) {
    result[i] = cur;
    int curSize = size + (mod-- > 0 ? 1 : 0);

    // but why `curSize - 1`?
    for (int j = 0; j < curSize - 1; j++) {
      cur = cur.next;
    }

    ListNode next = cur.next;
    cur.next = null;

    cur = next;
  }

  return result;
}
