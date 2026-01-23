import java.util.ArrayList;
import java.util.Arrays;

public class Q10_Longest_SubArray_Target_Sum_K {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 1, 3, 2, 0, 1));
        int k = 6;
        subArray(list, k);
    }

    static void subArray(ArrayList<Integer> list, int k) {
        int n = list.size();

        int min = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            int j = i + 1;
            int sum = list.get(i);
            if (sum== k) {
                if (j - i > max - min) {
                    min = i;
                    max = i;
                }
            }
            while (j < n) {
                sum = sum + list.get(j);
                if (sum == k && j - i > max - min) {
                    min = i;
                    max = j;
                }
                j++;
            }

        }
        System.out.println("min : " + min);
        System.out.println("max : " + max);
    }
}
