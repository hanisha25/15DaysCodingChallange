/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA,temp2=headB;
        while(temp1!=null)
        {
            ListNode cur=headB;
            while(cur!=null)
            {
                if(cur==temp1)
                {
                    return cur;
                }
                cur=cur.next;
            }
            temp1=temp1.next;
        }
        return null;
    }
}