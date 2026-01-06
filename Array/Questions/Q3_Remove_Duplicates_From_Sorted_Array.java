import java.util.ArrayList;
import java.util.Arrays;

public class Q3_Remove_Duplicates_From_Sorted_Array {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 2));
        remove(list);
        System.out.println("After Remove: " + list.toString());
    }

    static void remove(ArrayList<Integer> list) {
        int index = 1;
        for (int i = 1; i < list.size(); i++) {
            if (!list.get(i).equals(list.get(i - 1))) {
                list.set(index++, list.get(i));
            }
        }

        while (index < list.size()) {
            list.remove(list.size() - 1);
        }
    }
}
