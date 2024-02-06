package linkedlist;

public class aLL {
    private Node head;
    private Node tail;
    

    private int size;
    
    


    public aLL() {
        this.size = 0;
    }


    public class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
        
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


    public void addFirst(int num) {
        // new node showing static error
        Node node=new Node(num);
    // same as above   node.value=num;
       node.next=head;
       head=node;
       if(tail==null){
        tail=head;
       }
       size=size+1;
    }
}
