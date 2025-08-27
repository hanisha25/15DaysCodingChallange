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
        if(l1==null)
        {
            return l2;
        }
        if(l2==null)
        {
            return l1;
        }
        ListNode add=new ListNode(-1);
        ListNode temp=add;
        ListNode head1=l1,head2=l2;
        int carry=0;
        while(head1!=null && head2!=null)
        {
            int a=head1.val;
            int b=head2.val;
            int sum=a+b+carry;
            if(sum>9) carry=1;
            else carry=0;
            ListNode newNode=new ListNode(sum%10);
            temp.next=newNode;
            temp=temp.next;
            head1=head1.next;
            head2=head2.next;
        }
        while(head1!=null)
        {
            int sum=carry+head1.val;
            if(sum>9) carry=1;
            else carry=0;
            ListNode newNode=new ListNode(sum%10);
            temp.next=newNode;
            temp=temp.next;
            head1=head1.next;
        }
        while(head2!=null)
        {
            int sum=carry+head2.val;
            if(sum>9) carry=1;
            else carry=0;
            ListNode newNode=new ListNode(sum%10);
            temp.next=newNode;
            temp=temp.next;
            head2=head2.next;
        }
        if(carry==1)
        {
            ListNode newNode=new ListNode(carry);
            temp.next=newNode;
            temp=temp.next;
        }
        return add.next;
    }
}