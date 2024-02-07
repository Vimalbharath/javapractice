package linkedlist;

public class bmain {
    public static void main(String[] args) {
        aLL linked=new aLL();
        linked.addFirst(4);
        linked.addFirst(5);
        linked.addFirst(6);
        linked.addFirst(7);
        linked.addFirst(8);
        linked.addLast(3);
        //System.out.println(linked.getSize());
        linked.add(9,2);
        //System.out.println(linked.getSize());
        linked.display();
        //System.out.println(linked.getSize());
        System.out.println(linked.deletefirst());
        //System.out.println(linked.getSize());
        System.out.println(linked.deleteLast());
        //System.out.println(linked.getSize());
        linked.display();
        System.out.println(linked.delete(2));
        linked.display();
    }
   
}
