// package Array.Binary Search;
// Q2 - > Find the occurance of given number in an array .... how many times given no present in an array;

public class Q2_Total_Occurance_Of_No {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 3, 3,3,3, 4, 5, 6 };
        int target=3;
        System.out.println("Count of "+target+" is: "+count(arr, target));
    }

    static int count(int array[], int k) {
        int left = leftOccurance(array, k);
        int right = rightOccurance(array, k);
        return right - left + 1;
    }

    static int leftOccurance(int array[], int k) {
        int start = 0;
        int end = array.length - 1;
        int mid = (start + end) / 2;
        int result = -1;
        while (start <= end) {
            if (array[mid] == k) {
                end = mid - 1;
                result = mid;
            } else if (array[mid] < k) {
                start = mid + 1;
            } else if (array[mid] > k) {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        return result;
    }

    static int rightOccurance(int array[], int k) {
        int start = 0;
        int end = array.length - 1;
        int mid = (start + end) / 2;
        int result = -1;
        while (start <= end) {
            if (array[mid] == k) {
                start = mid + 1;
                result = mid;
            } else if (array[mid] < k) {
                start = mid + 1;
            } else if (array[mid] > k) {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        return result;
    }
}
