import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q7_Find_Missing_No {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(14, 10, 12, 13, 11));
        System.out.println("Missing No: " + missing2(list));

    }

    // Brute force
    static int missing(ArrayList<Integer> list) {
        int n = list.size();
        int min = list.get(0);
        int max = list.get(0);

        for (int k = 0; k < n; k++) {
            if (list.get(k) < min)
                min = list.get(k);
            if (list.get(k) > max)
                max = list.get(k);
        }

        for (int i = min; i <= max; i++) {
            boolean isAvailable = false;
            for (int j = 0; j < n; j++) {
                if (i == list.get(j)) {
                    isAvailable = true;
                }
            }
            if (!isAvailable) {
                return i;
            }
        }
        return -1;
    }

    // Better
    static int missing2(ArrayList<Integer> list) {
        int n = list.size();
        int min = list.get(0);
        int max = list.get(0);

        for (int k = 0; k < n; k++) {
            if (list.get(k) < min)
                min = list.get(k);
            if (list.get(k) > max)
                max = list.get(k);
        }

        ArrayList<Integer> temp = new ArrayList<>(Collections.nCopies(n+1, null));
        for (int i = 0; i < list.size(); i++) {
            temp.set(list.get(i) - min, list.get(i));
        }

        int miss = -1;
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i) == null)
                miss = min + i;
        }

        return miss;
    }
}
