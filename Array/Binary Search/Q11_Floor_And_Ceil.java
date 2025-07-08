/*
Q10 => Find the floor and ceil acrroding to given target in an array?
  Floor => larget element index <= target
  Ceil => smallest element index >= target
*/

public class Q11_Floor_And_Ceil {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 6, 7, 8 };
        int target = 3;
        int floor = getFloor(arr, target);
        int ceil = getCeil(arr, target);
        System.out.println("Floor index for target "+target+" is: "+floor);
        System.out.println("Ceil index for target "+target+" is: "+ceil);
    }

    static int getFloor(int array[], int target) {
        int start = 0, end = array.length - 1, ans = -1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (array[mid] <= target) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        return ans;
    }

    static int getCeil(int array[], int target) {
        int start = 0, end = array.length - 1, ans = -1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (array[mid] >= target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        return ans;
    }
}
