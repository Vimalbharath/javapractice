package recursion.carrays;

import java.util.ArrayList;

public class linearsearch4 {
     public static void main(String[] args) {
        int[] arr={0,1,2,3,3,3,3,3,6,7,8};
        int target=3;
        ArrayList<Integer> ans=linear4(arr,0,target);
        System.out.println(ans);
    }
    
    

    private static ArrayList<Integer> linear4(int[] arr,int index,int target) {
        ArrayList<Integer> list=new ArrayList<>();
        if(arr.length==index){
            return list;
        }

        if ( arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ans=linear4(arr,index+1,target);
        list.addAll(ans);
        return list;


    }
}
