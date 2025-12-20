import java.util.ArrayList;

public class Q10_Print_First_Subsquence_Target_Sum_K {
    public static void main(String[] args) {
        int array[] = {1,2,3};
        ArrayList<Integer> list = new ArrayList<>();
        int k=3;
        subsequence(0, array, array.length, list, k, 0);
    }

    static boolean subsequence(int i, int[] array, int n, ArrayList<Integer> list, int k, int sum){
        if(i>=n){
            if(sum==k){
                System.out.println(list.toString());
                return true;
            }
            else return false;
        }

        list.add(array[i]);
        sum+=array[i];
        if(subsequence(i+1, array, n, list, k, sum)==true) return true;

        int removed = list.removeLast();
        sum-=removed;

         if(subsequence(i+1, array, n, list, k, sum)==true) return true;

         return false;
    }
}

