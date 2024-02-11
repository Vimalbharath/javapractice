package linkedlist;
//https://leetcode.com/problems/linked-list-cycle/
//https://leetcode.com/problems/linked-list-cycle-ii/

public class jlinkedlistcyclestart {

     public ListNode detectCycle(ListNode head) {
        ListNode f = head;
        ListNode s = head;
        int length=lengthCycle(head);
        if(length==0){
            return null;
        }
        while(length!=0){
            f=f.next;
            length--;
        }
        while(f!=s){
            f = f.next;
            s = s.next;
        }
        return s;
        
    }

    public int lengthCycle(ListNode head) {
        ListNode f = head;
        ListNode s = head;
        
        while (f != null && f.next != null) {

            f = f.next.next;
            s = s.next;
            if (f == s) {
                //f = head;
                int count = 0;
                ListNode temp=s;
                do {
                    //f = f.next;
                    temp = temp.next;
                    count = count + 1;
                } while (temp != s);
                return count;
            }
        }
        return 0;
    }
}
