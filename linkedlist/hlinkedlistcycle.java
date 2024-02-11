package linkedlist;
//https://leetcode.com/problems/linked-list-cycle/

public class hlinkedlistcycle {
     public boolean hasCycle(ListNode head) {
        ListNode f = head;
        ListNode s = head;
        while (f != null && s != null) {
            if (f != s) {
                f = f.next;
                s = s.next.next;
            } else {
                return true;
            }
        }
        return false;
    }
}
