package Array;
//wap to segregate 0 and 1.
public class q2 {
    public static void main(String[] args) {
        int arr[]={1,1,0,1,0,1};
        //first we will count the no of zeroes.
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
        }
        //then run the code till count and fill the elements with zeros
        for(int i=0;i<count;i++){
            arr[i]=0;
        }
        // then start with count and fill with 1.
        for(int i=count;i<arr.length;i++){
            arr[i]=1;
        }
        //print.
        for(int el:arr){
            System.out.println(el);
        }
    }
}
