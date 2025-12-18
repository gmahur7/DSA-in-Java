import java.util.ArrayList;
import java.util.Arrays;

public class Q17_Max_Element_In_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int array[]={6,7,8,1,2};
        ArrayList<Integer> list = new ArrayList<>(Arrays.stream(array).boxed().toList());
        int peak = findPeak(list);
        System.out.println("Peak Element is : "+list.get(peak));
    }

    static int findPeak(ArrayList<Integer> list){
        int start=0;
        int end=list.size()-1;
        int mid=(start+end)/2;

        while (start<end) {
            if(list.get(mid)>list.get(mid+1)){
                return mid;
            }else if(list.get(start)<list.get(mid)){
                start=mid+1;
            }else{
                end=mid;
            }
            mid=(start+end)/2;
        }
        return -1;
    }
}
