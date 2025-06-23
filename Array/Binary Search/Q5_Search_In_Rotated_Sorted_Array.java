// Q5 -> Find the target element in rotated sorted array.
// step 1. find pivot element -> pivot element is minimum value element in rotated sorted array.
// step 2. then run binary search accoding to target lies on first line or second line

public class Q5_Search_In_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int arr[] = { 7, 8, 9, 2, 3, 4, 5 };
        int target = 9;
        int index = searchInRotatedArray(arr, target);
        System.out.println("Target " + target + " found at index " + index);
    }

    static int getPivot(int array[]) {
        int start = 0;
        int end = array.length - 1;
        int mid = (start + end) / 2;
        while (start < end) {
            if (array[0] <= array[mid]) {
                start = mid + 1;
            } else {
                end = mid;
            }
            mid = (start + end) / 2;
        }
        return end;
    }

    static int binarySearch(int array[], int start, int end, int target) {
        int mid = (start + end) / 2;
        while (start <= end) {
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                end = mid - 1;
            } else if (array[mid] < target) {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        return -1;
    }

    static int searchInRotatedArray(int array[], int target) {
        int pivotIndex = getPivot(array);
        if (array[pivotIndex] <= target && target <= array[array.length - 1]) {
            return binarySearch(array, pivotIndex, array.length - 1, target);
        } else {
            return binarySearch(array, 0, pivotIndex - 1, target);
        }
    }
}
