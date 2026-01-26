import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q13_Majority_Element_In_Array {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,4,4,2,1,4,1,4,4,2,4,5,4,4));
        int majorElem = getMajorityElem(list);
        System.out.println("Majority Element: "+majorElem);
    }

    //better
     static int getMajorityElem(ArrayList<Integer> list){
        int n = list.size();

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
              int num = list.get(i);
              map.put(num, map.getOrDefault(num, 0)+1);
        }

        for (int j = 0; j < n; j++) {
            if (map.get(list.get(j))>n/2) {
                return list.get(j);
            }
        }
        return -1;
     }


    //optimize
    static int getMajorityElem2(ArrayList<Integer> list){
        int n = list.size();
        int count=0;
        int elem=0;

        for (int i = 0; i < n; i++) {
            if(count==0){
                count++;
                elem=list.get(i);
            }else if(list.get(i)==elem){
                count++;
            }else{
                count--;
            }
        }

        int count2=0;
        for (int j = 0; j < n; j++) {
            if(list.get(j)==elem) count2++; 
        }

        if(count2>(n/2)) return elem;
        return -1;
    }
}
