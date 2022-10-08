public class IterationRecursionDemo {
    public void calculateiterative(int n){
        while(n>0){
            int k = n*n;
            System.out.println(k);
            n = n-1;
        }
    }
    public void calculaterecursive(int n){
        if(n>0){
            int k = n*n;
            System.out.println(k);
            calculaterecursive(n-1);
        }
    }
    public static void main(String args[]){
        IterationRecursionDemo r= new IterationRecursionDemo();
        r.calculateiterative(4);
        r.calculaterecursive(4);
    }
}
