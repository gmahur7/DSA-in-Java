public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2,5,13,19,22,28,30,37,41};
        int x = 37;
        System.out.println(search(arr, x));
    }

    public static int search(int[] array,int target){
        int start = 0;  
        int end= array.length-1;
        while (start<=end) {
            int mid =(start+end)/2;   
            if(array[mid]==target) {
                return mid;
            }else if(array[mid]<target){
                start=mid+1;
            }else if(array[mid]>target){
                end=mid-1;
            }
        }
        return -1; // target not found
    }
}