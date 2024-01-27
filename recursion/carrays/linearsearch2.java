package recursion.carrays;

public class linearsearch2 {
     public static void main(String[] args) {
        int[] arr={0,1,2,3,6,7,8};
        int target=7;
        System.out.println(linear(arr,0,target));
    }

    private static int linear(int[] arr,int index,int target) {
        if(arr.length==0){
            return -1;
        }
       if(arr.length==index){
        return -1;
       }
       if ( arr[index]==target){
        return index;
       }
       else{
        return linear(arr,index+1,target);
       }


    }
}
