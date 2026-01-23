import java.util.ArrayList;
import java.util.Arrays;

public class Q8_Maximum_Consecutive_Ones {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,0,1,1,1,1,0,0,1,0,1,1,1,0));
        int count  = getCount(list);
        System.out.println("Max 1 Consecutive: "+count);
    }

    static int getCount(ArrayList<Integer> list) {
        int n = list.size();
        int count = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if(list.get(i)==1){
                count++;
                if(count>max){
                    max=count;
                }
            }else count=0;
        }
        return max;
    }
}
