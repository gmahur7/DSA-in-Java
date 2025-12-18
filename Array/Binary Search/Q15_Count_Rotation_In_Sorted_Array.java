import java.util.ArrayList;
import java.util.Arrays;

public class Q15_Count_Rotation_In_Sorted_Array {
    public static void main(String[] args) {
        int[] array = { 4, 5, 6, 7, 0, 1, 2 };
        ArrayList<Integer> list = new ArrayList<>(Arrays.stream(array).boxed().toList());

        int min = getMinimumElementIndex(list);
        System.out.println("List is rotated by: " + min+" times");
    }

    static int getMinimumElementIndex(ArrayList<Integer> list) {
        int start = 0;
        int end = list.size() - 1;
        int mid = (start + end) / 2;

        while (start <= end) {
            if (list.get(start) <= list.get(mid)) {
                if (list.get(mid) > list.get(mid + 1)) {
                    return mid + 1;
                }
                start = mid + 1;
            } else {
                if (list.get(mid) > list.get(mid - 1)) {
                    return mid - 1;
                }
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        return -1;
    }
}
