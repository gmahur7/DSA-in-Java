public class Reverse_An_Array_After_Target {
     public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int after=3;
        int[] reversedArray = reverse(array,3);

        for(int i:reversedArray){
            System.out.print(i+",");
        }
        
    }

    static int[] reverse(int[] array,int target){
        int start=target;
        int end=array.length-1;
        while (start<=end) {
            int temp = array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
        return array;
    }
}
