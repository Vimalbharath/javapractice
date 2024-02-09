package linkedlist;

public class cdoubleLL {

    private Node head;
    
    public void insert(int val){
        Node node=new Node(val);
        if(head!=null){
            head.prev=node;
            node.next=head;
        }
        
        node=head;
        
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val+ " - >");
            temp=temp.next;
        }
    }

    public class Node{
        private int val;
        private Node next;
        private Node prev;

         public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }
    public static void main(String[] args) {
        cdoubleLL linked=new cdoubleLL();
        linked.insert(0);
        linked.insert(1);
        linked.insert(2);
        linked.insert(3);
        linked.insert(4);
        linked.display();

    }
}
