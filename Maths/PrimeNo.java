public class PrimeNo {
    public static void main(String[] args) {
        int n = 99;
        System.out.println("Given no " + n + " is " + (checkPrime(n) ? "" : " not ") + " prime");
    }

    static Boolean checkPrime(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (n / i != i) {
                    count++;
                }
                if (count > 2) {
                    break;
                }
            }
        }
        if (count <= 2)
            return true;
        else
            return false;
    }
}
