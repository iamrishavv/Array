package Array.assigment;
//sort array in ascending and descending order.
public class sortArray {
    public static void main(String[] args) {
        //Ascending order..
        int [] arr={4,3,5,2,8};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i:arr){
            System.out.println(i);
        }
        System.out.println(" ");
        //descending order.
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for(int j:arr){
            System.out.println(j);
        }
    }
}
