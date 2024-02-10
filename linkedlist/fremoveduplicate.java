package linkedlist;
//https://leetcode.com/problems/remove-duplicates-from-sorted-list/

public class fremoveduplicate extends aLL {
    public Node deleteDuplicates(Node head) {
        Node node = head;
        //not works when null.next
        // if(head.next==null){
        //     return head;
        // }
        while (node != null) {
            
            while (node.next!=null && node.value == node.next.value) {
                node.next = node.next.next;
                //not workswhen 1,1,1
                //size--;
            }
            node=node.next;
        }
        return head;
    }
}
