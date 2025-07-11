public class Q14_Minimum_In_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 0, 1, 2};

        int min = minimum(array);
        System.out.println("Minimum value is: " +array[min]);
    }

    static int minimum(int[] array) {
        int start = 0, end = array.length - 1;
        int mid = (start + end) / 2;
        
        while (start <= end) {
            if (array[mid] >= array[start]) {
                if (array[mid] > array[mid + 1]) {
                    return mid + 1;
                }
                start = mid + 1;
            } else {
                if (array[mid] > array[mid - 1]) {
                    return mid - 1;
                }
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        return -1;
    }
}