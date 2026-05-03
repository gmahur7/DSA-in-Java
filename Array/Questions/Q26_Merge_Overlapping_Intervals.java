import java.util.ArrayList;
import java.util.Arrays;

public class Q26_Merge_Overlapping_Intervals {
    public static void main(String[] args) {

        int nums[][] = { { 1, 2 }, { 3, 6 }, { 2, 3 }, { 8, 9 }, { 5, 7 }, { 4, 7 } };

        ArrayList<ArrayList<Integer>> result = mergeIntervals(nums);

        for (ArrayList<Integer> arrayList : result) {
            System.out.println(arrayList.toString());
        }

    }

    // static ArrayList<ArrayList<Integer>> mergeIntervals(int nums[][]) {
    // int n = nums.length;

    // Arrays.sort(nums, (a, b) -> Integer.compare(a[0], b[0]));

    // ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    // for (int i = 0; i < n; i++) {
    // int start = nums[i][0];
    // int end = nums[i][1];

    // if (list.size() != 0 && end <= list.getLast().getLast()) {
    // continue;
    // }

    // for (int j = i + 1; j < n; j++) {
    // while (i + 1 < n && nums[i + 1][0] <= end) {
    // end = Math.max(nums[i + 1][1], end);
    // i++;
    // }
    // }

    // ArrayList<Integer> res = new ArrayList<>();
    // res.add(start);
    // res.add(end);
    // list.add(res);

    // }

    // return list;
    // }

    static ArrayList<ArrayList<Integer>> mergeIntervals(int nums[][]) {
        int n = nums.length;

        Arrays.sort(nums, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        int start = nums[0][0];
        int end = nums[0][1];

        // ArrayList<Integer> temp = new ArrayList<>();
        // temp.add(start);
        // temp.add(end);

        // list.add(temp);

        for (int i = 0; i < n; i++) {

            if (end >= nums[i][0]) {
                end = Math.max(end, nums[i][1]);
            } else {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(start);
                temp.add(end);
                list.add(temp);
                start = nums[i][0];
                end = nums[i][1];
            }
        }

        if (start != list.getLast().getFirst()) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(start);
            temp.add(end);
            list.add(temp);
        }

        return list;
    }

}
