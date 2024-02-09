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
        Node last=head;
        while(last!=null){
            last=last.next;
        }
        node.prev=last;
        

    }

// insertnenxt next passing node and value
//pass after val and new val

    public void insertnext(Node node,int val){
        if(node.next==null){
            
        }
    }
//find node returning index passing node not possible
//pass val return node
    public int findnode(Node node){
        Node temp=head;
        int count=0;
        
        while(temp!=null){
           if(temp.val==node.val){
                return count;
           }
            count=count+1;
        }
        return 
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
        linked.display();

    }
}
