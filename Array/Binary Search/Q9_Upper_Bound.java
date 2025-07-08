// Q8=> Find the upper bound in sorted array with given target no.? 
// Upper bound => Smallest index such that array[ind] > target

public class Q9_Upper_Bound {
    public static void main(String[] args){
        int[] arr = {1,2,4,5,6,8,9,12,15};
        int target = 3;
        int ans = upperBound(arr, target);
        System.out.println("Upper bound index for target "+target+" is "+ans);
    }

    static int upperBound(int array[], int target) {
        int start = 0;
        int end = array.length - 1;
        int ans = array.length;
        int mid = (start + end) / 2;

        while (start <= end) {
            if (array[mid] > target) {
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
