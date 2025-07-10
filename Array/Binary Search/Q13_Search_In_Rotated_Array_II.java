public class Q13_Search_In_Rotated_Array_II {
    public static void main(String[] args) {
        int array[] = {10,20,30,40,50,1,2};
        for(int i : array){
            int target=i;
            int index = search(array, target);
            System.out.println("Target "+target+" founded at index: "+index);
        }
    }

    static int search(int[] array, int target){
        int start=0,end=array.length-1;
        int ans=-1;
        int mid=(start+end)/2;    // 6+6/2 => 6

        while (start<=end) {
            if(array[mid]==target){
                return mid;
            }else if(array[0]<=array[mid]){ 
                if(array[0]<=target && target<=array[mid]){    
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(array[mid]<=target && target<=array[end]){  
                    start=mid+1; 
                }else{
                    end=mid-1;
                }
            }
             mid=(start+end)/2;
        }
        return ans;
    }
}
