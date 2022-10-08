import java.util.Scanner;
public class sumOfArrayElements {
    public static void main(String[] args) {
        System.out.println("Enter 10 numbers: ");
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int e:arr){
            sum+=e;
        }
        System.out.println("Sum = "+sum);
        float avg=(float)(sum/arr.length);
        System.out.println("Average = "+avg);


    }
}
