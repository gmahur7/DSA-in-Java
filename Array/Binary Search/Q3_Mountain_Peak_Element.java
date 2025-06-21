// package Array.Binary Search;
// Q3 -> To find the peak element in mountain ....mountain array is something like first sorted increasing order then peak then sorted decraesing order. Peak is the largest element in  array;

public class Q3_Mountain_Peak_Element {
    public static void main(String[] args) {
        int mountain[] = {1,3,4,8,15,12,9,5}; 
        System.out.println("Peak element is: "+peak(mountain));
    }

    static int peak(int array[]){
        int start=0;
        int end=array.length-1;
        int mid = (start+end)/2;
        while (start<end) {
            if(array[mid]<array[mid+1]){
                start=mid+1;
            }else{
                end=mid;
            }
            mid = (start+end)/2;
        }
        return array[start];
    }
}
