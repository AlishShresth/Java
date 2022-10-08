import java.util.Scanner;
public class removeElementFromArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter 5 numbers: ");
        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
                System.out.println("Enter number to remove");
        int e = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==e){
                while(i<arr.length-1)
                {arr[i]=arr[i+1];
                i++;}
                arr[i]=Integer.MIN_VALUE;
                for(int j=0;j<arr.length-1;j++){
                    System.out.print(arr[j]+" ");
                }
                return;
            }
        }
        System.out.println("Element not found!");
    }
}
