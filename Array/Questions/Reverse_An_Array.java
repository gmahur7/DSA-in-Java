public class Reverse_An_Array {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] reversedArray = reverse(array);

        for(int i:reversedArray){
            System.out.print(i+",");
        }
        
    }

    static int[] reverse(int[] array){
        int start=0;
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