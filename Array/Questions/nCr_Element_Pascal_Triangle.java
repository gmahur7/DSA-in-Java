public class nCr_Element_Pascal_Triangle {
    public static void main(String[] args) {
        System.out.println("Element is: "+getnCrElement(3, 2));
    }

    static int getnCrElement(int row, int col) {
        if(row<col) return 1;
        int n=row-1;
        int r=col-1;
        int result = 1;
        for (int i = 0; i < r; i++) {
            result *= (n - i);
            result /= i + 1;
        }
        return result;
    }
}
