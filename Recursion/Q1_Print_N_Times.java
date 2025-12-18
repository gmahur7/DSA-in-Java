public class Q1_Print_N_Times {
    public static void main(String[] args) {
        printByRecursion(1, 5); //positive
        printByRecursion(5, 1);

    }

    // Positive
    static void printByRecursion (int i,int n){
    if(i>n)
    return;
    System.err.println(i+" Recursion");
    printByRecursion(i+1, n);
    }

    // Negative
    // static void printByRecursion(int i, int n) {
    //     if (i < n)
    //         return;
    //     System.err.println(i + " Recursion");
    //     printByRecursion(i - 1, n);
    // }
}
