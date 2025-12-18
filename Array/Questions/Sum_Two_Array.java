import java.util.ArrayList;
import java.util.Arrays;

public class Sum_Two_Array {
    public static void main(String[] args) {
        int array1[]={1,2,3};
        int array2[]={0,7};
        
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.stream(array1).boxed().toList());
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.stream(array2).boxed().toList());

        ArrayList<Integer> total = sum(list1, list2);

        System.out.println(total.toString());
    }

    static ArrayList<Integer> sum(ArrayList<Integer> a, ArrayList<Integer> b) {
        int m = a.size() - 1;
        int n = b.size() - 1;
        ArrayList<Integer> total = new ArrayList<>();

        int carry = 0;

        while (0 <= m && 0 <= n) {
            int sum = a.get(m) + b.get(n) + carry;
            carry = sum / 10;
            int ans = sum % 10;
            total.add(ans);
            m--;
            n--;
        }

        while (m >= 0) {
            int sum = a.get(m)  + carry;
            carry = sum / 10;
            int ans = sum % 10;
            total.add(ans);
            m--;
        }
        
        while (n >= 0) {
            int sum = b.get(n)  + carry;
            carry = sum / 10;
            int ans = sum % 10;
            total.add(ans);
            n--;
        }

        if(carry>0){
            total.add(carry);
        }

        int i=0;
        int j=total.size()-1;
        while (i<=j) {
           int temp = total.get(i);
           total.set(i,total.get(j));
           total.set(j,temp);
           i++;
           j--;
        }
        return total;
    }
}
