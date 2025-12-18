// package Array.Questions;

public class Merge_Sorted_Arrays {
    public static void main(String[] args) {
        int array1[] = { 2, 5, 9, 12, 16 };
        int array2[] = { 1, 3, 4, 7, 8, 10, 11 };
        int mergedArray[] = merge(array1, array2);

        for (int i : mergedArray) {
            System.out.print(i + ",");
        }
    }

    static int[] merge(int arr1[], int arr2[]) {
        int m = arr1.length;
        int n = arr2.length;
        int i = 0, j = 0, k = 0;
        int[] arr3 = new int[m + n];
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }

        while (j < n) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        return arr3;
    }
}
