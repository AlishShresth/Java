public class reverseArray {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8  };
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];

            arr[i]=arr[arr.length-1-i];

            arr[arr.length-1-i]=temp;

        }
        for(int e:arr){
            System.out.print(e+" ");
        }
    }
}
