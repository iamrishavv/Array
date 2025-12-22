package Array;
//find min and max element of an array.
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class findMaxAndMinEle {
    public static void main(String[] args) {
        int arr[]={15,8,9,2,11,4};
        //using sorting method.
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);
        //using two pointers.
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }else{
                min=arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);


    }
}
