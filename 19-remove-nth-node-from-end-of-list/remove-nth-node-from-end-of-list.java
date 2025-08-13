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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=1;
        ListNode temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
            size++;
        }
        if(size==n) return head.next;
        temp=head;
        for(int i=1;i<(size-n);i++)
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}