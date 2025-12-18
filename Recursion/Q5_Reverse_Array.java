import java.util.Arrays;

public class Q5_Reverse_Array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        reverse(0, arr.length-1, arr); 
    }

    static void reverse(int l, int r,int arr[]){
        if (l>=r) {
           System.out.println("Reversed Array: "+Arrays.toString(arr));
           return;
        }
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        reverse(l+1, r-1, arr);
    }
}
