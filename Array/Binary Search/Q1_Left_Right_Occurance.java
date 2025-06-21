// package Array.Binary Search;

public class Q1_Left_Right_Occurance {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 6, 6, 6, 6, 6, 6, 15, 16 };
        int x = 6;
        System.out.println("Left Occurance of " + x + " is " + leftOccurance(arr, x));
        System.out.println("Right Occurance of " + x + " is " + rightOccurance(arr, x));
    }

    public static int leftOccurance(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        int result = -1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (array[mid] == target) {
                result = mid;
                end = mid - 1;
            } else if (array[mid] < target) {
                start = mid + 1;
            } else if (array[mid] > target) {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        return result; // target not found
    }

    public static int rightOccurance(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        int result = -1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (array[mid] == target) {
                result = mid;
                start = mid + 1;
            } else if (array[mid] < target) {
                start = mid + 1;
            } else if (array[mid] > target) {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        return result; // target not found
    }
}
