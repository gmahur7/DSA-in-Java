import java.util.ArrayList;
import java.util.Arrays;

public class Q12_Sort_0_1_2s {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0, 0, 2, 0, 1, 0, 0, 0, 1, 2, 0, 1, 1, 2, 1));
        sort012s(list);
        System.out.println("sorted: " + list.toString());
    }

    static void sort012s(ArrayList<Integer> list) {
        int n = list.size();

        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            if (list.get(mid) == 0) {
                int temp = list.get(mid);
                // if (low == 0) {
                    list.set(mid, list.get(low));
                    list.set(low, temp);
                // } 
                // else {
                //     list.set(mid, list.get(low - 1));
                //     list.set(low, temp);
                // }
                low++;
                mid++;
            } else if (list.get(mid) == 1) {
                mid++;
            } else {
                int temp = list.get(mid);
                list.set(mid, list.get(high));
                list.set(high, temp);
                high--;
            }
        }
    }
}
