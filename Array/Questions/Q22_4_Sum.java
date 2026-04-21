import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q22_4_Sum {
    public static void main(String[] args) {
        int[] list = { 0, 0, 1, 1, 2, 2, 3, 4, 5, 5, 7, 8, 9 };
        int target = 12;
        ArrayList<ArrayList<Integer>> set = get4sum(list, target);

        for (List<Integer> item : set) {
            System.out.println(item.toString());
        }
    }

    static ArrayList<ArrayList<Integer>> get4sum(int nums[], int target) {
        int n = nums.length;
        Arrays.sort(nums);

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                int k = j + 1;
                int l = n - 1;

                while (k < l) {
                    if ((nums[i] + nums[j] + nums[k] + nums[l]) == target) {
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        result.add(temp);
                        k++;
                        l--;
                    } else if ((nums[i] + nums[j] + nums[k] + nums[l]) < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }

        return result;
    }
}
