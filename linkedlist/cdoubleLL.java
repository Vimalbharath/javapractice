package linkedlist;

public class cdoubleLL {


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
