import java.util.ArrayList;
import java.util.List;

public class PrintDivisor {
    public static void main(String[] args) {
        int no=36;
        List<Integer> divisors = findDivisor(no);

        System.out.println(divisors.toString());

    }

    static List<Integer> findDivisor(int no) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i * i <= no; i++) {
            if (no % i == 0) {
                list.add(i);
                if (no / i != i) {
                    list.add(no / i);
                }
            }
        }
        list.sort(null);
        return list;
    }
}
