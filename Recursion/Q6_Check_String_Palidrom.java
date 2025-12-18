
public class Q6_Check_String_Palidrom {
     public static void main(String[] args) {
        String str = "MadaM";
        check(0, str);
    }

    static void check(int i,String str){
        int j=str.length()-i-1;
        if (i>=j) {
           System.out.println(str+ " String is Palidrom");
           return;
        }
        else if(str.charAt(i)!=str.charAt(j)){
            System.out.println(str+ " String is not Palidrom");
            return;
        }
        check(i+1, str);
    }
}
