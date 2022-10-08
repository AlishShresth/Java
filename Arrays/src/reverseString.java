import java.util.Scanner;
public class reverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String s=sc.nextLine();
        String reversed ="";
        char chars[]=s.toCharArray();
        for(int i=s.length()-1;i>=0;i--){
            reversed+=chars[i];
        }
        System.out.println(reversed);

    }
}
