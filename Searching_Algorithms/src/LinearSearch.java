public class LinearSearch {
    public static void main(String[] args) {
        int[] arr ={12,4,6,8,10,9};
        int key=12;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==key){
                System.out.println("Found at index "+i);
                return;
            }
        }
        System.out.println("Not found");
    }
}
