public class Q19_Set_Matrix_Zeros {
    public static void main(String[] args) {
        int nums[][] = { { 1, 1, 1 }, { 0, 1, 1 }, { 1, 0, 1 } };
        // 0 0 1
        // 0 0 0
        // 0 0 0
        setZeros(nums);
        traverse(nums);

    }

    // brute
    static void setZeros(int nums[][]) {
        int m = nums.length;
        for (int i = 0; i < m; i++) {
            int n = nums[i].length;
            for (int j = 0; j < n; j++) {
                if (nums[i][j] == 0) {
                    setRow(i, nums);
                    setColumn(j, nums);
                    // traverse(nums);
                }
            }
        }

        for (int i = 0; i < m; i++) {
            int n = nums[i].length;
            for (int j = 0; j < n; j++) {
                if (nums[i][j] == -1) {
                    nums[i][j] = 0;
                }
            }
        }
    }

    static void setRow(int i, int[][] nums) {
        for (int j = 0; j < nums[i].length; j++) {
            nums[i][j] = -1;
        }
    }

    static void setColumn(int j, int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i][j] = -1;
        }
    }

    static void traverse(int nums[][]) {
        int m = nums.length;
        for (int i = 0; i < m; i++) {
            int n = nums[i].length;
            for (int j = 0; j < n; j++) {
                System.out.print(" " + nums[i][j]);
            }
            System.out.println("\n");
        }
    }

    // better
        static void setZeros2(int nums[][]) {
        int m = nums.length;
        int col[] = new int[m];
        int row[] = new int[nums[0].length];

        for (int i = 0; i < m; i++) {
            int n = nums[i].length;
            for (int j = 0; j < n; j++) {
                if (nums[i][j] == 0) {
                    col[i] = 1;
                    row[j] = 1;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            int n = nums[i].length;
            for (int j = 0; j < n; j++) {
                if (col[i] == 1 || row[j] == 1) {
                    nums[i][j] = 0;
                }
            }
        }
    }
}
