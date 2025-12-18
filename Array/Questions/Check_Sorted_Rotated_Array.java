import java.util.ArrayList;
import java.util.Arrays;

public class Check_Sorted_Rotated_Array {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,1};
        ArrayList<Integer> list = new ArrayList<>(Arrays.stream(array).boxed().toList());
        System.out.println(check(list)==true?"Array is sorted":"Array is unsorted");
    }

    static boolean check(ArrayList<Integer> list) {
        int n = list.size();
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (list.get(i - 1) > list.get(i)) {
                count++;
            }
        }

        if(list.get(0)<list.get(n-1)){
           count++;
        }

        return count<=1;
    }
}
