public class Print_Row_In_Pascal_Triange {
    public static void main(String args[]) {
        printRow(4);
    }

    static void printRow(int row) {
        int resullt = 1;
        int n=row-1;
        System.out.print(resullt+" ");

        for (int i = 0; i < n; i++) {
            resullt=resullt*(n-i);
            resullt=resullt/(i+1);
            System.out.print(resullt+" ");
        }
    }
}
