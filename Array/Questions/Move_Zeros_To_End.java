// package Array.Questions;

public class Move_Zeros_To_End {
    public static void main(String[] args) {
        int array[] = {1,0,3,4,0,12,8,0,0,0,18};
        int result[] = moveZero(array);

        for (int i : result) {
            System.out.print(i+",");
        }
    }

    static int[] moveZero(int[] array){
        int n = array.length;
        int k=0;
        int result[]=new int[n];
        for (int i : array) {
            if(i!=0){
                result[k++]=i;
            }
        }

        while (k<n) {
            result[k++]=0;
        }
        return result;
    }
}
