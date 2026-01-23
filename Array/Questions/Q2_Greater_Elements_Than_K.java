public class Q2_Greater_Elements_Than_K {
    public static void main(String[] args) {
         int arr[] = {6,3,1,7,2,9};
         int k=5;
        int count = greaterElemCount(arr,k);
        System.out.println("count: "+count);
    }

    static int greaterElemCount(int arr[],int k){
        if(arr.length==0) return -1;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>k) count++;
        }
        return count;
    }
}
