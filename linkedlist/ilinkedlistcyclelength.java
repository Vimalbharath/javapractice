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
