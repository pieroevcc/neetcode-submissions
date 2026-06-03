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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode cur1 = l1;
        ListNode prev1 = null;
        ListNode cur2 = l2;
        int carry = 0;
        while (cur1 != null || cur2 != null){
            int x = (cur1 != null) ? cur1.val : 0;
            int y = (cur2 != null) ? cur2.val : 0;
            int val = x + y + carry;
            carry = val/10;
            
            if (cur1 == null && cur2 != null){
                prev1.next = cur2;
                cur1 = cur2;
                cur2 = null;
            }
            cur1.val = val%10;

            prev1 = cur1;
            if (cur1 != null) cur1 = cur1.next;
            if (cur2 != null) cur2 = cur2.next;
        }
        if (carry != 0 ){
            prev1.next = new ListNode(1);
        }
        return l1;
           
    }
}
