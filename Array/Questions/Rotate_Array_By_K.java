import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rotate_Array_By_K {
    public static void main(String[] args) {

        // List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8);
        // ArrayList<Integer> list= new ArrayList<>(list1);
        int k=3;

        int array[] = {1,2,3,4,5,6,7,8};
        ArrayList<Integer> list= new ArrayList<>(Arrays.stream(array).boxed().toList());

        ArrayList<Integer> rotatedList = rotate(list, k);
        
        for (Integer i : rotatedList) {
            System.out.print(i+",");
        }
        
    }

    static ArrayList rotate(ArrayList<Integer> array,int k){
        int n =array.size();
          k = k % n;

        ArrayList<Integer> temp = new ArrayList<>(array);

        for (int i = 0; i < n; i++) {
            temp.set(((i+k)%n), array.get(i));
        }

        for(int j = 0;j<n;j++){
            array.set(j, temp.get(j));
        }

        return temp;
    }
}
