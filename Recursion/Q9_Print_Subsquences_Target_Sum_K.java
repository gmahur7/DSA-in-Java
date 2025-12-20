import java.util.ArrayList;

public class Q9_Print_Subsquences_Target_Sum_K {
    public static void main(String[] args) {
        int array[]={1,2,3};
        ArrayList<Integer> list = new ArrayList<>();
        subsequence(0, array, array.length, list, 3, 0);
    }

    static void subsequence(int i,int[] array, int n, ArrayList<Integer> list, int k,int sum){
        if(i>=n){
            if(sum==k){
                System.out.println(list.toString());
            }
            return;
        }

        list.add(array[i]);
        sum+=array[i];
        subsequence(i+1, array, n, list, k, sum);
        int removed = list.removeLast();
        sum-=removed;
        subsequence(i+1, array, n, list, k, sum);
    }
}
