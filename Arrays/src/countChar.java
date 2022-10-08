import java.util.Scanner;
public class countChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        char chars[]=s.toCharArray();
        int character=0;
        int space=0;
        int digits=0;
        int other=0;

        for(int i=0;i<s.length();i++){
            if(Character.isDigit(chars[i])){
                digits++;
            }
            else if(Character.isAlphabetic(chars[i])) {
                character++;

            }
            else if(Character.isSpaceChar(chars[i])){
                space++;
            }
            else{
                other++;
            }
        }

//        for(int i=0;i<s.length();i++){
//            if((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z'))
//                character++;
//            else if(s.charAt(i)>='0'&&s.charAt(i)<='9')
//                digits++;
//            else if(s.charAt(i)==' ')
//                space++;
//            else
//                other++;
//
//        }
        System.out.println("Number of characters = "+ character);
        System.out.println("Number of spaces = "+ space);
        System.out.println("Number of digits = "+ digits);
        System.out.println("Number of other characters = "+ other);
    }
}
