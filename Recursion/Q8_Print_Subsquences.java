import java.util.ArrayList;

public class Q8_Print_Subsquences {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        ArrayList<Integer> list = new ArrayList<>();
        subsequence(0, arr, arr.length, list);
    }

    static void subsequence(int i, int arr[], int n, ArrayList<Integer> list) {
        if (i >= n) {
            if (list.size() > 0) {
                System.err.println(list.toString());
            }
            return;
        }
        list.add(arr[i]);
        subsequence(i + 1, arr, n, list);
        list.remove(list.removeLast());
        subsequence(i + 1, arr, n, list);
    }
}
