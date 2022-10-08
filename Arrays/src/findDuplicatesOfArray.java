

import java.util.HashSet;
public class findDuplicatesOfArray {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        int arr[]={1,3,3,2,4,2,4,5,6,7,8,8};
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                System.out.println(arr[i]);
            }
            else{
                set.add(arr[i]);
            }
        }
    }
}
