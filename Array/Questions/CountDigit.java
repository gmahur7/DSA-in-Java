package Array.Questions;

public class CountDigit {

    public static void main(String[] args) {
        int no=1423;
        System.out.println(countDigit(no));
    }

    public static int countDigit(int n) {
        int digits = 1;
        while (n > 10) {
            System.out.println("in while loop "+digits);
            n = n / 10;
            digits++;
            System.out.println("digits: "+digits);
        }
        return digits;
    }
}
