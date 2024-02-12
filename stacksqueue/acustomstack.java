package stacksqueue;

public class acustomstack {
    private int [] data;
    private static final int DEFAULT_SIZE=10;

    int ptr=-1;
    //private int size;

    //  public  acustomstack(){
    //     this.DEFAULT_SIZE;
    // }

    // public acustomstack(int size) {
    //     this.size = size;
    // }
     public  acustomstack(){
        this(DEFAULT_SIZE);
    }

    public acustomstack(int size) {
        this.data = new int[size];
    }

    public boolean push(int val){
        if(isfull()){
            System.out.println("Stack is full");
            return true;
        }
        ptr++;
        data[ptr]=val;
        return false;
    }

    public boolean isfull(){
        return ptr==data.length-1;
    }

    public boolean isempty(){
        return ptr==-1;
    }
   
    public int pop() throws bstackexception{
        if(isempty()){
            throw new bstackexception("Stack is full");
        }
       
        return data[ptr--];
    }

    public static void main(String[] args) throws bstackexception{
        acustomstack stack=new acustomstack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(4);
        System.out.println(stack.pop());

    }

}
