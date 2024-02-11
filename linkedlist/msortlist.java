package linkedlist;

//147 insertion 148 https://leetcode.com/problems/sort-list/

public class msortlist {
    
}
//differt mid showing stackoverflow
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
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode mid=middleNode(head);
        ListNode left=sortList(head);
        ListNode right=sortList(mid);
        return mergeTwoLists(left,right);
        //return head;
    }
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
     public ListNode middleNode(ListNode head) {
        ListNode midPrev=null;
        //ListNode s=head;
        //missed s!=null
        while(head!=null && head.next!=null){
           midPrev  =(midPrev == null)?head: midPrev.next;
           head=head.next.next;
        }
        ListNode mid=midPrev.next;
        midPrev.next=null;
        return mid;
    }
}