import java.util.ArrayList;
import java.util.Arrays;

public class Q17_Leaders_In_Array {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 5, 2, 8, 9, 3, 7));
        System.out.println("Leaders: " + getLeaders(list).toString());
    }

    static ArrayList<Integer> getLeaders(ArrayList<Integer> list) {
        int n = list.size();
        int max = Integer.MIN_VALUE;

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = n - 1; i >= 0; i--) {
            int current = list.get(i);
            if (current > max) {
                result.add(current);
                max = current;

            }
        }

        int start = 0;
        int end = result.size()-1;

        while (start < end) {
            int temp = result.get(start);
            result.set(start, result.get(end));
            result.set(end, temp);
            start++;
            end--;
        }
        return result;
    }
}
