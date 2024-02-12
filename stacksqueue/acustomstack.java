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
   

}
