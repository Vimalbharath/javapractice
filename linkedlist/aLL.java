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

    public int deletefirst(){
        int val=head.value;
        head=head.next;
        size--;
        return val;
    }

    public void add(int num,int index) {
        if(index==0){
            addFirst(num);
            return;
        }
        if(index==size){
            addLast(num);
            return;
        }
        
        Node temp=head;
        for(int i=1;i<index;i++){
            //how to get index?
            temp=temp.next;
        }
        //here another contructor
        Node node=new Node(num,temp);
        node.next=temp.next;
        temp.next=node;
        size++;


    }

    public void addLast(int num) {
        
        if(tail==null){
            addFirst(num);
            return;
        }

        //new node will be created at add first
        Node node=new Node(num);
        tail.next=node;
        tail=node;
        size=size+1;
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
    public void display(){
        Node temp=head;
        while(temp !=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
    }
}
