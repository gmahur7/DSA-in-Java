public class Q2_Print_N_Times_Backtrack {
    public static void main(String[] args) {
        printRecursion(1, 5);
    }

    static void printRecursion(int i, int n) {
        if (i > n)
            return;
        printRecursion(i, n - 1);
        System.out.println(n + " Recursion");
    }
}
