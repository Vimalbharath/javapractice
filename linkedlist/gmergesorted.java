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
