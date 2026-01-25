import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Q11_Two_Sum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 1, 5, 7, 3, 0, 1, 2));
        ArrayList<Integer> result = new ArrayList<>();
        result = twoSum3(list, 12);
        System.out.println("result: " + result.toString());

    }

    // brute force
    static ArrayList<Integer> twoSum(ArrayList<Integer> list, int k) {
        int n = list.size();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int sum = 0;
            sum += list.get(i);
            for (int j = i + 1; j < n; j++) {
                int temp = list.get(j);
                if (sum + temp == k) {
                    result.add(i);
                    result.add(j);
                    return result;
                }
            }

        }
        result.add(-1);
        result.add(-1);
        return result;
    }

    // better approch
    static ArrayList<Integer> twoSum2(ArrayList<Integer> list, int k) {
        int n = list.size();
        ArrayList<Integer> result = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(list.get(i), i);
        }

        for (int j = 0; j < n; j++) {
            int rem = k - list.get(j);
            if (map.containsKey(rem) && j != map.get(rem)) {
                result.add(j);
                result.add(map.get(rem));
                return result;
            }
        }

        result.add(-1);
        result.add(-1);
        return result;

    }

    // optimize approch
    static ArrayList<Integer> twoSum3(ArrayList<Integer> list, int k) {
        int i = 0;
        int j = list.size() - 1;
        Collections.sort(list);
        ArrayList<Integer> result = new ArrayList<>();

        while (i < j) {
            int sum = list.get(i) + list.get(j);
            if (sum == k) {
                result.add(list.get(i));
                result.add(list.get(j));
                return result;
            } else if (sum < k) {
                i++;
            } else {
                j--;
            }
        }

        result.add(-1);
        result.add(-1);
        return result;

    }
}
