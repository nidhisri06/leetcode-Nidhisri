// Last updated: 12/08/2026, 11:12:56
1public class Solution {
2    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
3        ListNode a = headA;
4        ListNode b = headB;
5        
6        while (a != b) {
7            a = a != null ? a.next : headB;
8            b = b != null ? b.next : headA;
9        }
10        
11        return a;
12    }
13}