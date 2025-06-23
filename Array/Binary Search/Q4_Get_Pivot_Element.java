//Q4 -> Find pivot element in rotated sorted array. Pivot element is the minimun value element in array.

public class Q4_Get_Pivot_Element {
    public static void main(String[] args) {
        int arr[]={7,8,11,15,19,15,3,4,6};
        int pivotIndex=getPivot(arr);
        System.out.println("Pivot index: "+pivotIndex);
        System.out.println("Pivot element: "+arr[pivotIndex]);
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
}