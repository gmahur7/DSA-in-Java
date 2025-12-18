import java.util.ArrayList;
import java.util.Arrays;

public class Q16_Single_Element_In_Sorted_Array {
    public static void main(String[] args) {
        int array[] = {1,1,2,2,3,3,4,5,5,6,6};
        ArrayList<Integer> list = new ArrayList<>(Arrays.stream(array).boxed().toList());
        int single = checkSingleElement(list);
        System.out.println("Single elem is :" + list.get(single));
    }

    static int checkSingleElement(ArrayList list) {
        
        if(list.size()==1) return 0;
        if(list.get(0)!=list.get(1)) return 0;
        if(list.get(list.size()-2)!=list.get(list.size()-1)) return list.size()-1;   
        
        int start = 1;
        int end = list.size()-2;
        int mid = (start + end) / 2;

        while (start <= end) {
            if (list.get(mid) != list.get(mid - 1) && list.get(mid) != list.get(mid + 1)) {
                return mid;
            } 
            // else {
            //     if (list.get(mid) == list.get(mid + 1)) {
            //         if (mid % 2 == 0) {
            //             start = mid + 1;
            //         } else {
            //             end = mid - 1;
            //         }
            //     } else {
            //         if (mid % 2 == 0) {
            //             end = mid - 1;
            //         } else {
            //             start = mid + 1;
            //         }
            //     }
            // }
            if(( mid%2==1 && list.get(mid-1)==list.get(mid)) || (mid%2==0 && list.get(mid)==list.get(mid+1)) ){
                start=mid+1;
            }else{
                end=mid-1;
            }
            mid = (start + end) / 2;
        }
        return -1;
    }
}
