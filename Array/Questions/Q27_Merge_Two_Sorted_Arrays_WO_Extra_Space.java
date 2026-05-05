public class Q27_Merge_Two_Sorted_Arrays_WO_Extra_Space {
    public static void main(String[] args) {
        int nums[]= {2,6,9};
        int nums2[]={0,1,3,4,5,6,7};
        doSort(nums, nums2);

        for (int i : nums) {
            System.out.print(i+", ");
        }

        System.out.println();

        for (int i : nums2) {
            System.out.print(i+", ");
        }

    }

    static void doSort(int nums[], int[] nums2) {
        int n = nums.length;
        int n2 = nums2.length;

        int res[] = new int[n + n2];
        int i = 0, j = 0, curr = 0;

        while (i < n && j < n2) {
            if (nums[i] <= nums2[j]) {
                res[curr++] = nums[i];
                i++;
            } else {
                res[curr++] = nums2[j];
                j++;
            }
        }

        if (i < n) {
            while (i < n) {
                res[curr++] = nums[i];
                i++;
            }
        }

        if (j < n2) {
            while (j < n2) {
                res[curr++] = nums2[j];
                j++;
            }
        }

        for (int k = 0; k < res.length; k++) {
            if(k<n){
                nums[k]=res[k];
            }else{
                nums2[k-n]=res[k];
            }
        }

    }
}
