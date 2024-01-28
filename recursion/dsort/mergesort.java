package recursion.dsort;

import java.util.Arrays;

public class mergesort {
     public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        arr=merge(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static int[] merge(int[] arr) {
        if(arr.length==1){
            return arr;
        }
        int mid =arr.length/2;
        int [] left=merge(Arrays.copyOfRange(arr,0,mid));
        int [] right=merge(Arrays.copyOfRange(arr,mid,arr.length));

        return sorted(left,right);
    }

    private static int[] sorted(int[] left, int[] right) {
    
       int k=0;
       int i=0;
       int j=0;
       int[] ans=new int[left.length+right.length];
       while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                ans[k]=left[i];
                k++;
                i++;
            }
            else{
                ans[k]=right[j];;
                k++;
                j++;
            }
       }
       while(i<left.length){
        ans[k]=left[i];
        i++;
       }
       while(j<right.length){
        ans[k]=right[j];
        j++;
       }
       return ans;
    }
}
