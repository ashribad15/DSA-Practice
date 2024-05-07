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
    public ListNode doubleIt(ListNode head)
    {    
        ListNode prev = null;
        
        ListNode current = head;
        
        while (current != null)
        {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        
        ListNode newHead = prev;
        int carry = 0;
        ListNode resultPrev = null; // For building the reversed result
        
        while (newHead != null)
        {
            int temp = newHead.val * 2 + carry;
            carry = temp / 10;
            ListNode newNode = new ListNode(temp % 10);
            
            // Build the result in the correct order
            newNode.next = resultPrev;
            resultPrev = newNode;
            
            newHead = newHead.next;
        }
        
        if (carry > 0)
        {
            ListNode new_node = new ListNode(carry);
            new_node.next = resultPrev;
            resultPrev = new_node;
        }
         
        
        return resultPrev; 
    }
}



