public class Q2_Find_Second_Largest_From_Array {
    public static void main(String[] args) {
        int array[] = {3,1,8,7,7,7,8,4};
        int secondLargestElem = secondLargest(array);
        System.out.println("Second largest element is: " + secondLargestElem);
    }

    static int secondLargest(int array[]) {

        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int largest = array[0];
        int sec = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                sec = largest;
                largest = array[i];
            } else if(array[i]<largest && array[i]>sec){
                sec=array[i];
            }
        }
        return sec;
    }
}
