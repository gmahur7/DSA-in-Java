public class CheckPalindrom {
    public static void main(String[] args) {
        int no = 12121;
        Boolean checked = check(no);
        if (checked)
            System.out.println("Given no is palidrom");
        else
            System.out.println("Given no is not palidrom");
    }

    static Boolean check(int no) {
        int dup = no;
        int rev = 0;
        while (dup > 0) {
            int mod = dup % 10;
            rev = (rev * 10) + mod;
            dup /= 10;
        }

        if (rev == no)
            return true;
        else
            return false;
    }
}
