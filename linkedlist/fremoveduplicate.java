package linkedlist;
//https://leetcode.com/problems/remove-duplicates-from-sorted-list/

public class fremoveduplicate extends aLL {
    public Node deleteDuplicates(Node head) {
        Node node = head;
        if(head.next==null){
            return head;
        }
        while (node != null) {
            
            if (node.next!=null && node.value == node.next.value) {
                node.next = node.next.next;
                //size--;
            }
            node=node.next;
        }
        return head;
    }
}
