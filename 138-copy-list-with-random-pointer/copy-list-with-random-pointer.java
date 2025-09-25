/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        Node cur=head;
        //creating next list
        while(cur!=null)
        {
            Node newNode=new Node(cur.val);
            newNode.next=cur.next;
            cur.next=newNode;
            cur=newNode.next;
        }
       cur=head;
       // creating random list
       while(cur!=null)
       {
        if(cur.random!=null)
        {
           cur.next.random=cur.random.next;
        }
        cur=cur.next.next;
       }
       cur=head;
       Node newhead=head.next;
       Node newcur=newhead;
       while(cur!=null )
       {
          cur.next=newcur.next;
          cur=cur.next;
          if(cur!=null)
          {
            newcur.next=cur.next;
            newcur=newcur.next;
          }
       }
       return newhead;
    }
}