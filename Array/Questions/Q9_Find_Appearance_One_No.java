import java.util.ArrayList;
import java.util.Arrays;

public class Q9_Find_Appearance_One_No {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,0,1));
        int miss = find(list);
        System.out.println("Missing No: " + miss);
    }

    static int find(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n; i += 2) {
           if(list.size()-1!=i && list.get(i+1)!=list.get(i)){
            return list.get(i);
           }
           else if(list.size()-1==i){
               return list.get(i);
           }
        }
        return -1;
    }
}
