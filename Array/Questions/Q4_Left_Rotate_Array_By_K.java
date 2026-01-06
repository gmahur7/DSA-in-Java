import java.util.ArrayList;
import java.util.Arrays;

public class Q4_Left_Rotate_Array_By_K {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        rotate(list,3);
        System.out.println("After Remove: " + list.toString());
    }

    // brute force
    static void rotate(ArrayList<Integer> list,int d) {
        int n = list.size();
        int k= d%n;

        for (int i = 0; i < k; i++) {
            int removed = list.remove(0);
            list.add(removed);
        }
        
    }
}
