public class BinarySearch {
    // Iterative Binary Search
    public int iterativeSearch(int[] arr,int key){
        int start=0,end = arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    // Recursive Binary Search
    public int recursiveSearch(int[] arr,int start,int end,int key){
        int mid=(start+end)/2;
        if(start>end)
            return -1;
        if(arr[mid]==key){
            return mid;
        }
        else if(arr[mid]>key)
        return recursiveSearch(arr,start,mid-1,key);

        return recursiveSearch(arr,mid+1,end,key);
    }
    // Main function
    public static void main(String[] args) {
        BinarySearch b=new BinarySearch();
        int[] arr = {1,3,5,6,8,10,15,20};
        System.out.println(b.recursiveSearch(arr,0,arr.length-1,0));
        
    }
}
