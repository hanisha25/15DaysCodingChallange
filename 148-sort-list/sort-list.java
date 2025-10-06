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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            list.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(list);
        ListNode newhead=new ListNode(-1);
        ListNode cur=newhead;
        for(int el:list)
        {
            cur.next=new ListNode(el);
            cur=cur.next;
        }
        return newhead.next;
    }
}