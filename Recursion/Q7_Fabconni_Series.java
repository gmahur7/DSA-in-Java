public class Q7_Fabconni_Series {
    public static void main(String[] args) {
        int n=3;
        System.out.println("n = "+series(n));
    }

    static int series(int n){
        if(n<=1) return n;
        return series(n-1)+series(n-2);
    }
}
