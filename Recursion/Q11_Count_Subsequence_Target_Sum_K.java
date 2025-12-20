import java.util.ArrayList;

public class Q11_Count_Subsequence_Target_Sum_K {
    public static void main(String[] args) {
         int array[] = {1,2,3};
        ArrayList<Integer> list = new ArrayList<>();
        int k=3;
        int total = count(0, array, array.length, list, k, 0,0);
        System.out.println("Count: "+total);
    }

    static int count(int i, int[] array, int n, ArrayList<Integer> list, int k,int sum,int c){
        if(i>=n){
            if(sum==k){
                System.out.println(list.toString());
                return 1;
            }
            return 0;
        }

        list.add(array[i]);
        sum+=array[i];
        int left = count(i+1, array, n, list, k, sum, c);

        int removed= list.removeLast();
        sum-=removed;
        int right=count(i+1, array, n, list, k, sum, c);
         
        return left+right;
    }
}
