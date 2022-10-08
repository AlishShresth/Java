public class HeadRecursion {
    public void calculate(int n){
        if(n>0){
            calculate(n-1);
            int k = n*n;
            System.out.println(k);

        }
    }

    public static void main(String[] args) {
        HeadRecursion r = new HeadRecursion();
        r.calculate(4);
    }
}
