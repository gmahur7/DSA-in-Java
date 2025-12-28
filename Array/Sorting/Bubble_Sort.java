import java.util.ArrayList;
import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8, 3, 4, 7, 6, 1, 2));
        sort(list);
        System.out.println("Sorted: " + list.toString());
    }

    static void sort(ArrayList<Integer> list) {

        for (int i = list.size() - 1; i >= 1; i--) {
            boolean swap=false;
            for (int j = 0; j <= i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    swap=true;
                }
            }
            if(!swap) break;
        }

    }
}