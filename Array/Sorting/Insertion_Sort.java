import java.util.ArrayList;
import java.util.Arrays;

public class Insertion_Sort {
     public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,7,1,2,5,3));
        sort(list);
        System.out.println("sorted: "+list.toString());
    }

    static void sort(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && list.get(j-1) > list.get(j)) {
                int temp = list.get(j);
                list.set(j, list.get(j - 1));
                list.set(j - 1, temp);
                j--;
            }
        }
    }
}