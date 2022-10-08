public class sumOfNnumbers {
    public int sum(int n){
        if(n<=0)
            return n;
        return n+sum(n-1);

    }
    public static void main(String[] args) {
        sumOfNnumbers s = new sumOfNnumbers();
        System.out.println(s.sum(10));
    }
}
