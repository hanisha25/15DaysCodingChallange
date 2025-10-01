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
        int size=sizeOfLL(head);
        if(size==n)
        {
            return head.next;
        }
        ListNode cur=head;
        for(int i=1;i<(size-n);i++)
        {
            cur=cur.next;
        }
        cur.next=cur.next.next;
        return head;
    }
    public int sizeOfLL(ListNode head)
    {
        int size=1;
        ListNode temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
            size++;
        }
        return size;
    }
}