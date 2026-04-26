import java.util.HashMap;
import java.util.Map;

public class Q23_Largest_SubArray_With_Sum_0 {

    public static void main(String[] args) {
        int nums[] = { 1, 2, -3, -4, 2, 5, -1, -2, -1, 2, -3, -2, 8 };

        int max = getLargestSubArrayLength(nums);

        System.out.println("Max Sub Array Length: " + max);
    }

    static int getLargestSubArrayLength(int nums[]) {

        int max = 0;
        int sum = 0;
        int start = 0;
        int end = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (sum == 0) {
                max = i + 1;
                start = 0;
                end = i;
            }

            if (map.containsKey(sum)) {

                int length = i - map.get(sum);

                if (length > max) {
                    max = length;
                    start = map.get(sum) + 1;
                    end = i;
                }

            } else {
                map.put(sum, i);
            }
        }

        System.out.println("start: " + start);
        System.out.println("end: " + end);

        return max;
    }
}