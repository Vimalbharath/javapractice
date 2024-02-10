package linkedlist;

public class erecinsert extends aLL {

    public Node insertrec(int val,int index){
        Node node=head;
        if(index==0){
            Node temp=new Node(val);
            node.next=temp;
            return temp;
        }
        node=node.next;
        return node.next=insertrec(val,index-1);


    }
     public static void main(String[] args) {
        erecinsert linked=new erecinsert();
        linked.addFirst(4);
        linked.addFirst(5);
        linked.addFirst(6);
        linked.addFirst(7);
        linked.addFirst(8);
        linked.addLast(3);
        //System.out.println(linked.getSize());
        linked.add(9,2);
        //System.out.println(linked.getSize());
        linked.display();
        //System.out.println(linked.getSize());
        System.out.println(linked.deletefirst());
        //System.out.println(linked.getSize());
        System.out.println(linked.deleteLast());
        //System.out.println(linked.getSize());
        linked.display();
        System.out.println(linked.delete(2));
        linked.insertrec(600, 2);
        linked.display();
    }
}
