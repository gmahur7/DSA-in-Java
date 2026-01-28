import java.util.ArrayList;
import java.util.Arrays;

public class Q16_Next_Permutation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 5,4,3));
        find(list);
        System.err.println("Next Permutation: " + list.toString());
    }

    static void find(ArrayList<Integer> list) {
        int n = list.size();

        int index = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (list.get(i) < list.get(i + 1)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            int start = 0;
            int end = n;
            while (start < end) {
                int temp = list.get(start);
                list.set(start, list.get(end));
                list.set(end, temp);
                start++;
                end--;
            }
            return;

        }

        for (int i = n - 1; i > index; i--) {
            if (list.get(i) > list.get(index)) {
                int temp = list.get(i);
                list.set(i, list.get(index));
                list.set(index, temp);
                break;
            }
        }

        int start = index + 1;
        int end = n - 1;
        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }

        return;

    }
}