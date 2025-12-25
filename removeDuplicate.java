package Array.assigment;

import java.util.HashSet;

public class removeDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 4};
        //unsorted
        HashSet<Integer> s=new HashSet<>();
        for(int x:arr){
            s.add(x);
        }
        for(int  y:s){
            System.out.println(y);
        }
        //sorted Array
        int j=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[j++]=arr[i];
            }
        }
        for(int i=0;i<j;i++){
            System.out.println(arr[i]);
        }
    }
}
