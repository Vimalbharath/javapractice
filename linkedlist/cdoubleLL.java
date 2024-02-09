package linkedlist;



public class cdoubleLL {

    private Node head;
    
    public void insert(int val){
        Node node=new Node(val);
        if(head!=null){
            head.prev=node;
            node.next=head;
        }
        
        head=node;
        
    }
    public void insertlast(int val){
        Node node=new Node(val);
        if (head==null){
            head=node;
            return;
        }
        Node temp=head;
        Node last=null;
        while(temp!=null){
            last =temp;
            temp=temp.next;
        }
        node.prev=last;
        last.next=node;


    }

// insertnenxt next passing node and value
//pass after val and new val

    public void insertnext(int after,int val){
        Node p=findnode(after);
        if(p==null){
            System.out.println("does not exist");
            return;
        }
        Node node=new Node(val);
        if(p.next!=null){
        node.next=p.next;
        Node a=node.next;
        a.prev=node;
        }
        node.prev=p;
        p.next=node;
        
    }
//find node returning index passing node not possible
//pass val return node
    public Node findnode(int value){
        Node temp=head;
        
        while(temp!=null){
           if(temp.val==value){
                return temp;
           }
           temp=temp.next;
           
        }
      return null;
    }

    public void display(){
        Node temp=head;
        Node tail=null;
        while(temp!=null){
            System.out.print(temp.val+ " -> ");
            //position to print reverse
            tail=temp;
            temp=temp.next;
            
        }
        
        System.out.print("END ");
        System.out.println();
        System.out.println("Printing in reverse");
        while(tail!=null){
            System.out.print(tail.val+ " -> ");
            tail=tail.prev;
            
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
        linked.insertlast(99);
        linked.insertnext(2,50);
        linked.insertnext(99,100);
        linked.display();

    }
}
