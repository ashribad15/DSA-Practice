/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head)
     {
        ListNode dummy = new ListNode(-1);
    ListNode current = head;
    ListNode result = dummy;
    
    while (current != null) {
        int sum = 0;
        while (current != null && current.val != 0) {
            sum += current.val;
            current = current.next;
        }
        result.next = new ListNode(sum);
        result = result.next;
        if (current != null) {
            current = current.next;
        }
    }
    
    return dummy.next.next;
    }
}

               
