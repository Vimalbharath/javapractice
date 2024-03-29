package linkedlist;

public class gmergesorted extends aLL {
     public Node mergeTwoLists(Node list1, Node list2) {
        //aLL merged=new aLL();
        while(list1!=null&&list2!=null){
            if(list1.value<list2.value){
                addLast(list1.value);
                list1=list1.next;
            }else{
                addLast(list2.value);
                list2=list2.next;
            }
            
            
        }
        while(list1!=null){
            addLast(list1.value);
            list1=list1.next;
        }
         while(list2!=null){
            addLast(list2.value);
            list2=list2.next;
        }
        return head;
    }
}

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode DummyHead= new ListNode();
        ListNode tail=DummyHead;
         while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                tail.next=list1;
                list1=list1.next;
                
                tail=tail.next;
            }
            else{
                tail.next=list2;
                list2=list2.next;
                tail=tail.next;
            }
            
            
        }
        while(list1!=null){
            tail.next=list1;
           list1=list1.next;
                
                tail=tail.next;
        }
         while(list2!=null){
            //val for tail,only tail,tail.next
             tail.next=list2;
                list2=list2.next;
                tail=tail.next;
        }
        return DummyHead.next;
    }
    
     
    
}
