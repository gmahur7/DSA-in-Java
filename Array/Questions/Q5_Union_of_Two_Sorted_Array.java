import java.util.ArrayList;
import java.util.Arrays;

public class Q5_Union_of_Two_Sorted_Array {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 1,2,2, 5, 6));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(1, 1,1,3, 4, 6, 9));
        ArrayList<Integer> list = union(a, b);
        System.out.println(list.toString());
    }

    static ArrayList<Integer> union(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < a.size() && j < b.size()) {
            if (a.get(i) <= b.get(j)) {
                if (list.size() == 0 || list.get(list.size() - 1) != a.get(i)) {
                    list.add(a.get(i));
                } 
                i++;

            } else {
                if (list.size() == 0 || list.get(list.size() - 1) != b.get(j)) {
                    list.add(b.get(j));
                } 
                j++;
            }
        }

        while (i < a.size()) {
            if (list.get(list.size() - 1) < a.get(i)) {
                list.add(a.get(i++));
            } else {
                i++;
            }
        }

        while (j < b.size()) {
            if (list.get(list.size() - 1) < b.get(j)) {
                list.add(b.get(j++));
            } else {
                j++;
            }
        }

        return list;
    }
}
