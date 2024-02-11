package linkedlist;
//https://leetcode.com/problems/linked-list-cycle/

public class hlinkedlistcycle {
    public boolean hasCycle(ListNode head) {
        ListNode f = head;
        ListNode s = head;
        while (f != null && f.next != null) {

            f = f.next.next;
            s = s.next;
            if (f == s) {
                return true;
            }
        }
        return false;
    }
}
