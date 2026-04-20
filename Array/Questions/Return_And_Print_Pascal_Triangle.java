import java.util.ArrayList;

public class Return_And_Print_Pascal_Triangle {
    public static void main(String Args[]) {
        ArrayList<ArrayList<Integer>> list = getPascalTriangle(8);
        System.out.println(list.toString());

    }

    static ArrayList<ArrayList<Integer>> getPascalTriangle(int row) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int n = row;

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> inner = new ArrayList<>();
            int res = 1;
            inner.add(res);
            for (int j = 0; j < i; j++) {
                res *= (i - j);
                res /= j + 1;
                inner.add(res);
            }
            list.add(inner);
        }

        return list;
    }
}
