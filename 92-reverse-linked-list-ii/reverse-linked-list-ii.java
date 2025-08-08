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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null|| left==right) return head;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode temp=dummy;
        for(int i=1;i<left;i++)
        {
            temp=temp.next;
        }
        ListNode cur=temp.next;
        ListNode next,prev=null;
        for(int i=0;i<=right-left;i++)
        {
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        temp.next.next=cur;
        temp.next=prev;
        return dummy.next;
    }
}