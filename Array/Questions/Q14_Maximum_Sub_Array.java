import java.util.ArrayList;
import java.util.Arrays;

public class Q14_Maximum_Sub_Array {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(-2, -3, -1, -2, -3));

        int maxSum = getMaximumSum(list);
        System.out.println("Maximun Sum: " + maxSum);

        ArrayList<Integer> result = getMaximumSumArray(list);
        System.out.println("Maximun SubArray: " + result.toString());
    }

    static int getMaximumSum(ArrayList<Integer> list) {
        int n = list.size();

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + list.get(i);
            if (max < sum) {
                max = sum;
            }  if (sum < 0) {
                sum = 0;
            }
        }

        return max;
    }

    static ArrayList<Integer> getMaximumSumArray(ArrayList<Integer> list) {
        int n = list.size();
        ArrayList<Integer> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int sum = 0;

        int start = 0;
        int startIndex = -1;
        int endIndex = -1;

        for (int i = 0; i < n; i++) {
            sum = sum + list.get(i);
            if (max < sum) {
                max = sum;
                startIndex = start;
                endIndex = i;
            }  if (sum < 0) {
                sum = 0;
                start = i + 1;
            }
        }

        for (int j = startIndex; j <= endIndex; j++) {
            result.add(list.get(j));
        }
        return result;

    }
}
