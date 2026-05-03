public class Q25_Count_SubArrays_Target_K_XOR {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1, 1, 1, 5, 6, 4, 7, 2, 3, 1, 0, 5 };
        int target = 6;
        int count = getCount(nums, target);
        System.out.println("SubArrays with given target Count: " + count);
    }

    static int getCount(int nums[], int k) {
        int n = nums.length;
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            int xor = 0;
            for (int j = i; j < n; j++) {
                xor = xor ^ nums[j];
                if (xor == k) {
                     System.out.println("i: " + i + " & j: " + j);
                    count++;
                }
            }
        }

        return count;
    }
}
