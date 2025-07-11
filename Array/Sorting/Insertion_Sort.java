
public class Insertion_Sort {
    public static void main(String[] args) {
        int array[] = { 1, 9, 7, 8, 4, 2, 0 };
        int sortedArray[] = insertionSort(array);

        for (int i : sortedArray) {
            System.out.print(i + ",");
        }
    }

    // Solution 1
    // static int[] insertionSort (int[] array){
    // int n=array.length;
    // for (int i = 1; i < n; i++) {
    // int temp=array[i];
    // int j=i-1;
    // for (; 0<=j; j--) {
    // if(array[j]>temp){
    // array[j+1]=array[j];
    // }else{
    // break;
    // }
    // }
    // array[j+1]=temp;
    // }
    // return array;
    // }


    // Solution 2 
    static int[] insertionSort(int[] array) {
        int n = array.length;
        int i = 1;
        while (i < n) {
            int temp =array[i];
            int j=i-1;
            while (j>=0 && array[j]>temp ) {
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=temp;
            i++;
        }
        return array;
    }
}