import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q20_3_Sum {
    public static void main(String Args[]) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0, 2, 4, 5, 1, 8, 9,
        1, 0, 5, 3, 7, 2));
        int target = 12;
        List<List<Integer>> set = get3sum(list, target);

        for (List<Integer> item : set) {
        System.out.println(item.toString());
        }
    }

    // static Set<ArrayList<Integer>> get3sum(ArrayList<Integer> list, int target) {
    // Set<ArrayList<Integer>> set = new HashSet<>();
    // for (int i = 0; i < list.size() - 1; i++) {
    // HashMap<Integer, Integer> map = new HashMap<>();
    // for (int j = i + 1; j < list.size(); j++) {
    // int sum = list.get(i) + list.get(j);
    // int rem = target - sum;
    // if (map.containsKey(rem)) {
    // ArrayList<Integer> res = new ArrayList<>();
    // res.add(list.get(i));
    // res.add(list.get(j));
    // res.add(rem);
    // res.sort(null);
    // set.add(res);
    // } else {
    // map.put(list.get(j), j);
    // }
    // }
    // }
    // return set;
    // }

    static List<List<Integer>> get3sum(ArrayList<Integer> list, int target) {

        Set<List<Integer>> set = new HashSet<List<Integer>>();
        int n = list.size();
        int i = 0;
        int j = i + 1;
        int k = n - 1;

        while (i < n - 1) {
            int sum = list.get(i) + list.get(j) + list.get(k);
            if (sum == target) {
                List<Integer> result = new ArrayList<>(Arrays.asList(list.get(i), list.get(j), list.get(k)));
                result.sort(null);
                set.add(result);
                j++;
                k = n - 1;
            } else if (sum > target) {
                k--;
            } else if (sum < target) {
                j++;
            }
            if (j >= k) {
                i++;
                j = i + 1;
                k = n - 1;
            }
        }

        return new ArrayList<>(set);
    }
}
