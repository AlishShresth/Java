public class InsertingElement {
    public static void main(String[] args){
        int arr[]=new int[]{22,18,19,23,14,90};
        int index=2;
        for(int i=arr.length-1;i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=99;
        for(int e=0;e<arr.length;e++){
            System.out.println(arr[e]+" ");
        }
    }
}
