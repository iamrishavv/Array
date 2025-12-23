package Array.assigment;

import java.util.HashSet;

//print non-repeating number.
public class uniqueNum {
    public static void main(String[] args) {
        int [] arr={2,3,2,1,3,4,5};
        HashSet<Integer> seen=new HashSet<>();
        for(int x:arr){
            if(seen.contains(x)){
                seen.remove(x);
            }else {
                seen.add(x);
            }
        }
        System.out.println(seen);


    }
}
