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
    public ListNode swapPairs(ListNode head) {
        if(head==null|| head.next==null)
        {
            return head;
        }
        ListNode cur=head;
        ListNode prev=null;
        ListNode next;
        for(int i=0;i<2;i++)
        {
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        head.next=swapPairs(cur);
        return prev;
    }
}