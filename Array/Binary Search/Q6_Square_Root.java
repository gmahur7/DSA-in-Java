//Q6 -> Find the square root of the the any given no.

public class Q6_Square_Root {
    public static void main(String[] args) {
        int no = 37;
        int precision=3;
        long ans=sqrt(no);
        System.out.println("Square root of no: " + no + " is: " + ans);
        System.out.println("Square root of no: " + no + " with precesion "+precision+" is: " + morePrecision(no,precision,ans));
    }

    static long sqrt(int no) {
        int start = 0, end = no;
        long mid = (start + end) / 2;
        int ans = 0;
        while (start <= end) {
            long sq = mid * mid;
            if (sq == no)
                return mid;
            else if (sq > no) {
                end = (int) mid - 1;
            } else if (sq < no) {
                start = (int) mid + 1;
                ans = (int) mid;
            }
            mid = (start + end) / 2;
        }
        return ans;
    }

    // static double morePrecision(int num, int precision, long tempSoln) {
    //     double factor = 1;
    //     double ans = tempSoln;

    //     for (int i = 0; i < precision; i++) {
    //         factor = factor / 10;
    //         for (double j = ans; j * j < num; j = j + factor) {
    //             ans = j;
    //         }
    //     }
    //     return ans;
    // }

    static double morePrecision(int num, int precision, long tempSoln) {
    double factor = 1;
    double ans = tempSoln;

    for (int i = 0; i < precision; i++) {
        factor = factor / 10;
        double j = ans;
        while ((j + factor) * (j + factor) <= num) {
            j = j + factor;
        }
        ans = j;
    }
    return ans;
}
}
