public class Q1_Find_Minimum_Element {
     public static void main(String[] args) {
        int arr[] = {6,3,1,7,2,9};
        int min = getMin(arr);
        System.out.println("min: "+min);
    }

    static int getMin(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }

        return min;

    }
}
