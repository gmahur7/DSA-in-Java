
public class Bubble_Sort {
    public static void main(String[] args) {
        int[] array = {8,3,5,1,0,2,4,9,7};
        int[] sortedArray = bubbleSort(array);

        for(int i : sortedArray){
            System.out.print(i+",");
        }
    }

    static int[] bubbleSort (int[] array){
        int n=array.length;
        boolean hasSwapped;
        for(int i=0;i<n-1;i++){
            hasSwapped=false;
            for (int j = 0; j < n-1-i; j++) {
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    hasSwapped=true;
                }
            }
            if(!hasSwapped) break;
        }
        return array;
    }
}