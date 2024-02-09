package linkedlist;

public class dcircularLL {
    private Node head;
    private Node tail;

    public void insert(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        head=node;
    }
    public void display(){
        Node temp=head;
        do{
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }while(temp!=head);
        System.out.print(" HEAD ");
    }
    public void delete(int val){
        if (head.val==val){
            tail.next=head.next;
            head=tail.next;
            return;
        }
        Node node=head;
        Node n=node.next;
        do{
            //no problem when node=node.next; above or below
            node=node.next;
            n=n.next;
            if(n.val==val){
                node.next=n.next;
                // n=n.next;
            }
        }while(node!=head);
    }
    public class Node{
        int val;
        public Node(int val) {
            this.val = val;
        }
        Node next;
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        dcircularLL linked=new dcircularLL();
        linked.insert(1);
        linked.insert(2);
        linked.insert(3);
        linked.insert(4);
        linked.insert(5);
        linked.display();
        linked.delete(3);
        linked.display();
        linked.delete(5);
        linked.display();
        linked.delete(1);
        linked.display();
        


    }
}
