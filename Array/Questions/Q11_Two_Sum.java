import java.util.ArrayList;
import java.util.Arrays;

public class Q11_Two_Sum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 1, 5, 7, 3, 0, 1, 2));
        ArrayList<Integer> result = new ArrayList<>();
        result = twoSum(list, 10);
        System.out.println("result: "+result.toString());

    }

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
}
