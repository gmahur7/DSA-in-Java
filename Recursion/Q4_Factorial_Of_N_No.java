public class Q4_Factorial_Of_N_No {
    public static void main(String[] args) {
        int n=5;
        fact1(n, 1);
        System.out.println("Factorial2: "+fact2(n));
    }

   static void fact1(int n, int ans){
        if(n==1){
            System.out.println("Factorial1: "+ans);
            return;
        }
        fact1(n-1, n*ans);
   }

   static int fact2(int n){
        if(n==1) return 1;
        return n* fact2(n-1);
   }
}
