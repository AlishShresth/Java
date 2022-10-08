public class StringToInteger {
    public static void main(String args[]){
        String s="10";
        String s2 = "6";
        String s3;
        s3=s.concat(s2);
        int k=Integer.parseInt(s);
        int n=Integer.parseInt(s2);
        int m=Integer.parseInt(s3);
        System.out.println(k+n+m);

    }
}
