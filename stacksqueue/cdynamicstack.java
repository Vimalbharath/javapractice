package stacksqueue;

public class cdynamicstack extends acustomstack {
    public cdynamicstack(){
        super();
    }
    public cdynamicstack(int size){
        super(size);
    }
     
    @Override
    public boolean push(int val) {
       if(this.isfull()){
            int[] temp=new int[data.length*2];

            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
            data=temp;

       }
        return super.push(val);
    }
     public static void main(String[] args) throws bstackexception{
        cdynamicstack stack=new cdynamicstack(3);
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
