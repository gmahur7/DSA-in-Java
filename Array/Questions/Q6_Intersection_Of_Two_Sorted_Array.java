import java.util.ArrayList;
import java.util.Arrays;

public class Q6_Intersection_Of_Two_Sorted_Array {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,1,2,2,2,2,2,2, 2, 7, 8, 9));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(2,2, 3, 4, 5, 6, 7));
        ArrayList<Integer> list = intersection(a, b);
        System.out.println(list.toString());
    }

    static ArrayList<Integer> intersection(ArrayList<Integer> a, ArrayList<Integer> b) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while (i < a.size() && j < b.size()) {
            if (a.get(i) == b.get(j)) {
                list.add(a.get(i));
                i++;
                j++;
            } else if (a.get(i) > b.get(j)) {
                j++;
            } else {
                i++;
            }
        }
        return list;
    }
}
