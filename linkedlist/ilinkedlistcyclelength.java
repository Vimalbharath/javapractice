package linkedlist;
//https://leetcode.com/problems/linked-list-cycle/

public class ilinkedlistcyclelength {
    public int hasCycle(ListNode head) {
        ListNode f = head;
        ListNode s = head;
        
        while (f != null && f.next != null) {

            f = f.next.next;
            s = s.next;
            if (f == s) {
                //f = head;
                do {
                    //f = f.next;
                    s = s.next;
                    count = count + 1;
                } while (f != s);

            }
        }
        return 0;
    }
}
