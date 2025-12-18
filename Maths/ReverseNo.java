class ReverseNo {
    public static void main(String[] args) {
        int no = 123456;
        System.out.println("Reverse of no " +no+" is: "+ reverse(no));
    }

    static int reverse(int no) {
        int reverse = 0;
        while (no > 0) {
            int mod = no % 10;
            reverse = (reverse * 10) + mod;
            no /= 10;
        }
        return reverse;
    }
}