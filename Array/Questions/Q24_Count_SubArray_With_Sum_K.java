import java.util.HashMap;
import java.util.Map;

public class Q24_Count_SubArray_With_Sum_K {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1, 1, 1, 5, 6, 4, 7, 2, 3, 1, 0, 5 };
        int target = 6;
        int count = getCount(nums, target);
        System.out.println("SubArrays with given target Count: " + count);
    }

    // static int getCount(int nums[], int target) {
    // int n = nums.length;
    // int count = 0;
    // for (int i = 0; i < n; i++) {
    // int sum = 0;
    // for (int j = i; j < n; j++) {
    // sum += nums[j];
    // if (sum == target) {
    // // System.out.println("i: " + i + " & j: " + j);
    // count++;
    // }
    // }
    // }
    // return count;
    // }

    static int getCount(int nums[], int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int count = 0;
        int prefix = 0;

        map.put(0, 1);

        for (int i = 0; i < n; i++) {
            prefix += nums[i];
            if (map.containsKey(prefix - target)) {
                count += map.get(prefix - target);
            }

            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }

        return count;
    }

}
