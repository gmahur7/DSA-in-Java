public class Q3_Sum_Of_N_No {
    public static void main(String[] args) {
        int n=10;
        sum1(n, 0);
        System.out.println("Sum2: "+sum2(n));
    }

    static void sum1(int n,int total){
        if (n<1) {
             System.out.println("Sum1: "+total);
             return;
        }
        sum1(n-1, total+n);
    }

    static int sum2(int n){
        if(n==1){
            return 1;
        }
        return n+ sum2(n-1);
    }
}
