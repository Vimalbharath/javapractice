package linkedlist;

public class aLL {
    private node head;
    private node tail;
    private node next;

    private int size=0;
    
    public void setSize(int size) {
        this.size = size;
    }


    public class node{
        int value;
        node next;

        public node(int value) {
            this.value = value;
        }
        
        public node(int value, node next) {
            this.value = value;
            this.next = next;
        }
    }


    public void addFirst(int num) {
       node.value=num;
    }
}
