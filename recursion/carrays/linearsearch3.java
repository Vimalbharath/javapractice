package recursion.carrays;

import java.util.ArrayList;

public class linearsearch3 {
     public static void main(String[] args) {
        int[] arr={0,1,2,3,3,3,3,3,6,7,8};
        int target=3;
        System.out.println(linear2(arr,0,target,new ArrayList<>(list)));
    }
    static ArrayList<Integer>list = new ArrayList<>();

    private static ArrayList<Integer> linear1(int[] arr,int index,int target) {
       if(arr.length==index){
        return list;
       }
       if ( arr[index]==target){
        list.add(index);
       }
       
        return linear1(arr,index+1,target);
       


    }

    private static ArrayList<Integer> linear2(int[] arr,int index,int target,ArrayList<Integer> list) {
        if(arr.length==index){
        return list;
        }

        if ( arr[index]==target){
        list.add(index);
        }
        return linear2(arr,index+1,target,list);

    }
}
