package recursion.carrays;

public class sorted {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(sort(arr,0));
    }

    private static boolean sort(int[] arr,int index) {
       if(arr.length-1==0){
        return true;
       }
       return arr[i]<arr[i+1]&&sort(arr,index-1);
    }
}
