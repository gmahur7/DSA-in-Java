

public class Rotate_Array_By_K {
    public static void main(String[] args) {
        int k = 3;

        int array[] = { 1, 2, 3, 4, 5,6,7 };

        rotate(array, k);

        for (Integer i : array) {
            System.out.print(i + ",");
        }

    }

    static void rotate(int[] nums, int k) {
        if (k < 1)
            return;
        int n = nums.length;

        k = k % n;

        for (int i = 0; i < k; i++) {
            int temp = nums[n - 1];
            for (int j = n-1; j >0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }
    }
}
