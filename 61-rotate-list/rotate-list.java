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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        if(head.next==null || k==0)
        {
            return head;
        }
        ListNode temp=head;
        int size=1;
        while(temp.next!=null)
        {
            temp=temp.next;
            size++;
        }
        k=k%size;
        int it=size-k;
        temp.next=head;
        ListNode tailNode=head;
        for(int i=1;i<it;i++)
        {
            tailNode=tailNode.next;
        }
        ListNode newHead=tailNode.next;
        tailNode.next=null;
        return newHead;
        
    }
}