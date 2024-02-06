package linkedlist;

public class aLL {
    private node head;
    private node tail;
    private node next;

    
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
}
