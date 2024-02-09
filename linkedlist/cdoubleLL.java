package linkedlist;

public class cdoubleLL {

    private Node head;
    
    public void insert(int val){
        Node node=new Node(val);
        if(head!=null){
            
            node.next=head;
        }
        
        node=head;
        node.prev=null;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val+ " - >");
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
        }
    }
}
