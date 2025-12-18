public class ArmstrongNo {
    public static void main(String[] args) {
        int no = 1634;
        System.out.println("Given no is" + (checkArmstrong(no) ? "" : " not ") + " Armstrong");
    }

    static Boolean checkArmstrong(int no) {
        int sum = 0;
        int dup = no;
        while (dup > 0) {
            int mod = dup % 10;
            sum = sum + mod * mod * mod;
            dup /= 10;
        }
        if (sum == no)
            return true;
        else
            return false;
    }
}
