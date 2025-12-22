package Array;
//print 0 then 1 then 2.
public class q3 {
    public static void main(String[] args) {
        int arr[]={0,1,2,0,1,2};
        int count0=0 , count1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count0++;
            }else if(arr[i]==1){
                count1++;
            }
        }

        for(int i=0;i<count0;i++){
            arr[i]=0;
        }
        for(int i=count0;i<count1+count1;i++){
            arr[i]=1;
        }
        for(int i=count0+ count1;i<arr.length;i++){
            arr[i]=2;
        }
        for(int ele:arr){
            System.out.println(ele);
        }
        //using three pointers.
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            } else if (arr[mid]==1) {
                mid++;
            }else{//mid==2
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
        for(int k:arr){
            System.out.println(k);
        }
    }
}
