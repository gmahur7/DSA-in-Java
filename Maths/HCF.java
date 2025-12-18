class HCF {
    public static void main(String[] args) {
        int a = 80;
        int b = 70;

        System.out.println("HCF of " + a + " and " + b + " : " + findHcf(a, b));
    }

    static int findHcf(int a, int b) {
        int hcf = 1;
        for (int i = Math.min(a, b); i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
                break;
            }
        }
        return hcf;
    }
}