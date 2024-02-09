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

    }
}
