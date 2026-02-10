import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collector;

public class Q18_Largest_Consecutive_Sequence {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 1, 5, 3, 4, 7, 8, 12, 6));
        int x = getSequence(list);
        System.err.println("Largest Sequence Length: " + x);
    }

    // brute force
    // static int getSequence(ArrayList<Integer> list) {
    // int n = list.size();
    // int maxLen = 0;
    // for (int i = 0; i < n; i++) {
    // int curr = list.get(i);
    // int max = 1;
    // while (list.contains(curr + 1)) {
    // max++;
    // curr++;
    // }
    // maxLen = Math.max(maxLen, max);
    // }
    // return maxLen;
    // }

    // better
    // static int getSequence(ArrayList<Integer> list) {
    // int n = list.size();
    // int maxLen = 0;
    // int lastMin = Integer.MIN_VALUE;
    // Collections.sort(list);

    // int len = 1;
    // for (int i = 0; i < n; i++) {

    // if (list.get(i) == lastMin) {
    // continue;
    // } else if (list.get(i) == lastMin + 1) {
    // len++;
    // lastMin = list.get(i);
    // } else {
    // lastMin = list.get(i);
    // len = 1;

    // }

    // maxLen = Math.max(maxLen, len);
    // }

    // return maxLen;
    // }

    // optimized
    static int getSequence(ArrayList<Integer> list) {
        int n = list.size();
        int maxLen = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(list.get(i));
        }

        for (int i = 0; i < n; i++) {
            int curr = list.get(i);

            if (!set.contains(curr - 1)) {
                int len = 1;
                while (set.contains(curr + 1)) {
                    curr++;
                    len++;
                }
                maxLen = Math.max(maxLen, len);
            }

        }

        return maxLen;
    }

}