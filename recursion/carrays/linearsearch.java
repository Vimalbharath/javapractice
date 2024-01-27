package recursion.carrays;

public class linearsearch {
     public static void main(String[] args) {
        int[] arr={0,1,2,3};
        int target=0;
        System.out.println(linear(arr,0,target));
    }

    private static boolean linear(int[] arr,int index,int target) {
        if(arr.length==0){
            return false;
        }
       if(arr.length==index){
        return false;
       }
       return arr[index]==target||linear(arr,index+1,target);
    }
}
