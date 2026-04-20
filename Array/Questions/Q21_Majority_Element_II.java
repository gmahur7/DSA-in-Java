import java.util.ArrayList;

public class Q21_Majority_Element_II {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1, 2, 3, 2 };
        ArrayList<Integer> res = getMajority(nums);
        System.out.println("Max: " + res.toString());
    }

    static ArrayList<Integer> getMajority(int nums[]) {
        int n = nums.length;
        int elem1 = 0, elem2 = 0;
        int count1 = 0, count2 = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == elem1 && nums[i] != elem2) {
                count1++;
            } else if (nums[i] == elem2 && nums[i] != elem1) {
                count2++;
            } else if (count1 == 0) {
                count1 = 1;
                elem1 = nums[i];
            } else if (count2 == 0) {
                count2 = 1;
                elem2 = nums[i];
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == elem1)
                count1++;
            else if (nums[i] == elem2)
                count2++;
        }

        ArrayList<Integer> list = new ArrayList<>();

        if (count1 > n / 3)
            list.add(elem1);
        if (count2 > n / 3)
            list.add(elem2);

        return list;
    }
}
