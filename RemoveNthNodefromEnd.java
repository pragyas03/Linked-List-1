// Time Complexity : O(n), n = number of nodes
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return head;
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy, fast = dummy;
        int count = 0;
        
        while(count <= n) {
            fast = fast.next;
            count++;
        }
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}