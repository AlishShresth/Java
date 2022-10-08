import java.util.Scanner;
public class HelloWorld {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your weight");
        float w=sc.nextFloat();
        System.out.println("Enter your height");
        float h=sc.nextFloat();
        float bmi = w/(h*h);
        System.out.println("BMI = " + bmi);

    }
}
