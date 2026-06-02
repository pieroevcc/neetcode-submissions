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
    public void reorderList(ListNode head) {
        //get node half way
        ListNode fast = head;
        ListNode half = head;
        while(fast != null && fast.next != null){
            half = half.next;
            fast = fast.next.next;
        }
        //reverse half the list
        ListNode curr = half.next;
        ListNode prev = null;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        half.next = null;
        //merge the 2 list
        ListNode l1 = head;
        ListNode l2 = prev;
        while(l2 != null){
            ListNode n1 = l1.next;
            ListNode n2 = l2.next;
            l1.next = l2;
            l2.next = n1;
            l1 = n1;
            l2 = n2;
        }
    }
}
