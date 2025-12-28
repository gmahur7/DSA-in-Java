public class Q1_Find_Largest_Element_In_Array {
    public static void main(String[] args) {
        int array[]={};
        int largestElem = largest(array);
        System.out.println("largest element is: "+largestElem);
    }

    static int largest(int array[]) {

        if(array.length==0){
            throw new IllegalArgumentException("Array is empty");
        }

        int largest = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>largest) largest=array[i];
        }
        return largest;
    }
}
