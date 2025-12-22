package Array.assigment;
//Reverse an array
public class reverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        for(int i= arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
        System.out.println(" ");
        //using two pointers.
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
