import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q15_ReArrange_Positives_Negatives {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(-1,-2,-3,1,2,3));
        ArrayList<Integer> result = rearrange(list);
        System.out.println("ReArranged: "+result.toString());
    }

    static ArrayList<Integer> rearrange(ArrayList<Integer> list) {
        int n = list.size();
        int pos = 0;
        int neg = 1;
        ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(n, 0));

        for (int i = 0; i < n; i++) {
            if (list.get(i) > 0) {
                result.set(pos, list.get(i));
                pos += 2;
            } else {
                result.set(neg, list.get(i));
                neg += 2;
            }
        }

        return result;
    }
}
