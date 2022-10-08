public class TailRecursion {
    public void calculate(int n){
        if(n>0){
            int k = n*n;
            System.out.println(k);
            calculate(n-1);
        }
    }

    public static void main(String[] args) {
        TailRecursion r = new TailRecursion();
        r.calculate(4);
    }
}
