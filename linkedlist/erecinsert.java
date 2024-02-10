package linkedlist;

public class erecinsert extends aLL {

    public Node insertrec(int val,int index){
        Node node=head;
        if(index==0){
            Node temp=new Node(val);
            temp=node.next;
            return temp;
        }
        node=node.next;
        return node.next=insertrec(val,index-1);


    }
}
