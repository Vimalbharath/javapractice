package linkedlist;

//https://leetcode.com/problems/middle-of-the-linked-list/description/

public class lmiddle {
     public ListNode middleNode(ListNode head) {
        ListNode f=head;
        ListNode s=head;
        //missed s!=null
        while(s!=null && s.next!=null){
            f=f.next;
            s=s.next.next;
        }
        return f;
    }
}
