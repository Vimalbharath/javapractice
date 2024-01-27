package recursion.carrays;

public class linearsearch {
     public static void main(String[] args) {
        int[] arr={};
        int target=0;
        System.out.println(linear(arr,0,target));
    }

    private static boolean linear(int[] arr,int index,int target) {
        if(arr.length==0){
            return false;
        }
       if(arr.length-1==index){
        return arr[index]==target;
       }
       return arr[index]==target||linear(arr,index+1,target);
    }
}
